package file.serialization.test;

import java.io.IOException;
import java.util.ArrayList;

import file.serialization.GrepJava;
import junit.framework.*;

public class TestGrep extends TestCase{
	public TestGrep(String testName) {
		super(testName);
	}
	
	public Test Suite() {
		return new TestSuite(TestGrep.class);
	}
	
	public void test() {
		assertTrue(true);
	}
	
	public void testGrep() throws IOException{
		ArrayList<String> list1= new ArrayList<String>();
		list1.add("My name is Yash Maheshwari");
		list1.add("My college is AITR");
		ArrayList<String> list2 = GrepJava.grep("E:/xyz.txt","is");
		assertTrue(list1.equals(list2));
		assertEquals(2,list2.size());
	}
	

}
