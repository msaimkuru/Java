package org.curlybrace.oopj.ocp1z0_829.ch05.mystudies.Study004_applyingAccessModifiersToClassMembers.study02_package.packagesB;

import org.curlybrace.oopj.ocp1z0_829.ch05.mystudies.Study004_applyingAccessModifiersToClassMembers.study02_package.packagesA.A1;

/* Terminal commands to run program
 * curlybrace@saim-MacBook-Pro src % javac org/curlybrace/oopj/ocp1z0_829/ch05/mystudies/Study004_applyingAccessModifiersToClassMembers/study02_package/packagesB/B2.java
 * curlybrace@saim-MacBook-Pro src % java org.curlybrace.oopj.ocp1z0_829.ch05.mystudies.Study004_applyingAccessModifiersToClassMembers.study02_package.packagesB.B2 
 */

public class B2 {
	// String text = "Class B2 package-access/package-private text member";
	
	public static void main(String[] args) {
		System.out.println("""
		/* ------------------------------------------------------
		 * package Access Modifier
		 * ------------------------------------------------------
		 * 1- When we don't put any access modifier, Java assumes
		 * package access/package-private.
		 * 2- Only code in the same class + same package can access 
		 * package-access/package-private members.
		 * ------------------------------------------------------
		 */
		 """);
		
		A1 a1 = new A1();
		/*
		 * DOES NOT COMPILE
		 * The method printText() from the type A1 is not visible
		 * a1.printText();
		 */
	}
}