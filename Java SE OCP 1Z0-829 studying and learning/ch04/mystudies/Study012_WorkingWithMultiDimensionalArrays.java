package org.curlybrace.oopj.ocp1z0_829.ch04.mystudies;

/* Terminal commands to run program
 * curlybrace@saim-MacBook-Pro src % javac org/curlybrace/oopj/ocp1z0_829/ch04/mystudies/Study012_WorkingWithMultiDimensionalArrays.java
 * curlybrace@saim-MacBook-Pro src % java org.curlybrace.oopj.ocp1z0_829.ch04.mystudies.Study012_WorkingWithMultiDimensionalArrays      
 */

public class Study012_WorkingWithMultiDimensionalArrays {

	public static void main(String[] args) {
		int[][] arr1 = {{1},{1,1},{1,2,1},{1,3,3,1},{1,4,6,4,1},{1,5,10,10,5,1}};	// a 2D array
		int[] arr3 = {1,2}, arr2[] = arr1;											// first 1D array declaration, second a 2D array declaation 
	
		for(int i=0; i < arr2.length; i++) {
			for(int space = 0; space < arr2.length - i - 1; space++)
				System.out.print("\t");
			for(int j=0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + "\t\t");
			}
			System.out.println();
		}
		System.out.println("----------------------------------------------------------------------------------------------------");
		for(int[] arr : arr2) {
			for(int i : arr) {
				System.out.print(i + "\t");
			}
			System.out.println();
		}
	}
}