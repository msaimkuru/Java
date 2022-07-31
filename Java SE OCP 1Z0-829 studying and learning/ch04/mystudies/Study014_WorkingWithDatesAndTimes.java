package org.curlybrace.oopj.ocp1z0_829.ch04.mystudies;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

/* Terminal commands to run program
 * curlybrace@saim-MacBook-Pro src % javac org/curlybrace/oopj/ocp1z0_829/ch04/mystudies/Study014_WorkingWithDatesAndTimes.java
 * curlybrace@saim-MacBook-Pro src % java org.curlybrace.oopj.ocp1z0_829.ch04.mystudies.Study014_WorkingWithDatesAndTimes      
 */

public class Study014_WorkingWithDatesAndTimes {

	public static void main(String[] args) {
		System.out.println("""
		--------------------------------------------------------------------------------
		I N T R O D U C T I O N    T O java.time package classes: 
		LocalTime, LocalDate, LocalDateTime, ZonedDateTime
		--------------------------------------------------------------------------------
		Notes:
		* LocalDate	: contains just a date (no time, no time-zone)
		  LocalTime	: contains just a time (no date, no time-zone)
		  LocalDateTime	: contains date and time (no time-zone)
		  ZonedDateTime	: contains zone, date and time.
		* Each of these 4 classes has static methods of() and now() to get specific or 
		current dates,times, or date-times
		* !!! The date and time classes are immutable. !!! 
		* The date and time classes have private constructors along with static methods
		that return instances. This is known as the factory pattern. So we can not 
		instantiate this classes with the new word.
		* The time part of time-including values show hours, minutes, seconds and 
		fractional seconds (at a highest precision of nanoseconds).
		* In order to create a ZonedDateTime we first need to get the desired time zone
		(i.e, by means of ZoneId.of() )
		--------------------------------------------------------------------------------		
		EXAMPLE 1) Using current date, current time, current date-time and current
		zoned date-time
		--------------------------------------------------------------------------------				
		""");
		System.out.println("Now  time is (LocalTime.now())                        ->	" + LocalTime.now());
		System.out.println("Today is (LocalDate.now())                            ->	" + LocalDate.now());
		System.out.println("Today the time is (LocalDateTime.now())               ->	" + LocalDateTime.now());
		System.out.println("Most specificly now the time is (ZonedDateTime.now()) ->	" + ZonedDateTime.now());

		System.out.println("""
		--------------------------------------------------------------------------------		
		EXAMPLE 2) Creating specific dates, times, date-times, and zoned date-times
		--------------------------------------------------------------------------------				
		""");
		System.out.println("-----------------------------Creating Dates-------------------------------------");
		
		var date1 = LocalDate.of(2022, Month.JANUARY, 1);
		var date2 = LocalDate.of(2022, 2, 2);
		System.out.println("date1               ->		" + date1);
		System.out.println("date2               ->		" + date2);
		System.out.println("The Period difference between date1 and date2 is:" + Period.between(date1, date2));
		System.out.println("The ChronoUnit difference between date1 and date2 is:" + ChronoUnit.DAYS.between(date1, date2) + " Day(s)");
		System.out.println("The ChronoUnit difference between date1 and date2 is:" + ChronoUnit.MONTHS.between(date1, date2) + " Month(s)");
		System.out.println("The ChronoUnit difference between date1 and date2 is:" + ChronoUnit.YEARS.between(date1, date2) + " Year(s)");

		System.out.println("\n-----------------------------Creating Times-------------------------------------");
		
		var time1 = LocalTime.of(1, 1);				// creating a time by hour, minute
		var time2 = LocalTime.of(2, 2, 2);			// creating a time by hour, minute, second
		var time3 = LocalTime.of(3, 3, 3, 2250000);	// creating a time by hour, minute, second, billionth of second (nanosecond)
		
		System.out.println("time1               ->		" + time1);
		System.out.println("time2               ->		" + time2);
		System.out.println("time3               ->		" + time3);
		System.out.println("The Duration difference between time1 and time2 is:" + Duration.between(time1, time2));
		System.out.println("The ChronoUnit difference between time1 and time2 is:" + ChronoUnit.HOURS.between(time1, time2) + " Hour(s)");
		System.out.println("The ChronoUnit difference between time1 and time2 is:" + ChronoUnit.MINUTES.between(time1, time2) + " Minute(s)");
		System.out.println("The ChronoUnit difference between time1 and time2 is:" + ChronoUnit.SECONDS.between(time1, time2) + " Second(s)");		
		System.out.println("\n----------------------------Creating Date-Times-----------------------------------");

		var 
		dateTime1 = LocalDateTime.of(2022,1,1,1,1);					//creating a date-time by year, month, day, hour, minute
		dateTime1 = LocalDateTime.of(2022,1,1,1,1,1);				//creating a date-time by year, month, day, hour, minute, second
		dateTime1 = LocalDateTime.of(2022,1,1,1,1,1,1);				//creating a date-time by year, month, day, hour, minute, second, billionth of second (nanosecond)
		dateTime1 = LocalDateTime.of(2022,Month.JANUARY,1,1,1);		//creating a date-time by year, month, day, hour, minute
		dateTime1 = LocalDateTime.of(2022,Month.JANUARY,1,1,1,1);	//creating a date-time by year, month, day, hour, minute, second
		dateTime1 = LocalDateTime.of(2022,Month.JANUARY,1,1,1,1,1);	//creating a date-time by year, month, day, hour, minute, second, billionth of second (nanosecond)
		
		var date1Time1 = LocalDateTime.of(date1,time1);				//creating a date-time by LocalDate and LocalTime objects
		var date2Time2 = LocalDateTime.of(date2,time2);
		
		System.out.println("dateTime1           ->		" + dateTime1);
		System.out.println("date1Time1          ->		" + date1Time1);
		System.out.println("date2Time2          ->		" + date2Time2);

		System.out.println("The Duration difference between date1Time1 and date2Time2 is:" + Duration.between(date1Time1, date2Time2));
		System.out.println("The ChronoUnit difference between date1Time1 and date2Time2 is:" + ChronoUnit.DAYS.between(date1Time1, date2Time2) + " Day(s)");
		System.out.println("The ChronoUnit difference between date1Time1 and date2Time2 is:" + ChronoUnit.MONTHS.between(date1Time1, date2Time2) + " Month(s)");
		System.out.println("The ChronoUnit difference between date1Time1 and date2Time2 is:" + ChronoUnit.YEARS.between(date1Time1, date2Time2) + " Year(s)");
		System.out.println("""
		
		--------------------------------------------------------------------------------		
		EXAMPLE 3) Creating specific zoned date-time.
		In order to create a zoned date-time we first need to get the desired time zone.
		--------------------------------------------------------------------------------				
		""");
		var zoneTR = ZoneId.of("Europe/Istanbul");
		var zoneIRE = ZoneId.of("Europe/Dublin");
		
		var zonedTR = ZonedDateTime.of(2022,  6, 13, 14, 30, 28, 200, zoneTR);
		var zonedDate1Time1 = ZonedDateTime.of(date1, time1, zoneTR);
		var zonedDate2Time2 = ZonedDateTime.of(date2Time2, zoneTR);
		
		System.out.println("zonedTR               ->		" + zonedTR);
		System.out.println("zonedDate1Time1       ->		" + zonedDate1Time1);
		System.out.println("zonedDate2Time2       ->		" + zonedDate2Time2);
		System.out.println();
		System.out.println("The difference between zonedDate1Time1 and zonedDate2Time2 is:" + Duration.between(zonedDate1Time1, zonedDate2Time2));
		System.out.println();
		
		var zonedDateTimeNowTR = ZonedDateTime.now(zoneTR);
		var zonedDateTimeNowIRE = ZonedDateTime.now(zoneIRE);
		
		System.out.println(String.format("In Turkey now the zoned datetime is->>%s while\nIn Ireland the zoned datetime is ->>%s", zonedDateTimeNowTR, zonedDateTimeNowIRE));
		System.out.println();
		System.out.println("The Duration difference is:" + Duration.between(zonedDateTimeNowIRE, zonedDateTimeNowTR));
		
		System.out.println("The difference is(in nano-seconds):" + ChronoUnit.NANOS.between(zonedDateTimeNowTR,zonedDateTimeNowIRE ));
		System.out.println("The difference is(in micro-seconds):" + ChronoUnit.MICROS.between(zonedDateTimeNowTR,zonedDateTimeNowIRE ));
		System.out.println("The difference is(in milli-seconds):" + ChronoUnit.MILLIS.between(zonedDateTimeNowTR,zonedDateTimeNowIRE ));

		System.out.println("""
		--------------------------------------------------------------------------------		
		EXAMPLE 4) Illegal creation samples
		--------------------------------------------------------------------------------				
		""");		
		//var d = new LocalDate();	DOES NOT COMPILE
		
		try {
			var d = LocalDate.of(2022, 1, 32);
		}
		catch(Exception e) {
			e.printStackTrace();
		}	//	java.time.DateTimeException: Invalid value for DayOfMonth (valid values 1 - 28/31): 32	
		
		System.out.println("""
		--------------------------------------------------------------------------------		
		MANIPULATING DATES AND TIMES
		* The date and time classes are immutable. 
		--------------------------------------------------------------------------------				
		""");
		
		System.out.println("""
		--------------------------------------------------------------------------------		
		EXAMPLE 5) Adding to/Subtracting from a date/datetime
		--------------------------------------------------------------------------------				
		""");		
		var date3 = LocalDate.of(2022, 3, 3);
		System.out.println("date3                       ->	" + date3);
		date3 = date3.plusDays(2);
		System.out.println("date3 = date3.plusDays(2)   ->	" + date3);
		date3 = date3.plusWeeks(1);
		System.out.println("date3 = date3.plusWeeks(1)  ->	" + date3);
		date3 = date3.plusMonths(2);
		System.out.println("date3 = date3.plusMonths(2) ->	" + date3);
		date3 = date3.plusYears(3);
		System.out.println("date3 = date3.plusYears(3)  ->	" + date3);
		date3 = date3.plusYears(-3);
		System.out.println("date3 = date3.plusYears(-3) ->	" + date3);
		var date3orig = date3.plusMonths(-2).plusWeeks(-1).plusDays(-2);			// Goes back to the initial value by chaining.
		System.out.println("date3orig                   ->	" + date3orig);
		var date3orig2 = date3.minusMonths(2).minusWeeks(1).minusDays(2);		// Goes back to the initial value by chaining.
		System.out.println("date3orig2                  ->	" + date3orig);		
		
		var dateTime2 = LocalDateTime.of(2022, 2, 2, 2, 2, 2);
		System.out.println("dateTime2                                            ->	" + dateTime2);
		
		System.out.println("dateTime2.minusDays(1)                               ->	" + dateTime2.minusDays(1));
		System.out.println("dateTime2.minusDays(1).minusHours(1)                 ->	" + dateTime2.minusDays(1).minusHours(1));
		System.out.println("dateTime2.minusDays(1).minusHours(1).minusSeconds(2) ->	" + dateTime2.minusDays(1).minusHours(1).minusSeconds(2));
	}
}