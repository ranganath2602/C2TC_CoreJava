package com.cg.abstractclass;

public class Executor {

	public static void main(String[] args) {
		
		// Food f = new Food(); cannot create obj for abstract class
		System.out.println("creating obj for cherry champakali");
		Food CherryChampakali = new CherryChampakali();
		
		System.out.println("creating obj for kova champakali");
		Food KovaChampakali = new KovaChampakali();
		
		CherryChampakali cherryChampakali1 = new CherryChampakali();
		cherryChampakali1.makeChampakali();
		System.out.println(CherryChampakali.consume());
	}
}

