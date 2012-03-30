/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sms;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 100039d
 */
public class StudentRepositoryTest {

    public StudentRepositoryTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of saveStudent method, of class StudentRepository.
     */
    @Test
    public void testSaveStudent() {
        System.out.println("saveStudent");
        Student stu = null;
        StudentRepository instance = new StudentRepositoryImpl();
        instance.saveStudent(stu);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteStudent method, of class StudentRepository.
     */
    @Test
    public void testDeleteStudent() {
        System.out.println("deleteStudent");
        Student stu = null;
        StudentRepository instance = new StudentRepositoryImpl();
        instance.deleteStudent(stu);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findStudent method, of class StudentRepository.
     */
    @Test
    public void testFindStudent() {
        System.out.println("findStudent");
        long regNumber = 0L;
        StudentRepository instance = new StudentRepositoryImpl();
        Student expResult = null;
        Student result = instance.findStudent(regNumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateStudent method, of class StudentRepository.
     */
    @Test
    public void testUpdateStudent() {
        System.out.println("updateStudent");
        Student stu = null;
        StudentRepository instance = new StudentRepositoryImpl();
        instance.updateStudent(stu);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findAllStudents method, of class StudentRepository.
     */
    @Test
    public void testFindAllStudents() {
        System.out.println("findAllStudents");
        StudentRepository instance = new StudentRepositoryImpl();
        List expResult = null;
        List result = instance.findAllStudents();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class StudentRepositoryImpl implements StudentRepository {

        public void saveStudent(Student stu) {
        }

        public void deleteStudent(Student stu) {
        }

        public Student findStudent(long regNumber) {
            return null;
        }

        public void updateStudent(Student stu) {
        }

        public List<Student> findAllStudents() {
            return null;
        }
    }

}