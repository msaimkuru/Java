package org.curlybrace.oopj.ocp1z0_829.ch03.mystudies;

/* Terminal commands to run program
 * curlybrace@saim-MacBook-Pro src % javac org/curlybrace/oopj/ocp1z0_829/ch03/mystudies/Study006_AcceptableSwitchDataTypes.java
 * curlybrace@saim-MacBook-Pro src % java org.curlybrace.oopj.ocp1z0_829.ch03.Study006_AcceptableSwitchDataTypes      
 */

public class Study006_AcceptableSwitchDataTypes {
	public static void main(String[] args) {
		System.out.println("""
		/* Switch Variable Rule:
		 * ---------------------
		 * Switch variables can only be of type;
		 * 1) byte, 2)short, 3)int, 4)char and their associated 
		 * wrapper classes:5)Byte, 6)Short, 7)Integer, 8)Character,
		 * 9)String, 10)enum values 
		 * and 11)var (if the type resolves to one of the preceding types)
		 */
		 """
		);
		byte b1 = 1;	Byte B1 = Byte.valueOf(b1);
		short s1 = 1;	Short S1 = Short.valueOf(s1);
		char c1 = 1;	Character C1 = Character.valueOf(c1);
		int i1 = 1;		Integer I1 = Integer.valueOf(i1);
		boolean bl1 = true;	Boolean BL1 = Boolean.valueOf(bl1);
		float f1 = 1.0f;		Float F1 = Float.valueOf(f1);
		double d1 = 1.0;		Double D1 = Double.valueOf(d1);
		//
		// These switches compile well
		switch(b1) {}
		switch(s1) {}
		switch(c1) {}
		switch(i1) {}
		switch(B1) {}
		switch(S1) {}
		switch(C1) {}
		switch(I1) {}
		//
		// These switches do not compile 
		//switch(bl1) {}	// DOES NOT COMPILE : Cannot switch on a value of type boolean. Only convertible int values, strings or enum variables are permitted
		//switch(f1) {}	// DOES NOT COMPILE : Cannot switch on a value of type float. Only convertible int values, strings or enum variables are permitted
		//switch(d1) {}	// DOES NOT COMPILE : Cannot switch on a value of type double. Only convertible int values, strings or enum variables are permitted
		//switch(BL1) {}	// DOES NOT COMPILE : Cannot switch on a value of type Boolean. Only convertible int values, strings or enum variables are permitted
		//switch(F1) {}	// DOES NOT COMPILE : Cannot switch on a value of type Float. Only convertible int values, strings or enum variables are permitted
		//switch(D1ofA1) {}	// DOES NOT COMPILE : Cannot switch on a value of type Double. Only convertible int values, strings or enum variables are permitted
	}
}