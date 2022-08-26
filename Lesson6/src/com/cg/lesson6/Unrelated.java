package com.cg.lesson6;

public class Unrelated {
	Unrelated(){
		/*
		 * accessed by base class
		 */
		
		/* var_default = 10;
		var_public=20;  // ? Reason
		var_protected=40; */
		
		Base obj = new Base();
		obj.var_default = 10;
		obj.var_public=20;
		obj.var_protected=40;
		// var_private=30; //won't work bcoz its private
		
		obj.methodDefault();
		obj.methodPublic();
		// obj.methodPrivate(); //won't work
		obj.methodProtected();
	}
}
