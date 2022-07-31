package org.curlybrace.oopj.ocp1z0_829.ch06.mystudies.Study000_Inheritance.Study000_02_ClassModifiers;

/**
 * @author	Saim Kuru
 * @version 1.0
 * ------------
 * Objectives:
 * ------------ 
 * 1. Listing Class Modifiers
 * ------------
 * Difficulty: Medium
 * ------------ 
 */

/* Terminal commands to run program
 * curlybrace@saim-MacBook-Pro src % 
 * javac org/curlybrace/oopj/ocp1z0_829/ch06/mystudies/Study000_Inheritance/Study000_02_ClassModifiers/A0.java
 * curlybrace@saim-MacBook-Pro src % 
 * java org.curlybrace.oopj.ocp1z0_829.ch06.mystudies.Study000_Inheritance/Study000_02_ClassModifiers/A0     
 */

public class A0 {
	static {
		System.out.println("""
		--------------------------------------------------------------------------------------------
		--------------------------------------------------------------------------------------------
		C l a s s   (O p t i o n a l)   M o d i f i e r s
		--------------------------------------------------------------------------------------------
		--------------------------------------------------------------------------------------------
		Modifier		Description
		--------------------------------------------------------------------------------------------
		final			The class may not be extended.
		--------------------------------------------------------------------------------------------
		abstract		The class is abstract, may contain abstract or concrete methods
					,and requires a concrete subclass to instantiate.
		--------------------------------------------------------------------------------------------
		sealed			The class may only be extended by a specific list of classes.
		--------------------------------------------------------------------------------------------
		non-sealed		A subclass of a sealed class permits potentially unnamed 
					classes.
		--------------------------------------------------------------------------------------------
		static			Used for static nested classes defined within a class.
		--------------------------------------------------------------------------------------------
		--------------------------------------------------------------------------------------------
		C l a s s   A c c e s s   M o d i f i e r s
		--------------------------------------------------------------------------------------------
		--------------------------------------------------------------------------------------------
		public			public access
		--------------------------------------------------------------------------------------------
		no-modifier		package-private access
		--------------------------------------------------------------------------------------------
		--------------------------------------------------------------------------------------------
		""");
	}
	
	public static void main(String[] args) {

	}
}