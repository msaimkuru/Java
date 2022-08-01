package org.curlybrace.oopj.ocp1z0_829.ch06.mystudies.Study005_InheritingMembers.Study005_01_OverridingInstanceMethods.PolyMorphismPackage1;

import org.curlybrace.oopj.ocp1z0_829.ch06.mystudies.Study005_InheritingMembers.Study005_01_OverridingInstanceMethods.PolyMorphismPackage2.B0ofA0;

/* 
 * Terminal commands to run program
 * curlybrace@saim-MacBook-Pro src % 
 * javac org/curlybrace/oopj/ocp1z0_829/ch06/mystudies/Study005_InheritingMembers/Study005_01_OverridingInstanceMethods/PolyMorphismPackage1/ClassA0.java
 * curlybrace@saim-MacBook-Pro src % 
 * java org.curlybrace.oopj.ocp1z0_829.ch06.mystudies.Study005_InheritingMembers.Study005_01_OverridingInstanceMethods.PolyMorphismPackage1.A0
 */

public class A0 {	
	String packagePrivateInstanceString1 = "initialized in ClassA0 (variable packagePrivateInstanceString1)";
	protected String protectedInstanceString1 = "initialized in ClassA0 (variable protectedInstanceString1)";
	
	String getPackagePrivateInstanceString1() {
		return packagePrivateInstanceString1;
	}

	void setPackagePrivateInstanceString1(String packagePrivateInstanceString1) {
		this.packagePrivateInstanceString1 = "ClassA0.setPackagePrivateInstanceString1(): " + packagePrivateInstanceString1 + " packagePrivateInstanceString1";
	}

	protected String getProtectedInstanceString1() {
		return protectedInstanceString1;
	}

	protected void setProtectedInstanceString1(String protectedInstanceString1) {
		this.protectedInstanceString1 = "ClassA0.setProtectedInstanceString1(): " + protectedInstanceString1 + " protectedInstanceString1";
	}

	public static void main(String[] args) {
		/*
		 * This is an application of polymorphism.
		 */
		A0 a0 = new B0ofA0();
		a0.setPackagePrivateInstanceString1(" sets..");
		System.out.println("ClassA0-1) " + a0.getPackagePrivateInstanceString1());
		a0.setProtectedInstanceString1(" sets..");
		System.out.println("ClassA0-2) " + a0.getProtectedInstanceString1());
	}
}