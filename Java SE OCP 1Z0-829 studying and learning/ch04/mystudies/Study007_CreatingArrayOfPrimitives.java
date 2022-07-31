package org.curlybrace.oopj.ocp1z0_829.ch04.mystudies;

/* Terminal commands to run program
 * curlybrace@saim-MacBook-Pro src % javac org/curlybrace/oopj/ocp1z0_829/ch04/mystudies/Study007_CreatingArrayOfPrimitives.java
 * curlybrace@saim-MacBook-Pro src % java org.curlybrace.oopj.ocp1z0_829.ch04.mystudies.Study007_CreatingArrayOfPrimitives      
 */

public class Study007_CreatingArrayOfPrimitives {

	public static void main(String[] args) {
		System.out.println("""
		-----------------------------------------------------------------------------------------------
		A B O U T  Creating Array of Primitives
		-----------------------------------------------------------------------------------------------
		* Though local primitve variables need to be initialized before use elements of an array
		of primitives don't need to be initialized. They take default values like class/instance
		primitive variables..
		
		""");
		int[] numbers = new int[3];
		char[] chars = new char[3];
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i] + ", " + (int)chars[i]);	//Prints -> 0, 0
		}
		
		System.out.println("""
		-----------------------------------------------------------------------------------------------
		* When creating arrays we can initialize array elements.
		-----------------------------------------------------------------------------------------------	
		""");	
		int[] numbers2 = new int[] {10, 20, 30};
		int[] numbers3 = {11, 21, 31};
		System.out.println("----- elements of numbers2 -----");
		for(int i = 0; i < numbers2.length; i++) {
			System.out.println(numbers2[i]);
		}
		System.out.println("----- elements of numbers3 -----");
		for(int i = 0; i < numbers3.length; i++) {
			System.out.println(numbers3[i]);
		}		
		System.out.println("""
		-----------------------------------------------------------------------------------------------
		* We can create multiple arrays in a single declaration
		-----------------------------------------------------------------------------------------------	
		""");	
		int[] arr1 = new int[2], arr2 = new int[3];
		System.out.println("----- elements of arr1 -----");
		for(int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		System.out.println("----- elements of arr2 -----");
		for(int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}			
	}
}