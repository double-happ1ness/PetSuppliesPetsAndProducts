package petsuppliespetsandproducts;

import org.junit.Test;
import static org.junit.Assert.*;

public class PetTest {
    
    public PetTest() {
    }

    /**
     * Test of toString method, of class Pet.
     */
//    @Test
//    public void testToString() {
//        System.out.println("toString");
//        Pet instance = new Pet();
//        String expResult = "";
//        String result = instance.toString();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of getTraversals method, of class Pet.
     */
//    @Test
//    public void testGetTraversals() {
//        System.out.println("getTraversals");
//        Pet instance = new Pet();
//        String expResult = "";
//        String result = instance.getTraversals();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of insert method, of class Pet.
     */
    @Test
    public void testInsert() throws Exception {
        System.out.println("insert");
        Comparable object = null;
        Pet instance = new Pet();
        instance.insert(object);
        assertNotNull(instance);
    }

    /**
     * Test of find method, of class Pet.
     */
//    @Test
//    public void testFind() throws Exception {
//        System.out.println("find");
//        Comparable object = null;
//        Pet instance = new Pet();
//        Comparable expResult = null;
//        Comparable result = instance.find(object);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of remove method, of class Pet.
     */
//    @Test
//    public void testRemove() throws Exception {
//        System.out.println("remove");
//        Comparable object = null;
//        Pet instance = new Pet();
//        Comparable expResult = null;
//        Comparable result = instance.remove(object);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
