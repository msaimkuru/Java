package org.curlybrace.oopj.ocp1z0_829.ch03.mystudies;

/* Terminal commands to run program
 * curlybrace@saim-MacBook-Pro src % javac org/curlybrace/oopj/ocp1z0_829/ch03/mystudies/Study011_NestedLoopSample1.java
 * curlybrace@saim-MacBook-Pro src % java org.curlybrace.oopj.ocp1z0_829.ch03.mystudies.Study011_NestedLoopSample1      
 */

public class Study011_NestedLoopSample1 {

	public static void main(String[] args) {
		int[][] arr = {{5, 2, 1, 3}, {3, 9, 8, 9}, {5, 7, 12, 7}};

		for(int[] subarr : arr) {
			for(int i = 0; i < subarr.length; i++) {
				System.out.print(subarr[i] + "\t");
			}
			System.out.println();
		}
	}
}