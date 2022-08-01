package org.curlybrace.oopj.ocp1z0_829.ch06.mystudies.Study007_AbstractClasses.Study007_02_MoreAboutAbstractClasses;

/* !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
 * There are 3 strange things to investigate in this abstract class study code. 
 * !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
 */

/* 
 * Terminal commands to run program
 * curlybrace@saim-MacBook-Pro src % 
 * javac org/curlybrace/oopj/ocp1z0_829/ch06/mystudies/Study007_AbstractClasses/Study007_02_MoreAboutAbstractClasses/*.java
 * curlybrace@saim-MacBook-Pro src % 
 * java org.curlybrace.oopj.ocp1z0_829.ch06.mystudies.Study007_AbstractClasses.Study007_02_MoreAboutAbstractClasses.AVeryInterestingOverridingFact0
 */

abstract class AbstractParentOfAVeryInterestingOverridingFact{
	static {
		System.out.println("""
		------------------------------------------------------------------------------------------
		A VERY INTERESTING OVERRIDING FACT:
		------------------------------------------------------------------------------------------
		abstract instance method saySomething() is implemented/overridden in the child class
		instance method getX() is overridden in the child class 
		instance method getY() is not overridden but is inherited by the child class 
		------------------------------------------------------------------------------------------		
		Although saySomething() is an abstract method in class 
		AbstractParentOfAVeryInterestingOverridingFact, in 
		AbstractParentOfAVeryInterestingOverridingFact() constructor we can call saySomething() 
		method. But how can it be possible to call a method which has an implementation only in a 
		child class from a parent class constructor?
		
		The answer comes in with polymorphism and overriding. Actually, when we call instance 
		saySomething() method in parent class constructor we implicitly call this.saySomething() 
		method. And, as that is the child object being instantiated, with "this" reference we 
		actually refer to whatever, through an object of child class. So, as a result of 
		overriding methods, the child object's method runs.
		
		And it's the same for non-abstract methods too.
		------------------------------------------------------------------------------------------		
		""");
	}
	
	abstract CharSequence saySomething();
	
	public String getX() {
		return "getX()-of-Parent, " + this.saySomething();
	}

	public String getY() {
		return "getY()-of-Parent, " + this.saySomething();
	}
	
	public AbstractParentOfAVeryInterestingOverridingFact() {
		System.out.println("1) " + this.saySomething());	// Strange-1) Does this line compile? Answer:Yes
		System.out.println("2) " + this.getX());				// Strange-2) This line runs the overridden getX() method in the child class.
		System.out.println("3) " + this.getY());				// Strange-3) This line runs the inherited parent class getY() method.
	}
}

public class AVeryInterestingOverridingFact0 extends AbstractParentOfAVeryInterestingOverridingFact{
	@Override
	String saySomething() { return "yummy!";}
	
	@Override
	public String getX() {
		return "getX()-of-Child";
	}
	
	public static void main(String[] args) {
		/* 
		 * ----------------------------
		 * Prints:
		 * ----------------------------
		 * 1) yummy!
         * 2) getX()-of-Child
         * 3) getY()-of-Parent, yummy!
         * ----------------------------
		 */
		new AVeryInterestingOverridingFact0();
	}
}