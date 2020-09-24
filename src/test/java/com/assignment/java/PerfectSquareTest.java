package com.assignment.java;

import junit.framework.*;

public class PerfectSquareTest extends TestCase{
	public PerfectSquareTest( String testName )
    {
        super( testName );
    }

    public static Test suite()
    {
        return new TestSuite( PerfectSquareTest.class );
    }
    
    public void test()
    {
        assertTrue( true );
    }
    
    public void testIsPerfectSquare1() {
    	assertFalse(PerfectSquare.isPerfectSquare(-1));
    }
    
    public void testIsPerfectSquare2() {
    	assertFalse(PerfectSquare.isPerfectSquare(3));
    }
    
    public void testIsPerfectSquare3() {
    	assertFalse(PerfectSquare.isPerfectSquare(26));
    }
    
    public void testIsPerfectSquare4() {
    	assertTrue(PerfectSquare.isPerfectSquare(0));
    }
    
    public void testIsPerfectSquare5() {
    	assertTrue(PerfectSquare.isPerfectSquare(4));
    }
    
    public void testIsPerfectSquare6() {
    	assertTrue(PerfectSquare.isPerfectSquare(25));
    }
}
