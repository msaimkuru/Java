package org.curlybrace.oopj.ocp1z0_829.ch03.mystudies;

/**
 * @author	Saim Kuru
 * @version 1.0
 * ------------
 * Objectives:
 * ------------ 
 * 1. Understanding Pattern Matching with Additional Expressions
 * ------------
 * Difficulty: High
 * ------------ 
 * NOTES
 * ------------ 
 * Pattern matching may include additional expressions which filter data out.
 * ------------   
 */

/* Terminal commands to run program
 * curlybrace@saim-MacBook-Pro src % javac org/curlybrace/oopj/ocp1z0_829/ch03/mystudies/Study002_PatternVariablesAndExpressions.java
 * curlybrace@saim-MacBook-Pro src % java org.curlybrace.oopj.ocp1z0_829.ch03.mystudies.Study002_PatternVariablesAndExpressions      
 */

public class Study002_PatternVariablesAndExpressions {
	public static void printIntegersGreaterThanX(Number number, int X) {
		/* 
		 * Notice that we are using the pattern variable with an additional filtering expression 
		 * in the same line in which it is declared
		 */
		if(number instanceof Integer data && data.compareTo(X) > 0) {
			System.out.println(data + ", " + X + ":");
		}
		else 
			return;
		
		System.out.println(data + " is greater than " + X);
	}
	
	// pattern matching flow scoping examples
	public static void tryAWeirdSample(Object obj) {
		if((obj instanceof String patternVariable)) {
			System.out.println("Point 1");
			System.out.println("At Point 1 patternVariable:" + patternVariable);	
		}
		else if((obj instanceof Integer patternVariable)) {
			System.out.println("Point 2");
			System.out.println("At Point 2 patternVariable:" + patternVariable);				
		}
	    else if(!(obj instanceof Float patternVariable)) {
			System.out.println("Point 3, patternVariable is not defined");
			//System.out.println("At Point 3 patternVariable:" + patternVariable); // DOES NOT COMPILE : patternVariable cannot be resolved to a variable		
		}
		else if(!(obj instanceof Character patternVariable2)) {
			System.out.println("Point 4, patternVariable2 is not defined");
			//System.out.println("At Point 4 patternVariable2:" + patternVariable2); 	// DOES NOT COMPILE : patternVariable2 cannot be resolved to a variable			
		}
		else return;

		//System.out.println("At Point End" + patternVariable);	// DOES NOT COMPILE : patternVariable cannot be resolved to a variable		
		System.out.println("At Point End");
	}
	
	public static void main(String[] args) {
		printIntegersGreaterThanX(23,5);		// Prints 23
		System.out.println("----------");
		
		printIntegersGreaterThanX(37,55);	// Prints nothing
		System.out.println("----------");
		
		System.out.println("--------------------" + "tryAWeirdSample(\"abc\")" + "--------------------");
		tryAWeirdSample("abc");
		
		System.out.println("--------------------" + "tryAWeirdSample(Integer.valueOf(5))" + "--------------------");
		tryAWeirdSample(Integer.valueOf(5));	
		
		System.out.println("--------------------" + "tryAWeirdSample(Float.valueOf(4.1f))" + "--------------------");
		tryAWeirdSample(Float.valueOf(4.1f));			
		
		System.out.println("--------------------" + "tryAWeirdSample(Character.valueOf('a'))" + "--------------------");
		tryAWeirdSample(Character.valueOf('a'));			
	}
}