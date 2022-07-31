package org.curlybrace.oopj.ocp1z0_829.ch06.mystudies.Study000_Inheritance.Study000_03_InheritanceRules.animals;

/**
 * @author	Saim Kuru
 * @version 1.0
 * ------------
 * Objectives:
 * ------------ 
 * 1. Understanding the rules of Inheritance
 * ------------
 * Difficulty: Easy
 * ------------ 
 */

/* Terminal commands to run program
 * curlybrace@saim-MacBook-Pro src % 
 * javac org/curlybrace/oopj/ocp1z0_829/ch06/mystudies/Study000_Inheritance/Study000_03_InheritanceRules/animals/*.java
 * curlybrace@saim-MacBook-Pro src % 
 * java org.curlybrace.oopj.ocp1z0_829.ch06.mystudies.Study000_Inheritance/Study000_03_InheritanceRules/animals/Lion     
 */

public class Lion extends Animal{
	protected void setProperties(int age, String n) {
		setAge(age);	// method setAge() is inherited from the parent class
		name = n;		// name is inherited from the parent class
	}
	
	public void roar() {
		System.out.println(name + ", age " + getAge() + ", says: Roar!"); //method getAge() is inherited from the parent class
		System.out.println(super.name + ", age " + super.getAge() + ", says: Roar!");
		System.out.println(this.name + ", age " + this.getAge() + ", says: Roar!"); 
	}
	
	public static void main(String[] args) {
		var lion = new Lion();
		lion.setProperties(3, "kion");
		lion.roar();
	}
}