package org.curlybrace.oopj.ocp1z0_829.ch05.mystudies.Study004_applyingAccessModifiersToClassMembers.study01_private.packagesA;

/* Terminal commands to run program
 * curlybrace@saim-MacBook-Pro src % javac org/curlybrace/oopj/ocp1z0_829/ch05/mystudies/Study004_applyingAccessModifiersToClassMembers/study01_private/packagesA/A2.java
 * curlybrace@saim-MacBook-Pro src % java org.curlybrace.oopj.ocp1z0_829.ch05.mystudies.Study004_applyingAccessModifiersToClassMembers.study01_private.packagesA.A2 
 */

public class A2 {
	//private String text = "Class A2 private text member";
	
	public static final void main(String[] args) {
		System.out.println("""
		/* ----------------------------------------------------------------
		 * private Access Modifier
		 * ----------------------------------------------------------------
		 * 1- Only code in the same class can access private members.
		 * ----------------------------------------------------------------
		 */
		 """);
		
		A1 a1 = new A1();
		/* 
		 * DOES NOT COMPILE
		 * The method printText() from the type A1 is not visible
	     * The field A1.text is not visible
		 */
		//a1.printText();
		//a1.text = a1.text + ".";
	}
}