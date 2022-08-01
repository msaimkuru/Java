package org.curlybrace.oopj.ocp1z0_829.ch01.mystudies;

/**
 * @author	Saim Kuru
 * @version 1.0
 * ------------
 * Objectives:
 * ------------ 
 * 1. Understanding the need for initializing local variables before they are used.
 * ------------
 * Difficulty: Medium
 * ------------ 
 */

/* 
 * Terminal commands to run program
 * curlybrace@saim-MacBook-Pro src % javac org/curlybrace/oopj/ocp1z0_829/ch01/mystudies/Study005_InitializingLocalVariables.java
 * curlybrace@saim-MacBook-Pro src % java org.curlybrace.oopj.ocp1z0_829.ch01.mystudies.Study005_InitializingLocalVariables      
 */

public class Study005_InitializingLocalVariables {
	static {
		System.out.println("""
		 --------------------------------------------------------------------------------		
		        I n i t i a l i z i n g    L o c a l    V a r i a b l e s
		 --------------------------------------------------------------------------------       
		 * Local variables need to be initialized before they are accessed/used.
		 
		 * An uninitialized but never accessed/used local variable doesn't produce a 
		 compiler error.
		 
		 * An uninitialized/potentially uninitialized and accessed/used local variable 
		 produces a compiler error.
		 
		 --------------------------------------------------------------------------------
		 Sample Compiler Error:
		 --------------------------------------------------------------------------------
		 Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
		 The local variable d may not have been initialized
		 at org.curlybrace.oopj.ocp1z0_829.ch01.mystudies.Study005_InitializingLocalVariables.main(Study005_InitializingLocalVariables.java:83)
		 --------------------------------------------------------------------------------
		 """
		);		
	}
	
	public static void main(String[] args) {
		/*
		 * local variable a is initialized before it is used.
		 */		
		int a;
		/*
		 * local variable b is initialized in any condition before it is 
		 * used.
		 */
		int b;
		/*
		 * local variable c is never initialized in the code block. 
		 * It would cause a compiler error if we tried to use/access 
		 * it in the code block. As we didn't use it, compiler 
		 * doesn't give any error.
		 */
		int c;
		/*
		 * local variable d is conditionally initialized in the code 
		 * block. So, it would cause a compiler error if we tried to 
		 * use/access it in the code block. As we didn't use it, 
		 * compiler doesn't give any error.
		 */		
		int d;
		//
		a = 5;
		//
		if ( a > 0 ) {
			b = 1;
			d = -1; // d is initialized here
		}
		else {
			b = -1;
			// d is npt initialized here
		}
		//
		System.out.println("local variable a -->" + a);
		System.out.println("local variable b -->" + b);
		/*System.out.println(d); /* d is accessed here and is potentially uninitialized.
								  * DOES NOT COMPILE: The local variable d may not have been initialized
								  */
	}
}