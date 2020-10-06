package date.time.test;

import date.time.DaysYouAreAlive;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestYouAreAliveDays extends TestCase{
	public TestYouAreAliveDays(String testName) {
		super(testName);
	}
	
	public Test Suite() {
		return new TestSuite(TestYouAreAliveDays.class);
	}
	
	public void test() {
		assertTrue(true);
	}
	
	public void testAliveDays() {
		assertEquals(8356, DaysYouAreAlive.getDaysYouAreAlive());
	}
}
