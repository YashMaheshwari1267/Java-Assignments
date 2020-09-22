package com.assignment.java;

public class PushZerosToEnd {
	
	static int[] pushZero(int a[]) {
		for(int i=0,j=1;i<a.length-1;i++,j++) {
			if(a[i] == 0 && a[j] != 0) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		return a;
	}
}
