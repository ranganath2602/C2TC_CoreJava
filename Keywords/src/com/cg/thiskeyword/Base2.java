package com.cg.thiskeyword;

public class Base2 {
	Base2(){
		System.out.println("Default constructor in Base 2");
	}
	Base2(int i){
		this(i,10);
		//super(i);
		System.out.println("constructor with int arg in Base 2, i is" + i);
	}
	Base2(int i, int j){
		System.out.println("constructor with 2 int arg in Base 2, i is" + i + " and j is " + j);
	}
}
