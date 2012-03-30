/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sms;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 *
 * @author 100039d
 */
public class SimpleStudentRepository implements StudentRepository {

    private Map<Long, Student> studentsDb = new HashMap<Long, Student>();

    public Map<Long, Student> getStudentsDb() {
        return studentsDb;
    }

    @Override
    public void saveStudent(Student stu) {
        studentsDb.put(stu.getRegNumber(), stu);
    }

    @Override
    public void deleteStudent(Student stu) {

        studentsDb.remove(stu.getRegNumber());
    }

    @Override
    public Student findStudent(long regNumber) {
        Student st = studentsDb.get(regNumber);

        return st;

    }

    @Override
    public void updateStudent(Student stu) {
        studentsDb.put(stu.getRegNumber(), stu);

    }

    @Override
    public List<Student> findAllStudents() {
        List<Student> ls = new ArrayList<Student>();


        Iterator it = studentsDb.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pairs = (Map.Entry) it.next();
            ls.add((Student) pairs.getValue());
        }
        return ls;
    }
}
