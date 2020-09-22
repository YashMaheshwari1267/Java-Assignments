package com.assignment.java;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import java.util.*;

public class AppTest extends TestCase{
	
	public int arr1[] = {1,2,4,6,3,7,8,9,10};
    public int arr2[] = {10,4,3,50,0,90};
    public int arr3[] = {1,5,10,20,0,7};
	
    public AppTest( String testName )
    {
        super( testName );
    }

    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    public void testApp()
    {
        assertTrue( true );
    }
    
    // Testing the findMissingNumber function when number is anywhere in middle 
    public void testFindMissingNumber() {
    	assertEquals("Cheking the output ",5,FindMissingNumber.findNumber(arr1));
    }
    
    // Testing the findMissingNumber function when number is at starting 
    public void testFindMissingNumber1() {
    	int temp [] = {2,3,4,5,6,7,8,9,10};
    	assertEquals("Cheking the output ",1,FindMissingNumber.findNumber(temp));
    }
    
    // Testing the findMissingNumber function when number is at end 
    public void testFindMissingNumber2() {
    	int temp [] = {1,2,3,4,5,6,7,8,9};
    	assertEquals("Cheking the output ",10,FindMissingNumber.findNumber(temp));
    }
    
    // Testing the LargestThreeElements function with random numbers
    public void testLargestThreeElements() {
    	int temp [] = {90,50,10};
    	int temp1 [] = LargestThreeElements.findLargestThreeElements(arr2);
    	assertTrue(Arrays.equals(temp, temp1));
    }
    
    // Testing the LargestThreeElements function with equal numbers
    public void testLargestThreeElements1() {
    	int temp [] = {90,90,90};
    	int test [] = {11,5,90,74,9,90,90};
    	int temp1 [] = LargestThreeElements.findLargestThreeElements(test);
    	assertTrue(Arrays.equals(temp, temp1));
    }
    
    // Testing the findCommonElements function
    public void testFindCommonElements() {
    	int temp [] = {10,0,0,0,0,0,0,0,0};
    	int temp1 [] = FindCommonElements.findCommonElements(arr1,arr2,arr3);
    	assertTrue(Arrays.equals(temp, temp1));
    }
    
    // Testing the pushZero function
    public void testPushZerosToEnd() {
    	int temp [] = {1,5,10,20,7,0};
    	int temp1 [] = PushZerosToEnd.pushZero(arr3);
    	assertTrue(Arrays.equals(temp, temp1));
    }
}
