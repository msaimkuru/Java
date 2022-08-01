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
	   ----------------
	   DOES NOT COMPILE
	   Violated Rule: Sbstract method declarations should end with a semicolon.
	   ----------------
	   error: ';' expected
       public abstract long eat()
                                 ^
       ----------------
	 */
	
	/* 	 	
	   public abstract void swim() {};
	   ----------------
	   DOES NOT COMPILE
	   Violated Rule:  Abstract methods cannot have a body
	   ----------------
       error: abstract methods cannot have a body
	   public abstract void swim() {};
	                        ^
       ----------------
	 */
	
	/* 
	   public abstract void sleep;
	   ----------------
	   DOES NOT COMPILE
	   Violated Rule: Method declaration should have () for parameter list.
	   ----------------
       error: '(' expected
	   public abstract void sleep;
	                             ^
       ----------------	 
	 */
	
	/* 	 
	   public void goInShell();
	   ----------------
	   DOES NOT COMPILE
	   Violated Rule: Concrete methods need to have an empty or full body. 
	   ----------------	   
	   error: missing method body, or declare abstract
	   public void goInShell();
	               ^
       ----------------	 	               
     */
}

/* 
   final abstract class InvalidDeclaration2{}
   ----------------
   DOES NOT COMPILE
   Violated Rule: Java does not permit a class or method to be marked both abstract and final.
   ----------------	   
   error: illegal combination of modifiers: abstract and final
   final abstract class InvalidDeclaration2{}
                  ^
   ----------------	    
*/

abstract class InvalidDeclaration3{
	/* 	
	   public abstract final void walk();
	   ----------------
	   DOES NOT COMPILE
	   Violated Rule: Java does not permit a class or method to be marked both abstract and final.
	   ----------------	   	   
	   error: illegal combination of modifiers: abstract and final
	   public abstract final void walk();
	                              ^
	   ----------------		                              
     */  
}

abstract class InvalidDeclaration4{
	/*
	   private abstract void sing();
	   ----------------
	   DOES NOT COMPILE
	   Violated Rule: A method cannot be marked as both abstract and private.
	   ----------------		   
	   error: illegal combination of modifiers: abstract and private
	   private abstract void sing();
	                         ^
	 */
}

abstract class InvalidDeclaration5{
	/*
	   public static abstract void swim();
	   ----------------
	   DOES NOT COMPILE
	   Violated Rule: Only instance methods can be marked abstract within a class, not variables, 
	   constructors, or static methods.
	   ----------------	   
	   error: illegal combination of modifiers: abstract and static
	   public static abstract void swim();
	                               ^
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
	   ----------------
	   DOES NOT COMPILE
	   Violated Rule: Abstract methods cannot be declared in concrete classes. 
	   ----------------	   
       error: SpottingInvalidDeclarations is not abstract and does not override abstract method abstractMethodInConcreteClassIsNotAllowed() in SpottingInvalidDeclarations
       public class SpottingInvalidDeclarations {
              ^
    */   
}