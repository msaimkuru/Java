package org.curlybrace.oopj.ocp1z0_829.ch05.mystudies.Study004_applyingAccessModifiersToClassMembers.study03_protected.packagesB;

import org.curlybrace.oopj.ocp1z0_829.ch05.mystudies.Study004_applyingAccessModifiersToClassMembers.study03_protected.packagesA.A1;
import org.curlybrace.oopj.ocp1z0_829.ch05.mystudies.Study004_applyingAccessModifiersToClassMembers.study03_protected.packagesC.C1;
import org.curlybrace.oopj.ocp1z0_829.ch05.mystudies.Study004_applyingAccessModifiersToClassMembers.study03_protected.packagesD.D1ofA1;

/* Terminal commands to run program
 * curlybrace@saim-MacBook-Pro src % 
 * javac org/curlybrace/oopj/ocp1z0_829/ch05/mystudies/Study004_applyingAccessModifiersToClassMembers/study03_protected/packagesB/B1ofA1.java
 * curlybrace@saim-MacBook-Pro src % 
 * java org.curlybrace.oopj.ocp1z0_829.ch05.mystudies.Study004_applyingAccessModifiersToClassMembers.study03_protected.packagesB.B1ofA1  
 */

public class B1ofA1 extends A1{
	@Override
	public void printProtectedText() {
		System.out.println("* Caller: overriding B1ofA1.printProtectedText()      (in diff package with and extends class A1) -> ");
		super.printProtectedText();
		/*
		 * DOES NOT COMPILE:
		 * The method printPackagePrivateText() from the type A1 is not visible
		 * super.printPackagePrivateText();
		 */
	}
	
	public static void main(String[] args) {	
		B1ofA1 b1ofA1 = new B1ofA1();
		b1ofA1.printProtectedText();
		//
		//System.out.println("------------------------------");
		//
		//b1ofA1.printPackagePrivateText();	// The method printPackagePrivateText() from the type A1 is not visible
		//
		//System.out.println("----------------------------------------------------------------------");
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
		a1.printProtectedText();			// The method printProtectedText() from the type A1 is not visibl
		
		DOES NOT COMPILE:
		-----------------
		error: printProtectedText() has protected access in A1
		a1.printProtectedText();			// The method printProtectedText() from the type A1 is not visible
		  ^
		*/
		System.out.println("----------------------------------------------------------------------");
		a1 = b1ofA1;
		/*
		a1.printProtectedText(); 		// The method printProtectedText() from the type A1 is not visible
		
		DOES NOT COMPILE:
		-----------------
		error: printProtectedText() has protected access in A1
		a1.printProtectedText(); 		// The method printProtectedText() from the type A1 is not visible
		  ^
		*/

		//
		System.out.println("----------------------------------------------------------------------");
		//
		C1 c1 = new C1();
		c1.printText();
		//
		System.out.println("----------------------------------------------------------------------");
		//
		D1ofA1 d1ofA1 = new D1ofA1();
		d1ofA1.printProtectedText();
		d1ofA1.printOtherD();
		d1ofA1.printOtherA();
		//
		//System.out.println("-----");
		//
		
		//
		//System.out.println("-----");
		//		
	}
}