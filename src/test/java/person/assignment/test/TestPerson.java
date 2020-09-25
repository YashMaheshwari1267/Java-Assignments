package person.assignment.test;
import junit.framework.*;
import person.assignment.Person;

public class TestPerson extends TestCase{
	
	public TestPerson(String testName) {
		super(testName);
	}
	
	public Test Suite() {
		return new TestSuite( TestPerson.class );
	}
	
	public void test() {
		assertTrue(true);
	}
	
	public void testOlderOne() {
		Person person1 = new Person("Ram",5,6,1980);
		Person person2 = new Person("Shyam",2,3,1987);
		String result = person1.olderOne(person2);
		assertTrue("Ram is older than Shyam by 6 years,8 months,25 days".equals(result));
	}
	
}
