package org.curlybrace.oopj.ocp1z0_829.ch06.mystudies.Study007_AbstractClasses.Study007_02_MoreAboutAbstractClasses;

/* 
 * Terminal commands to run program
 * curlybrace@saim-MacBook-Pro src % 
 * javac org/curlybrace/oopj/ocp1z0_829/ch06/mystudies/Study007_AbstractClasses/Study007_02_MoreAboutAbstractClasses/*.java
 * curlybrace@saim-MacBook-Pro src % 
 * java org.curlybrace.oopj.ocp1z0_829.ch06.mystudies.Study007_AbstractClasses.Study007_02_MoreAboutAbstractClasses.AVeryInterestingOverridingFact1
 */

class ParentOfAVeryInterestingOverridingFact1{
	public String getX() {
		return "getX()-of-Parent";
	}

	private String getY() {
		return this.getX() + ", getY()-of-Parent";
	}
	
	public ParentOfAVeryInterestingOverridingFact1() {
		System.out.print("1) " + this.getX() + " ");	// This line runs the overriding child class getX() method when a child class is instantiated.
		System.out.println("2) " + this.getY());// This line runs the inherited parent class getY() method when a child class is instantiated. 		
	}
}

public class AVeryInterestingOverridingFact1 extends ParentOfAVeryInterestingOverridingFact1{	
	@Override
	public String getX() {
		return "getX()-of-Child";
	}
	
	public static void main(String[] args) {
		// prints : 1) getX()-of-Child 2) getX()-of-Child, getY()-of-Parent
		AVeryInterestingOverridingFact1 child = new AVeryInterestingOverridingFact1();			

		// prints : 1) getX()-of-Parent 2) getX()-of-Parent, getY()-of-Parent
		ParentOfAVeryInterestingOverridingFact1 parent = new ParentOfAVeryInterestingOverridingFact1();	
		//
		ParentOfAVeryInterestingOverridingFact1 parent2 = child;
		//
		/* DOES NOT COMPILE
		 * parent2.getY();
		 */
	}
}