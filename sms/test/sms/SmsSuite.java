/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sms;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author 100039d
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({sms.StudentManagementSystemTest.class,sms.SimpleStudentRepositoryTest.class,sms.MainTest.class,sms.StudentTest.class,sms.StudentRepositoryTest.class})
public class SmsSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

}