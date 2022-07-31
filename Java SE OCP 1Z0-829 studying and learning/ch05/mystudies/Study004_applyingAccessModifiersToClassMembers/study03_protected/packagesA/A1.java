package org.curlybrace.oopj.ocp1z0_829.ch05.mystudies.Study004_applyingAccessModifiersToClassMembers.study03_protected.packagesA;

/* 
 * Terminal commands to run program
 * curlybrace@saim-MacBook-Pro src % 
 * javac org/curlybrace/oopj/ocp1z0_829/ch05/mystudies/Study004_applyingAccessModifiersToClassMembers/study03_protected/packagesA/A1.java
 * curlybrace@saim-MacBook-Pro src % 
 * java org.curlybrace.oopj.ocp1z0_829.ch05.mystudies.Study004_applyingAccessModifiersToClassMembers.study03_protected.packagesA.A1 
 */

public class A1 {
	protected String protectedText = "Class A1's protected instance member       : protectedText     ";
	String packagePrivateText      = "Class A1's package-private instance member : packagePrivateText";
	
	static {
		System.out.println("""
		--------------------------------------------------------------------------
		protected Access Modifier
		--------------------------------------------------------------------------
		*** protected access is almost identical to default (package-private) 
		access, with one exception:
			
			it allows subclasses to inherit the protected thing, even if those
		 subclasses are outside the package of the superclass they extend.
		 
		 Unlike the other access levels, protected access only applies only to 
		 inheritance. That is, if a subclass-outside-the-package, has a reference 
		 to an instance of a superclass, or has a superclass reference pointing to
		 a subclass instance, the subclass can't access the protected method using 
		 that superclass reference. The only way for that subclass to access that 
		 protected method is by inheriting it.
		 
		 In other words, the subclass-outside-the-package doesn't have A C C E S S
		 to the protected method, it just has the method, through 
		 I N H E R I T A N C E.
		 
		 *** By extending a class;
		  
		 1 - the subclass gains inheritance and access to all public members of 
		 the parent class.
		 
		 2- If the 2 classes are in the same package, then the subclass also gains 
		 inheritance and access to all package-private members.
		 
		 3- If the 2 classes are in different packages, then the subclass gains 
		 only I N H E R I T A N C E for protected members, but it doesn't gain 
		 A C C E S S to the protected members.
		 --------------------------------------------------------------------------
		 """);		
	}
	protected void printProtectedText() {
		System.out.println(protectedText + " --> printed by Class A1's protected instance member       : printProtectedText()          ");
	}
	
	void printPackagePrivateText() {
		System.out.println(packagePrivateText + " --> printed by Class A1's package-private instance member : printPackagePrivateText()");
	}	
	
	public static void main(String[] args) {
		var o1 = new A1();
		//
		o1.printProtectedText();
		o1.printPackagePrivateText();
	}
}