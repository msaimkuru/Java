package org.curlybrace.oopj.ocp1z0_829.ch05.mystudies.Study004_applyingAccessModifiersToClassMembers.study03_protected.packagesA;

import org.curlybrace.oopj.ocp1z0_829.ch05.mystudies.Study004_applyingAccessModifiersToClassMembers.study03_protected.packagesA.A1;
import org.curlybrace.oopj.ocp1z0_829.ch05.mystudies.Study004_applyingAccessModifiersToClassMembers.study03_protected.packagesC.C1;
import org.curlybrace.oopj.ocp1z0_829.ch05.mystudies.Study004_applyingAccessModifiersToClassMembers.study03_protected.packagesD.D1ofA1;

/* 
 * Terminal commands to run program
 * curlybrace@saim-MacBook-Pro src % 
 * javac org/curlybrace/oopj/ocp1z0_829/ch05/mystudies/Study004_applyingAccessModifiersToClassMembers/study03_protected/packagesA/A3ofA1.java
 * curlybrace@saim-MacBook-Pro src % 
 * java org.curlybrace.oopj.ocp1z0_829.ch05.mystudies.Study004_applyingAccessModifiersToClassMembers.study03_protected.packagesA.A3ofA1  
 */

public class A3ofA1 extends A1{
	@Override
	void printPackagePrivateText(){
		System.out.println("* Caller: overriding A3ofA1.printPackagePrivateText() (in same package with and extends class A1) -> ");
		super.printPackagePrivateText();
	}
	
	@Override
	public void printProtectedText() {
		System.out.println("* Caller: overriding A3ofA1.printProtectedText()      (in same package with and extends class A1) -> ");
		super.printProtectedText();
	}
	
	public static void main(String[] args) {		
		A3ofA1 a3ofa1 = new A3ofA1();
		a3ofa1.printProtectedText();
		//
		System.out.println("------------------------------");
		//
		a3ofa1.printPackagePrivateText();
		//
		System.out.println("----------------------------------------------------------------------");
		//
		A1 a1 = new A1();
		/*
		 * IMPORTANT NOTE:
		 * ----------------
		 * If a subclass is in same package with a parent class, then by parent class references
		 * we can access protected instance members as well as we can already access protected
		 * members in subclass code or by subclass references. 
		 */
		a1.printProtectedText();
		System.out.println("------------------------------");
		a1.printPackagePrivateText();
		//
		System.out.println("----------------------------------------------------------------------");
		a1 = a3ofa1;
		a1.printProtectedText(); 		// polymorphism: overriding method of A3oFA1 instance is called
		System.out.println("------------------------------");
		a1.printPackagePrivateText();	// polymorphism: overriding method of A3oFA1 instance is called		
	}
}