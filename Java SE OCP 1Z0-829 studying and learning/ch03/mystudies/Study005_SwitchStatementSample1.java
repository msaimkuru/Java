package org.curlybrace.oopj.ocp1z0_829.ch03.mystudies;

/* Terminal commands to run program
 * curlybrace@saim-MacBook-Pro src % javac org/curlybrace/oopj/ocp1z0_829/ch03/mystudies/Study005_SwitchStatementSample1.java
 * curlybrace@saim-MacBook-Pro src % java org.curlybrace.oopj.ocp1z0_829.ch03.Study005_SwitchStatementSample1      
 */

/* 
 * COMMENT: Switch statements are good for lots of possible branches or paths for a single value
 */

public class Study005_SwitchStatementSample1 {
	public static void printDayOfWeekWithIfs(int day) {
		if(day == 0)
			System.out.println("Sunday");
		else if(day == 1)
			System.out.println("Monday");
		else if(day == 2)
			System.out.println("Tuesday");
		else if(day == 3)
			System.out.println("Wednesday");	
		else if(day == 4)
			System.out.println("Thursday");
		else if(day == 5)
			System.out.println("Friday");
		else if(day == 6)
			System.out.println("Saturday");	
		else
			System.err.println("Invalid Value!");
	}
	//
	public static void printDayOfWeekWithSwitchStatement(int day) {
		switch(day) {
			case 0: System.out.println("Sunday"); break;
			case 1: System.out.println("Monday"); break;
			case 2: System.out.println("Tuesday"); break;
			case 3: System.out.println("Wednesday"); break;
			case 4: System.out.println("Thursday"); break;
			case 5: System.out.print("Friday"); 
					System.out.println("..and Friday is aka freeday!");
					break;
			case 6: System.out.println("Saturday"); break;
			default: System.err.println("Invalid Value!");break;
		}
	}
	//
	public static void compoundCasedSwitchStatement(int starAvg) {
		switch(starAvg) {
			case 4,5: System.out.println("Rating Good!"); break;
			case 3: System.out.println("Rating OK"); break;
			case 2: System.out.println("Rating Not good"); break;
			case 1,0: System.out.println("Rating Sucks!"); break;
			default: System.err.println("Invalid Value!");break;
		}
	}	
	//
	public static void main(String[] args) {
		printDayOfWeekWithIfs(2);
		System.out.println("-----");
		printDayOfWeekWithSwitchStatement(2);
		System.out.println("-----");
		compoundCasedSwitchStatement(3);
		System.out.println("""
		--------------------------------------------------------------------------------
		"""
		);
		//
		System.out.println("""
		--------------------------------------------------------------------------------
		EXPLANATION:
		--------------------------------------------------------------------------------
		Without break statements the code will execute every branch
		following a matching case statement (including a following default statement 
		if exists)	
		""");
		//
		System.out.println("-----");
		switch(2) {
			default: System.out.println("No values"); 
			case 3: System.out.println("Three"); 
			case 2: System.out.println("Two"); 
			case 1: System.out.println("One"); 
		} // Prints Two, One
		//
		System.out.println("--------------------------------------------------------------------------------");
		//
		switch(5) {
			default: System.out.println("No values"); 
			case 3: System.out.println("Three"); 
			case 2: System.out.println("Two"); 
			case 1: System.out.println("One"); 
		} // Prints "No Values", Three, Two One
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
		//
		System.out.println("""
		--------------------------------------------------------------------------------
		EXPLANATION:
		--------------------------------------------------------------------------------
		It is forbidden to use same case values
		""");
		//
		System.out.println("-----");
		switch(2) {
			default: System.out.println("No values"); 
			case 2: System.out.println("Three minus 1"); 
			//case 2: System.out.println("Two");		// DOES NOT COMPILE : Duplicate case
			case 1: System.out.println("One"); 
		} // Prints Two, One
		//
		
	}
}