package org.curlybrace.oopj.ocp1z0_829.ch06.mystudies.Study005_InheritingMembers.Study005_02_HidingStaticMethods;

/* 
 * Terminal commands to run program
 * curlybrace@saim-MacBook-Pro src % 
 * javac org/curlybrace/oopj/ocp1z0_829/ch06/mystudies/Study005_InheritingMembers/Study005_02_HidingStaticMethods/DemoHidingMethod.java
 * curlybrace@saim-MacBook-Pro src % 
 * java org.curlybrace.oopj.ocp1z0_829.ch06.mystudies.Study005_InheritingMembers.Study005_02_HidingStaticMethods.DemoHidingMethod
 */

class D0{
	/* 
	 * this method will be inherited or hidden by child classes.
	 * as it is static, it cannot be overridden.
	 */
	public static void printName() {
		System.out.println("I am static method printName() of class D0");
	}
}
public class DemoHidingMethod extends D0 {
	/*
	 * this method hides the method in the parent class.
	 */
	public static void printName() {
		System.out.println("I am static method printName() of class DemoHidingMethod");
	}
	
	public static void main(String[] args) {
		D0 o1 = new D0();
		D0 o2 = new DemoHidingMethod();
		//
		o1.printName();	//	Prints-->"I am static method printName() of class D0"
		o2.printName();	//	Prints-->"I am static method printName() of class D0"
		//
		// now child class's hiding method prints..
		DemoHidingMethod d1 = (DemoHidingMethod)o2;
		d1.printName();	//	Prints-->"I am static method printName() of class DemoHidingMethod"
	}
}