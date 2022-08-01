package org.curlybrace.oopj.ocp1z0_829.ch05.mystudies;

/* Terminal commands to run program
 * curlybrace@saim-MacBook-Pro src % javac org/curlybrace/oopj/ocp1z0_829/ch05/mystudies/Study010_MethodOverloading.java
 * curlybrace@saim-MacBook-Pro src % java org.curlybrace.oopj.ocp1z0_829.ch05.mystudies.Study010_MethodOverloading      
 */

public class Study010_MethodOverloading {
	static {
		System.out.println("""
		--------------------------------------------------------------------------------
		M e t h o d  O v e r l o a d i n g
		--------------------------------------------------------------------------------	
		* Method overloading occurs when methods in the same class have the same name 
		but different method signatures, which means they use different parameter lists.
		
		* Everything other than the method name can vary for the overloading methods.
		This means there can be different access modifiers, optional specifiers, return
		types, and exception lists.
		
		
		NOTES:
		------
		1- When calling overloaded methods java looks for matching types and calls the 
		most specific appropriate method. That means, Java tries to use the most
		specific parameter list it can find. 
		
		2- The order which Java uses to choose the right overloaded method:
				i) Exact match by type			i.e. glide(int i, int j)
				ii) Larger primitive type		i.e. glide(long i, long j)
				iii) Autoboxed type			i.e. glide(Integer i, Integer j)
				iv) Varargs				i.e. glide(int... nums)
		--------------------------------------------------------------------------------				
		""");
	}

	/* 
	 * public void fly() {};
	 *
	 * DOES NOT COMPILE:
	 *
	 *		method fly() is already defined in class Study010_MethodOverloading
	 *		public boolean fly() {return false;}
	 */
	
	public void fly(short numFeet) {System.out.println("-->method fly(short) is called");}
	
	public void fly(int numMiles) { System.out.println("-->method fly(int) is called");}

	public void fly(String s) { System.out.println("-->method fly(String) is called");}

	public void fly(Object o) { System.out.println("-->method fly(Object) is called");}
	/*
	 * public int fly(int numMiles) {return 0;}
	 * 
	 * DOES NOT COMPILE:
	 *		method fly(int) is already defined in class Study010_MethodOverloading
	 *		public int fly(int numMiles) {return 0;}
	 * 
	 */
	
	public boolean fly() {return false;}
	
	void fly(int numMiles, short numFeet) {}
	
	public void fly(short numFeet, int numMiles) throws Exception{}
	
	public void fly(int[] lengths) {};
	
	/*
	 * public void fly(int... lngArr) {};
	 *
	 * DOES NOT COMPILE:
	 * 		cannot declare both fly(int...) and fly(int[]) in Study010_MethodOverloading
	 */
	
	
	//public void printOne(Integer... i) {System.out.println("-->method printOne(Integer...) is called");}
	
	public void printOne(int... i) {System.out.println("-->method printOne(int...) is called");}
		
	public void printOne(Integer i, Integer j) {System.out.println("-->method printOne(Integer, Integer) is called");}

	public void printOne(Integer i) {System.out.println("-->method printOne(Integer) is called");}
		
	public void printOne(int i, int j) {System.out.println("-->method printOne(int, int) is called");}
	
	public void printOne(int i) {System.out.println("-->method printOne(int) is called");}
	
	public static void main(String[] args) {
		var o = new Study010_MethodOverloading();
		System.out.println("""
		------------------------------------------------------------------------------------------
		EXAMPLE 1-Overloading	
		------------------------------------------------------------------------------------------
		""");		
		o.fly(8);			// Prints -->method fly(int) is called
		o.fly((short)8);		// Prints -->method fly(short) is called
		o.fly("abc");		// Prints -->method fly(String) is called
		o.fly(new int[3]);	// Prints -->method fly(Object) is called
		//
		System.out.println("""
		------------------------------------------------------------------------------------------
		EXAMPLE 2-Overloading ( The order which Java uses to choose the right overloaded method)		
		------------------------------------------------------------------------------------------
		""");
		//
		o.printOne(1);									// Prints-->method printOne(int) is called
		o.printOne(1, 2);								// Prints-->method printOne(int, int) is called
		o.printOne(1, 2, 3);								// Prints-->method printOne(int...) is called
		o.printOne(new Integer(1));						// Prints-->method printOne(Integer) is called
		o.printOne(new Integer(1),new Integer(2));		// Prints-->method printOne(Integer, Integer) is called
	}
}