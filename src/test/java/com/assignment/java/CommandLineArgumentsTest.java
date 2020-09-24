package com.assignment.java;

import junit.framework.*;

public class CommandLineArgumentsTest extends TestCase{
	
	public CommandLineArgumentsTest(String testName) {
		super(testName);
	}
	
	public static Test Suite() {
		return new TestSuite(CommandLineArgumentsTest.class);
	}
	
	public void test() {
		assertTrue(true);
	}
	
	public void testPrintSum() {
		assertEquals(10, CommandLineArguments.printSum(1,4,5));
	}
}
