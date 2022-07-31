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
 * javac org/curlybrace/oopj/ocp1z0_829/ch06/mystudies/Study004_InitializingObjects/Study004_03_IntializingInstances/*.java
 * curlybrace@saim-MacBook-Pro src % 
 * java org.curlybrace.oopj.ocp1z0_829.ch06.mystudies.Study004_InitializingObjects.Study004_03_IntializingInstances.B1
 */

class B0{	
	// 1st static initializer
	static {
		System.out.println("B0 1st static initializer");
	}
	
	// 2nd static initializer
	static {
		System.out.println("B0 2nd static initializer");
	}	
    
	// 1st instance initializer
	{
		System.out.println("B0 1st instance initializer");
	}
    
	// 2nd instance initializer
	{
		System.out.println("B0 2nd instance initializer");
	}    

	// no-argument constructor
	public B0() {
		this("(calling constructor is the 1st BO constructor B0())");
		System.out.println("B0 1st constructor B0()");
	}

	// overloading constructor
	public B0(String s) {
		System.out.println("B0 2nd constructor B0(String) " + s);
	}
	
	// 3rd static initializer
	static {
		System.out.println("B0 3rd static initializer");
	}
	
	int k = 2;
	
	// 3rd instance initializer
	{
		System.out.println("B0 3rd instance initializer, k = " + k);
	}
}

class BO$ extends B0{
	// 1st static initializer
	static {
		System.out.println("BO$ (extends BO) 1st static initializer");
	}
	
	// 2nd static initializer
	static {
		System.out.println("BO$ (extends BO) 2nd static initializer");
	}	
    
	// 1st instance initializer
	{
		System.out.println("BO$ (extends BO) 1st instance initializer");
	}
    
	// 2nd instance initializer
	{
		System.out.println("BO$ (extends BO) 2nd instance initializer");
	}    

	// no-argument constructor
	public BO$() {
		this("(calling constructor is the 1st BO$ constructor BO$())");
		System.out.println("BO$ (extends BO) 1st constructor BO$()");
	}

	// overloading constructor
	public BO$(String s) {
		System.out.println("BO$ (extends BO) 2nd constructor BO$(String) " + s);
	}
	
	// 3rd static initializer
	static {
		System.out.println("BO$ (extends BO) 3rd static initializer");
	}
	
	// 3rd instance initializer
	{
		System.out.println("BO$ (extends BO) 3rd instance initializer");
	}
}

public class B1{
	public static void main(String[] args) {
		new BO$();
		//
		System.out.println("""
				
		--------------------------------------------------------------------------------		
		Order of Instance Initialization for This Example
		--------------------------------------------------------------------------------		
		1st Step: Class initialization for BO$ (extends BO) and its superclass B0 
		happens. It happens to be the superclass initialization first and then 
		the subclass initializes.
				In this step first static declarations and static initializers run.
		
		2nd Step: Instance initialization for BO$ (extends BO) and its superclass B0 
		happens. It happens to be the superclass instance initialization first and then 
		the subclass instance initializes.
				In this step first instance declarations run,
				then instance initializers run,
				then one or more constructor(s) run.
		--------------------------------------------------------------------------------	
		""");
	}
}