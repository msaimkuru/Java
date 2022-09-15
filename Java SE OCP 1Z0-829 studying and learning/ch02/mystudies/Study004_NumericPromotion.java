package org.curlybrace.oopj.ocp1z0_829.ch02.mystudies;

/**
 * @author	Saim Kuru
 * @version 1.0
 * ------------
 * Objectives:
 * ------------ 
 * 1. Understanding Numeric Promotion
 * ------------ 
 * Difficulty: Medium
 * ------------ 
 * NOTES
 * ------------ 
 */

/* Terminal commands to run program
 * curlybrace@saim-MacBook-Pro src % javac org/curlybrace/oopj/ocp1z0_829/ch02/mystudies/Study004_NumericPromotion.java
 * curlybrace@saim-MacBook-Pro src % java org.curlybrace.oopj.ocp1z0_829.ch02.mystudies.Study004_NumericPromotion      
 */

public class Study004_NumericPromotion {
	static {
		System.out.println("""	
		--------------------------------------------------------------------------------
		N u m e r i c   P r o m o t i o n   R u l e s (for primitives)   W h e n
		A p p l y i n g   O p e r a t o r s   t o   D a t a   T y p e s
		--------------------------------------------------------------------------------
		Java follows certain numeric promotion rules when applying operators to data 
		types. These rules are listed below;
		-------------------------------------------------------------------------------- 	
		1) If 2 values have different data types, Java will automatically promote one of
		the values to the larger of the 2 data types.
		
		2) If 1 of the values is integral and the other is floating-point, Java will 
		automatically promote the integral value to the floating-point value's data 
		type.
		
		3) Smaller data types, namely, byte, short, and char, are first promoted to int
		any time they are used with 
				- a Java binary arithmetic operator 
				- and with A VARIABLE (as opposed to a value)
		even if neither of the operands is int.	

		4) After all promotion has occurred and the operands have the same data type, 
		the resulting value will have the same data type as its promoted operands.
		
		----------
		Notes: 
		----------
		* Unary operators (e.g., ++) are excluded from the 3rd rule. 
		* floating-point literals are assumed to be double unless post-fixed with an
		f or F.
		----------		
		--------------------------------------------------------------------------------		
		""");
	}
	
	public static void main(String[] args) {
		byte b1 = 5;				//-> COMPILES: Compiler doesn't require casting when working with literal values that fit into the data type.
		byte b2 = 5 * 10;	 		//-> COMPILES: Compiler doesn't require casting when working with literal values that fit into the data type.
		//byte b3 = b1 * 10; 		//-> DOES NOT COMPILE: "Type mismatch: cannot convert from int to byte"
		//byte b4 = 5 * 100; 		//-> DOES NOT COMPILE: "Type mismatch: cannot convert from int to byte"
		//
		short s1 = 5, s2 = 10;		//-> COMPILES: Compiler doesn't require casting when working with literal values that fit into the data type.
		//
		int i1 = 5, i2 = 10;
		//int i3 = 10_000_000_000;	//-> DOES NOT COMPILE: The literal 10_000_000_000 of type int is out of range.
		//int i3 = 10_000_000_000L;	//-> DOES NOT COMPILE: Type mismatch: cannot convert from long to int.
		Long l1 = 10_000_000_000L;
		//
		float f1 = 5.0f;
		float f2 = 10.0f;
		//float f3 = 5.0;			//-> DOES NOT COMPILE: Type mismatch: cannot convert from double to float
		//
		b2 = 8 * 12;				//-> COMPILES: Compiler doesn't require casting when working with literal values that fit into the data type.	
		//
		//i2 = i2 * l1;				//-> DOES NOT COMPILE: Type mismatch: cannot convert from long to int
		i2 *= l1;					//-> COPMPILES: Compound assignment operator makes automatic casting by itself.
									//-> i2 is promoted to a long and multiplied by l1 and the long result is casted to an int by compound operator itself.
		//
		System.out.println("b1->" + b1);		// prints-->5
		System.out.println("b2->" + b2);		// prints-->96
		System.out.println("s1->" + s1);		// prints-->5
		System.out.println("s2->" + s2);		// prints-->10
		System.out.println("i1->" + i1);		// prints-->5
		System.out.println("i2->" + i2);		// prints-->1215752192
		System.out.println("l1->" + l1);		// prints-->10000000000
		System.out.println("f1->" + f1);		// prints--> 5.0
		System.out.println("f2->" + f2);		// prints--> 10.0		
	}
}