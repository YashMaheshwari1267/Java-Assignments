package com.assignment.java;

import java.util.*;

public class SortString {
	static String sortString(String str) {
		String[] s=str.split("\\s");
		SortedMap<Integer, String> map = new TreeMap<Integer, String>();
		for(int i=0;i<s.length;i++) {
			map.put(findInt(s[i]), s[i]);
		}
		String result="";
		for(String ss: map.values()) {
			result = result.concat(ss+" ");
		}
		return result;
	}
	
	static int findInt(String s) {
		char []c= s.toCharArray();
		int t=0;
		for(int i=0;i<c.length;i++) {
			if(c[i]=='1' || c[i]=='2' || c[i]=='3' || c[i]=='4' || c[i]=='5' || c[i]=='6' || c[i]=='7' || c[i]=='8' || c[i]=='9') {
				t=c[i];
				break;
			}
		}
		return t;
	}
}
