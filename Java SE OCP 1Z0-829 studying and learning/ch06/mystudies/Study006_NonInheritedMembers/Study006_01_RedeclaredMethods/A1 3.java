package org.curlybrace.oopj.ocp1z0_829.ch06.mystudies.Study006_NonInheritedMembers.Study006_01_RedeclaredMethods;

/* 
 * Terminal commands to run program
 * curlybrace@saim-MacBook-Pro src % 
 * javac org/curlybrace/oopj/ocp1z0_829/ch06/mystudies/Study006_NonInheritedMembers/Study006_01_RedeclaredMethods/A1.java
 * curlybrace@saim-MacBook-Pro src % 
 * java org.curlybrace.oopj.ocp1z0_829.ch06.mystudies.Study006_NonInheritedMembers.Study006_01_RedeclaredMethods.A1
 */

class A0{
	static {
		System.out.println("""
		--------------------------------------------------------------------------------
		R e d e c l a r i n g   M e t h o d s
		--------------------------------------------------------------------------------
		* In Java, we can't override private methods since they are not inherited. 
		
		* So, if we declare a non-inherited method in the child class with the same name 
		but same or different signature, it s called redeclaring a method.
		
		In general saying, any method of a parent class that is not inherited by a 
		subclass can be redeclared.
		
		* A redeclared method is not an overriding or hiding version of the parent class
		method. It 's a new, separate and independent method, unrelated to the parent
		version's method, so none of the overriding rules is invoked.
		--------------------------------------------------------------------------------	
		""");
	}
	
	/* 
	 * Can be redeclared (that is, can't be inherited) in a 
	 * subclass either in same or different package
	 */	
	private String privateRedeclaredMethod() {
		return null;	
	}
	
	/* 
	 * package-private method
	 * Can be redeclared (that is, can't be inherited) 
	 * in a subclass which is in a different package
	 */
	String packagePrivateRedeclaredMethod() {
		return null;	
	}
	
	/* 
	 * Can not be redeclared in any subclass
	 * (that is, can be inherited in any subclass)
	 */ 
	protected String nonRedeclarableMethod() {
		return "Writing from ClassA0.nonRedeclarableMethod()";	
	}		
}

public class A1 extends A0{
	/*
	 *  redeclaring a method in the parent class.
	 */
	private int privateRedeclaredMethod() {
		super.packagePrivateRedeclaredMethod();
		return 0;	
	}
	
	public static void main(String[] args) {
		
	}
}