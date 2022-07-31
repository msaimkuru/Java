package org.curlybrace.oopj.ocp1z0_829.ch01.mystudies;

/**
 * @author	Saim Kuru
 * @version 1.0
 * ------------
 * Objectives:
 * ------------ 
 * 1. Understanding the String Text Block
 * ------------
 * Difficulty: Medium
 * ------------ 
 */


/* 
 * Terminal commands to run program
 * curlybrace@saim-MacBook-Pro src % javac org/curlybrace/oopj/ocp1z0_829/ch01/mystudies/Study007_TextBlock.java
 * curlybrace@saim-MacBook-Pro src % java org.curlybrace.oopj.ocp1z0_829.ch01.mystudies.Study007_TextBlock      
 */

public class Study007_TextBlock {
	static String st1 = "Saim Kuru\n\s\s\s\sBest Wishes";
	//
	//String text blocks
	static String tb1 = """
                        Saim Kuru
                            Best Wishes""";
	static String tb2 = """
            Saim Kuru\
                Best Wishes""";
	
	static String tb3 = """
            Saim Kuru   """;	
	
	//
	static String tb4 = """
            Saim Kuru   \s""";		
	//
	public static void main(String[] args) {
		System.out.println("""
						   String st1:
						   --------------------""");
		System.out.println(st1);
		//
		System.out.println("""
				           --------------------
				           Text Block 1 (tb1):
				           --------------------""");		
		System.out.println(tb1);
		//
		System.out.println("""
				           --------------------
				           Text Block 2 (tb2):
				           --------------------""");				
		System.out.println(tb2);
		System.out.println("--------------------");
		//
		System.out.println("tb3:" + tb3 + ", length(tb3):" + tb3.length());
		//
		System.out.println("tb4:" + tb4 + ", length(tb4):" + tb4.length());		
	}
}