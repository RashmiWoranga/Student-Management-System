/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sms;

import java.util.List;

/**
 *
 * @author 100039d
 */
public class StudentManagementSystem {

    private StudentRepository repo;

    public StudentManagementSystem(StudentRepository repo) {
        this.repo = repo;
    }

   

    public void listAllStudents() {
        
        List<Student> l2 = (List<Student>) repo.findAllStudents();
        for (int i = 0; i < l2.size(); i++) {
            System.out.println(i + ". " + l2.get(i).getRegNumber());
        }
    }

    public void registerStudent(Student stu) {

        repo.saveStudent(stu);
    }
}
