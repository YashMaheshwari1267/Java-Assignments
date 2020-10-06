package collection.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import collection.assignments.MMSavingsAccount;
import junit.framework.*;

public class TestMMBank extends TestCase {

	protected ArrayList<MMSavingsAccount> list = new ArrayList<MMSavingsAccount>();

	public TestMMBank(String testName) {
		super(testName);
	}

	public Test Suite() {
		return new TestSuite(TestMMBank.class);
	}

	protected void setUp() {
		MMSavingsAccount msa1 = new MMSavingsAccount(101, "Yash", 10000, true);
		MMSavingsAccount msa2 = new MMSavingsAccount(102, "Vipul", 15000, true);
		MMSavingsAccount msa3 = new MMSavingsAccount(103, "Yashi", 12000, false);
		MMSavingsAccount msa4 = new MMSavingsAccount(104, "Yogesh", 11000, true);
		MMSavingsAccount msa5 = new MMSavingsAccount(105, "Ram", 9000, false);

		list.add(msa1);
		list.add(msa2);
		list.add(msa3);
		list.add(msa4);
		list.add(msa5);
	}

	public void test() {
		assertTrue(true);
	}

	// test the list
	public void testList() {
		assertEquals(5, list.size());
	}

	// saving list to file and retrieving it and checking if both list are same
	public void testFile() throws IOException, ClassNotFoundException {
		FileOutputStream file = new FileOutputStream("E:/employeeList.txt");
		ObjectOutputStream os = new ObjectOutputStream(file);
		os.writeObject(list);
		os.close();

		FileInputStream fin = new FileInputStream("E:/employeeList.txt");
		ObjectInputStream objectIn = new ObjectInputStream(fin);

		ArrayList<MMSavingsAccount> newList= ((ArrayList<MMSavingsAccount>) objectIn.readObject());
		System.out.println(newList.toString());
		objectIn.close();
		
		assertTrue(list.equals(newList));
	}
}
