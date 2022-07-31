package org.curlybrace.oopj.ocp1z0_829.ch06.mystudies.Study004_InitializingObjects.Study004_02_InitializingFinalInstanceVariables;


/* Terminal commands to run program
 * curlybrace@saim-MacBook-Pro src % 
 * javac org/curlybrace/oopj/ocp1z0_829/ch06/mystudies/Study004_InitializingObjects/Study004_02_InitializingFinalInstanceVariables/A0.java
 * curlybrace@saim-MacBook-Pro src % 
 * java org.curlybrace.oopj.ocp1z0_829.ch06.mystudies.Study004_InitializingObjects.Study004_02_InitializingFinalInstanceVariables.A0  
 */

public class A0 {
	static {
		System.out.println("""
		--------------------------------------------------------------------------------
		I n i t i a l i z i n g   f i n a l   I n s t a n c e   V a r i a b l e s		
		--------------------------------------------------------------------------------
		1- Like final static variables, final instance variables must be explicitly
		assigned a value EXACTLY ONCE.
		
		2- The constructor is part of the initialization process.

		3- A default value is only applied to non-final class/instance variables. So,
		the final instance/static variables need to be explicitly initialized.
		
		4- Final instance variables should be initialized either in the declaration line
		,in an instance initializer, or in a constructor.
		
		By the time the constructor completes, all final instance variables must be
		assigned a value exactly once.
		
		5- Unlike local variables and local final variables which are not required to 
		have a value unless they are actually used, final instance variables must be 
		assigned a value. If they are not assigned a value when they are declared or in 
		an instance initializer, then they must be assigned a value in the constructor 
		declaration.
		
		Failure to do so will result in a COMPILER ERROR on the line that declares the
		constructor.
		
		6- In terms of assigning values to final instance variables, each constructor 
		is reviewed individually
		--------------------------------------------------------------------------------				
		""");
	}
	
	private final int volume;
	private final String type;
	
	//instance initializer
	{
		this.volume = 10;
	}
	
	//constructor
	public A0(String type) {
		this.type = type;
	}
	
	/*
	public A0() {	// 2 LINES DON'T COMPILE
		this.volume = 2;		// DOES NOT COMPILE : error: variable volume might already have been assigned
	}						// DOES NOT COMPILE : error: variable type might not have been initialized
	*/

	/*	
	public A0() { 	// 1 LINE DOESN'T COMPILE
		this(null);
		this.volume = 2;		//DOES NOT COMPILE : error: variable volume might already have been assigned
		
	}
	*/

	public A0() {
		this(null);			// COMPILES WELL
	}
	
	public static void main(String[] args) {

	}
}