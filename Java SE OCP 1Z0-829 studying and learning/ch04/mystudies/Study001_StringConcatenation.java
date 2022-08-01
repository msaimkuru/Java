package org.curlybrace.oopj.ocp1z0_829.ch04.mystudies;

/* Terminal commands to run program
 * curlybrace@saim-MacBook-Pro src % javac org/curlybrace/oopj/ocp1z0_829/ch04/mystudies/Study001_StringConcatenation.java
 * curlybrace@saim-MacBook-Pro src % java org.curlybrace.oopj.ocp1z0_829.ch04.mystudies.Study001_StringConcatenation      
 */

public class Study001_StringConcatenation {

	public static void main(String[] args) {
		System.out.println("""
		-----------------------------------------------------------------------------------------------
		+ OPERATOR RULES:
		-----------------------------------------------------------------------------------------------
		1) + operator means a numeric addition if both operands are numeric
		2) + operator works as a concatenation operator if at least one of its operands is type of String.
		3) + operator is evaluated left to right
		-----------------------------------------------------------------------------------------------	
		""");
		
		String s = "abc";
		System.out.println(String.format("s=\"%s\"", s));
		
		System.out.println(String.format("s + 1 + 2 = \"%s\"", s + 1 + 2));	// Prints ->s + 1 + 2 = "abc12"

		
		System.out.println(String.format("1 + 2 + s = \"%s\"", 1 + 2 + s ));	// Prints ->1 + 2 + s = "3abc"
		
		System.out.println(String.format("s + null = \"%s\"", s + null));	// Prints ->s + null = "abcnull"
		
		//
		
		s += "89";
		
		System.out.println(s);	// Prints ->abc89
		
		//System.out.println(null);	// DOES NOT COMPILE ->The method println(char[]) is ambiguous for the type PrintStream
	}
}