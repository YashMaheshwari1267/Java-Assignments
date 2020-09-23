package com.assignment.java;

import java.util.HashMap;

public class OddTimes {
	static int findOdd(int arr[]) {
		int n=0;
		HashMap<Integer, Integer> list= new HashMap<Integer, Integer>();
		for(int i=0;i<arr.length;i++) {
			if(list.containsKey(arr[i]))
				list.put(arr[i], list.get(arr[i]) + 1);
			else
				list.put(arr[i], 1);
		}
		for(Integer i : list.keySet()) {
			if((list.get(i) % 2) != 0 ) {
				n = i; 
				break;
			}
		}
		return n;
	}
}
