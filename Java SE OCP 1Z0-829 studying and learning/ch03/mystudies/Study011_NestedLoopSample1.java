package org.curlybrace.oopj.ocp1z0_829.ch03.mystudies;

/**
* @author	Saim Kuru
* @version 1.0
* ------------
* Objectives:
* ------------ 
* 1. Understanding Nested Loops
* ------------ 
* Difficulty: Easy
* ------------
* NOTES
* ------------
*/

/* Terminal commands to run program
 * curlybrace@saim-MacBook-Pro src % javac org/curlybrace/oopj/ocp1z0_829/ch03/mystudies/Study011_NestedLoopSample1.java
 * curlybrace@saim-MacBook-Pro src % java org.curlybrace.oopj.ocp1z0_829.ch03.mystudies.Study011_NestedLoopSample1      
 */

public class Study011_NestedLoopSample1 {
	static {
		System.out.println("""
		--------------------------------------------------------------------------------
		N e s t e d   L o o p s
		--------------------------------------------------------------------------------
		* A nested loop is a loop that contains another loop.
		--------------------------------------------------------------------------------		
		""");
	}
	
	public static void main(String[] args) {
		int[][] arr = {{5, 2, 1, 3}, {3, 9, 8, 9}, {5, 7, 12, 7}};
		
		// A nested loop example 1
		for(int[] subarr : arr) {
			for(int i = 0; i < subarr.length; i++) {
				System.out.print(subarr[i] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("--------------------------------------------------------------------------------");
		
		int k = 8;
		// A nested loop example 2
		while(k > 0) {
			do {
				k -= 2;
			}while(k > 5);
			k--;
			System.out.print(k + ", ");
		} // Prints --> 3, 0, 
	}
}