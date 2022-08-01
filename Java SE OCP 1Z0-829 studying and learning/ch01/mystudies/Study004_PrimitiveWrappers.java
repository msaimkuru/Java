package org.curlybrace.oopj.ocp1z0_829.ch01.mystudies;

/**
 * @author	Saim Kuru
 * @version 1.0
 * ------------
 * Objectives:
 * ------------ 
 * 1. Understanding how to produce/create Wrapper and primitives.
 * ------------
 * Difficulty: Easy
 * ------------ 
 */

/* 
 * Terminal commands to run program
 * curlybrace@saim-MacBook-Pro src % javac org/curlybrace/oopj/ocp1z0_829/ch01/mystudies/Study004_PrimitiveWrappers.java
 * curlybrace@saim-MacBook-Pro src % java org.curlybrace.oopj.ocp1z0_829.ch01.mystudies.Study004_PrimitiveWrappers      
 */
public class Study004_PrimitiveWrappers {

	public static void main(String[] args) {
		System.out.println("""
		------------------------------------ Notes: ------------------------------------
		* parseInt(), parseFloat(), etc. methods return primitive numeric values from 
		the given parameters.
		
		* valueOf() methods construct wrappers from the given parameters.
		
		* intValue(), floatValue(),  etc. methods return primitive numeric values from 
		the wrapper numeric objects.
		--------------------------------------------------------------------------------
		"""
		);
		int i1 = Integer.parseInt("123");				// Parses int from the given parameter
		Integer I1 = Integer.valueOf("456");				// Constructs a wrapper from the given parameter
		int i2 = I1.intValue();							// Gives int value of the object referenced.
		//
		byte b1 = Integer.valueOf(i1).byteValue();		// Gives byte value of the object referenced.
		byte b2 = I1.byteValue();						// Gives byte value of the object referenced.
		//
		System.out.println("i1-->" + i1);
		System.out.println("i2-->" + i2);
		System.out.println("b1-->" + b1);
		System.out.println("b2-->" + b2);					//because of overflow it gets -56
		//
		System.out.println();
		float f1 = Float.parseFloat("3.1");
		Float F2 = Float.valueOf("4.5");
		float f2 = F2.floatValue();
		System.out.println("f1,f2-->" + f1 + "," + f2);
	}
}