package org.curlybrace.oopj.ocp1z0_829.ch02.mystudies;

/**
 * @author	Saim Kuru
 * @version 1.0
 * ------------
 * Objectives:
 * ------------ 
 * 1. Understanding modulus operator.
 * ------------ 
 * Difficulty: Easy
 * ------------ 
 * NOTES
 * ------------ 
 */

/* Terminal commands to run program
 * curlybrace@saim-MacBook-Pro src % javac org/curlybrace/oopj/ocp1z0_829/ch02/mystudies/Study003_ModulusOperator.java
 * curlybrace@saim-MacBook-Pro src % java org.curlybrace.oopj.ocp1z0_829.ch02.mystudies.Study003_ModulusOperator      
 */

public class Study003_ModulusOperator {	
	public static void main(String[] args) {
		int i1 = 12;
		int divisor = 3;
		//
		float f1 = i1; // int value can be directly assigned to a float, java automatically promotes that value to a float and then assigns.
		//
		System.out.println("\n------------------" + "i1 = " + i1 + ", f1=" + f1 + "----------------------\n");
		System.out.println(i1 + "/" + divisor + " = " + i1 / divisor + ", " + i1 + "%" + divisor + " = " + i1 % divisor);
		System.out.println(f1 + "/" + divisor + " = " + f1 / divisor + ", " + f1 + "%" + divisor + " = " + f1 % divisor);
		System.out.println("-----------------------------------");
		System.out.println(-i1 + "/" + divisor + " = " + -i1 / divisor + ", " + -i1 + "%" + divisor + " = " + -i1 % divisor);
		System.out.println(-f1 + "/" + divisor + " = " + -f1 / divisor + ", " + -f1 + "%" + divisor + " = " + -f1 % divisor);		
		//
		i1++; f1++;
		//
		System.out.println("\n------------------" + "i1 = " + i1 + ", f1=" + f1 + "----------------------\n");
		System.out.println(i1 + "/" + divisor + " = " + i1 / divisor + ", " + i1 + "%" + divisor + " = " + i1 % divisor);
		System.out.println(f1 + "/" + divisor + " = " + f1 / divisor + ", " + f1 + "%" + divisor + " = " + f1 % divisor);
		System.out.println("-----------------------------------");
		System.out.println(-i1 + "/" + divisor + " = " + -i1 / divisor + ", " + -i1 + "%" + divisor + " = " + -i1 % divisor);
		System.out.println(-f1 + "/" + divisor + " = " + -f1 / divisor + ", " + -f1 + "%" + divisor + " = " + -f1 % divisor);		
		//
		i1++; f1++;
		//
		System.out.println("\n------------------" + "i1 = " + i1 + ", f1=" + f1 + "----------------------\n");
		System.out.println(i1 + "/" + divisor + " = " + i1 / divisor + ", " + i1 + "%" + divisor + " = " + i1 % divisor);
		System.out.println(f1 + "/" + divisor + " = " + f1 / divisor + ", " + f1 + "%" + divisor + " = " + f1 % divisor);
		System.out.println("-----------------------------------");
		System.out.println(-i1 + "/" + divisor + " = " + -i1 / divisor + ", " + -i1 + "%" + divisor + " = " + -i1 % divisor);
		System.out.println(-f1 + "/" + divisor + " = " + -f1 / divisor + ", " + -f1 + "%" + divisor + " = " + -f1 % divisor);		
		//
		i1++; f1++;
		//
		System.out.println("\n-------------------" + "i1 = " + i1 + ", f1=" + f1 + "----------------------\n");		
		System.out.println(i1 + "/" + divisor + " = " + i1 / divisor + ", " + i1 + "%" + divisor + " = " + i1 % divisor);
		System.out.println(f1 + "/" + divisor + " = " + f1 / divisor + ", " + f1 + "%" + divisor + " = " + f1 % divisor);
		System.out.println("-----------------------------------");
		System.out.println(-i1 + "/" + divisor + " = " + -i1 / divisor + ", " + -i1 + "%" + divisor + " = " + -i1 % divisor);
		System.out.println(-f1 + "/" + divisor + " = " + -f1 / divisor + ", " + -f1 + "%" + divisor + " = " + -f1 % divisor);		
		System.out.println("----------------------------------------");
	}
}