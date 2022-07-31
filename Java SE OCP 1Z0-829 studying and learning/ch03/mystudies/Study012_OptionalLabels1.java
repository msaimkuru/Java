package org.curlybrace.oopj.ocp1z0_829.ch03.mystudies;

/* Terminal commands to run program
 * curlybrace@saim-MacBook-Pro src % javac org/curlybrace/oopj/ocp1z0_829/ch03/mystudies/Study012_OptionalLabels1.java
 * curlybrace@saim-MacBook-Pro src % java org.curlybrace.oopj.ocp1z0_829.ch03.mystudies.Study012_OptionalLabels1      
 */

public class Study012_OptionalLabels1 {

	public static void findValueInA2DimArray(int[][] arr, int searchValue, String findFirstOrLast) {
		int i = 0, j = 0;
		int positionI = -1, positionJ = -1;

		// search for the first or last i,j index where searchValue resides.
		OUTER_LOOP:
			for(i = 0; i < arr.length; i++) {
			INNER_LOOP:
				for(j = 0; j < arr[i].length; j++) {
					if(arr[i][j] == searchValue) {
						positionI = i;
						positionJ = j;
						//
						if (findFirstOrLast.equals("First"))
							break OUTER_LOOP;
						else if (findFirstOrLast.equals("FirstOfLastRow"))
							break INNER_LOOP;
					}						
			}
			
		}
		//
		if(positionI == -1 || positionJ == -1)
			System.out.println("Value " + searchValue + " Not Found!");
		else
			switch(findFirstOrLast) {
				case "First": System.out.println(searchValue + " is found at first at index:" + positionI + "," + positionJ);break;
				case "FirstOfLastRow": System.out.println(searchValue + " is found at first in last row at index:" + positionI + "," + positionJ);break;
				case "Last": System.out.println(searchValue + " is found at last at index:" + positionI + "," + positionJ);break;
			}
		;
					
		System.out.println("Now loop indexes i,j are: " + i + "," + j);
		System.out.println("----------------------------------------");		
	}
	
	public static void main(String[] args) {
		int[][] arr = {{5, 2, 1, 3}, {3, 9, 8, 9}, {5, 3, 12, 3}};
		
		//Print array
		System.out.println("*" + "\t" + "*" + "\t" + "*" + "\t" + "*");
		for(int[] subarr : arr) {
			for(int num : subarr) {
				System.out.print(num + "\t");
			}
			System.out.println();
		}	
		System.out.println("*" + "\t" + "*" + "\t" + "*" + "\t" + "*");
		System.out.println("----------------------------------------");	
		//
		//Search for values in the array
		findValueInA2DimArray(arr, 3, "First");
		findValueInA2DimArray(arr, 3, "FirstOfLastRow");
		findValueInA2DimArray(arr, 3, "Last");
		
		findValueInA2DimArray(arr, 23, "First");
		findValueInA2DimArray(arr, 23, "FirstOfLastRow");
		findValueInA2DimArray(arr, 23, "Last");
	}
}