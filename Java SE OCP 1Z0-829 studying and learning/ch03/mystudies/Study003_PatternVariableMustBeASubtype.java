package org.curlybrace.oopj.ocp1z0_829.ch03.mystudies;

/* Terminal commands to run program
 * curlybrace@saim-MacBook-Pro src % javac org/curlybrace/oopj/ocp1z0_829/ch03/mystudies/Study003_PatternVariableMustBeASubtype.java
 * curlybrace@saim-MacBook-Pro src % java org.curlybrace.oopj.ocp1z0_829.ch03.Study003_PatternVariableMustBeASubtype      
 */

public class Study003_PatternVariableMustBeASubtype {

	public static void main(String[] args) {
		Integer value = 123;
		Number numValue = 123;
		//
		if(value instanceof Integer) {
			Integer data = (Integer) value;
			System.out.println("Step 1 OK");
		}
		//
		//
		/* DOES NOT COMPILE --> 	Expression type cannot be a subtype of the Pattern type
		 * 						Syntax error on tokens, they can be merged to form instanceof
		if(value instance of Integer data) {
			//do something
			System.out.println("Step 2 OK");
		}
		*/
		if(numValue instanceof Integer data) {
			//do something
			System.out.println("Step 3 OK");
		}
		//
		System.out.println
		("""
		* Pattern Matching requires that the pattern variable type be a strict subtype of left operand of instanceof operator.
		* The type of the pattern variable must be a subtype of the variable on the left side of the expression.
		* It also cannot be the same type.
		* This rule does not exist for traditional instanceof operation expressions, though.		
		""");
	}
}