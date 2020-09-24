package com.assignment.java;

import junit.framework.*;

public class RearrangeDigitsTest extends TestCase{
	public RearrangeDigitsTest( String testName )
    {
        super( testName );
    }

    public static Test suite()
    {
        return new TestSuite( RearrangeDigitsTest.class );
    }
    
    public void test()
    {
        assertTrue( true );
    }
    
    public void testRearrangeDigits() {
    	assertEquals(54421, RearrangeDigits.rearrange(21445));
    }
    
    public void testRearrangeDigits1() {
    	assertEquals(654321, RearrangeDigits.rearrange(145263));
    }
    
    public void testRearrangeDigits2() {
    	assertEquals(987554322, RearrangeDigits.rearrange(254859723));
    }
}
