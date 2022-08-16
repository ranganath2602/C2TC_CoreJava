package com.cg.string;

public class StringCompare {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = new String(s1);
		
		System.out.println(s1 + " equals " + s2 + " is " + s1.equals(s2));
		
		System.out.println(s1 + " == " + s2 + " is " + (s1==s2));
	}

}
