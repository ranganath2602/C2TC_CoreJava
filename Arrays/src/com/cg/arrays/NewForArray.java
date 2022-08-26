package com.cg.arrays;

import java.util.Arrays;

public class NewForArray {

	public static void main(String[] args) {
		int j = 0;
		int[] sqrs= {0,1,4,9,16,25};
		System.out.println(Arrays.binarySearch(sqrs, 4));
		
		for(int i: sqrs) {
			System.out.println("The square of " +(j++) + " is " + i);
		}
		//copyof
		
		/* int[] num=Arrays.copyOf(sqrs, 3);
		for(int val:num) {
			System.out.println(val); 
		} */
		/*int[] num1 = Arrays.copyOfRange(sqrs, 2, 4);
		for(int val:num1) {
			System.out.println(val);
		}*/
		Arrays.fill(sqrs, 6);
		for(int val:sqrs) {
		System.out.println("The element in the index " + (j++) + " is " + val);
		}
	}
}
