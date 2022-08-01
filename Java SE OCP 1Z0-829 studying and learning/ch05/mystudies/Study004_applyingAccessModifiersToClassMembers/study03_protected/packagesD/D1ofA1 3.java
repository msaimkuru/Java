package org.curlybrace.oopj.ocp1z0_829.ch05.mystudies.Study004_applyingAccessModifiersToClassMembers.study03_protected.packagesD;

import org.curlybrace.oopj.ocp1z0_829.ch05.mystudies.Study004_applyingAccessModifiersToClassMembers.study03_protected.packagesA.A1;
import org.curlybrace.oopj.ocp1z0_829.ch05.mystudies.Study004_applyingAccessModifiersToClassMembers.study03_protected.packagesB.B1ofA1;
import org.curlybrace.oopj.ocp1z0_829.ch05.mystudies.Study004_applyingAccessModifiersToClassMembers.study03_protected.packagesC.C1;

/* Terminal commands to run program
 * curlybrace@saim-MacBook-Pro src % 
 * javac org/curlybrace/oopj/ocp1z0_829/ch05/mystudies/Study004_applyingAccessModifiersToClassMembers/study03_protected/packagesD/D1ofA1.java
 * curlybrace@saim-MacBook-Pro src % 
 * java org.curlybrace.oopj.ocp1z0_829.ch05.mystudies.Study004_applyingAccessModifiersToClassMembers.study03_protected.packagesD.D1ofA1     
 */

public class D1ofA1 extends A1{
	@Override
	public void printProtectedText() {
		System.out.println("* Caller: overriding D1ofA1.printProtectedText()      (in diff package with and extends class A1) -> ");
		super.printProtectedText();
	}
	
	public void printOtherD() {
		D1ofA1 dOther = new D1ofA1();
		System.out.println("D1ofA1 other in:");
		dOther.printProtectedText();		
	}
	
	public void printOtherA() {
		A1 aOther = new A1();
		/* DOES NOT COMPILE : 
		 * error: printText() has protected access in A1
		 * aOther.printText();
		 */
		System.out.println("A1 other in: D1ofA1 could only created an instance of A1");
	}	
	
	public static void main(String[] args) {	
		D1ofA1 d1ofA1 = new D1ofA1();
		d1ofA1.printProtectedText();
		System.out.println("----------------------------------------------------------------------");
		d1ofA1.printOtherD();
		System.out.println("----------------------------------------------------------------------");
		d1ofA1.printOtherA();
		//
		System.out.println("----------------------------------------------------------------------");
		//
		A1 a1 = new A1();
		/*
		 * IMPORTANT NOTE:
		 * ----------------
		 * If a subclass is in different package with a parent class, then by parent class references
		 * we C A N N O T   A C C E S S   protected instance members. In contrary to this, we can access 
		 * protected members in subclass code or by subclass references through I N H E R I T A N C E. 
		 */			
		
		/*
		 a1.printProtectedText();	
		 
		 DOES NOT COMPILE:
		 -----------------
		 error: printProtectedText() has protected access in A1
		 a1.printProtectedText();
		   ^
		 */	
	}	
}