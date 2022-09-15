package org.curlybrace.oopj.ocp1z0_829.ch03.mystudies;

/**
 * @author	Saim Kuru
 * @version 1.0
 * ------------
 * Objectives:
 * ------------ 
 * 1. Understanding Pattern Matching with instanceof Operator
 * ------------
 * Difficulty: High
 * ------------ 
 * NOTES
 * ------------ 
 * compareTo() method is defined on Integer, but not on Number.
 * ------------  
 */

/* 
 * Terminal commands to run program
 * curlybrace@saim-MacBook-Pro src % javac org/curlybrace/oopj/ocp1z0_829/ch03/mystudies/Study001_PatternMatchingWithInstanceOf.java
 * curlybrace@saim-MacBook-Pro src % java org.curlybrace.oopj.ocp1z0_829.ch03.mystudies.Study001_PatternMatchingWithInstanceOf      
 */

public class Study001_PatternMatchingWithInstanceOf {
	static {
		System.out.println("""
		--------------------------------------------------------------------------------
		P a t t e r n   M a t c h i n g   w i t h   I f   S t a t e m e n t s   and   
		i n s t a n c e o f   O p e r a t o r  
		--------------------------------------------------------------------------------
		* Introduced officially by Java 16
		* Pattern matching is a tool to reduce boilerplate code
		* Declaration and assignment of pattern variable executes only if the implicit
		  instanceof operator returns true. 
		--------------------------------------------------------------------------------			
		""");
	}
	
	public static void compareIntegers1(Number number, int intToCompare) {
		System.out.println("""
		------------------------------------------------------
		EXAMPLE 1: Conventional type casting 
		------------------------------------------------------
		compareIntegers1():
		Code first checking if a variable (here number) is of a particular type and then immediately casting it to
		that type (here Integer).
		"""
		);
		
		if(number instanceof Integer) {
			Integer data = (Integer) number;
			System.out.println("compareIntegers1() Comapring " + data.intValue() + " to " + intToCompare + "-->" + data.compareTo(intToCompare));
			System.out.println("--------------------------------------------------------------------------------");
		}
	}
	
	public static void compareIntegers2(Number number, int intToCompare) {
		System.out.println("""
		------------------------------------------------------
		EXAMPLE 2: Shortening code with pattern matching
		------------------------------------------------------
		compareIntegers2() is the same as compareIntegers1()
		The only difference is: 
		Code "first checking if a variable (here number) is of a particular type and then immediately casting it to
		that type (here Integer)." is shortened by pattern matching.				
		"""
		);
		
		if(number instanceof Integer data /* here variable data is referred to as "pattern variable" */) {
			System.out.println("compareIntegers2() Comapring " + data.intValue() + " to " + intToCompare + "-->" + data.compareTo(intToCompare));
		}
		else return;
		
		System.out.println("data-->" + data); // without "else return" branch we couldn't use pattern variable data here
		System.out.println("--------------------------------------------------------------------------------");	
	}

	public static void compareIntegers3(Number number, int intToCompare) {
		System.out.println("""
		------------------------------------------------------
		EXAMPLE 3: Reassigning a pattern variable
		------------------------------------------------------
		Reassigning a pattern variable is possible but not advised since doing so can lead to ambiguity about what is and is not in scope. 
		"""
		);
			
		if(number instanceof Integer data /* here variable data is referred to as "pattern variable" */) {
			data = 0; // This is reassigning the pattern variable data.
			System.out.println("compareIntegers3() Comapring " + data.intValue() + " to " + intToCompare + "-->" + data.compareTo(intToCompare));
			System.out.println("--------------------------------------------------------------------------------");			
		}
	}	

	public static void compareIntegers4(Number number, int intToCompare) {
		System.out.println("""
		------------------------------------------------------
		EXAMPLE 4: Making a pattern variable final
		------------------------------------------------------
		To prohibit reassigning a pattern variable we use final modifier in patter matching expression
		"""
		);
		//
		if(number instanceof final Integer data /* here variable data is referred to as "pattern variable" */) {
			/*
			 data = 0;
			 ---------------------------------------------------------------------------------
			 DOES NOT COMPILE: The pattern variable data is final and cannot be assigned again
			 ---------------------------------------------------------------------------------
			 error: cannot assign a value to final variable data
			 data = 0;
			 ^
			 ---------------------------------------------------------------------------------
			 */
			System.out.println("compareIntegers4() Comapring " + data.intValue() + " to " + intToCompare + "-->" + data.compareTo(intToCompare));
			System.out.println("--------------------------------------------------------------------------------");
		}
	}
	
	public static void main(String[] args) {
		compareIntegers1(3, 5);
		compareIntegers2(10, 5);
		compareIntegers3(10, 5);
		compareIntegers4(10, 5);
	}
}