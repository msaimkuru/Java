package org.curlybrace.oopj.ocp1z0_829.ch06.mystudies.Study005_InheritingMembers.Study005_01_OverridingInstanceMethods.PolyMorphismPackage1;

import org.curlybrace.oopj.ocp1z0_829.ch06.mystudies.Study005_InheritingMembers.Study005_01_OverridingInstanceMethods.PolyMorphismPackage2.B0ofA0;

/* 
 * Terminal commands to run program
 * curlybrace@saim-MacBook-Pro src % 
 * javac org/curlybrace/oopj/ocp1z0_829/ch06/mystudies/Study005_InheritingMembers/Study005_01_OverridingInstanceMethods/PolyMorphismPackage1/A1ofA0.java
 * curlybrace@saim-MacBook-Pro src % 
 * java org.curlybrace.oopj.ocp1z0_829.ch06.mystudies.Study005_InheritingMembers.Study005_01_OverridingInstanceMethods.PolyMorphismPackage1.A1ofA0
 */

public class A1ofA0 extends A0{

	public static void main(String[] args) {
		System.out.println("""
		--------------------------------------------------------- 
		Info:
		---------------------------------------------------------
		Code is in Class A1ofA0 which extends A0 and which is in 
		the same package with A0.
		---------------------------------------------------------
		""");
		// This is an application of polymorphism.
		System.out.println("---------- Reference type is A0 (parent class) ---------- ");
		A0 a0 = new B0ofA0();
		a0.setPackagePrivateInstanceString1(" sets..");
		System.out.println(a0.getPackagePrivateInstanceString1());
		a0.setProtectedInstanceString1(" sets..");
		System.out.println(a0.getProtectedInstanceString1());
		System.out.println();
		//
		//
		//
		System.out.println("---------- Reference type is B0ofA0 (child class) ---------- ");
		B0ofA0 b0ofa0 = new B0ofA0();
		/*
		 b0ofa0.setProtectedInstanceString1(" seta ..");
		 
		 error: setProtectedInstanceString1(String) has protected access in B0ofA0
		 b0ofa0.setProtectedInstanceString1(" sets ..");
		       ^
		 */      
		/*
		 System.out.println(b0ofa0.getProtectedInstanceString1());	
		 
		 error: getProtectedInstanceString1() has protected access in B0ofA0
   		 System.out.println(b0ofa0.getProtectedInstanceString1());	
		                          ^
         */
		
		
		//System.out.println(b0ofa0.getPackagePrivateInstanceString1());	
		/*
		error: getPackagePrivateInstanceString1() is not public in B0ofA0; cannot be accessed from outside package
		System.out.println(b0ofa0.getPackagePrivateInstanceString1());		
		                         ^
		*/	
	}
}