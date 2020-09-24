package com.assignment.java;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class OddTimesTest extends TestCase{
	public OddTimesTest( String testName )
    {
        super( testName );
    }

    public static Test suite()
    {
        return new TestSuite( OddTimesTest.class );
    }
    
    public void test()
    {
        assertTrue( true );
    }
    
    public void testFindOdd1() {
    	assertEquals(5, OddTimes.findOdd(new int[]{20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5}));
    }
    
    public void testFindOdd2() {
    	assertEquals(-1, OddTimes.findOdd(new int[]{1,1,2,-2,5,2,4,4,-1,-2,5}));
    }
    
    public void testFindOdd3() {
    	assertEquals(5, OddTimes.findOdd(new int[]{20,1,1,2,2,3,3,5,5,4,20,4,5}));
    }
    
    public void testFindOdd4() {
    	assertEquals(10, OddTimes.findOdd(new int[]{10}));
    }
    
    public void testFindOdd5() {
    	assertEquals(10, OddTimes.findOdd(new int[]{1,1,1,1,1,1,10,1,1,1,1}));
    }
    
    public void testFindOdd6() {
    	assertEquals(1, OddTimes.findOdd(new int[]{5,4,3,2,1,5,4,3,2,10,10}));
    }
}
