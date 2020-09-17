package fr.dauphine.ja.chilhagopianJulien.td00;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.ArrayList;

/**
 * Unit test for simple PrimeCollection.
 */
public class PrimeCollectionTest
        extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public PrimeCollectionTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(PrimeCollectionTest.class);
    }

    /**
     * Rigourous Test :-)
     */
    public void testPrimeCollection() {
        PrimeCollection pc = new PrimeCollection(new ArrayList<>());
        test0IsPrime(pc);
        testTwoIsPrime(pc);
        test9IsNotPrime(pc);
    }

    private void test0IsPrime(PrimeCollection pc) {
        assertFalse(pc.isPrime(0));
    }

    private void testTwoIsPrime(PrimeCollection pc) {
        assertTrue(pc.isPrime(2));
    }

    private void test9IsNotPrime(PrimeCollection pc) {
        assertFalse(pc.isPrime(9));
    }


}
