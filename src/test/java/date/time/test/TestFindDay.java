package date.time.test;

import java.text.ParseException;

import date.time.FindDay;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestFindDay extends TestCase {
	public TestFindDay(String testName) {
		super(testName);
	}

	public Test Suite() {
		return new TestSuite(TestFindDay.class);
	}

	public void test() {
		assertTrue(true);
	}

	public void testGetDay() throws ParseException {
		assertTrue("Thursday".equals(FindDay.getDay()));
	}

}
