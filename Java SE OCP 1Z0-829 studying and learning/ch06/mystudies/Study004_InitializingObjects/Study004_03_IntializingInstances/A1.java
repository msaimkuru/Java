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
 * javac org/curlybrace/oopj/ocp1z0_829/ch06/mystudies/Study004_InitializingObjects/Study004_03_IntializingInstances/A1.java
 * curlybrace@saim-MacBook-Pro src % 
 * java org.curlybrace.oopj.ocp1z0_829.ch06.mystudies.Study004_InitializingObjects.Study004_03_IntializingInstances.A1
 */

public class A1{
	private String name = "Saim";
	public static int step = 0;
	
	// 1st instance initializer
	{
		System.out.println("--------------------" + ++step + ") Start of 1st instance initializer block of class A1--------------------");
		System.out.println("--------------------" + step + ") End of 1st instance initializer block of class A1--------------------");
		System.out.println();
	}
	
	//private static int count = 0;
	
	// 1st static initializer
	static {
		System.out.println("--------------------" + ++step + ") Start of 1st static initializer block of class A1--------------------");
		System.out.println("""
				
		--------------------------------------------------------------------------------		
		Order of Instance Initialization for This Example
		--------------------------------------------------------------------------------		
		1st Step: In this example first class A1 loads and 1st static initializer block 
		prints text.
		
		2nd Step: 2nd static initializer block prints text.
		
		3rd Step: 3rd static initializer block prints text.
		
		4th Step: 4th static initializer block prints text.
		
		5th Step: main() method prints text.
		
		6th step: 1st instance initializer block prints text.
		
		7th step: no-argument constructor A1() prints text.
		
			and main() method ends.
		--------------------------------------------------------------------------------	
		""");
		
		System.out.print("""
		
		--------------------------------------------------------------------------------
		Order of Initialization - Instance Initialization
		--------------------------------------------------------------------------------
		- First, start at the lowest-level constructor where the new keyword is used.
		Remember, the first line of every constructor is a call to this([parameters]) or
		super([parameters]), and if omitted, the compiler will automatically insert a
		call to the parent no-argument constructor super(). Then, progress upward and
		note the order of constructors. Finally, initialize each class starting with the
		superclass, processing each instance initializer and constructor in the reverse
		order in which it was called.
		
		- All final instance variables (fields) must be assigned a value (but exactly 
		once), either when they are declared, in an instance initializer, or in a
		constructor.
		--------------------------------------------------------------------------------
		Order of Initialization for an Instance of Class X
		--------------------------------------------------------------------------------
		1- Initialize Class X if it has not been previously initialized.
		
		2- If there is a superclass Y of X, then initialize the instance of Y first.
		
		3- Process all instance variable declarations in the order in which they appear 
		in the class.
		
		4- Process all instance initializers in the order in which they appear in the 
		class.
		
		5- Initialize the constructor, including any overloaded constructors referenced
		with this([parameters]).
		--------------------------------------------------------------------------------		
		"""
		);
		System.out.println("--------------------" + step + ") End of 1st static initializer block of class A1--------------------");
		System.out.println();
	}
	
	// 2nd static initializer
	static{
		//System.out.println("In 1st static initializer block (count =  " + count + ")");
		System.out.println("--------------------" + ++step + ") Start of 2nd static initializer block of class A1--------------------");
		System.out.println("--------------------" + step + ") End of 2nd static initializer block of class A1--------------------");
		System.out.println();
	}
	
	// 3rd static initializer
	static{
		//count += 10;
		//System.out.println("In 2nd static initializer block (count =  " + count + ")");
		System.out.println("--------------------" + ++step + ") Start of 3rd static initializer block  class A1--------------------");
		System.out.println("--------------------" + step + ") End of 3rd static initializer block  class A1--------------------");
		System.out.println();
	}
	
	// no-argument constructor
	public A1() {
		System.out.println("--------------------" + ++step + ") Start of no-argument constructor block  class A1--------------------");
		System.out.println("--------------------" + step + ") End of no-argument constructor block  class A1--------------------");
		System.out.println();
	}
		
	public static void main(String[] args) {
		System.out.println("--------------------" + ++step + ") Start of main() method of class A1--------------------");	
		//
		new A1();
		//
		System.out.println("--------------------" + step + ") End of main() method of class A1--------------------");	
	}
	
	// 4th static initializer
	static {
		System.out.println("--------------------" + ++step + ") Start of 4th static initializer block of class A1--------------------");
		System.out.println("--------------------" + step + ") End of 4th static initializer block  class A1--------------------");
		System.out.println();
	}
}