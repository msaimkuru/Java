package org.curlybrace.oopj.ocp1z0_829.ch06.mystudies.Study002_ThisAndSuperReferences;

/**
 * @author	Saim Kuru
 * @version 1.0
 * ------------
 * Objectives:
 * ------------ 
 * 1. Understanding this and super references.
 * ------------
 * Difficulty: Medium
 * ------------ 
 */

/* Terminal commands to run program
 * curlybrace@saim-MacBook-Pro src % javac org/curlybrace/oopj/ocp1z0_829/ch06/mystudies/Study002_ThisAndSuperReferences/A2ofA1.java
 * curlybrace@saim-MacBook-Pro src % java org.curlybrace.oopj.ocp1z0_829.ch06.mystudies.Study002_ThisAndSuperReferences.A2ofA1      
 */

public class A2ofA1 extends A1{
	public int i2 = 5678; // hiding variable i2 of the parent.
	
	public int getI1() {
		//public and instance variable i1 is inherited from A1
		
		/* Java checks if there is a local variable or parameter named i1,
		 * if there is not it then checks this.i1; and since it exists it uses this.i1
		 */		
		System.out.println(" i1->" + i1);
		//
		System.out.println(" this.i1->" + this.i1);
		System.out.println("super.i1->" + super.i1);
		System.out.println("-----");
		return this.i1;
	}
	
	public int getI2() {
		//public and instance variable i2 is not inherited from A1 because A2 hides it
		
		/* Java checks if there is a local variable or parameter named i2,
		 * if there is not it then checks this.i2; and since it exists it uses this.i2
		 */
		System.out.println(" i2->" + i2);
		//
		System.out.println(" this.i2->" + this.i2);
		System.out.println("super.i2->" + super.i2);
		System.out.println("-----");
		return this.i2;
	}	
	
	public int getSI1() {
		//package-private and static variable si1 is inherited from A1
		
		/* Java checks if there is a local variable or parameter named si1,
		 * if there is not it then checks A2ofA1.si1; and since it exists it uses A2ofA1.si1
		 */			
		System.out.println(" si1->" + si1);
		//
		System.out.println(" this.si1->" + this.si1);
		System.out.println("super.si1->" + super.si1);
		System.out.println("-----");
		return this.si1;
	}
	
	public void setI1(int n) {
		/* 
		 * as i1 is inherited and not hidden setting this.i1
		 * also affects super.i1
		 */
		this.i1 = n;	
	}
	
	public void setI2(int n) {
		/* 
		 * as i2 is hidden setting this.i2
		 * will not affect super.i2
		 */
		this.i2 = n;	
	}	

	public void setSI1(int n) {
		/* 
		 * as sI1 is inherited and not hidden setting A2ofA1.si1
		 * also affects A1.si1 
		 */
		A2ofA1.si1 = n;
	}		
	public static void main(String[] args) {

		A2ofA1 o1 = new A2ofA1();
		
		o1.getI1();
		o1.getI2();	
		o1.getSI1();
		//
		o1.setI1(999);
		o1.setI2(999);
		o1.setSI1(999);
		//
		o1.getI1();
		o1.getI2();	
		o1.getSI1();
	}
}