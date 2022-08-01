package org.curlybrace.oopj.ocp1z0_829.ch06.mystudies.Study007_AbstractClasses.Study007_01_IntroducingAbstractClasses;

/* 
 * Terminal commands to run program
 * curlybrace@saim-MacBook-Pro src % 
 * javac org/curlybrace/oopj/ocp1z0_829/ch06/mystudies/Study007_AbstractClasses/Study007_01_IntroducingAbstractClasses/SpottingInvalidDeclarations.java
 * curlybrace@saim-MacBook-Pro src % 
 * java org.curlybrace.oopj.ocp1z0_829.ch06.mystudies.Study007_AbstractClasses.Study007_01_IntroducingAbstractClasses.SpottingInvalidDeclarations
 */

abstract class InvalidDeclarations{
	/*
	   public abstract long eat()
	  
	   error: ';' expected
       public abstract long eat()
                                 ^
	   1 error
	 */
	
	/* Rule: abstract methods cannot have a body
	
	   public abstract void swim() {};

       error: abstract methods cannot have a body
	   public abstract void swim() {};
	                        ^
       1 error
	 */
	
	/* 
	   public abstract void sleep;
	 
       error: '(' expected
	   public abstract void sleep;
	                             ^
       1 error	 
	 */
	
	/* Rule: Concrete methods need to have an empty or full body. 
	 
	   public void goInShell();
	   
	   error: missing method body, or declare abstract
	   public void goInShell();
	               ^
       1 error
     */
}

/* 
   Rule: Java does not permit a class or method to be marked both abstract and final.
 
   final abstract class InvalidDeclaration2{}

   error: illegal combination of modifiers: abstract and final
   final abstract class InvalidDeclaration2{}
                  ^
   1 error
*/

abstract class InvalidDeclaration3{
	/*
	   Rule: Java does not permit a class or method to be marked both abstract and final.
	   	
	   public abstract final void walk();
	   
	   error: illegal combination of modifiers: abstract and final
	   public abstract final void walk();
	                              ^
       1 error
     */  
}

abstract class InvalidDeclaration4{
	/*
	   Rule: A method cannot be marked as both abstract and private.
	   
	   private abstract void sing();
	   
	   error: illegal combination of modifiers: abstract and private
	   private abstract void sing();
	                         ^
       1 error
	 */
}

abstract class InvalidDeclaration5{
	/*
	   Rule: Only instance methods can be marked abstract within a class, not variables, 
	   constructors, or static methods.
	   
	   public static abstract void swim();

	   error: illegal combination of modifiers: abstract and static
	   public static abstract void swim();
	                               ^
       1 error
     */
}

public class SpottingInvalidDeclarations {
	static {
		System.out.println("""
		--------------------------------------------------------------------------------
		Please find invalid declaration samples in the comments.	
		--------------------------------------------------------------------------------
	    """);
	}
	public static void main(String[] args) {

	}
	
	/*
	   public abstract void abstractMethodInConcreteClassIsNotAllowed();

       error: SpottingInvalidDeclarations is not abstract and does not override abstract method abstractMethodInConcreteClassIsNotAllowed() in SpottingInvalidDeclarations
       public class SpottingInvalidDeclarations {
              ^
       1 error
    */   
}