package file.serialization.test;

import file.serialization.FileExist;
import junit.framework.*;

public class TestFileExist extends TestCase{

	public TestFileExist(String testName) {
		super(testName);
	}
	
	public Test Suite() {
		return new TestSuite(TestFileExist.class);
	}
	
	public void test() {
		assertTrue(true);
	}
	
	public void testFileExistTrue() {
		assertTrue(FileExist.isFileExist("E:\\test.txt"));
	}
	
	public void testFileExistFalse() {
		assertFalse(FileExist.isFileExist("E:\\abc.txt"));
	}
	
}
