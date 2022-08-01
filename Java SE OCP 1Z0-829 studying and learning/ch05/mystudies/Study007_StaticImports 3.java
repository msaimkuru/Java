package org.curlybrace.oopj.ocp1z0_829.ch05.mystudies;

import static java.util.Arrays.asList;
/* 
 * static import java.util.Arrays.asList;
 * DOES NOT COMPILE
 * should be import static
 */
import java.util.List;

/* Terminal commands to run program
 * curlybrace@saim-MacBook-Pro src % javac org/curlybrace/oopj/ocp1z0_829/ch05/mystudies/Study007_StaticImports.java
 * curlybrace@saim-MacBook-Pro src % java org.curlybrace.oopj.ocp1z0_829.ch05.mystudies.Study007_StaticImports      
 */

public class Study007_StaticImports {
	static {
		System.out.println("""
		--------------------------------------------------------------------------------
		S t a t i c    I m p o r t s
		--------------------------------------------------------------------------------
		* Regular imports are for importing classes, while static imports are for 
		importing static members of classes like variables and methods.
		* We can import a specific member or use a wild-card. 
		* If we create a method with the same name with a static imported method, Java
		will give it preference over the imported one.
		* Static imports are only for importing static members but not classes.
		* The compiler doesn't compile if we try to explicitly do a static import of 2
		methods of the same name or 2 static variables with the same name.
		--------------------------------------------------------------------------------	
		""");
	}
	public static void main(String[] args) {
		List<String> list = asList("one","two"); // By help of the static import we can call Arrays.asList() by asList().
		System.out.println(list.toString());
		
		/*
		 * List<String> list2 = Arrays.asList("one","two"); 
		 * DOES NOT COMPILE: Arrays cannot be resolved
		 * Method Arrays.asList() is imported but class Arrays is not imported!
		 */
	}
}