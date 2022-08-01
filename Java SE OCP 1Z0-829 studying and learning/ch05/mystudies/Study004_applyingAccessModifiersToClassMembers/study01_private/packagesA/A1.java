package org.curlybrace.oopj.ocp1z0_829.ch05.mystudies.Study004_applyingAccessModifiersToClassMembers.study01_private.packagesA;

/* Terminal commands to run program
 * curlybrace@saim-MacBook-Pro src % javac org/curlybrace/oopj/ocp1z0_829/ch05/mystudies/Study004_applyingAccessModifiersToClassMembers/study01_private/packagesA/A1.java
 * curlybrace@saim-MacBook-Pro src % java org.curlybrace.oopj.ocp1z0_829.ch05.mystudies.Study004_applyingAccessModifiersToClassMembers.study01_private.packagesA.A1  
 */

public class A1 {
	private String text = "Class A1 private text member";
	
	private void printText() {
		System.out.println(text);
	}
	
	private void printText2(String s) {
		System.out.println(s);
	}
	
	private void setOtherInstanceText(A1 obj, String s) {
		obj.text = s;
	}
	
	public static void main(String[] args) {
		System.out.println("""
		/* ----------------------------------------------------------------
		 * private Access Modifier
		 * ----------------------------------------------------------------
		 * 1- Only code in the same class can access private members.
		 * ----------------------------------------------------------------
		 */
		 """);
		A1 a1 = new A1();
		a1.printText();
		a1.text = a1.text + ".";
		
		A1 a2 = new A1();
		a2.printText2(a1.text);
		
		a1.setOtherInstanceText(a2, "A1 instance referred to by a1 changes private text member of another A1 instance referred to by a2.");
		a2.printText();
	}
}