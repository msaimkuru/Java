package org.curlybrace.oopj.ocp1z0_829.ch06.mystudies.Study005_InheritingMembers.Study005_03_HidingVariables;

/* 
 * Terminal commands to run program
 * curlybrace@saim-MacBook-Pro src % 
 * javac org/curlybrace/oopj/ocp1z0_829/ch06/mystudies/Study005_InheritingMembers/Study005_03_HidingVariables/A1.java
 * curlybrace@saim-MacBook-Pro src % 
 * java org.curlybrace.oopj.ocp1z0_829.ch06.mystudies.Study005_InheritingMembers.Study005_03_HidingVariables.A1
 */


class A0{
	static {
		System.out.println("""
		--------------------------------------------------------------------------------
		I n h e r i t i n g   M e m b e r s - H i d i n g  V a r i a b l e s
		--------------------------------------------------------------------------------
		* Java doesn't allow variables to be overridden, they can be hidden though.
		
		* A hidden variable occurs when a subclass defines a variable with the same name 
		as an INHERITED VARIABLE defined in the parent class. This creates two distinct 
		copies of the variable within an instance of the child class: one instance 
		defined in the parent class and one defined in the child class.
		--------------------------------------------------------------------------------
		V a r i a b l e  H i d i n g   R u l e s
		--------------------------------------------------------------------------------

		--------------------------------------------------------------------------------		
		""");
	}

	protected boolean b1 = false;
	protected static boolean b2 = false;
	protected boolean b3 = false;
	
	protected boolean getB1() {
		return b1;
	}

	protected boolean getB2() {
		return b2;
	}	
	
	protected boolean getB3() {
		return b3;
	}	
}

public class A1 extends A0{
	protected boolean b1 = true; 			// hides parent class's b1 instance variable.
	protected static boolean b2 = true;		// hides parent class's b2 static variable.
	protected byte b3 = 1;					// hides parent class's b3 static variable.

	protected boolean getB1() {
		return b1;
	}

	protected boolean getB2() {
		return b2;
	}	

	public static void main(String[] args) {
		A1 o1 = new A1();
		
		// Parent class reference referencing the child class instance
		A0 o0 = o1;	
		//
		System.out.println("----- b1 variable investigations -----");
		System.out.println("     o0.b1-->" + o0.b1);			// Prints-->o0.b1-->false
		System.out.println("     o1.b1-->" + o1.b1);			// Prints-->o1.b1-->true
		/* 
		 * Instance method getB1() in parent class ClassA0 is overridden in child class A1.
		 * So, even o0 has a ClassA0 reference type, as it references to a child class
		 * instance, when calling getB1() method the child class instance's getB1()
		 * method is called (actually, this is what we call polymorphism) which
		 * in turn returns the value of instance variable b1 of class A1
		 */
		System.out.println("o0.getB1()-->" + o0.getB1());	// Prints-->o0.getB1()-->true
		System.out.println("o1.getB1()-->" + o1.getB1());	// Prints-->o1.getB1()-->true	
		//
		System.out.println("----- b2 variable investigations -----");
		//
		System.out.println("     o0.b2-->" + o0.b2);			// Prints-->o0.b2-->false
		System.out.println("     o1.b2-->" + o1.b2);			// Prints-->o1.b2-->true	
		/* 
		 * Instance method getB2() in parent class ClassA0 is overridden in child class A1.
		 * So, even o0 has a ClassA0 reference type, as it references to a child class
		 * instance, when calling getB2() method the child class instance's getB2()
		 * method is called (actually, this is what we call polymorphism) which
		 * in turn returns the value of static variable b2 of class A1
		 */		
		System.out.println("o0.getB2()-->" + o0.getB2());	// Prints-->o0.getB2()-->true	
		System.out.println("o1.getB2()-->" + o1.getB2());	// Prints-->o1.getB2()-->true			
		//
		System.out.println("----- b3 variable investigations -----");		
		//
		System.out.println("     o0.b3-->" + o0.b3);			// Prints-->o0.b3-->false
		System.out.println("     o1.b3-->" + o1.b3);			// Prints-->o1.b3-->1
		/*
		 * As getB3() is not overridden in child class A1, it is inherited from parent
		 * class ClassA0. So in child class A1 getB3() method returns the value of inherited 
		 * but hidden variable b3 of parent class ClassA0.
		 */
		System.out.println("o0.getB3()-->" + o0.getB3());	// Prints-->o0.getB3()-->false	
		System.out.println("o1.getB3()-->" + o1.getB3());	// Prints-->o1.getB3()-->false	
	}
}