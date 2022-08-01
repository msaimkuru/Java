package org.curlybrace.oopj.ocp1z0_829.ch03.mystudies;


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