package org.curlybrace.oopj.ocp1z0_829.ch06.mystudies.Study004_InitializingObjects.Study004_01_InitializingClasses;

/* 
 * Terminal commands to run program
 * curlybrace@saim-MacBook-Pro src % 
 * javac org/curlybrace/oopj/ocp1z0_829/ch06/mystudies/Study004_InitializingObjects/Study004_01_InitializingClasses/*.java
 * curlybrace@saim-MacBook-Pro src % 
 * java org.curlybrace.oopj.ocp1z0_829.ch06.mystudies.Study004_InitializingObjects.Study004_01_InitializingClasses.A1
 */

class A0{
	public static int step = 0;
	
	// 1st static initializer
    static {
		System.out.print("""	
		--------------------------------------------------------------------------------
		Subject: Order of Initialization
		--------------------------------------------------------------------------------
		Order of Initialization - Definition		 
		--------------------------------------------------------------------------------
		Order of initialization refers to how members of a class are assigned values.
		They can be given default values, or require explicit values, such as for final
		variables.				
		--------------------------------------------------------------------------------
		Order of Initialization - Class Initialization (aka. class loading)
		--------------------------------------------------------------------------------
		- First class is initialized, which involves invoking all static members in the
		class hierarchy, starting with the highest superclass and working downward. This 
		is sometimes referred to as loading the class.
		
		- The class is loaded before it is referenced or used. The class may be 
		initialized when the program first starts, when a static member of the class is 
		referenced, or shortly before an instance of the class is created.
		
		The JVM controls exactly when the class is loaded.
		
		- Class initialization happens at most once for each class.
		
		- The Class may also never be loaded/initialized if it is not used in the 
		program.
		
		- All static final variables must be assigned a value (but exactly once), either
		when they are declared or in a static initializer.
		--------------------------------------------------------------------------------
		Order of initialization for Class X
		--------------------------------------------------------------------------------
		1- If there is a superclass Y of X, then initialize class Y first.
		
		2- Process all static variable declarations in the order in which they appear in
		the class.
		
		3- Process all static initializers in the order in which they appear in the 
		class.
		--------------------------------------------------------------------------------		
		"""
		);
		
		System.out.println("""
				
		--------------------------------------------------------------------------------		
		Order of Class Initialization for This Example
		--------------------------------------------------------------------------------		
		1st Step: In this example first the superclass (A0) of the class (A1) loads, 
		and prints "A0-" in its static initializer block.
		
		2nd Step: Class A1 loads and runs the static initializer block to print "A1-"
		
		3rd Step: main() method of class A1 runs and prints "A1.2-".
		--------------------------------------------------------------------------------		  	
		""");
		
		System.out.println();
		
    }
    
    // 2nd static initializer
	static {
		System.out.println("--------------------" + ++step + ") Start of A0 static initializer--------------------");
		System.out.println("A0-");
		System.out.println("--------------------" + step + ") End of A0 static initializer--------------------");
		System.out.println();
	}
}

public class A1 extends A0{

	public static void main(String[] args) {
		System.out.println("--------------------" + ++step + ") Start of A1 main() method--------------------");		
		System.out.println("A1.2-");
		//
		new A1();
		new A1();
		new A1();
		//
		System.out.println("--------------------"  + step + ") End of A1 main() method--------------------");
	}
	
	// 1st static initializer
	static {
		System.out.println("--------------------" + ++step + ") Start of A1 static initializer--------------------");
		System.out.println("A1-");
		System.out.println("--------------------" + step + ") End of A1 static initializer--------------------");
		System.out.println();
	}
}