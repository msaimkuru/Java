package org.curlybrace.oopj.ocp1z0_829.ch01.mystudies;
import java.lang.*; // A redundant import, because java.lang package is automatically imported.
import java.util.*;
import java.sql.*;

/**
 * @author	Saim Kuru
 * @version 1.0
 * ------------
 * Objectives:
 * ------------ 
 * 1. Understanding importing packages in Java
 * ------------
 * Difficulty: Easy
 * ------------ 
 */

/* 
 * Terminal commands to run program
 * curlybrace@saim-MacBook-Pro src % javac org/curlybrace/oopj/ocp1z0_829/ch01/mystudies/Study002_ImportingPackagesInJava.java
 * curlybrace@saim-MacBook-Pro src % java org.curlybrace.oopj.ocp1z0_829.ch01.mystudies.Study002_ImportingPackagesInJava      
 */
public class Study002_ImportingPackagesInJava {

	public static void main(String[] args) {
		//Date d1; //COMPILER ERROR: The Type Date is ambigious
		//Date d2; //COMPILER ERROR: The Type Date is ambigious
		java.util.Date d3;
		java.sql.Date d4;
		//
		System.out.println("Hello, everything is fine!");
	}
}