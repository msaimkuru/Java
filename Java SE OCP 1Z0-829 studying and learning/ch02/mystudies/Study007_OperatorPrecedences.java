package org.curlybrace.oopj.ocp1z0_829.ch02.mystudies;

/**
 * @author	Saim Kuru
 * @version 1.0
 * ------------
 * Objectives:
 * ------------ 
 * 1. Understanding Precedence of Operators
 * ------------ 
 * Difficulty: Medium
 * ------------ 
 * NOTES
 * ------------ 
 */

/* Terminal commands to run program
 * curlybrace@saim-MacBook-Pro src % javac org/curlybrace/oopj/ocp1z0_829/ch02/mystudies/Study007_OperatorPrecedences.java
 * curlybrace@saim-MacBook-Pro src % java org.curlybrace.oopj.ocp1z0_829.ch02.mystudies.Study007_OperatorPrecedences      
 */
public class Study007_OperatorPrecedences {

	public static void main(String[] args) {
		/* 
		 * 1st Precedence: Unary Operators
		 * -------------------------------
		 * 1.1) Post-Unary Operators: expression++, expression--      (Left-to-Right evaluation for operators having the same level of precedence)
		 * 1.2) Pre-Unary Operators: ++expression, --expression       (Left-to-Right evaluation for operators having the same level of precedence)
		 * 1.3) Other Unary Operators: -, !, ~, +, (type)             (Right-to-Left evaluation for operator having the same level of precedence)
		 * 1.4) Cast: (Type) reference                                (Right-to-Left evaluation for operator having the same level of precedence)
		 */
		
		/* 
		 * 2nd Precedence: Binary Operators
		 * --------------------------------
		 * 
		 * 2.1) Binary Arithmetic Operators
		 *      2.1.1) *, /, %                                        (Left-to-Right evaluation for operators having the same level of precedence)
		 *      2.1.2) +, -                                           (Left-to-Right evaluation for operators having the same level of precedence)
		 * 
		 * 2.2) Shift Operators
		 *      <<, >>, >>>                                           (Left-to-Right evaluation for operators having the same level of precedence)
		 * 
		 * 2.3) Relational Operators
		 *      <, >, <=, >=, instanceof                              (Left-to-Right evaluation for operators having the same level of precedence)
		 *      ==, !=
		 * 
		 * 2.4) Logical Operators
		 *      2.4.1) &                                              (Left-to-Right evaluation for operators having the same level of precedence)
		 *      2.4.2) ^                                              (Left-to-Right evaluation for operators having the same level of precedence)
		 *      2.4.3) |                                              (Left-to-Right evaluation for operators having the same level of precedence)
		 *      
		 * 2.5) Conditional Operators
		 *      2.5.1) &&                                             (Left-to-Right evaluation for operators having the same level of precedence)
		 *      2.5.2) ||                                             (Left-to-Right evaluation for operators having the same level of precedence)
 		 * 
 		 * 3rd Precedence: Ternary Operators
		 * ---------------------------------      
		 * 3.1) Ternary Operator                                      (Right-to-Left evaluation for operator having the same level of precedence)
		 *       boolean expression ? Expression1 : expression2
		 *       
		 * 4) Assignment Operators
		 *      =, +=, -=, *=, /=, %=, &=, ^=, |=, <<=, >>=, >>>=     (Right-to-Left evaluation for operator having the same level of precedence)
		 * 
		 * 5) Arrow Operator		                                      (Right-to-Left evaluation for operator having the same level of precedence)
		 *      ->
		 */
		
		/*
		 *  Precedence order or logical operators ( &, ^, |), 
		 *  and conditional operators (&&, ||):  &, ^, |, &&, ||
		 */
		
		System.out.print("& has higher precedence than ^, true ^ false & false = ");
		System.out.println(true ^ false & false); // Prints --> true				
		
		System.out.print("& has higher precedence than |, true | true & false = ");
		System.out.println(true | true & false); // Prints --> true
		
		System.out.print("^ has higher precedence than |, true | false ^ true = ");
		System.out.println(true | false ^ true);	 // Prints --> true

		System.out.print("^ has higher precedence than &&, false && true ^ true = ");
		System.out.println(false && true ^ true); // Prints --> false			
		
		System.out.print("| has higher precedence than &&, true | true && false = ");
		System.out.println(true | true && false); // Prints --> false	
	}
}