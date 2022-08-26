package com.cg.lesson6;

public class Base {
	/*
	 * Declare default public,private,protected variables
	 * 
	 */
	int var_default;
	public int var_public;
	private int var_private;
	protected int var_protected;
	
	/*
	 * Declare default public,private,protected methods
	 */
	
	void methodDefault( ) {
		System.out.println("Default access base class");
	}
	
	public void methodPublic( ) {
		System.out.println("Public access base class");
	}
	public void methodPrivate( ) {
		System.out.println("Private access base class");
	}
	public void methodProtected( ) {
		System.out.println("Protected access base class");
	}
}
