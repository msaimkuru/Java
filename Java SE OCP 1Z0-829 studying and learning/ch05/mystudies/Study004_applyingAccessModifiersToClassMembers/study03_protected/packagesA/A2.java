package org.curlybrace.oopj.ocp1z0_829.ch05.mystudies.Study004_applyingAccessModifiersToClassMembers.study03_protected.packagesA;

/* 
 * Terminal commands to run program
 * curlybrace@saim-MacBook-Pro src % 
 * javac org/curlybrace/oopj/ocp1z0_829/ch05/mystudies/Study004_applyingAccessModifiersToClassMembers/study03_protected/packagesA/A2.java
 * curlybrace@saim-MacBook-Pro src % 
 * java org.curlybrace.oopj.ocp1z0_829.ch05.mystudies.Study004_applyingAccessModifiersToClassMembers.study03_protected.packagesA.A2  
 */

public class A2 {
	public void printText() {
		A1 a1 = new A1();
		
		System.out.println("* Caller: A2.printText() (Class A2 in same package with class A1) -> ");
		a1.printProtectedText();
		
		System.out.println();
		
		System.out.println("* Caller: A2.printText() (Class A2 in same package with class A1) -> ");
		a1.printPackagePrivateText();
	}	
	
	public static void main(String[] args) {
		new A2().printText();
	}	
}