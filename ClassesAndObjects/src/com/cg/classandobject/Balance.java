package com.cg.classandobject;

public class Balance {
	private String name;
	private double balance;

	public Balance(String name, double balance) {
		super();
		this.name = name;
		this.balance = balance;
	}
	public void show() {
		if(balance<0)
			System.out.println("Insufficient balance");
			System.out.println("-->> ");
			System.out.println(name + ": INR " + balance);
		}
	}
