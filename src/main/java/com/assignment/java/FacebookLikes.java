package com.assignment.java;

public class FacebookLikes {
	static String facebookLikes(String arr[]){
		String temp = "";
		if(arr.length == 0)
			temp="no one likes this";
		else if(arr.length == 1)
			temp=arr[0] + " likes this";
		else if(arr.length == 2)
			temp= arr[0] + " and " + arr[1] + " likes this";
		else if(arr.length == 3)
			temp= arr[0] +", "+ arr[1] + " and " + arr[2] + " likes this";
		else
			temp= arr[0] + ", "+ arr[1] + " and " + (arr.length-2) + " others likes this";
		return temp;
	}
}
