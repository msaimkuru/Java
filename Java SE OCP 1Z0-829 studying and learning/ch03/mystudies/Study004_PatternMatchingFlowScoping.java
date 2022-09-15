package org.curlybrace.oopj.ocp1z0_829.ch03.mystudies;

/**
 * @author	Saim Kuru
 * @version 1.0
 * ------------
 * Objectives:
 * ------------ 
 * 1. Understanding Flow Scoping in Pattern Matching
 * ------------
 * Difficulty: High
 * ------------ 
 * NOTES
 * ------------ 
 * The compiler applies flow scoping when working with pattern matching.
 * 
 * HOW FLOW SCOPING WORKS:
 * 
 * In particular, it is possible to use a pattern variable outside of the if statement, 
 * but only when the compiler can definitively determine its type.
 * ------------   
 */

/* 
 * Terminal commands to run program
 * curlybrace@saim-MacBook-Pro src % javac org/curlybrace/oopj/ocp1z0_829/ch03/mystudies/Study004_PatternMatchingFlowScoping.java
 * curlybrace@saim-MacBook-Pro src % java org.curlybrace.oopj.ocp1z0_829.ch03.mystudies.Study004_PatternMatchingFlowScoping      
 */

public class Study004_PatternMatchingFlowScoping {
	public static void patternVariableNotInScope1(Number number) {
		/* 
		 * EXPLANATION:
		 * If the input does not inherit Integer, the data variable won't be defined.
		 * Since the compiler cannot guarantee that number is an instance of Integer,
		 * data is not in scope. And the code does not compile.
		 */
		/*
		if(number instanceof Integer data || data.compareTo(5) > 0 // DOES NOT COMPILE --> data cannot be resolved to a variable
		) {
			System.out.println(data);
		}
		*/
	}
	
	/* 
	 * EXPLANATION:
	 * This method returns if the input does not inherit Integer.
	 * This means when the last line of this method is reached, the input must inherit Integer, and
	 * therefore data stays in scope even after the if statement ends.
	 */
	public static void patternVariableInScope1(Number number) {
		if(!(number instanceof Integer data))
			return;
		System.out.println(data.intValue());
	}
	
	//A Totally equivalent method of patternVariableInScope1
	public static void patternVariableInScope1EquivalentMethod(Number number) {
		if(number instanceof Integer data)
			System.out.println(data.intValue());
		else
			return;
	}
	
	public static void main(String[] args) {
		patternVariableNotInScope1(1000);
		patternVariableInScope1(2000);
		patternVariableInScope1EquivalentMethod(2000);
	}
}