package org.curlybrace.oopj.ocp1z0_829.ch03.mystudies;

/**
 * @author	Saim Kuru
 * @version 1.0
 * ------------
 * Objectives:
 * ------------ 
 * 1. Understanding Switch Expression Rules
 * ------------ 
 * Difficulty: Easy
 * ------------
 * NOTES
 * ------------ 
 */

/*
 * Terminal commands to run program
 * curlybrace@saim-MacBook-Pro src % javac org/curlybrace/oopj/ocp1z0_829/ch03/mystudies/Study009_SwitchExpressionRules.java
 * curlybrace@saim-MacBook-Pro src % java org.curlybrace.oopj.ocp1z0_829.ch03.mystudies.Study009_SwitchExpressionRules      
 */

public class Study009_SwitchExpressionRules {
	static {
		System.out.println("""
		--------------------------------------------------------	
		S w i t c h   E x p r e s s i o n   R u l e s
		--------------------------------------------------------			
		""");
	}
	public static void main(String[] args) {
		System.out.println("""
		--------------------------------------------------------		
		Rule 1:
		--------------------------------------------------------
		If the switch expression returns a value; 
		All of the branches of a switch expression that do not 
		throw an exception must return a consistent data type
		--------------------------------------------------------
		""");
		
		int variableToTest = 10;
		int size = switch(variableToTest) {
			case 5 -> 1;
			case 10 -> (short)2;
			default -> 5;
			//case 20 -> "3";	//	DOES NOT COMPILE: Type mismatch: cannot convert from String to int
			//case 40 -> 4L;		//	DOES NOT COMPILE: Type mismatch: cannot convert from long to int
			//case 50 -> null;	//	DOES NOT COMPILE: Type mismatch: cannot convert from null to int
		};
		
		System.out.println("""
		--------------------------------------------------------
		Rule 2:
		--------------------------------------------------------
		If the switch expression returns a value; 
		Every branch that isn't an expression must yield a value
		--------------------------------------------------------
		""");
		
		int fish = 5;
		int length = 12;
		var name = switch(fish) {
			case 1 -> "Goldfish";
			/*
			//case 2 -> {}
			-----------------
			DOES NOT COMPILE:
			------------------ 
			switch rule completes without providing a value
			case 2 -> {}	
			           ^
            (switch rules in switch expressions must either provide a value or throw)
			*/
			/*case 3 -> {
				if(length > 10) yield "Blobfish";
			}*/				//	DOES NOT COMPILE: switch rule completes without providing a value
			case 2 -> {yield "Bigfish";}	
			case 3 -> {
				if(length > 10) yield "Blobfish"; else yield "Unknown fish";
			}	
			default -> "Swordfish";
		};
		
		System.out.println("""
		--------------------------------------------------------		
		Rule 3:
		--------------------------------------------------------
		If the switch expression returns a value; 
		A default branch is required unless all cases are covered. 
		--------------------------------------------------------				
		""");
		int canis = 2;
		/*
		String type2 = switch(canis) {
			case 1 -> "dog";
			case 2 -> "wolf";
			case 3 -> "coyote";
		};
		------------------
		DOES NOT COMPILE : 
		-------------------
		the switch expression does not cover all possible input values
		String type2 = switch(canis) {
		               ^
		-------------------               
		*/
		String type = switch(canis) {
			case 1 -> "dog";
			case 2 -> "wolf";
			case 3 -> "coyote";
			default -> "unknown";
		};
		//
		//
		byte b = 10;
		int c = 
		switch(b) {
			case   -128 -> 0;
			case  (byte) -127 -> 0;
			case  (byte) -126 -> 0;
			case  (byte) -125 -> 0;
			case  (byte) -124 -> 0;
			case  (byte) -123 -> 0;
			case  (byte) -122 -> 0;
			case  (byte) -121 -> 0;
			case  (byte) -120 -> 0;
			case  (byte) -119 -> 0;
			case  (byte) -118 -> 0;
			case  (byte) -117 -> 0;
			case  (byte) -116 -> 0;
			case  (byte) -115 -> 0;
			case  (byte) -114 -> 0;
			case  (byte) -113 -> 0;
			case  (byte) -112 -> 0;
			case  (byte) -111 -> 0;
			case  (byte) -110 -> 0;
			case  (byte) -109 -> 0;
			case  (byte) -108 -> 0;
			case  (byte) -107 -> 0;
			case  (byte) -106 -> 0;
			case  (byte) -105 -> 0;
			case  (byte) -104 -> 0;
			case  (byte) -103 -> 0;
			case  (byte) -102 -> 0;
			case  (byte) -101 -> 0;
			case  (byte) -100 -> 0;
			case  (byte) -99 -> 0;
			case  (byte) -98 -> 0;
			case  (byte) -97 -> 0;
			case  (byte) -96 -> 0;
			case  (byte) -95 -> 0;
			case  (byte) -94 -> 0;
			case  (byte) -93 -> 0;
			case  (byte) -92 -> 0;
			case  (byte) -91 -> 0;
			case  (byte) -90 -> 0;
			case  (byte) -89 -> 0;
			case  (byte) -88 -> 0;
			case  (byte) -87 -> 0;
			case  (byte) -86 -> 0;
			case  (byte) -85 -> 0;
			case  (byte) -84 -> 0;
			case  (byte) -83 -> 0;
			case  (byte) -82 -> 0;
			case  (byte) -81 -> 0;
			case  (byte) -80 -> 0;
			case  (byte) -79 -> 0;
			case  (byte) -78 -> 0;
			case  (byte) -77 -> 0;
			case  (byte) -76 -> 0;
			case  (byte) -75 -> 0;
			case  (byte) -74 -> 0;
			case  (byte) -73 -> 0;
			case  (byte) -72 -> 0;
			case  (byte) -71 -> 0;
			case  (byte) -70 -> 0;
			case  (byte) -69 -> 0;
			case  (byte) -68 -> 0;
			case  (byte) -67 -> 0;
			case  (byte) -66 -> 0;
			case  (byte) -65 -> 0;
			case  (byte) -64 -> 0;
			case  (byte) -63 -> 0;
			case  (byte) -62 -> 0;
			case  (byte) -61 -> 0;
			case  (byte) -60 -> 0;
			case  (byte) -59 -> 0;
			case  (byte) -58 -> 0;
			case  (byte) -57 -> 0;
			case  (byte) -56 -> 0;
			case  (byte) -55 -> 0;
			case  (byte) -54 -> 0;
			case  (byte) -53 -> 0;
			case  (byte) -52 -> 0;
			case  (byte) -51 -> 0;
			case  (byte) -50 -> 0;
			case  (byte) -49 -> 0;
			case  (byte) -48 -> 0;
			case  (byte) -47 -> 0;
			case  (byte) -46 -> 0;
			case  (byte) -45 -> 0;
			case  (byte) -44 -> 0;
			case  (byte) -43 -> 0;
			case  (byte) -42 -> 0;
			case  (byte) -41 -> 0;
			case  (byte) -40 -> 0;
			case  (byte) -39 -> 0;
			case  (byte) -38 -> 0;
			case  (byte) -37 -> 0;
			case  (byte) -36 -> 0;
			case  (byte) -35 -> 0;
			case  (byte) -34 -> 0;
			case  (byte) -33 -> 0;
			case  (byte) -32 -> 0;
			case  (byte) -31 -> 0;
			case  (byte) -30 -> 0;
			case  (byte) -29 -> 0;
			case  (byte) -28 -> 0;
			case  (byte) -27 -> 0;
			case  (byte) -26 -> 0;
			case  (byte) -25 -> 0;
			case  (byte) -24 -> 0;
			case  (byte) -23 -> 0;
			case  (byte) -22 -> 0;
			case  (byte) -21 -> 0;
			case  (byte) -20 -> 0;
			case  (byte) -19 -> 0;
			case  (byte) -18 -> 0;
			case  (byte) -17 -> 0;
			case  (byte) -16 -> 0;
			case  (byte) -15 -> 0;
			case  (byte) -14 -> 0;
			case  (byte) -13 -> 0;
			case  (byte) -12 -> 0;
			case  (byte) -11 -> 0;
			case  (byte) -10 -> 0;
			case  (byte) -9 -> 0;
			case  (byte) -8 -> 0;
			case  (byte) -7 -> 0;
			case  (byte) -6 -> 0;
			case  (byte) -5 -> 0;
			case  (byte) -4 -> 0;
			case  (byte) -3 -> 0;
			case  (byte) -2 -> 0;
			case  (byte) -1 -> 0;
			case  (byte) 0 -> 0;
			case  (byte) 1 -> 0;
			case  (byte) 2 -> 0;
			case  (byte) 3 -> 0;
			case  (byte) 4 -> 0;
			case  (byte) 5 -> 0;
			case  (byte) 6 -> 0;
			case  (byte) 7 -> 0;
			case  (byte) 8 -> 0;
			case  (byte) 9 -> 0;
			case  (byte) 10 -> 0;
			case  (byte) 11 -> 0;
			case  (byte) 12 -> 0;
			case  (byte) 13 -> 0;
			case  (byte) 14 -> 0;
			case  (byte) 15 -> 0;
			case  (byte) 16 -> 0;
			case  (byte) 17 -> 0;
			case  (byte) 18 -> 0;
			case  (byte) 19 -> 0;
			case  (byte) 20 -> 0;
			case  (byte) 21 -> 0;
			case  (byte) 22 -> 0;
			case  (byte) 23 -> 0;
			case  (byte) 24 -> 0;
			case  (byte) 25 -> 0;
			case  (byte) 26 -> 0;
			case  (byte) 27 -> 0;
			case  (byte) 28 -> 0;
			case  (byte) 29 -> 0;
			case  (byte) 30 -> 0;
			case  (byte) 31 -> 0;
			case  (byte) 32 -> 0;
			case  (byte) 33 -> 0;
			case  (byte) 34 -> 0;
			case  (byte) 35 -> 0;
			case  (byte) 36 -> 0;
			case  (byte) 37 -> 0;
			case  (byte) 38 -> 0;
			case  (byte) 39 -> 0;
			case  (byte) 40 -> 0;
			case  (byte) 41 -> 0;
			case  (byte) 42 -> 0;
			case  (byte) 43 -> 0;
			case  (byte) 44 -> 0;
			case  (byte) 45 -> 0;
			case  (byte) 46 -> 0;
			case  (byte) 47 -> 0;
			case  (byte) 48 -> 0;
			case  (byte) 49 -> 0;
			case  (byte) 50 -> 0;
			case  (byte) 51 -> 0;
			case  (byte) 52 -> 0;
			case  (byte) 53 -> 0;
			case  (byte) 54 -> 0;
			case  (byte) 55 -> 0;
			case  (byte) 56 -> 0;
			case  (byte) 57 -> 0;
			case  (byte) 58 -> 0;
			case  (byte) 59 -> 0;
			case  (byte) 60 -> 0;
			case  (byte) 61 -> 0;
			case  (byte) 62 -> 0;
			case  (byte) 63 -> 0;
			case  (byte) 64 -> 0;
			case  (byte) 65 -> 0;
			case  (byte) 66 -> 0;
			case  (byte) 67 -> 0;
			case  (byte) 68 -> 0;
			case  (byte) 69 -> 0;
			case  (byte) 70 -> 0;
			case  (byte) 71 -> 0;
			case  (byte) 72 -> 0;
			case  (byte) 73 -> 0;
			case  (byte) 74 -> 0;
			case  (byte) 75 -> 0;
			case  (byte) 76 -> 0;
			case  (byte) 77 -> 0;
			case  (byte) 78 -> 0;
			case  (byte) 79 -> 0;
			case  (byte) 80 -> 0;
			case  (byte) 81 -> 0;
			case  (byte) 82 -> 0;
			case  (byte) 83 -> 0;
			case  (byte) 84 -> 0;
			case  (byte) 85 -> 0;
			case  (byte) 86 -> 0;
			case  (byte) 87 -> 0;
			case  (byte) 88 -> 0;
			case  (byte) 89 -> 0;
			case  (byte) 90 -> 0;
			case  (byte) 91 -> 0;
			case  (byte) 92 -> 0;
			case  (byte) 93 -> 0;
			case  (byte) 94 -> 0;
			case  (byte) 95 -> 0;
			case  (byte) 96 -> 0;
			case  (byte) 97 -> 0;
			case  (byte) 98 -> 0;
			case  (byte) 99 -> 0;
			case  (byte) 100 -> 0;
			case  (byte) 101 -> 0;
			case  (byte) 102 -> 0;
			case  (byte) 103 -> 0;
			case  (byte) 104 -> 0;
			case  (byte) 105 -> 0;
			case  (byte) 106 -> 0;
			case  (byte) 107 -> 0;
			case  (byte) 108 -> 0;
			case  (byte) 109 -> 0;
			case  (byte) 110 -> 0;
			case  (byte) 111 -> 0;
			case  (byte) 112 -> 0;
			case  (byte) 113 -> 0;
			case  (byte) 114 -> 0;
			case  (byte) 115 -> 0;
			case  (byte) 116 -> 0;
			case  (byte) 117 -> 0;
			case  (byte) 118 -> 0;
			case  (byte) 119 -> 0;
			case  (byte) 120 -> 0;
			case  (byte) 121 -> 0;
			case  (byte) 122 -> 0;
			case  (byte) 123 -> 0;
			case  (byte) 124 -> 0;
			case  (byte) 125 -> 0;
			case  (byte) 126 -> 0;
			case  (byte) 127 -> 0;
			default -> 1;
		};
	}
}