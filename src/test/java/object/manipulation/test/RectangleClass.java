package object.manipulation.test;

import junit.framework.*;
import object.manipulation.Rectangle;

public class RectangleClass extends TestCase{
	
	public RectangleClass(String testName) {
		super(testName);
	}
	
	public Test Suite() {
		return new TestSuite(RectangleClass.class);
	}
	
	public void test() {
		assertTrue(true);
	}
	
	public void testArea() {
		assertEquals(200.0f,new Rectangle(10,20).getArea());
	}
	
	public void testPerimeter() {
		assertEquals(60.0f,new Rectangle(10,20).getPerimeter());
	}
	
	Rectangle r = new Rectangle();
	
	public void testCompareAreaEqual() {
		assertTrue(r.isAreaEqual(new Rectangle(10,20), new Rectangle(40,5)));
	}
	
	public void testCompareAreaNotEqual() {
		assertFalse(r.isAreaEqual(new Rectangle(10,20), new Rectangle(40,10)));
	}
}
