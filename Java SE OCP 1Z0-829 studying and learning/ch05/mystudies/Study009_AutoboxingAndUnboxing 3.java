package org.curlybrace.oopj.ocp1z0_829.ch05.mystudies;

/* Terminal commands to run program
 * curlybrace@saim-MacBook-Pro src % javac org/curlybrace/oopj/ocp1z0_829/ch05/mystudies/Study009_AutoboxingAndUnboxing.java
 * curlybrace@saim-MacBook-Pro src % java org.curlybrace.oopj.ocp1z0_829.ch05.mystudies.Study009_AutoboxingAndUnboxing      
 */

public class Study009_AutoboxingAndUnboxing {
	static {
		System.out.println("""
		--------------------------------------------------------------------------------
		A u t o b o x i n g  &  U n b o x i n g
		--------------------------------------------------------------------------------	
		* Autoboxing: It is the automatic java process of converting a primitive into
		its equivalent wrapper class.
		
		* Unboxing: It is the automatic java process of converting a wrapper class
		into its equivalent primitive.
		
		NOTES:
		------
		1- Unboxing on a wrapper class reference that is null causes a runtime exception.
		2- Unboxing & implicit casting at the same time (casting from narrower to bigger 
		primitive type) is allowed.
		3- Autoboxing & implicit casting at the same time (casting from narrower to bigger 
		primitive type) is NOT allowed.
		--------------------------------------------------------------------------------				
		""");
	}
	public static void main(String[] args) {
		int int1 = 1, int2;
		boolean bool1 = true, bool2;
		char char1 = 'a', char2;
		short shrt1 = -1, shrt2;
		
		Integer integer1 = int1;			// This is autoboxing.
		Boolean boolean1 = bool1;		// This is autoboxing.
		Character character1 = char1;	// This is autoboxing.
		Short short1 = shrt1;			// This is autoboxing.
		Short shortDummy = (int)8;		// This is still an autoboxing.
		//Short shortNotAllowed = int1;	// DOES NOT COMPILE
		
		int2 = integer1;				// This is unboxing
		bool2 = boolean1;				// This is unboxing
		char2 = character1;				// This is unboxing
		shrt2 = short1;					// This is unboxing
		
		Integer integer2 = Integer.valueOf(int2); // explicit conversion between primitive to wrapper.
		int int3 = integer2.intValue();			  // explicit conversion between wrapper to primitive.
		
		//Limits of Autoboxing and Numeric Promotion
		Integer e = Integer.valueOf(9);
		long lprimitive = e; // e unboxes to an int, and then implicit casting( int promotes to long successfully.)
		
		/* 
		 * Long lwrapper = e;
		 * 
		 * DOES NOT COMPILE:
		 * Type mismatch: cannot convert from Integer to Long
		 * 
		 * Long lwrapper = 8; // Cannot autobox and implicit cast at the same time!
		 * DOES NOT COMPILE:
		 * Type mismatch: cannot convert from int to Long
		 */ 
		
		//
		// RUNTIME EXCEPTION: java.lang.NullPointerException: Cannot invoke "java.lang.Character.charValue()" because "character2" is null
		// Unboxing on a wrapper class reference that is null causes a runtime exception.
		Character character2 = null;
		try {
			char char3 = character2;
		}
		catch(Exception ee) {
			ee.printStackTrace();
		}
	}
}