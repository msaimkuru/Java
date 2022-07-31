package org.curlybrace.oopj.ocp1z0_829.ch02.mystudies;

/**
 * @author	Saim Kuru
 * @version 1.0
 * ------------
 * Objectives:
 * ------------ 
 * 1. Understanding pre-increment and post-increment operators.
 * ------------ 
 * Difficulty: Easy
 * ------------ 
 */

/* 
 * Terminal commands to run program
 * curlybrace@saim-MacBook-Pro src % javac org/curlybrace/oopj/ocp1z0_829/ch02/mystudies/Study002_IncrementAndDecrementOperators.java
 * curlybrace@saim-MacBook-Pro src % java org.curlybrace.oopj.ocp1z0_829.ch02.mystudies.Study002_IncrementAndDecrementOperators      
 */

public class Study002_IncrementAndDecrementOperators {
	static {
		//
		System.out.println
		("""
		 ----------------------------------------------------------------------------------------------------------------
		 P r e I n c r e m e n t   &   P o s t I n c r e m e n t   O p e r a t o r s
		 ----------------------------------------------------------------------------------------------------------------		 
		 Pre-increment\t++w\tIncreases the value by 1 and returns the new value 	
		 Pre-decrement\t--w\tDecreases the value by 1 and returns the new value 
		 Post-increment\tw++\tIncreases the value by 1 and returns the original value 
		 Post-decrement\tw--\tDecreases the value by 1 and returns the original value
		 ----------------------------------------------------------------------------------------------------------------
		 An   I n t e r e s t i n g   E x a m p l e 
		 ----------------------------------------------------------------------------------------------------------------
		 int i = 1;
		 i = i++;
		 
		 The increment is discarded in this example. Because post-increment operator has precedence over the assignment
		 operator, it works first; returning the original value of i and incrementing i. Then the assignment operator 
		 assigns the original value of i to i. So, as a result, i has the original value again.
		 
		 Its equivalent code block is more explaining the case:
		 
		 int temp = i;
		 i++;
		 i = temp;
		 ----------------------------------------------------------------------------------------------------------------		
		 """
		);		
	}
	
	public static void main(String[] args) {
		int i1 = 0;
		int i2 = 0;
		//
		System.out.println("i1 -> " + i1);
		System.out.println("i2 -> " + i2);
		System.out.println("-------------");
		//
		System.out.println("++i1 -> " + ++i1);
		System.out.println("i1 -> " + i1);
		System.out.println("-------------");
		//
		System.out.println("i2++ -> " + i2++);
		System.out.println("i2 -> " + i2);
		System.out.println("-------------");
		System.out.println("-------------");
		//
		System.out.println("i1 -> " + i1);
		System.out.println("i2 -> " + i2);
		System.out.println("-------------");
		//
		System.out.println("--i1 -> " + --i1);
		System.out.println("i1 -> " + i1);
		System.out.println("-------------");
		//
		System.out.println("i2-- -> " + i2--);
		System.out.println("i2 -> " + i2);
		System.out.println("-------------");
		System.out.println("-------------");
		//
		System.out.println("i1 -> " + i1);
		System.out.println("i2 -> " + i2);
		System.out.println("-------------");
		//
		int j1 = 1;
		j1 = j1++; // The increment is discarded in this example.
		System.out.println("j1:" + j1);
		//
		j1 = ++j1;  // The increment is NOT discarded in this example.
		System.out.println("j1:" + j1);
	}
}