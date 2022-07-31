package org.curlybrace.oopj.ocp1z0_829.ch06.mystudies.Study002_ThisAndSuperReferences;

/**
 * @author	Saim Kuru
 * @version 1.0
 * ------------
 * Objectives:
 * ------------ 
 * 1. Understanding this and super references.
 * ------------
 * Difficulty: Medium
 * ------------ 
 */

/* Terminal commands to run program
 * curlybrace@saim-MacBook-Pro src % javac org/curlybrace/oopj/ocp1z0_829/ch06/mystudies/Study002_ThisAndSuperReferences/*.java
 * curlybrace@saim-MacBook-Pro src % java org.curlybrace.oopj.ocp1z0_829.ch06.mystudies.Study002_ThisAndSuperReferences.A1      
 */

public class A1 {
	public int i1 = 0;
	public int i2 = 0;
	static int si1 = 1;

	static {
		System.out.println("""
		--------------------------------------------------------------------------------		
		t h i s   R e f e r e n c e
		--------------------------------------------------------------------------------
		1) The this reference refers to the current instance of the class and can be 
		used to access any member of the class, including inherited members.
		
		2) this includes current and inherited members.
		
		3) this reference can be used in any instance method, constructor, or instance
		initializer block. It cannot be used in a static context or when there is no 
		implicit instance of the class, such as in a static method or static initializer 
		block.
		
		4) static members can be accessed via this reference, but this access still is 
		via Class but not via the instance.
		
		5) In many cases, the  t h i s  reference is optional. If Java encounters a 
		variable or method it cannot find, it will check the class hierarchy to see if
		it is available.
		--------------------------------------------------------------------------------
		--------------------------------------------------------------------------------		
		s u p e r    R e f e r e n c e   a n d   H i d i n g   V a r i a b l e s
		--------------------------------------------------------------------------------
		1) In Java, a variable or method can be defined in both a parent class and a 
		child class. This means the object instance actually holds 2 copies of the same
		variable with the same underlying name.
		
		2) Declaring a variable with the same name as an inherited variable is referred 
		to as hiding a variable.
		
		3) super only includes inherited members.
		
		4) super reference is similar to the this reference, but, the member referenced 
		by super keyword must be accessible via inheritance.
		--------------------------------------------------------------------------------
		""");	

		System.out.println("""
		--------------------------------------------------------------------------------
		Note: Subclasses can access to the members they inherit with this keyword
		(of course in non-static contexts)
		--------------------------------------------------------------------------------
		""");		
	}
	
	public void setI1Wrong(int i1) {
		/* 
		 * by i1, parameter i1 is seen in this local context, so, 
		 * parameter i1 is assigned to itself not to instance 
		 * variable i1.
		 */		
		i1 = i1;
	}

	public void setI1Good(int i1) {
		/* 
		 * by i1, parameter i1 is seen in this local context, so, 
		 * to assign parameter i1 value to instance variable i1
		 * we use this.i1 as assignment target.
		 */				
		this.i1 = i1;	
	}

	public void setSI1Good(int si1) {
		/* 
		 * by si1, parameter si1 is seen in this local context, so, 
		 * to assign parameter si1 value to static variable si1
		 * we use A1.si1 as assignment target.
		 */				
		A1.si1 = si1;	
	}
	
	public int getI1() {
		return i1;
	}

	public int getSI1() {
		return si1;
	}
	
	public static void main(String[] args) {
		A1 o1 = new A1();
		
		o1.setI1Wrong(123);
		System.out.println("o1.getI1()-->" + o1.getI1());
		o1.setI1Good(123);
		System.out.println("o1.getI1()-->" + o1.getI1());	
		o1.setSI1Good(456);
		System.out.println("o1.getSI1()-->" + o1.getSI1());			
		
		/*
		 System.out.println(this.i1); //Can not use this in a static context
		 
		 DOES NOT COMPILE:
		 -----------------
         error: non-static variable this cannot be referenced from a static context
		 System.out.println(this.i1); //Can not use this in a static context
		 
		 */		
	}
}