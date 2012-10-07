/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sT3ls
 */
public class TreeTest {
    
    public TreeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of AddChildrens method, of class Tree.
     */
    @Test
    public void testAddChildrens() {
        System.out.println("AddChildrens");
        int countchildren = 0;
        Tree instance = new Tree();
        instance.AddChildrens(countchildren);
        assertEquals(instance.ResultCountApex(instance), 1);
    }

    /**
     * Test of ResultCountApex method, of class Tree.
     */
    @Test
    public void testResultCountApex() {
        System.out.println("ResultCountApex");
        int countchildren = 1;
        Tree instance = new Tree();
        instance.AddChildrens(countchildren);
        assertEquals(instance.ResultCountApex(instance), 2);
    }
}
