package org.curlybrace.oopj.ocp1z0_829.ch05.mystudies;

public class Study011_WhereToInitializeFinalVariables {
	public final int insI1 = 6;
	public final int insI2;
	public final int insI3;
	public final int insI4;
	//
	public final static int staI1 = 0;
	public final static int staI2;
	public final static int staI3;
	public final static int staI4;	
	//
	// 1st Static Initializer
	static {
		staI2 = 1;
	}
	//
	// Instance Initializer	
	{
		insI2 = 7;
		/*
		 * staI3 = 2;
		 *
		 *DOES NOT COMPILE
		 */
	}
	//
	// Constructor
	public Study011_WhereToInitializeFinalVariables() {
		insI3 = 8;
		insI4 = 9;
		
		/*
		 * staI3 = 2;
		 *
		 *DOES NOT COMPILE
		 */
	}
	public static void main(String[] args) {
		final int locI1 = 0;
		final int locI2;

		locI2 = 1;
		
		System.out.println("""
		--------------------------------------------------------------------------------
		WHERE TO INITIALIZE FINAL VARIABLES ?
		--------------------------------------------------------------------------------
		* In contrary to not-final static and instance variables (they get default
		values when we don't initialize them), final static and final instance variables 
		need to be initialized to make the code C O M P I L E
		
		* Static final variables need to be initialized either
				- in the declaration lines or
				- in static initializers

		* Instance final variables need to be initialized either
				- in the declaration lines or
				- in instance initializers or
				- in constructors.
		
		* Local final variables must be initialized in their associated code blocks
		before they are used just as all local variables.
		
		Note: Static and Instance final variables can not be initialized in any places 
		other than the mentioned above.				
		--------------------------------------------------------------------------------
		""");
		var o1 = new Study011_WhereToInitializeFinalVariables();
		System.out.println("Static variables-->" + staI1 + "," + staI2 + "," + staI3 + "," + staI4 );
		System.out.println("Instance variables-->" + o1.insI1 + "," + o1.insI2 + "," + o1.insI3 + "," + o1.insI4);
	}

	// 2nd Static Initializer
	static {
		staI3 = 2;
		staI4 = 3;
	}	
}
