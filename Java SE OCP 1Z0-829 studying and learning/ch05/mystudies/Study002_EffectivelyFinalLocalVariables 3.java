package org.curlybrace.oopj.ocp1z0_829.ch05.mystudies;

/* Terminal commands to run program
 * curlybrace@saim-MacBook-Pro src % javac org/curlybrace/oopj/ocp1z0_829/ch05/mystudies/Study002_EffectivelyFinalLocalVariables.java
 * curlybrace@saim-MacBook-Pro src % java org.curlybrace.oopj.ocp1z0_829.ch05.mystudies.Study002_EffectivelyFinalLocalVariables      
 */

public class Study002_EffectivelyFinalLocalVariables {
	public void effectivelyFinalLocalVaribles() {
		String s1 = "abc";
		//final var size = 10;	 // Line 15 DOES NOT COMPILE : cannot assign a value to final variable size
		var size = 10;
		boolean wet;
		
		if (size > 100) size++;
		s1.substring(0);
		wet = true;
		
		System.out.println("""
		s1 and wet are effectively final. size variable is not effectively final
		because it could be incremented on line 15.		
		""");
	}
	
	public static void main(String[] args) {
		System.out.println("""
		--------------------------------------------------------------------------------
		Effectively Final Local Variables
		--------------------------------------------------------------------------------
		* An effectively final local variable is one that is not modified after it is 
		assigned.
		* A quick test of effectively final is to just add final to the variable
		declaration and see if it still compiles.
		--------------------------------------------------------------------------------					
		""");
	}
}