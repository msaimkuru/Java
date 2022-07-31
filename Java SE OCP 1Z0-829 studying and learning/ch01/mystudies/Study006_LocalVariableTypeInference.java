package org.curlybrace.oopj.ocp1z0_829.ch01.mystudies;

/**
 * @author	Saim Kuru
 * @version 1.0
 * ------------
 * Objectives:
 * ------------ 
 * 1. Understanding the Local Variable Type Inference
 * ------------
 * Difficulty: Medium
 * ------------ 
 */

/* 
 * Terminal commands to run program
 * curlybrace@saim-MacBook-Pro src % javac org/curlybrace/oopj/ocp1z0_829/ch01/mystudies/Study006_LocalVariableTypeInference.java
 * curlybrace@saim-MacBook-Pro src % java org.curlybrace.oopj.ocp1z0_829.ch01.mystudies.Study006_LocalVariableTypeInference      
 */

public class Study006_LocalVariableTypeInference {
	//var iv1 = 3; // var is only for local variables but not for other type of variables!!!
	
	static {		
		System.out.println("""
				 -----------------------------------------------------------------------------------
				           L o c a l    V a r i a b l e    T y p e    I n f e r e n c e
				 ----------------------------------------------------------------------------------- 
				 Rules
				 -----
				 1) var is only for local variables but not for other type of variables!!!
				 
				 2) var is not allowed in a compound declaration
				 
				 3) Can not use var on variable without initializer
				 
				 4) Can not infer type for local variable initialized to 'null'
				 
				 5) var is not allowed to be used for method parameters
				 
				 6) "var" is not a reserved word but it is a reserved type name so maybe used as a
				 method or variable name.
				 -----------------------------------------------------------------------------------
				 """
		);		
	}
	public Study006_LocalVariableTypeInference() {
		var a = 1; // var allowed as a local variable in constructors (result of Rule 1)
	}
	
	public static void main(String[] args) {	
		//var lv1 = 5, lv2 = "abc"; // var is not allowed in a compound declaration (Rule 2)
		
		var lv1 = 5;
		var lv2 = 3.0;
		var lv3 = 4.0F;
		//
		var lvs1 = "bertrand";
		var lvs2 = "russell";
		//var lvs3; 				// Compiler Error: Can not use var on variable without initializer (Rule 3)
		//var n = null; 				// Compiler Error: Cannot infer type for local variable initialized to 'null' (Rule 4)
		//
		System.out.println(lv1);
		System.out.println(lv2);
		System.out.println(lv3);
		System.out.println(lvs1 + " " + lvs2);
	}
	
	/*
	public int add(var l1, var l2) //var is not allowed to be used for method parameters (Rule 5)
	{ 
		return l1 + l2; 
	}
	*/
	
	/*
	 *  COMPILES WELL: var is not a reserved word but it is a reserved type name so maybe used as a
	 *  method or variable name. (Rule 6)
	 */
	public void var() { 
		var var = "var";
	}
}