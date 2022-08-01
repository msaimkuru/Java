package org.curlybrace.oopj.ocp1z0_829.ch05.mystudies.Study004_applyingAccessModifiersToClassMembers.study02_package.packagesA;

/* Terminal commands to run program
 * curlybrace@saim-MacBook-Pro src % javac org/curlybrace/oopj/ocp1z0_829/ch05/mystudies/Study004_applyingAccessModifiersToClassMembers/study02_package/packagesA/A1.java
 * curlybrace@saim-MacBook-Pro src % java org.curlybrace.oopj.ocp1z0_829.ch05.mystudies.Study004_applyingAccessModifiersToClassMembers.study02_package.packagesA.A1 
 */

public class A1 {
	String text = "Class A1 package-access/package-private text member";
	
	void printText() {
		System.out.println(text);
	}
	
	void printText2(String s) {
		System.out.println(s);
	}	
	
	public static void main(String[] args) {
		System.out.println("""
		 ------------------------------------------------------
		 package Access Modifier
		 ------------------------------------------------------
		 1- When we don't put any access modifier, Java assumes
		 package access/package-private.
		 
		 2- Only code in the same class + same package can access 
		 package-access/package-private members.
		 ------------------------------------------------------
		 """);
		A1 a1 = new A1();
		a1.printText();
		a1.text = a1.text + ".";
		
		A1 a2 = new A1();
		a2.printText2(a1.text);
		//
	}
}