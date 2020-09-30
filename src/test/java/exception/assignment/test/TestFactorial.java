package exception.assignment.test;

import exception.assignment.Factorial;
import junit.framework.*;

public class TestFactorial extends TestCase{
	public TestFactorial(String testName) {
		super(testName);
	}
	
	public Test Suite(){
		return new TestSuite(TestFactorial.class);
	}
	
	public void test() {
		assertTrue(true);
	}
	
	public void testGetFactorial() {
		assertEquals(120, Factorial.getFactorial(5));
	}
	
	public void testGetFactorial1() {
		assertEquals(24, Factorial.getFactorial(4));
	}
	
	public void testGetFactorial2() {
		assertEquals(6, Factorial.getFactorial(3));
	}
}


