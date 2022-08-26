package com.cg.abstractclass;

public abstract class Food {
	/*
	 * abstract keyword can be used for class/method
	 * cannot be used for variables & constructors
	 */
	public static final String whoAmI = "I am eatable"; //final = constant static = global variable
	
	public Food() {
		System.out.println("is a food");
	}
	
	public abstract String consume() ; //abstract method
	public abstract String taste();
	
	protected void prepareToEat() { //non-abstract method
		wash();
		System.out.println("Wash your hands");
	}
	
	private void wash() {
		System.out.println("Done washing your hands?");
	}
}
