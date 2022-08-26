package com.cg.string;

public class StringBuffDemoClass {
	
	public static void main(String[] args) {
		/* StringBuffer sc = new StringBuffer("Hello World ");
		System.out.println("buffer = " +sc);
		System.out.println("length = " +sc.length()); //11
		System.out.println("capacity = " +sc.capacity()); //16+11=27 ~ no. of chars can be stored//
		
		int a = 40;
		StringBuffer s;
		s = sc.append("a = ").append(a).append("!"); //.toString() can also be used
		System.out.println(s); */
		
		StringBuffer sc = new StringBuffer("I  Java!");
		sc.insert(2, "like");
		System.out.println(sc);
	}

}
