package org.curlybrace.oopj.ocp1z0_829.ch04.mystudies;

import java.util.Arrays;

/* Terminal commands to run program
 * curlybrace@saim-MacBook-Pro src % javac org/curlybrace/oopj/ocp1z0_829/ch04/mystudies/Study009_ArraysClassSortMethod.java
 * curlybrace@saim-MacBook-Pro src % java org.curlybrace.oopj.ocp1z0_829.ch04.mystudies.Study009_ArraysClassSortMethod      
 */

public class Study009_ArraysClassSortMethod {

	public static void main(String[] args) {
		int[] intArr = {4, 5, -1, -3, 10};
		String[] strArr = {"a","A","ba","0","1"};
		//
		System.out.println("---------- Contents of int Array intArr sorted ----------");
		Arrays.sort(intArr);
		System.out.println(Arrays.toString(intArr));
		for(int i:intArr) {
			System.out.print(i + ", ");
		}
		
		System.out.println();
		
		System.out.println("---------- Contents of String Array strArr sorted ----------");
		Arrays.sort(strArr);
		System.out.println(Arrays.toString(strArr));
		for(String s:strArr) {
			System.out.print(s+ ", ");
		}		
	}

}
