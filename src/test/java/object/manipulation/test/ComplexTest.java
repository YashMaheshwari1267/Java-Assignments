package object.manipulation.test;
import junit.framework.*;
import object.manipulation.Complex;

public class ComplexTest extends TestCase {
	public ComplexTest(String testName) {
		super(testName);
	}
	
	public Test Suite() {
		return new TestSuite(ComplexTest.class);
	}
	
	public void test() {
		assertTrue(true);
	}
	
	public void testSum() {
		Complex c3 = new Complex(0f,0f);
		c3 = Complex.sumComplex(new Complex(3,7),new Complex(8,11));
		String result = (c3.getReal() + "+" + c3.getImg() +"i").toString();  
		assertTrue("11.0+18.0i".equals(result));;
	}
}
