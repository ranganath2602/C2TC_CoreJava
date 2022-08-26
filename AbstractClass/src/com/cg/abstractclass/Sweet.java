package com.cg.abstractclass;

public abstract class Sweet extends Food{
	public Sweet() {
		System.out.println("Is a sweet");
	}
	@Override
	public String taste() {
		return "Sweet";
	}
}
