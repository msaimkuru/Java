package org.curlybrace.oopj.ocp1z0_829.ch03.mystudies;

/**
* @author	Saim Kuru
* @version 1.0
* ------------
* Objectives:
* ------------ 
* 1. Understanding Standard and Enhanced For Loops
* ------------ 
* Difficulty: Easy
* ------------
* NOTES
* ------------
* The for-each loop (enhanced for loop) is a specialized structure
* designed to iterate over arrays and various Collections Framework 
* classes.
* 
* Syntax:
*   for(datatype instance : collection){
*       //Body
*   }
* 
* The right side of the enhanced for loop must be one of the following:
* 1) A built-in Java array
* 2) An object whose type implemments java.lang.Iterable 
* such as List, Set (Map is not supported)
* ------------
*/

/* Terminal commands to run program
 * curlybrace@saim-MacBook-Pro src % javac org/curlybrace/oopj/ocp1z0_829/ch03/mystudies/Study010_StandardAndEnhancedForLoop.java
 * curlybrace@saim-MacBook-Pro src % java org.curlybrace.oopj.ocp1z0_829.ch03.mystudies.Study010_StandardAndEnhancedForLoop      
 */

public class Study010_StandardAndEnhancedForLoop {
	public static void printNamesByStandardForLoop(String[] names) {
		for(int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
	}
	
	public static void printNamesByEnhancedForLoop(String[] names) {
		for(String s : names) {
			System.out.println(s);
		}
	}
	
	public static void main(String[] args) {
		String[] s = {"Elçin","Saim","Djidji Yaramazo"};
		printNamesByStandardForLoop(s);
		System.out.println("--------------------------------------------------------------------------------");
		printNamesByEnhancedForLoop(s);
		System.out.println("--------------------------------------------------------------------------------");
	}
}