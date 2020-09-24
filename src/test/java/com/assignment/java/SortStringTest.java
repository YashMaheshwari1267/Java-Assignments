package com.assignment.java;

import junit.framework.*;

public class SortStringTest extends TestCase{
	public SortStringTest( String testName )
    {
        super( testName );
    }

    public static Test suite()
    {
        return new TestSuite( SortStringTest.class );
    }
    
    public void test()
    {
        assertTrue( true );
    }
    
    public void testSortString1() {
    	assertTrue("Thi1s is2 3a T4est ".equals(SortString.sortString("is2 Thi1s T4est 3a")));
    }
    
    public void testSortString2() {
    	assertTrue("Fo1r the2 g3ood 4of th5e pe6ople ".equals(SortString.sortString("4of Fo1r pe6ople g3ood th5e the2")));
    }
    
    public void testSortString3() {
    	assertTrue(" ".equals(SortString.sortString("")));
    }
}
