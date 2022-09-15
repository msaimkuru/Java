package org.curlybrace.oopj.ocp1z0_829.ch03.mystudies;

/**
* @author	Saim Kuru
* @version 1.0
* ------------
* Objectives:
* ------------ 
* 1. Understanding LABELS
* ------------ 
* Difficulty: Easy
* ------------
* NOTES
* ------------
* 1) Code blocks, if statements, switch statements, and loops can all have 
* optional labels.
* 
* 2) A label is an optional pointer to the head of a statement that allows the
* application flow to jump to it or break from it.
* 
* 3) A label is a single identifier that is followed by a colon (:)
* 
* 4) Labels follow the same rules for formatting as identifiers.
* 
* 5) For readability, they are commonly expressed using uppercase letters in
* snake_case with underscores between words.
* 
* 6) When dealing with only one loop, labels do not add any value, but they are 
* extremely useful in nested loops.
* ------------
*/

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
					LABEL_FOR_IF:
					if(arr[i][j] == searchValue) {
						positionI = i;
						positionJ = j;
						//
						if (findFirstOrLast.equals("First"))
							break OUTER_LOOP;
						else if (findFirstOrLast.equals("FirstOfLastRowIncludingElement"))
							break INNER_LOOP;
						else if (findFirstOrLast.equals("Last")) {
							// DO NOTHING JUST MAKE THE CODE GO ON
							continue INNER_LOOP;
						}
					}						
			}
			
		}
		//
		if(positionI == -1 || positionJ == -1)
			System.out.println("Value " + searchValue + " Not Found!");
		else
			switch(findFirstOrLast) {
				case "First" -> System.out.println(searchValue + " is found at first at index:" + positionI + "," + positionJ);
				case "FirstOfLastRowIncludingElement" -> System.out.println(searchValue + " is found at first in last row including at index:" + positionI + "," + positionJ);
				case "Last" -> System.out.println(searchValue + " is found at last at index:" + positionI + "," + positionJ);
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
		
		//Search for values in the array
		findValueInA2DimArray(arr, 3, "First");
		findValueInA2DimArray(arr, 3, "FirstOfLastRowIncludingElement");
		findValueInA2DimArray(arr, 3, "Last");
		
		findValueInA2DimArray(arr, 23, "First");
		findValueInA2DimArray(arr, 23, "FirstOfLastRowIncludingElement");
		findValueInA2DimArray(arr, 23, "Last");
	}
}