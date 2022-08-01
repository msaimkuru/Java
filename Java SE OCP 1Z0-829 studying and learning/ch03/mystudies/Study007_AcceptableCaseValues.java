package org.curlybrace.oopj.ocp1z0_829.ch03.mystudies;

/* Terminal commands to run program
 * curlybrace@saim-MacBook-Pro src % javac org/curlybrace/oopj/ocp1z0_829/ch03/mystudies/Study007_AcceptableCaseValues.java
 * curlybrace@saim-MacBook-Pro src % java org.curlybrace.oopj.ocp1z0_829.ch03.Study007_AcceptableCaseValues      
 */

public class Study007_AcceptableCaseValues {
	public static final int highFive() {
		return 5;
	}
	
	public static void main(String[] args) {
		System.out.println("""
		/* Acceptable Case Values:
		 * -----------------------
		 * 1) The values in each case statement must be compile-time constant values of the same data type as the switch value.
		 * This means you can use only literals, enum constants, or final constant variables of the same data type.
		 */
		 """
		);
		//
		final int i = 1;
		int j = 2;
		int switchVariable = 3;
		final int finalMethodValue = highFive();
		final byte b = 0;
		final long l = 1;
		final int k;
		k=3;
		final String s = "saim";
		//
		switch(switchVariable) {
			case i:
			/* j is not marked final so it is not permitted */
			//case j:					//	DOES NOT COMPILE : case expressions must be constant expressions
			
			/* You can't have a case statement value that requires executing a method at runtime, even if that method always returns the same value. */
			//case highFive():			//	DOES NOT COMPILE : case expressions must be constant expressions
			//case finalMethodValue:		//	DOES NOT COMPILE : case expressions must be constant expressions
				
			/* constant expressions are allowed as case values. They must be able to fit in the switch data type without an explicit cast. */	
			case 3 * 5:	
			case b:
			//case l:					//	DOES NOT COMPILE : Type mismatch: cannot convert from long to int
			//case k:					//	DOES NOT COMPILE : case expressions must be constant expressions
			//case s:					//	DOES NOT COMPILE : Type mismatch: cannot convert from String to int
		}
	}
}