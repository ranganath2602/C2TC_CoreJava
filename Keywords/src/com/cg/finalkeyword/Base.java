package com.cg.finalkeyword;

public class Base {
	final int varfinal = 4;

	public Base() {
		System.out.println("def cons in base");
	}
	public void methodX() {
		System.out.println("method X body");
	}
	public final void methodY() {
		System.out.println("method Y body");
	}
}
