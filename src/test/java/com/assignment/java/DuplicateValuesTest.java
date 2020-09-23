package com.assignment.java;

import junit.framework.*;

public class DuplicateValuesTest extends TestCase{
	
	public DuplicateValuesTest( String testName )
    {
        super( testName );
    }

    public static Test suite()
    {
        return new TestSuite( DuplicateValuesTest.class );
    }
    
    public void test()
    {
        assertTrue( true );
    }
	
	public void testDuplicateValue() {
		assertEquals(0,DuplicateValues.findDuplicateValues("abcde"));
	}
	
	public void testDuplicateValue1() {
		assertEquals(2,DuplicateValues.findDuplicateValues("aabbcde"));
	}
	
	public void testDuplicateValue2() {
		assertEquals(1,DuplicateValues.findDuplicateValues("indivisibility"));
	}
	
	public void testDuplicateValue3() {
		assertEquals(2,DuplicateValues.findDuplicateValues("Indivisibilities"));
	}
	
	public void testDuplicateValue4() {
		assertEquals(2,DuplicateValues.findDuplicateValues("ABBA"));
	}
	
}
