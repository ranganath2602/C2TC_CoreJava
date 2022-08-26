package com.cg.abstractclass;

public abstract class Spicy extends Food{
	public Spicy() {
		System.out.println("Is spicy");
	}
	@Override
	public String taste() {
		return "spicy";
	}
}
