package com.cg.string;

public class StringCapacity {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());
		sb.append("Hello");
		System.out.println(sb.capacity());
		sb.append("java is favourite language to others");
		System.out.println(sb.capacity());
	}

}
