package org.curlybrace.oopj.ocp1z0_829.ch06.mystudies.Study005_InheritingMembers.Study005_04_WritingFinalMethods;

/* 
 * Terminal commands to run program
 * curlybrace@saim-MacBook-Pro src % 
 * javac org/curlybrace/oopj/ocp1z0_829/ch06/mystudies/Study005_InheritingMembers/Study005_04_WritingFinalMethods/A1.java
 * curlybrace@saim-MacBook-Pro src % 
 * java org.curlybrace.oopj.ocp1z0_829.ch06.mystudies.Study005_InheritingMembers.Study005_04_WritingFinalMethods.A1
 */

class A0{
	static {
		System.out.println("""
		--------------------------------------------------------------------------------
		I n h e r i t a n c e   -   R u l e s   f o r   f i n a l   M e t h o d s 
		--------------------------------------------------------------------------------
		1) If an inherited static/instance method is marked final in the parent class, 
		then it cannot be hidden/overridden in the child class.
		
		2) If a private (or any non-inherited) method in a class is also declared in a 
		child class, it is neither an overriding nor a hiding method, but it is a 
		re-declared method, and it is permitted.
		--------------------------------------------------------------------------------
		""");
	}
	
	private final static int privateFinalStaticInt1= 0;
	protected final static int protectedFinalStaticInt1 = 1;	
	
	private final void privateFinalMethod1() {}
	protected final void protectedFinalMethod1() {}

	private final static void privateFinalStaticMethod1() {}
	protected final static void protectedFinalStaticMethod1() {}	
}

public class A1 extends A0{
	private final static int privateFinalStaticInt1 = 0;
	
	protected final static int protectedFinalStaticInt1 = 1;		
	
	// A redeclared method.
	private final void privateFinalMethod1() {}
	
	/*
	protected final void protectedFinalMethod1() {}
	
	DOES NOT COMPILE:
	-----------------
    error: protectedFinalMethod1() in A1 cannot override protectedFinalMethod1() in ClassA0
	protected final void finalProtectedMethod1() {}
	                     ^
    overridden method is final
    */
	
	// A redeclared method.
	private final static void privateFinalStaticMethod1() {}

	/*
	protected final static void protectedFinalStaticMethod1() {}	
	
	DOES NOT COMPILE:
	-----------------
    error: protectedFinalStaticMethod1() in A1 cannot override protectedFinalStaticMethod1() in ClassA0
	protected final static void protectedFinalStaticMethod1() {}	
	                            ^
    overridden method is static,final
    */	
	
	public static void main(String[] args) {

	}
}