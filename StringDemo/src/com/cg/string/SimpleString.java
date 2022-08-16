package com.cg.string;

public class SimpleString {

	public static void main(String[] args) {
		char c[] = {'J', 'A','V','A'};
		String s1 = new String(c);
		
		System.out.println(s1);
		
		String sentence = "Welcome to the session." + " Session Begins Shortly."
		+ " We are learning JAVA.";
		
		System.out.println(sentence);
		
		String name1 = "Rachana ";
		String name2 = "Inder ";
		String name3 = "Varma";
		String PrintName=name1.concat(name2.concat(name3));
		
		System.out.println(PrintName);
	}

}
