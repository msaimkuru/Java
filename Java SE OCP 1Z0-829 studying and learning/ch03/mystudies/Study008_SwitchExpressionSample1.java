package org.curlybrace.oopj.ocp1z0_829.ch03.mystudies;

/* Terminal commands to run program
 * curlybrace@saim-MacBook-Pro src % javac org/curlybrace/oopj/ocp1z0_829/ch03/mystudies/Study008_SwitchExpressionSample1.java
 * curlybrace@saim-MacBook-Pro src % java org.curlybrace.oopj.ocp1z0_829.ch03.Study008_SwitchExpressionSample1      
 */

public class Study008_SwitchExpressionSample1 {
	enum Season{WINTER, SPRING, SUMMER, FALL};
	
	public static void printDayOfWeekWithSwitchExpression(int day) {
		switch(day) {
			case 0 -> System.out.println("Sunday");
			case 1 -> System.out.println("Monday"); 
			case 2 -> System.out.println("Tuesday"); 
			case 3 -> System.out.println("Wednesday");
			case 4 -> System.out.println("Thursday");
			case 5 -> {System.out.print("Friday"); System.out.println("..and Friday is aka freeday!");}
			case 6 -> System.out.println("Saturday");
			default -> System.err.println("Invalid Value!");
		}
	}
	//
	public static String printDayOfWeekWithSwitchExpressionReturningValue(int day) {
		return(
			switch(day) {
				case 0 -> "0:Sunday";										//	a case expression
				case 1 -> {System.out.print(day + ":"); yield "Monday";}	//	a case block
				case 2 -> {System.out.print(day + ":"); yield "Tuesday";}
				case 3 -> {System.out.print(day + ":"); yield "Wednesday";}
				case 4 -> {System.out.print(day + ":"); yield "Thursday";}
				case 5 -> {System.out.print(day + ":"); yield "Friday..and Friday is aka freeday!";}
				case 6 -> {System.out.print("Saturday");yield "Saturday";}
				default -> {System.err.print(day + ":");yield "Invalid Value!";}
			}
		);	
	}	
	//
	public static void main(String[] args) {
		printDayOfWeekWithSwitchExpression(0);
		printDayOfWeekWithSwitchExpression(5);
		//
		System.out.println("--------------------------------------------------------------------------------");
		//
		String s;
		s = printDayOfWeekWithSwitchExpressionReturningValue(0);
		System.out.println(s);
		s = printDayOfWeekWithSwitchExpressionReturningValue(5);
		System.out.println(s);
		s = printDayOfWeekWithSwitchExpressionReturningValue(7);
		System.out.println(s);		
		//
		System.out.println("--------------------------------------------------------------------------------");
		//
		//ENUM EXAMPLE		
		Season value = Season.SUMMER;
		System.out.println(switch(value) {
							case WINTER -> "Cold";
							case SPRING -> "Rainy";
							case SUMMER -> "Hot";
							case FALL -> "Warm";
						}
		);
	}
}