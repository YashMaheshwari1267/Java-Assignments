package com.assignment.java;


 
public class FindCommonElements {
	
	// Method to find common elements from given arrays
	static int[] findCommonElements(int arr1[],int arr2[],int arr3[]) {
		int temp[]= new int[arr1.length];
		for(int i=0,j=0;i<arr1.length;i++) {
			if(findItem(arr2, arr1[i]) && findItem(arr3, arr1[i])) {
				temp[j++] = arr1[i];
			}
		}
		return temp;
	}
	
	// Method to find a item in given array
	static boolean findItem(int arr[],int item) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == item)
				return true;
		}
		return false;
	}
}
