package com.avd;

public class ReverseWords {
	public static void main(String[] args) {
		String str = "This is the test string";
		String splittedString[] = str.split(" ");
		StringBuffer result = new StringBuffer();
		for(String val : splittedString) {
			result= result.append(reverseWord(val)+" ");
		}
		System.out.println(result);
	}
	
	public static String reverseWord(String str) {
		return new StringBuffer(str).reverse().toString();
	}

}
