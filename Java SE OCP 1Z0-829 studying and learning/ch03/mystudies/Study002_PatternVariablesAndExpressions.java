package org.curlybrace.oopj.ocp1z0_829.ch03.mystudies;

/**
 * @author	Saim Kuru
 * @version 1.0
 * ------------
 * Objectives:
 * ------------ 
 * 1. Understanding ................................................................
 * ------------
 * Difficulty: Medium
 * ------------ 
 */

/* Terminal commands to run program
 * curlybrace@saim-MacBook-Pro src % javac org/curlybrace/oopj/ocp1z0_829/ch03/mystudies/Study002_PatternVariablesAndExpressions.java
 * curlybrace@saim-MacBook-Pro src % java org.curlybrace.oopj.ocp1z0_829.ch03.Study002_PatternVariablesAndExpressions      
 */

public class Study002_PatternVariablesAndExpressions {
	public static void printIntegersGreaterThanX(Number number, int X) {
		//Notice that we are using the pattern variable in an expression in the same line in which it is declared
		if(number instanceof Integer data && data.compareTo(X) > 0) {
			System.out.println(data);
		}
	}
	public static void tryAWeirdSample(Object obj) {
		if((obj instanceof String patternVariable)) {
			System.out.println("Point 1");
			System.out.println("patternVariable:" + patternVariable);	
		}
		else if((obj instanceof Integer patternVariable)) {
			System.out.println("Point 2");
			System.out.println("patternVariable:" + patternVariable);				
		}
		else if(!(obj instanceof String patternVariable2)) {
			System.out.println("Point 3");
			//System.out.println("At Point End" + patternVariable2);		// DOES NOT COMPILE : patternVariable2 cannot be resolved to a variable		
		}
		else if(!(obj instanceof Integer patternVariable3)) {
			System.out.println("Point 4");
			//System.out.println("At Point End" + patternVariable3);	// DOES NOT COMPILE : patternVariable3 cannot be resolved to a variable			
		}		
		else {
			System.out.println("Point 100");
		}	
		//System.out.println("At Point End" + patternVariable);	// DOES NOT COMPILE : patternVariable cannot be resolved to a variable		
		System.out.println("At Point End");
	}
	
	public static void main(String[] args) {
		printIntegersGreaterThanX(23,5);		// Prints 23
		System.out.println("----------");
		printIntegersGreaterThanX(37,55);	// Prints nothing
		System.out.println("--------------------" + "tryAWeirdSample(\"abc\")" + "--------------------");
		tryAWeirdSample("abc");
		System.out.println("--------------------" + "tryAWeirdSample(new Integer(5))" + "--------------------");
		tryAWeirdSample(new Integer(5));		
		System.out.println("--------------------" + "tryAWeirdSample(new Character('a'))" + "--------------------");
		tryAWeirdSample(new Character('a'));				
	}
}