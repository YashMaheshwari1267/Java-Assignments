package com.assignment.java;

import java.util.Arrays;

public class LargestThreeElements {
	
	static int[] findLargestThreeElements(int arr[]) {
		int[] temp = new int[3];
		Arrays.sort(arr);
		for(int i=0;i<3;i++)
			temp[i] = arr[arr.length-i-1];
		return temp;
	}
}
