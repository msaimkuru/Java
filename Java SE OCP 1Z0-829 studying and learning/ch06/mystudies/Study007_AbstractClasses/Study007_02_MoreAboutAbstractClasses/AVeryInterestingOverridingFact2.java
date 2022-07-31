package org.curlybrace.oopj.ocp1z0_829.ch06.mystudies.Study007_AbstractClasses.Study007_02_MoreAboutAbstractClasses;

/* 
 * Terminal commands to run program
 * curlybrace@saim-MacBook-Pro src % 
 * javac org/curlybrace/oopj/ocp1z0_829/ch06/mystudies/Study007_AbstractClasses/Study007_02_MoreAboutAbstractClasses/*.java
 * curlybrace@saim-MacBook-Pro src % 
 * java org.curlybrace.oopj.ocp1z0_829.ch06.mystudies.Study007_AbstractClasses.Study007_02_MoreAboutAbstractClasses.AVeryInterestingOverridingFact2
 */

class ParentOfAVeryInterestingOverridingFact2{
	static {
		System.out.println("""
		------------------------------------------------------------------------------------------
		A VERY INTERESTING OVERRIDING FACT:
		------------------------------------------------------------------------------------------
		instance method getX() is overridden in the child class 
		instance method getY() is inherited by the child class 
		------------------------------------------------------------------------------------------
		1- When An Object of A Child Class is Instantiated
		------------------------------------------------------------------------------------------			
		When we call instance getX() method in parent class constructor we implicitly call 
		this.getX() method. And, when that is the child object being instantiated, with "this" 
		reference we actually refer to whatever, through an object of child class. So, as a result 
		of overriding methods the child object's getX() method runs and prints getX()-of-Child.
		
		When we call instance getY() method in parent class constructor we implicitly call 
		this.getY() method. And, when that is the child object being instantiated, with "this" 
		reference we actually refer to whatever, through an object of child class. But, as getY() 
		is not overridden in child class but it is inherited, a result of inheriting methods the 
		inherited getY() method runs and prints getY()-of-Parent	.
		------------------------------------------------------------------------------------------
		2- When An Object of a Parent Class is Instantiated
		------------------------------------------------------------------------------------------		
		When we call instance getX() method in parent class constructor we implicitly call 
		this.getX() method. And, when that is the parent object being instantiated, with "this" 
		reference we actually refer to whatever, through an object of parent class itself. So, the 
		parent object's getX() method runs and prints getX()-of-Parent.
		
		When we call instance getY() method in parent class constructor we implicitly call 
		this.getY() method. And, when that is the parent object being instantiated, with "this" 
		reference we actually refer to whatever, through an object of parent class itself. So, the 
		parent object's getY() method runs and prints getY()-of-Parent.		
		------------------------------------------------------------------------------------------		
		""");
	}
	
	public String getX() {
		return "getX()-of-Parent";
	}

	public String getY() {
		return "getY()-of-Parent";
	}
	
	public static String getStaticX() {
		return "getStaticX()-of-Parent";
	}
	
	public String getStaticY() {
		return "getStaticY()-of-Parent";
	}
	
	public ParentOfAVeryInterestingOverridingFact2() {
		System.out.print(this.getX() + ", ");	// This line runs the overriding child class getX() method when a child class is instantiated.
		System.out.println(this.getY());		// This line runs the inherited parent class getY() method when a child class is instantiated. 
		
		System.out.print(this.getStaticX() + ", ");	// This line runs parent class getStaticX() method when a child class is instantiated.
		System.out.println(this.getStaticY());		// This line runs parent class getStaticY() method when a child class is instantiated.		
	}
}

public class AVeryInterestingOverridingFact2 extends ParentOfAVeryInterestingOverridingFact2{	
	@Override
	public String getX() {
		return "getX()-of-Child";
	}
	
	public static void main(String[] args) {
		new AVeryInterestingOverridingFact2();			// prints : getX()-of-Child, getY()-of-Parent, 
														//			getStaticX()-of-Parent, getStaticY()-of-Parent
		//
		new ParentOfAVeryInterestingOverridingFact2();	// prints : getX()-of-Parent, getY()-of-Parent
														//			getStaticX()-of-Parent, getStaticY()-of-Parent		
	}
}