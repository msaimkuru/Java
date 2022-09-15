package org.curlybrace.oopj.ocp1z0_829.ch03.mystudies;

/**
 * @author	Saim Kuru
 * @version 1.0
 * ------------
 * Objectives:
 * ------------ 
 * 1. Understanding Switch Statement
 * ------------ 
 * Difficulty: Easy
 * ------------
 * NOTES
 * ------------ 
 * 1) Switch statements are good for lots of possible branches or paths for a single value
 * 2) With Java 14, case values can now be combined with comma
 * 3) A switch statement is not required to have any case statements. For example, this
 * statement is perfectly valid: switch(month){} 
 * 
 * Syntax: 
	 switch(expression/variableToTest) {
	  case constantexpression1:
	    // code block
	    break; --> optional
	  case constantexpression2:
	    // code block
	    break;
	  case constantexpression3, constantexpression4, ..., constantexpressionN:
	  	// code block
	    break;
	  default: --> optional, may appear anywhere within switch statement
	    // code block
	 }
 * ------------  
 */

/* Terminal commands to run program
 * curlybrace@saim-MacBook-Pro src % javac org/curlybrace/oopj/ocp1z0_829/ch03/mystudies/Study005_SwitchStatementSample1.java
 * curlybrace@saim-MacBook-Pro src % java org.curlybrace.oopj.ocp1z0_829.ch03.mystudies.Study005_SwitchStatementSample1      
 */

public class Study005_SwitchStatementSample1 {
	public static void printDayOfWeekWithIfs(int day) {
		if(day == 0)
			System.out.println("day no " + day + ":" + "Sunday");
		else if(day == 1)
			System.out.println("day no " + day + ":" + "Monday");
		else if(day == 2)
			System.out.println("day no " + day + ":" + "Tuesday");
		else if(day == 3)
			System.out.println("day no " + day + ":" + "Wednesday");	
		else if(day == 4)
			System.out.println("day no " + day + ":" + "Thursday");
		else if(day == 5)
			System.out.println("day no " + day + ":" + "Friday");
		else if(day == 6)
			System.out.println("day no " + day + ":" + "Saturday");	
		else
			System.err.println("day no " + day + ":" + "Invalid Value!");
	}
	
	public static void printDayOfWeekWithSwitchStatement(int day) {
		switch(day) {
			case 0: System.out.println("day no " + day + ":" + "Sunday"); 
			        break;
			case 1: { System.out.println("day no " + day + ":" + "Monday"); 
			         break;
			        }
			case 2: System.out.println("day no " + day + ":" + "Tuesday"); 
			        break;
			case 3: System.out.println("day no " + day + ":" + "Wednesday"); 
			        break;
			case 4: System.out.println("day no " + day + ":" + "Thursday"); 
			        break;
			case 5: System.out.print("day no " + day + ":" + "Friday"); 
					System.out.println("..and Friday is aka freeday!");
					break;
			case 6: System.out.println("day no " + day + ":" + "Saturday"); 
			        break;
			default: System.err.println("day no " + day + ":" + "Invalid Value!"); 
			         break;
		}
	}
	
	public static void compoundCasedSwitchStatement(int starAvg) {
		switch(starAvg) {
			case 4, 5: System.out.println(starAvg + ": Rating Good!"); 
			           break;
			case 3: System.out.println(starAvg + ": Rating OK"); 
			        break;
			case 2: System.out.println(starAvg + ": Rating Not good"); 
			        break;
			case 1, 0: System.out.println(starAvg + ": Rating Sucks!"); 
			           break;
			default: System.err.println(starAvg + ": Invalid Value!"); 
			         break;
		}
	}	
	
	public static void main(String[] args) {
		printDayOfWeekWithIfs(2);
		System.out.println("------------------------------");
		
		printDayOfWeekWithSwitchStatement(2);
		System.out.println("------------------------------");
		
		compoundCasedSwitchStatement(3);
		
		System.out.println("--------------------------------------------------------------------------------");
		
		System.out.println("""
		--------------------------------------------------------------------------------
		EXPLANATION:
		--------------------------------------------------------------------------------
		Without break statements the code will execute every branch following a matching 
		case statement (including a following default statement if exists)	
		""");
		
		System.out.println("EXAMPLES:");
		System.out.println("---------------------------");
		
		int k = 2;
		switch(k) {
			default: System.out.println(k + ":No values"); 
			case 3: System.out.println(k + ":Three"); 
			case 2: System.out.println(k + ":Two"); 
			case 1: System.out.println(k + ":One"); 
		}
		
		//
		System.out.println("--------------------------------------------------------------------------------");
		
		//
		k = 5;
		switch(k) {
			default: System.out.println(k + ":No values"); 
			case 3: System.out.println(k + ":Three"); 
			case 2: System.out.println(k + ":Two"); 
			case 1: System.out.println(k + ":One"); 
		}
		
		//
		System.out.println("--------------------------------------------------------------------------------");
		
		//		
		switch(5) {
			case 3: System.out.println("Three"); 
			case 2: System.out.println("Two"); 
			case 1: System.out.println("One"); 
		} // Prints nothing
		
		//
		System.out.println("--------------------------------------------------------------------------------");
		
		//
		System.out.println("""
		--------------------------------------------------------------------------------
		EXPLANATION:
		--------------------------------------------------------------------------------
		It is forbidden to use same case values
		""");
		//
		System.out.println("-----");
		k = 2;
		switch(k) {
			default: System.out.println(k + ":No values"); 
			case 2: System.out.println(k + ":Three minus 1"); 
			/* case 2: System.out.println(k + ":Two");		
			   -----------------
			   DOES NOT COMPILE
			   -----------------
			   error: duplicate case label
			   case 2: System.out.println("Two");
               ^
             */
			case 1: System.out.println(k + ":One"); 
		}		
	}
}