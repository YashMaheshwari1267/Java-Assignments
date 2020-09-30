package file.serialization.test;

import java.io.IOException;

import file.serialization.LineCount;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestLineCount extends TestCase{
	public TestLineCount(String testName) {
		super(testName);
	}
	
	public Test Suite() {
		return new TestSuite(TestLineCount.class);
	}
	
	public void test() {
		assertTrue(true);
	}
	
	public void testLineCount0() throws IOException{
		assertEquals(0, LineCount.lineCount("E://test.txt"));
	}
	
	public void testLineCount2() throws IOException{
		assertEquals(2, LineCount.lineCount("E://xyz.txt"));
	}
}
