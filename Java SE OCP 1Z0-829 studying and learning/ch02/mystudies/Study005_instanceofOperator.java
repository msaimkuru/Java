package org.curlybrace.oopj.ocp1z0_829.ch02.mystudies;

/**
 * @author	Saim Kuru
 * @version 1.0
 * ------------
 * Objectives:
 * ------------ 
 * 1. Understanding instanceof Operator
 * ------------ 
 * Difficulty: Medium
 * ------------ 
 * NOTES
 * ------------ 
 */

/* Terminal commands to run program
 * curlybrace@saim-MacBook-Pro src % javac org/curlybrace/oopj/ocp1z0_829/ch02/mystudies/Study005_instanceofOperator.java
 * curlybrace@saim-MacBook-Pro src % java org.curlybrace.oopj.ocp1z0_829.ch02.mystudies.Study005_instanceofOperator      
 */

public class Study005_instanceofOperator {
	static {
		System.out.println("""
		--------------------------------------------------------------------------------
		i n s t a n c e o f   O p e r a t o r
		--------------------------------------------------------------------------------
		* instanceof operator is useful for determining whether an arbitrary object is a
		member of a particular class or interface at runtime.
		
		* null reference doesn't refer to any object, that's why;
		
		  null instanceof <AnyType (except literal null)> always returns false.
		
		* It's not allowed to use null on the right side of instanceof operator. 
		
		  null instanceof null does not compile.
		--------------------------------------------------------------------------------
		--------------------------------------------------------------------------------
		Explanation for the Example
		--------------------------------------------------------------------------------
		1) printTime(Number time) method can get references to instances of Integer, 
		Short, Byte, etc.
		
		1) Number is an abstract class. So, Number num = 9; statement causes an auto-boxing
		to create an Integer instance from int 9 literal value. That's why both
		num instanceof Number and num instanceof Integer expressions evaluates to true.
		--------------------------------------------------------------------------------
		""");
	}
	
	public static void printTime(Number time) {
		if(time instanceof Integer || time instanceof Short || time instanceof Byte) {
			if(time instanceof Integer)
				System.out.println((Integer)time + " o'clock.....");
			/*
			else if(time instanceof String)
				System.out.println(time + " o'clock.");

			--------------------------------------------------------------------------
			DOES NOT COMPILE: Incompatible conditional operand types Number and String
			--------------------------------------------------------------------------		
			error: incompatible types: Number cannot be converted to String
			else if(time instanceof String)
			        ^
			--------------------------------------------------------------------------
			*/	
			else
				System.out.println(time + " o'clock*****");
		}
		else {
			System.out.println(time);
		}
	}
	
	public static String nullInstanceOf() {
		return "null instanceof String-->" + (null instanceof String);
		/*
		System.out.println(null instanceof null);
		---------------------------------------------------------
		DOES NOT COMPILE: Incompatible conditional operand types
		---------------------------------------------------------
		error: illegal start of type
		System.out.println(null instanceof null);
		                                   ^
		---------------------------------------------------------
		*/                                   
	}
	
	public static void printIfObjectInstanceOfType() {
		Integer intgr = Integer.valueOf(5);
	    Number num = 9;

	    System.out.println("intgr instanceof Number-->" + (intgr instanceof Number));
	    System.out.println("num instanceof Number-->" + (num instanceof Number));
	    System.out.println("num instanceof Integer-->" + (num instanceof Integer));
	}
	
	public static void main(String[] args) {
		printTime(Integer.valueOf(10));		// Prints-->10 o'clock.....
		printTime(Byte.valueOf((byte)10));	// Prints-->10 o'clock*****
		printTime(Float.valueOf(10.0f));		// Prints-->10.0
		//
		System.out.println("------------------------------");
		System.out.println(nullInstanceOf());
		//
		System.out.println("------------------------------");
		printIfObjectInstanceOfType();
		//
		System.out.println("------------------------------");
	}
}