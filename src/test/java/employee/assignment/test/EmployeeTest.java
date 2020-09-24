package employee.assignment.test;

import employee.assignment.Employee;
import junit.framework.*;

public class EmployeeTest extends TestCase{
	
	public EmployeeTest(String testName) {
		super(testName);
	}
	
	public Test Suite() {
		return new TestSuite( EmployeeTest.class );
	}
	
	public void test() {
		assertTrue(true);
	}
	
	Employee e= new Employee(101,"Ram Kakani",20000);
	
	public void testAnnualBasic() {
		assertEquals(240000, e.getAnnualBasic());
	}
	
	public void testMonthlyGross() {
		assertEquals(32050, e.getMonthlyGrossSalary());
	}
	
	public void testAnnualGross() {
		assertEquals(384600, e.getAnnualGrossSalary());
	}
	
	public void testMonthlyDeduction() {
		assertEquals(2100, e.getMonthlyDeductions());
	}
	
	public void testMonthlyTakeHome() {
		assertEquals(29950, e.getMonthlyTakeHome());
	}
	
	public void testAnnualTakeHome() {
		assertEquals(359400, e.getAnnualTakeHome());
	}
}
