package com.cg.superkeyword;

public class Executor {
	
	public static void main(String[] args) {
		Base2 obj2 = new Base2();
		System.out.println("------------------>");
		System.out.println("creating obj of base 2");
		
		Base1 obj3 = new Base2(4);
	}
}
