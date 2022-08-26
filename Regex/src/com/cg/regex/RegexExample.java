package com.cg.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {

	public static void main(String[] args) {
		String line = "Hi welcome to full stack java training 200 days got over! right?";
		String pattern = "(.*)";
		//create obj for pattern
		Pattern r = Pattern.compile(pattern);
		//create obj for matcher
		Matcher m = r.matcher(line);
		if(m.find()) {
			System.out.println("Found the value :" +m.group());
		}
		else {
			System.out.println("xxx");
		}
	}

}
