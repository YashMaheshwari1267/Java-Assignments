package com.assignment.java;

import java.util.ArrayList;
import java.util.Collections;

public class RearrangeDigits {
	static int[] rearrange(int x) {
		ArrayList<Integer> arr=  new ArrayList<Integer>();
		while(x > 0) {
			arr.add(x % 10);
			x=x/10;
		}
		Collections.sort(arr);
		Collections.reverse(arr);
		int [] ints = new int[arr.size()];
		int i=0;
		for(Integer n: arr) {
			ints[i++]= n;
		}
		return ints;
	}

}
