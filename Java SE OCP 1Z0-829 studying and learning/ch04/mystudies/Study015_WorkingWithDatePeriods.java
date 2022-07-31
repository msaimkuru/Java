package org.curlybrace.oopj.ocp1z0_829.ch04.mystudies;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

/* Terminal commands to run program
 * curlybrace@saim-MacBook-Pro src % javac org/curlybrace/oopj/ocp1z0_829/ch04/mystudies/Study015_WorkingWithDatePeriods.java
 * curlybrace@saim-MacBook-Pro src % java org.curlybrace.oopj.ocp1z0_829.ch04.mystudies.Study015_WorkingWithDatePeriods      
 */

public class Study015_WorkingWithDatePeriods {

	public static void main(String[] args) {
		System.out.println("""
		--------------------------------------------------------------------------------
		A B O U T		Period Class
		--------------------------------------------------------------------------------
		* The of() method takes only years, months, and days.
		* The ability to use another factory method (ofWeeks()) to pass weeks is merely
		a convenience.
		* The actual Period is stored in terms of years, months, and days.
		* When we print a Period Java displays any non-zero parts in format P1Y2M3D
		where the first P stand for showing it is a period measure.
		* Period can only be used with objects that include date data namely LocalDate, 
		LocalDateTime and ZonedDateTime. 
		--------------------------------------------------------------------------------		
		""");	
		// Creating ways of Period instances.
		var date1 = LocalDate.of(2022, 6, 13);
		var period1D = Period.ofDays(1);
		var period1W = Period.ofWeeks(1);
		var period2W = Period.ofWeeks(2);
		var period1M = Period.ofMonths(1);
		var period1Y = Period.ofYears(1);
		var period1Y10D = Period.of(1,0,10);
		var period1Y3M10D = Period.of(1,3,10);
		
		System.out.println("date1 -> " + date1);
		System.out.println("--------------------");
		
		System.out.println("Period.ofDays(1)   ->" + period1D);		// Prints ->P1D
		System.out.println("Period.ofWeeks(1)  ->" + period1W);		// Prints ->P7D
		System.out.println("Period.ofWeeks(2)  ->" + period2W);		// Prints ->P14D
		System.out.println("Period.ofMonths(1) ->" + period1M);		// Prints ->P1M
		System.out.println("Period.ofYears(1)  ->" + period1Y);		// Prints ->P1Y
		System.out.println("Period.of(1,0,10)  ->" + period1Y10D);	// Prints ->P1Y10D
		System.out.println("Period.of(1,3,10)  ->" + period1Y3M10D);	// Prints ->P1Y3M10D
		
		System.out.println("--------------------");
		System.out.println("date1.plus(period1D)      -> " + date1.plus(period1D));
		System.out.println("date1.minus(period1D)     -> " + date1.minus(period1D));
		System.out.println("date1.plus(period1W)      -> " + date1.plus(period1W));
		System.out.println("date1.plus(period2W)      -> " + date1.plus(period2W));
		System.out.println("date1.plus(period1M)      -> " + date1.plus(period1M));
		System.out.println("date1.plus(period1Y)      -> " + date1.plus(period1Y));
		System.out.println("date1.plus(period1Y10D)   -> " + date1.plus(period1Y10D));
		System.out.println("date1.plus(period1Y3M10D) -> " + date1.plus(period1Y3M10D));
		System.out.println("--------------------");	
		
		var ldt = LocalDateTime.now();
		ldt.plus(period1D);
		System.out.println("At +1 Day Period (ldt.plus(period1D))         -> " + ldt.plus(period1D));
		
		var time = LocalTime.of(5, 15);
		try {
			// Attempting to add a day to an object that as only time won't work. It causes a runtime exception.
			time.plus(period1D);
		}
		catch(Exception e) {
			e.printStackTrace();
		}	// Runtime Exception: java.time.temporal.UnsupportedTemporalTypeException: Unsupported unit: Days
	}
}