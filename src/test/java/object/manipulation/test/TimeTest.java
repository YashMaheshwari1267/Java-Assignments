package object.manipulation.test;

import junit.framework.*;
import object.manipulation.Time;

public class TimeTest extends TestCase{
	public TimeTest (String testName) {
		super(testName);
	}
	
	public Test Suite(){
		return new TestSuite(TimeTest.class);
	}
	
	public void test() {
		assertTrue(true);
	}
	
	public void testShowTime() {
		Time t = new Time();
		t.setTime(11, 5);
		assertTrue("Time: 11:05".equals(t.showTime()));
	}
	
	public void testSumTime() {
		Time t1= new Time();
		Time t2= new Time();
		t1.setTime(2, 40);
		t2.setTime(8, 25);
		Time t3 = new Time();
		t3 = Time.sumTime(t1, t2);
		assertEquals(11, t3.getHrs());
		assertEquals(5, t3.getMins());
	}
}
