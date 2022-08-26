package com.cg.abstractclass;

public class KovaChampakali extends Champakali{
	
	public KovaChampakali() {
		System.out.println("Kova Champakali");
	}

	@Override
	public void makeChampakali() {
		System.out.println("Search the recipe for kova champakali");
		
	}

	@Override
	public String consume() {
		System.out.println(whoAmI);
		prepareToEat();
		return "eat when it is hot or cold";
	}

}
