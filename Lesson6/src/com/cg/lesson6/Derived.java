package com.cg.lesson6;

public class Derived extends Base{
	Derived(){
		var_default = 10;
		var_public=20;
		var_protected=40;
		// var_private=5;
		
		methodDefault();
		methodPublic();
		// methodPrivate();
		methodProtected();
	}

}
