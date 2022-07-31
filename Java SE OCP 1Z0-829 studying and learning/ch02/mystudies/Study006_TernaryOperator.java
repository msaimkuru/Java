package org.curlybrace.oopj.ocp1z0_829.ch02.mystudies;

/**
 * @author	Saim Kuru
 * @version 1.0
 * ------------
 * Objectives:
 * ------------ 
 * 1. Understanding Ternary Operator
 * ------------ 
 * Difficulty: Medium
 * ------------ 
 */

/* Terminal commands to run program
 * curlybrace@saim-MacBook-Pro src % javac org/curlybrace/oopj/ocp1z0_829/ch02/mystudies/Study006_TernaryOperator.java
 * curlybrace@saim-MacBook-Pro src % java org.curlybrace.oopj.ocp1z0_829.ch02.mystudies.Study006_TernaryOperator      
 */

public class Study006_TernaryOperator {
	static {
		System.out.println("""
		--------------------------------------------------------------------------------
		T e r n a r y   (Conditional)   O p e r a t o r
		-------------------------------------------------------------------------------
		* The ternary operator is really a condensed form of a combined if and else
		statement returning a value.  
		
		* The ternary operator has the form: 
				booleanExpression ? expression1 : expression2 
		
		* The 1st operand must be a boolean expression.
		  The 2nd and 3rd operands must be any expression returning a value.
		
		* When ternary operator is combined with the assignment operator 2nd and 3rd 
		operands/expressions need to have the same data type, but otherwise it is not 
		needed.
		  
		* A ternary expression can contain an unperformed side effect, as only one of
		the expressions on the right side will be evaluated at runtime.
		--------------------------------------------------------------------------------				
		
		""");
	}
	
	public static void main(String[] args) {
		int i1 = 3;
		int i2 = 0;
		
		// Here ternary operator can have different type of expressions namely int and String.
		System.out.println(i1 < 1 ? 0 : "i1 is bigger than 1");	
		
		/*
		i2 = i1 < 1 ? 0 : "i1 is bigger than 1";
		--------------------------------------------------------------------
		DOES NOT COMPILE: Type mismatch: cannot convert from String to int
		--------------------------------------------------------------------
		error: incompatible types: bad type in conditional expression
		i2 = i1 < 1 ? 0 : "i1 is bigger than 1";	
		                  ^
    	String cannot be converted to int
    	--------------------------------------------------------------------
		*/
		
		i2 = i1 < 1 ? 0 : 1;
		System.out.println("i2 is " + i2);

		/*
		 i2 = (i2 <= 1) ? i2=-1; i2=-2; : 1;	
		 --------------------------------------------------------------------
		 DOES NOT COMPILE: Syntax error, insert ": Expression" to complete Expression
		 --------------------------------------------------------------------
		 error: : expected
		 i2 = (i2 <= 1) ? i2=-1; i2=-2; : 1;
		                       ^
		 --------------------------------------------------------------------
		 */
		i2 = (i2 <= 1) ? i2=-1 : 1;
		System.out.println("i2 is " + i2);
		
		// Unperformed Side Effect Example
		System.out.println("--------------- Unperformed Side Effect Example -------------------");
		int x = 1;
		int y = 1;
		
		System.out.println("x-->" + x + ", y-->" + y);	//	Prints--> x-->1, y-->1
		
		int z = x <= y ? x++ : y++;
		
		System.out.println("After statement int z = x <= y ? x++ : y++;");
		System.out.println("x-->" + x + ", y-->" + y);	//	Prints--> x-->2, y-->1
	}
}