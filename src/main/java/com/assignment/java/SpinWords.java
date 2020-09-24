package com.assignment.java;

public class SpinWords {
	static String spinWords(String str) {
		String[] s=str.split("\\s");
		for(int i=0;i<s.length;i++) {
			if(s[i].length() >= 5) {
				s[i]=reverseString(s[i]);
			}
		}
		String result="";
		for(String s1: s) {
			result = result.concat(s1+" "); 
		}
		return result;
	}
	
	static String reverseString(String s) {
		StringBuilder sb= new StringBuilder(s);
		sb.reverse();
		return sb.toString();
	}
}
