package org.curlybrace.oopj.ocp1z0_829.ch04.mystudies;

/* Terminal commands to run program
 * curlybrace@saim-MacBook-Pro src % javac org/curlybrace/oopj/ocp1z0_829/ch04/mystudies/Study005_EqualsMethodWorkDifferentInStringAndStringBuilder.java
 * curlybrace@saim-MacBook-Pro src % java org.curlybrace.oopj.ocp1z0_829.ch04.mystudies.Study005_EqualsMethodWorkDifferentInStringAndStringBuilder      
 */

public class Study005_EqualsMethodWorkDifferentInStringAndStringBuilder {

	public static void main(String[] args) {
		var one = new StringBuilder();
		var two = new StringBuilder();
		var three = one.append("a");
		
		System.out.println(one == two);		// Prints false. one and two are 2 different instances.
		System.out.println(one == three);	/* Prints true. After "one.append("a");" three has the 
											 * same reference of one because StringBuilder is not immutable.
											 */
		
		var x = "Hello World";
		var z = " Hello World    ".trim();
		var xsb = new StringBuilder(x);
		var zsb = new StringBuilder(x);
		
		System.out.println(x.equals(z));			/* Prints true. 
												 * equals() method of String returns true if two 
												 * Strings has exactly the same characters.
												 */
		
		System.out.println(xsb.equals(zsb));		/* Prints false.
												 * equals() method of StringBuilder checks whether 
												 * 2 references refer the same object or not.
												 */
		
		var s1 = "Hello";
		var sb1 = new StringBuilder("Hello");
		
		//System.out.println(s1 == sb1);		// DOES NOT COMPILE: Incompatible operand types String and StringBuilder
	}
}