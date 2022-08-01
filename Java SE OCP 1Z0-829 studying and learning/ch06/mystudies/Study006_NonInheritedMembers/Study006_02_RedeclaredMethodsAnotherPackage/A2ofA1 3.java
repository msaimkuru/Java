package org.curlybrace.oopj.ocp1z0_829.ch06.mystudies.Study006_NonInheritedMembers.Study006_02_RedeclaredMethodsAnotherPackage;

import org.curlybrace.oopj.ocp1z0_829.ch06.mystudies.Study006_NonInheritedMembers.Study006_01_RedeclaredMethods.A1;

/* 
 * Terminal commands to run program
 * curlybrace@saim-MacBook-Pro src % 
 * javac org/curlybrace/oopj/ocp1z0_829/ch06/mystudies/Study006_NonInheritedMembers/Study006_02_RedeclaredMethodsAnotherPackage/A2ofA1.java
 * curlybrace@saim-MacBook-Pro src % 
 * java org.curlybrace.oopj.ocp1z0_829.ch06.mystudies.Study006_NonInheritedMembers.Study006_02_RedeclaredMethodsAnotherPackage.A2ofA1
 */

public class A2ofA1 extends A1{
	static{
		System.out.println("""
	    --------------------------------------------------------------------------------
	    Example Info (at class A2ofA1):
	    --------------------------------------------------------------------------------
	    A1 class inherits the packageprivateRedeclaredMethod() method from A0, as they 
	    are in the same package.
	    
	    This class (A2ofA1) extends class A1.
	    
	    As packageprivateRedeclaredMethod() method in parent class A1 is package-private 
	    and this class is in different package than A1, class A2ofA1 doesn't inherit
	    packageprivateRedeclaredMethod() method of A1.
	    
	    So, packageprivateRedeclaredMethod() method in this class is neither an 
	    overriding nor a hiding version of the packageprivateRedeclaredMethod() method 
	    of the parent class. It is simply a new redeclared method for this class. That
	    is why we could define it with an incompatible return type.
	    --------------------------------------------------------------------------------
        """		
		);		
	}
	
	int packageprivateRedeclaredMethod() {
		System.out.println(super.nonRedeclarableMethod());	// Prints -->"Writing from ClassA0.nonRedeclarableMethod()"
		return -1;
	}	
	
	public static void main(String[] args) {
		var o1 = new A2ofA1();
		System.out.println(o1.packageprivateRedeclaredMethod());
	}
}