package org.curlybrace.oopj.ocp1z0_829.ch03.mystudies;

/**
 * @author	Saim Kuru
 * @version 1.0
 * ------------
 * Objectives:
 * ------------ 
 * 1. Understanding Switch Expression
 * ------------ 
 * Difficulty: Easy
 * ------------
 * NOTES
 * ------------
 * 1) Switch expressions were officially added to Java 14
 * 
 * 2) Switch expression is a much more compact form of a switch statement,
 * capable of returning a value. Switch expressions can return values but
 * they don't have to.
 * 
 * 3) All of the branches of a switch expression that do not throw an
 * exception must return a consistent data type(if the switch expression
 * returns a value). 
 * 
 * 4) If the switch expression returns a value, then every branch that isn't
 * a case expression must yield a value.
 * 
 * 5) A default branch is required unless all cases are covered or no value
 * is returned by the siwtch expression.
 * 
 * 6) Like a traditional switch statement, a switch expression supports zero
 * or many case branches and an optional default branch.
 * 
 * Syntax: 
	 switch(expression/variableToTest) {
	  case constantexpression1 -> expression1;          // case expression
	  case constantexpression2 -> { statement1;
	                                ..
	                                statementN;
	                                yield expression 2;
	                              }                     // case block
	  case constantexpression3, constantexpression4, ..., constantexpressionN -> case expression or case block 
	  default-> case expression or case block           // optional, may appear anywhere within switch statement
	                                                    // is required if switch returns a value and
	                                                    // all possible case statement values are not handled
	                                                    
	 }
 * ------------ 
 */

/*
 * Terminal commands to run program
 * curlybrace@saim-MacBook-Pro src % javac org/curlybrace/oopj/ocp1z0_829/ch03/mystudies/Study008_SwitchExpressionSample1.java
 * curlybrace@saim-MacBook-Pro src % java org.curlybrace.oopj.ocp1z0_829.ch03.mystudies.Study008_SwitchExpressionSample1      
 */

public class Study008_SwitchExpressionSample1 {
	
	public static void printDayOfWeekWithSwitchExpression(int day) {
		// This switch expression does not return any value
		switch(day) {
			case 0 -> System.out.println("day no " + day + ":" + "Sunday");
			case 1 -> System.out.println("day no " + day + ":" + "Monday"); 
			case 2 -> System.out.println("day no " + day + ":" + "Tuesday"); 
			case 3 -> System.out.println("day no " + day + ":" + "Wednesday");
			case 4 -> System.out.println("day no " + day + ":" + "Thursday");
			case 5 -> { System.out.print("day no " + day + ":" + "Friday"); 
			            System.out.println("..and Friday is aka freeday!");
			          }
			case 6 -> System.out.println("day no " + day + ":" + "Saturday");
			default -> System.err.println("Invalid Value!");
		}
	}
	
	public static String printDayOfWeekWithSwitchExpressionReturningValue(int day) {
		return(
			// This switch expression returns a String value	
			switch(day) {
				case 0 -> "day no " + day + ":" + "Sunday";            //	a case expression
				case 1 -> { System.out.print("day no " + day + ":");
				            yield "Monday";
				          }	                                           //	a case block
				case 2 -> { System.out.print("day no " + day + ":"); 
				            yield "Tuesday";
				          }	                                           //	a case block
				case 3 -> { System.out.print("day no " + day + ":"); 
				            yield "Wednesday";
				          }	                                           //	a case block
				case 4 -> { System.out.print("day no " + day + ":"); 
				            yield "Thursday";
				          }	                                           //	a case block
				case 5 -> { System.out.print("day no " + day + ":"); 
				            yield "Friday..and Friday is aka freeday!";
				          }	                                           //	a case block
				case 6 -> { System.out.print("day no " + day + ":");
				            yield "Saturday";
				          }	                                           //	a case block
				default -> { System.err.print("day no " + day + ":");
				             yield "Invalid Value!";
				           }	                                           //	a case block
			}
		);	
	}	
	
	public static void main(String[] args) {
		printDayOfWeekWithSwitchExpression(0);
		printDayOfWeekWithSwitchExpression(5);
		
		System.out.println("--------------------------------------------------------------------------------");
		
		String s;
		s = printDayOfWeekWithSwitchExpressionReturningValue(0);
		System.out.println(s);
		
		s = printDayOfWeekWithSwitchExpressionReturningValue(5);
		System.out.println(s);
		
		s = printDayOfWeekWithSwitchExpressionReturningValue(7);
		System.out.println(s);		
		
		System.out.println("--------------------------------------------------------------------------------");
		
		// ENUM EXAMPLE
		enum Season{WINTER, SPRING, SUMMER, FALL};
		Season value = Season.SUMMER;
		System.out.println( switch(value) {
						       case WINTER -> {yield "Cold";}
							   case SPRING -> "Rainy";
							   case SUMMER -> "Hot";
							   case FALL -> "Warm";
						    }
		);
	}
}