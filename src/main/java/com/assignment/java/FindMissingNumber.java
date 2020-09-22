package com.assignment.java;

public class FindMissingNumber {
	static int findNumber(int arr[]) {	
		int sum=0,n=10;
		for (int i=0;i<n-1;i++) {
			sum+=arr[i];
		}
		int actualSum = (n)*(n + 1)/2;
		return actualSum-sum;
	}
}
