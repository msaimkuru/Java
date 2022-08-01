package org.curlybrace.oopj.ocp1z0_829.ch04.mystudies;

import java.util.Arrays;

/* Terminal commands to run program
 * curlybrace@saim-MacBook-Pro src % javac org/curlybrace/oopj/ocp1z0_829/ch04/mystudies/Study010_ArrayClassBinarySearchMethod.java
 * curlybrace@saim-MacBook-Pro src % java org.curlybrace.oopj.ocp1z0_829.ch04.mystudies.Study010_ArrayClassBinarySearchMethod      
 */

public class Study010_ArrayClassBinarySearchMethod {

	public static void main(String[] args) {
		System.out.println("""
		--------------------------------------------------------------------------------
		Arrays.binarySearch() method
		--------------------------------------------------------------------------------
		* Array should be sorted before making any search
		* If array is not sorted the result is undefined
		* If array is sorted and target element is found in the array the result is 
		index of match
		* If array is sorted and target element is not found in the array the result is 
		negative value showing one smaller than the negative of the index, where a match
		needs to be inserted to preserve sorted order.	
		--------------------------------------------------------------------------------	
		""");
		System.out.println("----------Searching within a sorted array is OK----------");
		int[] numbers = {2, 4, 6, 8};
		System.out.println("int[] numbers ->" + Arrays.toString(numbers));
		System.out.println();
		System.out.println("Search for 2 Gives index->" + Arrays.binarySearch(numbers, 2));	// Prints ->0
		System.out.println("Search for 4 Gives index->" + Arrays.binarySearch(numbers, 4));	// Prints ->1
		System.out.println("Search for 1 Gives index->" + Arrays.binarySearch(numbers, 1));	// Prints ->-1
		System.out.println("Search for 3 Gives index->" + Arrays.binarySearch(numbers, 3));	// Prints ->-2
		System.out.println("Search for 9 Gives index->" + Arrays.binarySearch(numbers, 9));	// Prints ->-5
		System.out.println("----------------------------------------");
		System.out.println("----------Searching within a sorted array is U N D E F I N E D----------");
		int[] unsortedNumbers = {20, 4, 60, 8};
		System.out.println("int[] unsortedNumbers ->" + Arrays.toString(unsortedNumbers));
		System.out.println();
		System.out.println("Search for 20 Gives index->" + Arrays.binarySearch(unsortedNumbers, 20));	// Prints ->-3
		System.out.println("Search for 40 Gives index->" + Arrays.binarySearch(unsortedNumbers, 40));	// Prints ->-3
		System.out.println("Search for 1 Gives index->" + Arrays.binarySearch(unsortedNumbers, 1));	// Prints ->-1
		System.out.println("Search for 4 Gives index->" + Arrays.binarySearch(unsortedNumbers, 3));	// Prints ->-1
		System.out.println("Search for 9 Gives index->" + Arrays.binarySearch(unsortedNumbers, 9));	// Prints ->-3			
	}
}
