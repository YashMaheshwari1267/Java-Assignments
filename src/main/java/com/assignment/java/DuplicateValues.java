package com.assignment.java;

import java.util.HashMap;

public class DuplicateValues {
	
	static int findDuplicateValues(String s) {
		int count=0;
		s.toLowerCase();
		HashMap<Character, Integer> map =new HashMap<Character, Integer>();
		char arr[]= s.toCharArray();
		for(int i=0;i<s.length();i++) {
			if(map.containsKey(arr[i]))
				map.put(arr[i], map.get(arr[i]) + 1);
			else
				map.put(arr[i], 1);
		}
		for(Integer i : map.values()) {
			if(i > 1)
				count++;
		}
		return count;
	}

}
