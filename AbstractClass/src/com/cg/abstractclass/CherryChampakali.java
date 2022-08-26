package com.cg.abstractclass;

public class CherryChampakali extends Champakali{
	public CherryChampakali() {
		System.out.println("Cherry Champakali");
	}

	@Override
	public void makeChampakali() {
		System.out.println("Search the recipe for cherry champakali");
		
	}

	@Override
	public String consume() {
		System.out.println(whoAmI);
		prepareToEat();
		
		return "eat when it is hot or cold";
	}

}
