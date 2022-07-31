package org.curlybrace.oopj.ocp1z0_829.ch04.mystudies;

import java.util.Arrays;

/* Terminal commands to run program
 * curlybrace@saim-MacBook-Pro src % javac org/curlybrace/oopj/ocp1z0_829/ch04/mystudies/Study011_ArrayClassCompareAndMismatchMethods.java
 * curlybrace@saim-MacBook-Pro src % java org.curlybrace.oopj.ocp1z0_829.ch04.mystudies.Study011_ArrayClassCompareAndMismatchMethods      
 */

public class Study011_ArrayClassCompareAndMismatchMethods {

	public static void main(String[] args) {
		System.out.println("""
		-----------------------------------------------------------------------------------------------
		A B O U T  Arrays.compare() C O M P A R I N G 	R U L E S
		-----------------------------------------------------------------------------------------------
		* A negative number means the first array is "smaller" than the second.
		* A zero means the arrays are equal
		* A positive number means the first array is "larger" than the second.
		* If both arrays are the same length and have the same values in each spot in the same order, 
		returns zero.
		* If all the elements are the same but the second array has extra elements at the end, returns
		a negative number.
		* If all the elements are the same but the first array has extra elements at the end, returns
		a positive number.
		* If the first element that differs is "smaller" in the first array, returns a negative number.
		* If the first element that differs is "larger" in the first array, returns a positive number.
		
		* null is smaller than any other value
		* For strings, one is smaller if it is a prefix of the other.
		* For strings/characters, uppercase is maller than the lowercase	
		-----------------------------------------------------------------------------------------------
		""");		
		System.out.println(Arrays.compare(new int[] {1}, new int[] {2}));	// Prints ->-1
		System.out.println(Arrays.compare(new int[] {1}, new int[] {12}));	// Prints ->-1
		System.out.println(Arrays.compare(new int[] {1,2}, new int[] {1}));	// Prints ->1
		System.out.println(Arrays.compare(new int[] {0,2}, new int[] {1}));	// Prints ->-1
		System.out.println(Arrays.compare(new int[] {1,2}, new int[] {3,4}));	// Prints ->-1
		System.out.println(Arrays.compare(new int[] {1,2}, new int[] {1,2}));	// Prints ->0
		System.out.println(Arrays.compare(new String[] {"a"}, new String[] {"aa"}));	// Prints ->-1
		System.out.println(Arrays.compare(new String[] {"a"}, new String[] {"A"}));	// Prints ->32
		System.out.println(Arrays.compare(new String[] {"a"}, new String[] {null}));	// Prints ->1
		//
		//System.out.println(Arrays.compare(new String[] {"a"}, new int[]{1}));	// DOES NOT COMPILE : The method compare(int[], int[]) in the type Arrays is not applicable for the arguments (String[], int[])
	
		System.out.println("""
		-----------------------------------------------------------------------------------------------
		A B O U T  Arrays.mismatch() method
		-----------------------------------------------------------------------------------------------
		* If the arrays are equal, returns -1
		* Otherwise, returns the first index where they differ.
		-----------------------------------------------------------------------------------------------
		""");		
		System.out.println(Arrays.mismatch(new int[] {1}, new int[] {1}));	// Prints ->-1
		System.out.println(Arrays.mismatch(new int[] {1,2}, new int[] {1,2,3,4}));	// Prints ->2
		System.out.println(Arrays.mismatch(new int[] {1,2}, new int[] {1}));	// Prints ->1	
	}
}