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
 * Difficulty: High
 * ------------ 
 */

// This is an exercise to determine the order of execution of the printing statements.
// To preserve the comments meaningful do not change the code!

/* 
 * The main method is in class D1. So first point for class loading is D1, 
 * but as D1 is subclass of D0 class loading/class initialization starts 
 * from D0 (we are not considering the Object superclass here). 
 *
 * Because of the same reason instance initialization also starts from 
 * D0 (we are not considering the Object superclass here).
 */
 
/* 
 * Terminal commands to run program
 * curlybrace@saim-MacBook-Pro src % 
 * javac org/curlybrace/oopj/ocp1z0_829/ch06/mystudies/Study004_InitializingObjects/Study004_03_IntializingInstances/D1.java
 * curlybrace@saim-MacBook-Pro src % 
 * java org.curlybrace.oopj.ocp1z0_829.ch06.mystudies.Study004_InitializingObjects.Study004_03_IntializingInstances.D1
 */

class D0{
	// 1st static initializer
	static { System.out.print("A"); }		//Runs 1st, runs only once when the class is loading for once.
	
	// 1st instance initializer
	{ System.out.print("B"); }				/*Runs 3rd, at the time the classes are also loaded,
											  Runs 1st when classes were already loaded before.*/

	// overloading constructor
	public D0(String name) {
		this(1);
		System.out.print("C");				/*Runs 5th, at the time the classes are also loaded, 
											  Runs 3rd when classes were already loaded before.*/
	}
	
	// no-argument constructor
	public D0() {
		System.out.print("D");
	}
	
	// overloading constructor
	public D0(int x) {
		System.out.print("E");				/*Runs 4th, at the time the classes are also loaded, 
											  Runs 2nd when classes were already loaded before.*/
	}
}

public class D1 extends D0{
	// 1st static initializer
	static { System.out.print("F"); }		//Runs 2nd, runs only once when the class is loading for once.		

	// constructor
	public D1(int x) {
		super("any string");
		System.out.print("G");				/*Runs 7th, at the time the classes are also loaded, 
		                                      Runs 5th when classes were already loaded before.*/
	}
	
	// 1st instance initializer
	{ System.out.print("H"); }				/*Runs 6th, at the time the classes are also loaded, 
	                                          Runs 4th when classes were already loaded before.*/			
	
	public static void main(String[] args) {
		new D1(1);							// This instantiation results in printing "AFBECHG"
		System.out.println();
		new D1(2);							// This instantiation results in printing "BECHG"
	}
}