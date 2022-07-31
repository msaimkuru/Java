package org.curlybrace.oopj.ocp1z0_829.ch05.mystudies.Study004_applyingAccessModifiersToClassMembers.study03_protected.packagesC;

import org.curlybrace.oopj.ocp1z0_829.ch05.mystudies.Study004_applyingAccessModifiersToClassMembers.study03_protected.packagesA.A1;

/* Terminal commands to run program
 * curlybrace@saim-MacBook-Pro src % 
 * javac org/curlybrace/oopj/ocp1z0_829/ch05/mystudies/Study004_applyingAccessModifiersToClassMembers/study03_protected/packagesC/C1.java
 * curlybrace@saim-MacBook-Pro src % 
 * java org.curlybrace.oopj.ocp1z0_829.ch05.mystudies.Study004_applyingAccessModifiersToClassMembers.study03_protected.packagesC.C1    
 */

public class C1 {
	public void printText() {
		A1 a1 = new A1();
		/*
		 * DOES NOT COMPILE : The method protectedPrintText() from the type A1 is not visible
		 *
		 * a1.protectedPrintText();
		 */
		System.out.println("* Runner: C1.printText()                              (in diff package with and not a subclass of A1) -> only could create an instance of A1)");	
	}	
	
	public static void main(String[] args) {
		C1 c1 = new C1();
		c1.printText();
	}	
}