package org.curlybrace.oopj.ocp1z0_829.ch06.mystudies.Study000_Inheritance.Study000_01_IntroductionToInheritance;

/**
 * @author	Saim Kuru
 * @version 1.0
 * ------------
 * Objectives:
 * ------------ 
 * 1. Understanding Inheritance
 * ------------
 * Difficulty: Medium
 * ------------ 
 */

/* Terminal commands to run program
 * curlybrace@saim-MacBook-Pro src % 
 * javac org/curlybrace/oopj/ocp1z0_829/ch06/mystudies/Study000_Inheritance/Study000_01_IntroductionToInheritance/ClassA0.java
 * curlybrace@saim-MacBook-Pro src % 
 * java org.curlybrace.oopj.ocp1z0_829.ch06.mystudies.Study000_Inheritance/Study000_01_IntroductionToInheritance/ClassA0     
 */

class A0$ {
	static {
		System.out.println("""
		--------------------------------------------------------------------------------
		W h a t   I s   I n h e r i t a n c e ?
		--------------------------------------------------------------------------------
		* Inheritance is the process by which a subclass automatically includes certain
		members of the class, including primitives, objects, or methods, defined in the
		parent class.
		
		* One key aspect of inheritance is that it is transitive. Given three classes
		[X,Y,Z], if X extends Y, and Y extends Z, then X is considered a subclass or 
		descendant of Z. Likewise, Z is a superclass or ancestor of X. And besides,
		X is a direct subclass/descendant only of class Y, not Z.
		
		* When one class inherits from a parent class all public and protected members
		are automatically available as part of the child class (Be careful about what 
		we say here is more than having access to the parent class members, but having 
		them available as part of the child class). If the 2 classes are in the same 
		package, then package-private members of the parent class are also available
		as part of the child class. Private members of a parent class are never 
		available via inheritance. They are restricted to class they are defined in.
		
		* The child classes can read or write inherited members of the parent class
		as if they are their own members.
		
		* Java supports single inheritance, by which a class may inherit from only one 
		direct parent class. Java doesn't support multiple inheritance, but it supports
		multiple levels of inheritance, by which one class may extend another class,
		which in turn extends another class.
		
		* In java all classes inherit directly or indirectly from the java.lang.Object
		class.
		
		* java.lang.Object is the only class that doesn't have a parent class.
		
		* When we write a class that doesn't use the extends keyword to extend a
		specific class, the compiler automatically inserts code to extend the 
		java.lang.Object class. For example, the following two are equivalent class
		declarations.
				public class Zoo{}
				public class Zoo extends java.lang.Object{}
		
		The result is that every class gains access to any accessible members in the
		Object class. For example, the toString() and equals() methods are available
		in Object; therefore, they are accessible in all classes.
		--------------------------------------------------------------------------------		
		""");
	}
	
	public String getPrivateX() {
		return privateX;
	}

	public String getPackage_privateX() {
		return package_privateX;
	}

	public String getProtectedX() {
		return protectedX;
	}

	public String getPublicX() {
		return publicX;
	}

	private String privateX = """
							  -----------------------------------------------------------
							  * private variables/methods are neither inherited by 
							  subclasses nor can be accessible from other classes. We can 
							  only access private variables through accessible helper 
							  methods (generally called getters or setters).
							  -----------------------------------------------------------
                              """;
	
	String package_privateX = """
							  -----------------------------------------------------------
							  * package private variables/methods are inherited by 
							  subclasses in the same package and can be accessible from 
							  the classes in the same package.
							  -----------------------------------------------------------		
							  """;
	
	protected String protectedX 
	                        = """
							  -----------------------------------------------------------
							  * protected variables/methods are inherited by all 
							  subclasses and can be accessible from other classes in the 
							  same package or can be accessible through inheritance in 
							  subclasses from other packages.
							  -----------------------------------------------------------		
						       """;
	
	public String publicX   = """
							  -----------------------------------------------------------			
							  * public variables/methods are inherited by all subclasses 
							  and can be accessible from all classes in any package.
							  -----------------------------------------------------------		                      
                              """;	
}

public class A0 extends A0${
	public static void main(String[] args) {
		A0 a0 = new A0();
		System.out.println("""
		--------------------------------------------------------------------------------
		E x a m p l e   E x p l a n a t i o n
		--------------------------------------------------------------------------------
		This example prints values of 4 variables of different access 
		types (private, package-private, protected, public) defined in parent class A0$
		in main() method of child class A0.
		
		As A0 doesn't inherit the private variable from the parent class A0$ and cannot 
		access it directly, we use the public getter method() getPrivateX() inherited
		from the parent class A0$, to print it here in the main() method of child class
		A0.
		--------------------------------------------------------------------------------		
		""");
		
		/*
		System.out.println(a0.privateX);
		
		DOES NOT COMPILE:
		------------------
		error: privateX has private access in ClassA0$
		System.out.println(a0.privateX);
		                     ^
		*/
		
		// Printing super class's private variable by help of the public getter method.
		System.out.println(a0.getPrivateX());
		
		// Printing inherited variables
		System.out.println(a0.package_privateX);
		System.out.println(a0.protectedX);
		System.out.println(a0.publicX);	
	}
}