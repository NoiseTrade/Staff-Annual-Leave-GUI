/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staffannualleavesystem;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author david
 */
public class EmployeesTest {
    
    public EmployeesTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getFirstName method, of class Employees.
     */
    @Test
    public void testGetFirstName() {
        System.out.println("getFirstName");
        Employees instance = new Employees();
        String expResult = "";
        String result = instance.getFirstName();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setFirstName method, of class Employees.
     */
    @Test
    public void testSetFirstName() {
        System.out.println("setFirstName");
        String firstName = "";
        Employees instance = new Employees();
        instance.setFirstName(firstName);
        
    }

    /**
     * Test of getLastName method, of class Employees.
     */
    @Test
    public void testGetLastName() {
        System.out.println("getLastName");
        Employees instance = new Employees();
        String expResult = "";
        String result = instance.getLastName();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setLastName method, of class Employees.
     */
    @Test
    public void testSetLastName() {
        System.out.println("setLastName");
        String lastName = "";
        Employees instance = new Employees();
        instance.setLastName(lastName);
       
    }

    /**
     * Test of getAge method, of class Employees.
     */
    @Test
    public void testGetAge() {
        System.out.println("getAge");
        Employees instance = new Employees();
        String expResult = "";
        String result = instance.getAge();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setAge method, of class Employees.
     */
    @Test
    public void testSetAge() {
        System.out.println("setAge");
        String age = "";
        Employees instance = new Employees();
        instance.setAge(age);
       
    }

    /**
     * Test of getPronouns method, of class Employees.
     */
    @Test
    public void testGetPronouns() {
        System.out.println("getPronouns");
        Employees instance = new Employees();
        String expResult = "";
        String result = instance.getPronouns();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setPronouns method, of class Employees.
     */
    @Test
    public void testSetPronouns() {
        System.out.println("setPronouns");
        String pronouns = "";
        Employees instance = new Employees();
        instance.setPronouns(pronouns);
        
    }

    /**
     * Test of getHolidayEntitlement method, of class Employees.
     */
    @Test
    public void testGetHolidayEntitlement() {
        System.out.println("getHolidayEntitlement");
        Employees instance = new Employees();
        String expResult = "";
        String result = instance.getHolidayEntitlement();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setHolidayEntitlement method, of class Employees.
     */
    @Test
    public void testSetHolidayEntitlement() {
        System.out.println("setHolidayEntitlement");
        String holidayEntitlement = "";
        Employees instance = new Employees();
        instance.setHolidayEntitlement(holidayEntitlement);
       
    }

    /**
     * Test of getHoldaysRequested method, of class Employees.
     */
    @Test
    public void testGetHoldaysRequested() {
        System.out.println("getHoldaysRequested");
        Employees instance = new Employees();
        String expResult = "";
        String result = instance.getHoldaysRequested();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setHoldaysRequested method, of class Employees.
     */
    @Test
    public void testSetHoldaysRequested() {
        System.out.println("setHoldaysRequested");
        String holdaysRequested = "";
        Employees instance = new Employees();
        instance.setHoldaysRequested(holdaysRequested);
        
    }

    /**
     * Test of getIdNumber method, of class Employees.
     */
    @Test
    public void testGetIdNumber() {
        System.out.println("getIdNumber");
        Employees instance = new Employees();
        String expResult = "";
        String result = instance.getIdNumber();
        assertEquals(expResult, result);
      
    }

    /**
     * Test of setIdNumber method, of class Employees.
     */
    @Test
    public void testSetIdNumber() {
        System.out.println("setIdNumber");
        String idNumber = "";
        Employees instance = new Employees();
        instance.setIdNumber(idNumber);
        
    }

    
}
