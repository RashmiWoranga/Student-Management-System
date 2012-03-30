/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sms;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 *
 * @author 100039d
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ClassPathXmlApplicationContext c = new ClassPathXmlApplicationContext("smsContext.xml");
        StudentRepository ssp = new SimpleStudentRepository();
        StudentManagementSystem sms = new StudentManagementSystem(ssp);
        ssp.saveStudent((Student)c.getBean("s1"));
        ssp.saveStudent((Student)c.getBean("s2"));
        ssp.saveStudent((Student)c.getBean("s3"));
        ssp.saveStudent((Student)c.getBean("s4"));
        ssp.saveStudent((Student)c.getBean("s5"));
        ssp.saveStudent((Student)c.getBean("s6"));
        sms.listAllStudents();

    }

}
