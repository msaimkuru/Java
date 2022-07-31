package org.curlybrace.oopj.ocp1z0_829.ch06.mystudies.Study005_InheritingMembers.Study005_01_OverridingInstanceMethods;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;

/* 
 * Terminal commands to run program
 * curlybrace@saim-MacBook-Pro src % 
 * javac org/curlybrace/oopj/ocp1z0_829/ch06/mystudies/Study005_InheritingMembers/Study005_01_OverridingInstanceMethods/A1.java
 * curlybrace@saim-MacBook-Pro src % 
 * java org.curlybrace.oopj.ocp1z0_829.ch06.mystudies.Study005_InheritingMembers.Study005_01_OverridingInstanceMethods.A1
 */

class A0{
	static {
		System.out.println("""
		--------------------------------------------------------------------------------
		I  n  h  e  r  i  t  i  n  g     M e m b e r s - 
		O v e r r i d i n g   I n s t a n c e   M e t h o d s
		--------------------------------------------------------------------------------
		* In Java, overriding a method occurs when a subclass declares a new 
		implementation FOR AN INHERITED METHOD with the same signature (name of the 
		method and the type and order of the method parameters) and compatible 
		return type.
		
		* When we override a method, we may still reference the parent version of the
		method using the super keyword.
		--------------------------------------------------------------------------------
		M e t h o d   O v e r r i d i n g   R u l e s
		--------------------------------------------------------------------------------
		1- The method in the child class must have the same signature as the method in 
		the parent class.
		
		2- The method in the child class must be at least as accessible as the method
		in the parent class.
		
		3- The method in the child class may not declare a checked exception that is new
		or broader than the class of any exception declared in the parent class method.
		
		This implies overriding methods are free to declare any number of new unchecked
		exceptions.
		
		4- If the method returns a value, it must be the same or a sub-type of the 
		return type of the method in the parent class (known as co-variant return types).
		
		5- Only instance methods can be overridden. Static methods cannot be overridden.
		
		6- An inherited instance method cannot be overridden if it is marked final in 
		the parent class.
		--------------------------------------------------------------------------------		
		""");
	}
	
	private Random r = new Random();
	
	protected int getRandom() {
		// Returns random int in range [0,10)
		return r.nextInt(10);
	}
	
	protected void dummyMethod1() throws IOException{}
	
	protected void dummyMethod2() throws FileNotFoundException{}
	
	protected void dummyMethod3() {};
	
	public static void staticDummyMethod1() {}
	
	protected CharSequence dummyMethod4() { return null;}
	
	protected String dummyMethod5() { return null;}
}

public class A1 extends A0 {
	@Override
	public int getRandom() {
		// Returns random int in range [10,100]
		return (super.getRandom() + 1) * 10;
	}
	
	/*
	@Override
	private int getRandom() {
		// Returns random int in range [10,100]
		return (super.getRandom() + 1) * 10;
	}
	
	DOES NOT COMPILE (Violation of Method Overriding Rules 2)
	--------------------------------------------------------------
	As access modifier private is more restrictive than protected
	access modifier given in parent class to the overridden method
	getRandom().
	
    error: getRandom() in A1 cannot override getRandom() in A0
	private int getRandom() {
	            ^
    attempting to assign weaker access privileges; was protected
	*/
	
	/*
	@Override
	public int getRandom() throws IOException{
		// Returns random int in range [10,100]
		return (super.getRandom() + 1) * 10;
	}
	
	DOES NOT COMPILE (Violation of Method Overriding Rules 3)
	--------------------------------------------------------------
	As it declares a new checked exception.
	
	error: getRandom() in A1 cannot override getRandom() in A0
	public int getRandom() throws IOException{
	           ^
  	overridden method does not throw IOException
	*/
	
	/*
	 * COMPILES WELL: As FileNotFoundException is narrower than 
	 * IOException declared in the parent class' s overridden dummyMethod1() 
	 * method.
	 */
	@Override
	public void dummyMethod1() throws FileNotFoundException{} 
	
	/*
	@Override
	public void dummyMethod2() throws IOException{}
	
	DOES NOT COMPILE (Violation of Method Overriding Rules 3)
	--------------------------------------------------------------
	As IOException is broader than FileNotFoundException declared in the 
	parent class' s overridden dummyMethod2() method.
	
	error: dummyMethod2() in A1 cannot override dummyMethod2() in A0
	public void dummyMethod2() throws IOException{}
	            ^
    overridden method does not throw IOException
	*/
	
	/*
	 * COMPILES WELL: Although it introduces a new exception which is
	 * not declared in the parent class's overridden method dummyMethod3(), 
	 * this compiles well because the exception is an unchecked exception.
	 */
	@Override
	protected void dummyMethod3() throws NumberFormatException{};

	/*
	 * COMPILES WELL: It doesn't return CharSequence, but, as a String is-a
	 * CharSequence, the return type of child class method is 
	 * compatible/covariant with of the parent class.
	 */	
	@Override
	public String dummyMethod4() { return null;}
	
	/*
	@Override
	public CharSequence dummyMethod5() { return null;}
	
	DOES NOT COMPILE (Violation of Method Overriding Rules 4)
	---------------------------------------------------------------	
	As a CharSequence is-not-a String it doesn't compile.
	
	error: dummyMethod5() in A1 cannot override dummyMethod5() in A0
	public CharSequence dummyMethod5() { return null;}
	                    ^
    return type CharSequence is not compatible with String
	*/
	
	/*	
	@Override
	public static void staticDummyMethod1() {}
	
	DOES NOT COMPILE (Violation of Method Overriding Rules 5)
	--------------------------------------------------------------
	Static methods cannot be overridden.
	
	error: static methods cannot be annotated with @Override
	*/

	public void printRandoms() {
		System.out.println(" this.getRandom()-->" + this.getRandom());
		System.out.println("super.getRandom()-->" + super.getRandom());
	}
	
	public static void main(String[] args) {
		A1 o1 = new A1();
		//
		System.out.println("-------------------- E x a m p l e   O u t p u t --------------------");
		o1.printRandoms();
	}
}