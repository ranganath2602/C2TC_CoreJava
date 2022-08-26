package com.cg.thiskeyword;

public abstract class Base1 {
	public Base1() {
		this(30);
		System.out.println("Default Constructor from Base1");
	}
	public Base1(int i) {
		System.out.println("constructor with int arg in Base 1, i is " + i);
	}
}
