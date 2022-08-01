package org.curlybrace.oopj.ocp1z0_829.ch01.mystudies;

/**
 * @author	Saim Kuru
 * @version 1.0
 * ------------
 * Objectives:
 * ------------ 
 * 1. Understanding the general logic of order of initialization
 * ------------
 * Difficulty: Easy
 * ------------ 
 */

/* 
 * Terminal commands to run program
 * curlybrace@saim-MacBook-Pro src % javac org/curlybrace/oopj/ocp1z0_829/ch01/mystudies/Study003_OrderOfInitialization.java
 * curlybrace@saim-MacBook-Pro src % java org.curlybrace.oopj.ocp1z0_829.ch01.mystudies.Study003_OrderOfInitialization      
 */

public class Study003_OrderOfInitialization {
	int order = 1;
	String state = "Initialization at Declaration";
	
	{
		// this instance initializer block is for printing the order of declaration.
		System.out.println("Initialization Order : " + order + "-->" + state);
		order++;
	}
	
	public Study003_OrderOfInitialization(){
		state = "Initialization at Constructor";
		System.out.println("Initialization Order : " + order + "-->" +state);
		order++;
	}
	
	{
		state = "Initialization at Instance Initializer";
		System.out.println("Initialization Order : " + order + "-->" +state);
		order++;
	}
	
	public static void main(String[] args) {
		/*
		 * Prints;
			Initialization Order : 1-->Initialization at Declaration
			Initialization Order : 2-->Initialization at Instance Initializer
			Initialization Order : 3-->Initialization at Constructor
		 */
		Study003_OrderOfInitialization s1 = new Study003_OrderOfInitialization();
	}
}