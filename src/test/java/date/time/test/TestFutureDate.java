package date.time.test;

import date.time.FutureDate;
import junit.framework.*;

public class TestFutureDate extends TestCase {
	public TestFutureDate(String testName) {
		super(testName);
	}

	public Test Suite() {
		return new TestSuite(TestFutureDate.class);
	}

	public void test() {
		assertTrue(true);
	}

	public void testFutureDate() {
		assertTrue("20/02/2014".equals(FutureDate.getFutureDate()));
	}
}
