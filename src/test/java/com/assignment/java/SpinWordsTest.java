package com.assignment.java;

import junit.framework.*;

public class SpinWordsTest extends TestCase{
	public SpinWordsTest( String testName )
    {
        super( testName );
    }

    public static Test suite()
    {
        return new TestSuite( SpinWordsTest.class );
    }
    
    public void test()
    {
        assertTrue( true );
    }
    
    public void testSpinWords1() {
    	assertTrue("Hey wollef sroirraw ".equals(SpinWords.spinWords("Hey fellow warriors")));
    }
    
    public void testSpinWords2() {
    	assertTrue("This is a test ".equals(SpinWords.spinWords("This is a test")));
    }
    
    public void testSpinWords3() {
    	assertTrue("emocleW ".equals(SpinWords.spinWords("Welcome")));
    }
    
    public void testSpinWords4() {
    	assertTrue("This is rehtona test ".equals(SpinWords.spinWords("This is another test")));
    }
    
    public void testSpinWords5() {
    	assertTrue("You are tsomla to the last test ".equals(SpinWords.spinWords("You are almost to the last test")));
    }
    
    public void testSpinWords6() {
    	assertTrue("Just gniddik ereht is llits one more ".equals(SpinWords.spinWords("Just kidding there is still one more")));
    }
    
    public void testSpinWords7() {
    	assertTrue("ylsuoireS this is the last one ".equals(SpinWords.spinWords("Seriously this is the last one")));
    }

}
