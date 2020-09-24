package com.assignment.java;

public class PerfectSquare {
	static boolean isPerfectSquare(int num) {
		double sqRoot = Math.sqrt(num);
		if((sqRoot - Math.floor(sqRoot)) == 0)
			return true;
		return false;
	}
}
