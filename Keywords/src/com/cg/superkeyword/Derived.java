package com.cg.superkeyword;

public class Derived {
	Derived(){
		System.out.println("Default constructor in the derived class");
	}
	
	Derived(int i, int j){
		super(i);
		System.out.println("constructor with 2 int arg in Base 2, i is" + i + " and j is " + j);
	}
	Derived(int i){
		System.out.println("Constructor with int arg o derived class, i is " + i);
	}
}
