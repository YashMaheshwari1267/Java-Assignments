 package date.time.test;

import date.time.TodaysDate;
import junit.framework.*;

public class TestTodaysDate extends TestCase{
	public TestTodaysDate(String testName) {
		super(testName);
	}
	
	public Test Suite() {
		return new TestSuite(TestTodaysDate.class);
	}
	
	public void test() {
		assertTrue(true);
	}
	
	public void testTodaysDate() {
		assertTrue("Tuesday, October 06, 2020".equals(TodaysDate.getTodaysDate()));
	}
}
