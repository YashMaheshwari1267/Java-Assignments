package file.serialization.test;

import java.io.IOException;
import file.serialization.WordCount;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestWordCount extends TestCase{
	public TestWordCount(String testName) {
		super(testName);
	}
	
	public Test Suite() {
		return new TestSuite(TestWordCount.class);
	}
	
	public void test() {
		assertTrue(true);
	}
	
	public void testWordCount10() throws IOException{
		assertEquals(10, WordCount.wordCount("E://xyz.txt"));
	}
}
