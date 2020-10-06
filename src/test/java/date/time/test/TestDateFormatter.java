package date.time.test;

import java.text.ParseException;

import date.time.DateFormatter;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestDateFormatter extends TestCase{
	public TestDateFormatter(String testName) {
		super(testName);
	}
	
	public Test Suite() {
		return new TestSuite(TestDateFormatter.class);
	}
	
	public void test() {
		assertTrue(true);
	}
	
	public void testGetDateInSlashFormat() throws ParseException {
		assertTrue("02/05/2013".equals(DateFormatter.getDateSeparatedBySlash()));
	}
	
	public void testGetDateInEnglishFormat() throws ParseException {
		assertTrue("02 May, 2013".equals(DateFormatter.getDateSInEnglishFormat()));
	}
	
	public void test2() throws ParseException {
		assertTrue("12/11/1963".equals(DateFormatter.getDateSeparatedBySlash()));
		assertTrue("12 November, 1963".equals(DateFormatter.getDateSInEnglishFormat()));
	}
	
	
}
