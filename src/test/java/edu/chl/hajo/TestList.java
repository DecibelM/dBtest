package edu.chl.hajo;

import static java.lang.System.out;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/*
    
     This is a test class (for some other class, in this case the List class)

 */
public class TestList {

    @Test
    public void testAdd() {
        List l = new List();
        l.add(1);                                   //Call method to test
        assertTrue(l.getLength() == 1);     // The logical check
    }

    @Test
    public void testRemove(){
        List l = new List();
        l.add(1);
        l.remove();
        assertTrue(l.getLength() == 0);
        try{
            l.remove();
        }catch(IllegalStateException e ){
            assertTrue("List empty", true);
        }
    }

    @Test
    public void testGet(){
        List l = new List();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        int i = l.get(2);
        assertEquals(3, i);
    }

    @Test(expected=IllegalArgumentException.class)
    public void testGetBadIndex() {
        List list = new List();
        list.get(-1); // Exception!!!
    }

    @Test
    public void testCopy(){
        List l = new List();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);

        List l2 = l.copy();

        assertEquals(l.get(1), l2.get(1));
    }

    @BeforeClass
    public static void beforeClass(){  //First of all
        System.out.println("Before class");
    }

    @AfterClass
    public static void afterClass(){  // Last of all
        System.out.println("After class");
    }

    @Before
    public void before(){  //Before each test method
        System.out.println("Before");
    }

    @After
    public void after(){  //After each test method
        System.out.println("After");
    }


}
