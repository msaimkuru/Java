package org.curlybrace.oopj.ocp1z0_829.ch04.mystudies;

import java.util.Arrays;

/* Terminal commands to run program
 * curlybrace@saim-MacBook-Pro src % javac org/curlybrace/oopj/ocp1z0_829/ch04/mystudies/Study008_CreatingArrayOfReferences.java
 * curlybrace@saim-MacBook-Pro src % java org.curlybrace.oopj.ocp1z0_829.ch04.mystudies.Study008_CreatingArrayOfReferences      
 */

public class Study008_CreatingArrayOfReferences {

	public static void main(String[] args) {
		String[] bugs = {"cricket", "beetle", "ladybug"};
		String[] alias = bugs;
		
		System.out.println(bugs.equals(alias));	// Prints ->true
		System.out.println(bugs.toString());	/* Prints ->[Ljava.lang.String;@7ad041f3
												 *[L means it is an array
												 *[Ljava.lang.String means it is an array of strings
												 *7ad041f3 is the hashcode
												 */	
		//
		//
		String[] s1 = {"abc", "def"};
		Object[] o1 = s1;				// This line doesn't require a cast because a String is already an Object.
		String[] s2 = (String[]) o1;		// This line requires a cast because we are moving to a more specific type from Object to a String.
		//s2[0] = new StringBuilder();	// DOES NOT COMPILE : Type mismatch: cannot convert from StringBuilder to String
		try{
			o1[0] = new StringBuilder();
		}
		catch(Exception e) {
			e.printStackTrace();
		}	// RUNTIME EXCEPTION : java.lang.ArrayStoreException: java.lang.StringBuilder
		//
		// To print arrays without loops
		System.out.println(Arrays.toString(bugs));	// Prints ->[cricket, beetle, ladybug]
	}
}