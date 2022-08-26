package com.cg.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpTest {

	public static void main(String[] args) {
		/* String input = "Test String";
		String pattern = "Test String";
		
		boolean patternMatched=Pattern.matches(pattern, input);
		System.out.println(patternMatched); */
		
		String input = "Shop, Mop, hopping, chopping";
		
		Pattern pattern = Pattern.compile("hop");
		Matcher m=pattern.matcher(input);
		System.out.println(m.matches());
		while(m.find()) {
			System.out.println(m.group() + ": " + m.start() + "," + m.end());
		}
	}

}
