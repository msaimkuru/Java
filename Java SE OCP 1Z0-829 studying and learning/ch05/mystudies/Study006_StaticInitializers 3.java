package org.curlybrace.oopj.ocp1z0_829.ch05.mystudies;

/* Terminal commands to run program
 * curlybrace@saim-MacBook-Pro src % javac org/curlybrace/oopj/ocp1z0_829/ch05/mystudies/Study006_StaticInitializers.java
 * curlybrace@saim-MacBook-Pro src % java org.curlybrace.oopj.ocp1z0_829.ch05.mystudies.Study006_StaticInitializers      
 */

public class Study006_StaticInitializers {
	private static final int NUM_SECONDS_PER_MINUTE;
	private static final int NUM_MINUTES_PER_HOUR;
	private static final int NUM_SECONDS_PER_HOUR;

	static {
		System.out.println("""
		--------------------------------------------------------------------------------
		S t a t i c    I n i t i a l i z e r s
		--------------------------------------------------------------------------------
		* All static initializers run when the class is first used, in the order they're
		defined.
		
		* Static initializers are one of the places where static variables can be 
		initialized.
		
		* There is a common case to use static initializers:
		When we need to initialize a static field and the code to do so requires more
		than one line. This often occurs when we want to initialize a collection like an
		ArrayList or a HashMap.
		--------------------------------------------------------------------------------	
		""");
		System.out.println("""
		1st static initializer has run...
		--------------------------------------------------------------------------------
		""");
	}
	static {
		NUM_SECONDS_PER_MINUTE = 60;
		NUM_MINUTES_PER_HOUR = 60;
		System.out.println("""
		2nd static initializer has run...
		--------------------------------------------------------------------------------
		""");
	}
	
	static {
		NUM_SECONDS_PER_HOUR = NUM_SECONDS_PER_MINUTE * NUM_MINUTES_PER_HOUR;
		System.out.println("""
		3rd static initializer has run...
		--------------------------------------------------------------------------------
		""");	}
	
	public static void main(String[] args) {
		System.out.println("NUM_SECONDS_PER_HOUR --> " + NUM_SECONDS_PER_HOUR);		
	}
}