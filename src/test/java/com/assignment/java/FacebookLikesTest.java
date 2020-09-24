package com.assignment.java;

import junit.framework.*;

public class FacebookLikesTest extends TestCase{
	public FacebookLikesTest( String testName )
    {
        super( testName );
    }

    public static Test suite()
    {
        return new TestSuite( FacebookLikesTest.class );
    }
    
    public void test()
    {
        assertTrue( true );
    }
    
    public void testLikes0() {
    	assertTrue("no one likes this".equals(FacebookLikes.facebookLikes(new String[] {})));
    }
    
    public void testLikes1() {
    	assertTrue("Peter likes this".equals(FacebookLikes.facebookLikes(new String[] {"Peter"})));
    }
    
    public void testLikes2() {
    	assertTrue("Jacob and Alex likes this".equals(FacebookLikes.facebookLikes(new String[] {"Jacob","Alex"})));
    }
    
    public void testLikes3() {
    	assertTrue("Max, John and Mark likes this".equals(FacebookLikes.facebookLikes(new String[] {"Max","John","Mark"})));
    }
    
    public void testLikes4() {
    	assertTrue("Alex, Jacob and 2 others likes this".equals(FacebookLikes.facebookLikes(new String[] {"Alex", "Jacob", "Mark", "Max"})));
    }
    
}
