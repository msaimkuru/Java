package org.curlybrace.oopj.ocp1z0_829.ch06.mystudies.Study004_InitializingObjects.Study004_03_IntializingInstances;

/**
 * @author	Saim Kuru
 * @version 1.0
 * ------------
 * Objectives: 
 * ------------ 
 * Understanding the Order of Initialization
 * Understanding ...
 * ------------
 * Difficulty: Medium
 * ------------ 
 */

/* 
 * Terminal commands to run program
 * curlybrace@saim-MacBook-Pro src % 
 * javac org/curlybrace/oopj/ocp1z0_829/ch06/mystudies/Study004_InitializingObjects/Study004_03_IntializingInstances/C1.java
 * curlybrace@saim-MacBook-Pro src % 
 * java org.curlybrace.oopj.ocp1z0_829.ch06.mystudies.Study004_InitializingObjects.Study004_03_IntializingInstances.C1
 */

public class C1 {
	private String name = "name";					// Runs 4th If class is not loaded already, 2nd otherwise
	
	// 1st instance initializer
	{ System.out.println(name); }					// Runs 5th and prints "name" If class is not loaded already, 3rd otherwise
	
	private static int count = 0;					// Runs 1st (If class is not loaded already)
	
	// 1st static initializer
	static { System.out.println(count); }			// Runs 2nd and prints "0"  (If class is not loaded already)
	
	// 2nd instance initializer
	{ count++; System.out.println(count); }			// Runs 6th and prints "1" If class is not loaded already, 4th otherwise
	
	// no-argument constructor
	public C1() {
		System.out.println("Constructor C1()");		// Runs 7th and prints "Constructor C1()" If class is not loaded already, 5th otherwise
	}
	
	public static void main(String[] args) {
		System.out.println("Ready, method main()");	// Runs 3rd and prints "Ready, method main()" If class is not loaded already, 1st otherwise
		new C1();									
	}
}