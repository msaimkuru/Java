package org.curlybrace.oopj.ocp1z0_829.ch06.mystudies.Study005_InheritingMembers.Study005_02_HidingStaticMethods;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;

/* 
 * Terminal commands to run program
 * curlybrace@saim-MacBook-Pro src % 
 * javac org/curlybrace/oopj/ocp1z0_829/ch06/mystudies/Study005_InheritingMembers/Study005_02_HidingStaticMethods/A1.java
 * curlybrace@saim-MacBook-Pro src % 
 * java org.curlybrace.oopj.ocp1z0_829.ch06.mystudies.Study005_InheritingMembers.Study005_02_HidingStaticMethods.A1
 */

class A0{
	static {
		System.out.println("""
		--------------------------------------------------------------------------------
		I n h e r i t i n g   M e m b e r s - H i d i n g  S t a t i c  M e t h o d s
		--------------------------------------------------------------------------------
		* Class/Static members do not inherit the same way instance members inherit.
		
		* A static method cannot be overridden, they can be hidden though.
		
		* In Java, a hidden method occurs when a subclass defines a static method with 
		the same signature (name of the method and the type and order of the method 
		parameters) as an inherited static method defined in a parent class.
		
		* Method hiding is similar to but not exactly the same as method overriding.
		The first 5 rules of overriding a method must be followed when hiding a method 
		, but there is two more rules to follow for hiding a method.
		--------------------------------------------------------------------------------
		S t a t i c   M e t h o d   H i d i n g   R u l e s
		--------------------------------------------------------------------------------
		1- The method in the child class must have the same signature as the method in 
		the parent class.
		
		2- The method in the child class must be at least as accessible as the method
		in the parent class.
		
		3- The method in the child class may not declare a checked exception that is new
		or broader than the class of any exception declared in the parent class method.
		
		This implies hiding methods are free to declare any number of new unchecked
		exceptions.
		
		4- If the method returns a value, it must be the same or a sub-type of the 
		return type of the method in the parent class (known as co-variant return types).
		
		5- Only instance methods can be overridden. Static methods cannot be overridden.
		Static methods can be hidden though.
		
		6- The method defined in the child and parent classes must be marked as static.
		
		7- An inherited static method cannot be hidden if it is marked final in the
		parent class.
		
		8- Final methods cannot be hidden or overridden.
		--------------------------------------------------------------------------------		
		""");
	}
	
	protected static Random r = new Random();
	
	protected static String getRandom() {
		// Returns random int in range [0,10)
		return ("A random number in range [0,10)-->" + r.nextInt(10));
	}
	
	protected static void dummyMethod1() throws IOException{}
	
	protected static void dummyMethod2() throws FileNotFoundException{}
	
	protected static void dummyMethod3() {};
	
	public static void staticDummyMethod1() {}
	
	protected static CharSequence dummyMethod4() { return null;}
	
	protected static String dummyMethod5() { return null;}
}

public class A1 extends A0 {
	public static String getRandom() {
		// Returns random int in range [10,100]
		return ("A random number in range [10,100]-->" + ((r.nextInt(10)+1) * 10));
	}
	
	/*
	private static int getRandom() {
		// Returns random int in range [10,100]
		return (A0.getRandom()+1) * 10;
	}
	
	DOES NOT COMPILE (Violation of Static Method Hiding Rules 2)
	--------------------------------------------------------------
	As access modifier private is more restrictive than protected
	access modifier given in parent class to the hidden method
	getRandom().
	
    error: getRandom() in A1 cannot override getRandom() in A0
	private static int getRandom() {
	                   ^
    attempting to assign weaker access privileges; was protected
	*/
	
	/*
	public static int getRandom() throws IOException{
		// Returns random int in range [10,100]
		return (A0.getRandom()+1) * 10;
	}
	
	DOES NOT COMPILE (Violation of Static Method Hiding Rules 3)
	--------------------------------------------------------------
	As it declares a new checked exception.
	
    error: getRandom() in A1 cannot override getRandom() in A0
	public static int getRandom() throws IOException{
	                  ^
    overridden method does not throw IOException
    1 error
	*/
	
	/*
	 * COMPILES WELL: As FileNotFoundException is narrower than 
	 * IOException declared in the parent class' s hidden dummyMethod1() 
	 * method.
	 */
	public static void dummyMethod1() throws FileNotFoundException{} 
	
	/*
	public static void dummyMethod2() throws IOException{}
	
	DOES NOT COMPILE (Violation of Static Method Hiding Rules 3)
	--------------------------------------------------------------
	As IOException is broader than FileNotFoundException declared in the 
	parent class' s hidden dummyMethod2() method.
	
    error: dummyMethod2() in A1 cannot override dummyMethod2() in A0
	public static void dummyMethod2() throws IOException{}
	                   ^
    overridden method does not throw IOException
	*/
	
	/*
	 * COMPILES WELL: Although it introduces a new exception which is
	 * not declared in the parent class's hidden method dummyMethod3(), 
	 * this compiles well because the exception is an unchecked exception.
	 */

	protected static void dummyMethod3() throws NumberFormatException{};

	/*
	 * COMPILES WELL: The return type is compatiple as return type
	 * String is-a-CharSequence which is the return type of the 
	 * parent class's overridden method dummyMethod4()
	 */
	public static String dummyMethod4() { return null;}
	
	/*
	public static CharSequence dummyMethod5() { return null;}
	
	DOES NOT COMPILE (Violation of Static Method Hiding Rules 4)
	---------------------------------------------------------------	
    error: dummyMethod5() in A1 cannot hide dummyMethod5() in A0
	public static CharSequence dummyMethod5() { return null;}
	                           ^
    return type CharSequence is not compatible with String
	*/
	
	/*
	@Override
	public static void staticDummyMethod1() {}
	
	DOES NOT COMPILE (Violation of Static Method Hiding Rules 5)
	--------------------------------------------------------------
	Static methods cannot be overridden.
	
	error: static methods cannot be annotated with @Override
	*/
	
	/*
	public String dummyMethod5() { return null;}	

	DOES NOT COMPILE (Violation of Static Method Hiding Rules 6)
	--------------------------------------------------------------
	error: dummyMethod5() in A1 cannot override dummyMethod5() in A0
	public String dummyMethod5() { return null;}	
	              ^
    overridden method is static
	*/
	public static void printRandoms() {
		System.out.println("A1.getRandom()-->" + A1.getRandom());
		System.out.println("A0.getRandom()-->" + A0.getRandom());
	}
	
	public static void main(String[] args) {
		//
		System.out.println("-------------------- E x a m p l e   O u t p u t --------------------");
		A1.printRandoms();
	}
}