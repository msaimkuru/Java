package org.curlybrace.oopj.ocp1z0_829.ch06.mystudies.Study004_InitializingObjects.Study004_01_InitializingClasses;

/* 
 * Terminal commands to run program
 * curlybrace@saim-MacBook-Pro src % 
 * javac org/curlybrace/oopj/ocp1z0_829/ch06/mystudies/Study004_InitializingObjects/Study004_01_InitializingClasses/*.java
 * curlybrace@saim-MacBook-Pro src % 
 * java org.curlybrace.oopj.ocp1z0_829.ch06.mystudies.Study004_InitializingObjects.Study004_01_InitializingClasses.A2
 */

public class A2 extends A0{
	static {
		System.out.println("""

		--------------------------------------------------------------------------------		
		Order of Class Initialization for This Example
		--------------------------------------------------------------------------------		
		1st Step: In this example first the superclass (A0) of this class (A2) loads, 
		and prints "A0-" in its static initializer block.
		
		2nd Step: This class loads and runs the static initializer block to print "A2-"
		
		3rd Step: main() method runs and prints "A2.2-"
		
				4th Step(runs in 3rd Step, finishes in 3rd step): A1 loads as a
				result of new A1() statement but as superclass A0 of A1 is also 
				superclass of A2 and has been already loaded once, this time 
				only A1 loads and its static block prints "A1-".
        """);		
	}
	
	//Console prints in this order: A0-A2-A2.2-A1-
	public static void main(String[] args) {
		System.out.println("--------------------" + ++step + ") Start of A2 main() method--------------------");		
		System.out.println("A2.2-");
		
		new A1();
		//
		System.out.println("--------------------" + step + ") End of A2 main() method--------------------");	
		System.out.println();		
	}
	
	// 1st static initializer
	static {
		System.out.println("--------------------" + ++step + ") Start of A2 static initializer--------------------");
		System.out.println("A2-");
		System.out.println("--------------------" + step + ") End of A2 static initializer--------------------");
		System.out.println();
	}
}