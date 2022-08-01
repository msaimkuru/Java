package org.curlybrace.oopj.ocp1z0_829.ch04.mystudies;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/* Terminal commands to run program
 * curlybrace@saim-MacBook-Pro src % javac org/curlybrace/oopj/ocp1z0_829/ch04/mystudies/Study016_WorkingWithDateDurations.java
 * curlybrace@saim-MacBook-Pro src % java org.curlybrace.oopj.ocp1z0_829.ch04.mystudies.Study016_WorkingWithDateDurations      
 */

public class Study016_WorkingWithDateDurations {

	public static void main(String[] args) {
		System.out.println("""
		--------------------------------------------------------------------------------
		A B O U T		Duration & ChronoUnit Classses
		--------------------------------------------------------------------------------
		* You can specify days, hours, minutes, seconds, and nanoseconds with Duration
		* Duration can be used with objects that have time components namely LocalTime,
		LocalDateTime, and ZonedDateTime
		* Duration is output beginning with PT, stored in Hours (H), Minutes(M) and 
		Seconds(S). The number of seconds includes fractional seconds.
		* The actual Duration is stored in hours, minutes, and seconds.
		* When we print a Duration Java displays any non-zero parts in format PT1H2M3S
		* By means of ChronoUnit we can estimate how far apart 2 temporal values and 
		we can truncate tempoal values including time elements.
		--------------------------------------------------------------------------------		
		--------------------------------------------------------------------------------				
		""");	
		// 
		var datetime1 = LocalDateTime.of(2022, 6, 13, 0, 0, 0);
		// Creating ways of Duration instances.
		var duraNS = Duration.ofNanos(123);
		var duraMS = Duration.ofMillis(456);
		var duraS = Duration.ofSeconds(2);
		var duraM = Duration.ofMinutes(3);
		var duraH = Duration.ofHours(4);
		var duraD = Duration.ofDays(5);
		
		System.out.println("datetime1 -> " + datetime1);
		System.out.println("--------------------");
		
		System.out.println("Duration.ofNanos(123)   ->" + Duration.ofNanos(123));	// Prints ->PT0.000000123S
		System.out.println("Duration.ofMillis(456)  ->" + Duration.ofMillis(456));	// Prints ->PT0.456S
		System.out.println("Duration.ofSeconds(2)   ->" + Duration.ofSeconds(2));	// Prints ->PT2S
		System.out.println("Duration.ofMinutes(3)   ->" + Duration.ofMinutes(3));	// Prints ->PT3M
		System.out.println("Duration.ofHours(4)     ->" + Duration.ofHours(4));	// Prints ->PT4H
		System.out.println("Duration.ofDays(5)      ->" + Duration.ofDays(5));	// Prints ->PT120H
		
		
		System.out.println("--------------------");
		System.out.println("At +123 Nanos Duration  -> " + datetime1.plus(duraNS));
		System.out.println("At -123 Nanos Duration  -> " + datetime1.minus(duraNS));
		System.out.println("At +456 millis Duration -> " + datetime1.plus(duraMS));
		System.out.println("At +2 Seconds Duration  -> " + datetime1.plus(duraS));
		System.out.println("At +3 Minutes Duration  -> " + datetime1.plus(duraM));
		System.out.println("At +4 Hours Duration    -> " + datetime1.plus(duraH));
		System.out.println("At +5 Days Duration     -> " + datetime1.plus(duraD));
		System.out.println("--------------------");	
		
		System.out.println("""
		--------------------------------------------------------------------------------
		* Duration doesn't have a factory method that takes multiple units like Period
		does.
		* Duration includes another more generic factory method that takes a number and 
		a TemporalUnit (an interface implemented by only ChronoUnit).
		--------------------------------------------------------------------------------				
		""");	
		
		var daily1 = Duration.ofDays(1);							//->PT24H
		var daily2 = Duration.of(1, ChronoUnit.DAYS);				//->PT24H
		var hourly1 = Duration.ofHours(1);							//->PT1H
		var hourly2 = Duration.of(1, ChronoUnit.HOURS);				//->PT1H
		var everyMinute1 = Duration.ofMinutes(1);					//->PT1M
		var everyMinute2 = Duration.of(1, ChronoUnit.MINUTES);		//->PT1M
		var everyTenSeconds1 = Duration.ofSeconds(10);				//->PT10S
		var everyTenSeconds2 = Duration.of(10, ChronoUnit.SECONDS);	//->PT10S
		
		System.out.println("daily1           ->" + daily1);
		System.out.println("daily2           ->" + daily2);
		System.out.println("hourly1          ->" + hourly1);
		System.out.println("hourly2          ->" + hourly2);
		System.out.println("everyMinute1     ->" + everyMinute1);
		System.out.println("everyMinute2     ->" + everyMinute2);
		System.out.println("everyTenSeconds1 ->" + everyTenSeconds1);
		System.out.println("everyTenSeconds2 ->" + everyTenSeconds2);

		System.out.println("""
		--------------------------------------------------------------------------------
		C h r o n o U n i t  for DATE/TIME D I F F E R E N C E S		
		--------------------------------------------------------------------------------
		* ChronoUnit provides a great means for determining how far apart 2 Temporal 
		values are. Temporal includes LocalDate, LocalTime, etc.
		* ChronoUnit is in the java.time.temporal package.
		--------------------------------------------------------------------------------		
		""");			
		
		var time1 = LocalTime.of(5, 0);
		var time2 = LocalTime.of(7, 30);
		//System.out.println("Hour difference between time1 and time2 ->" + ChronoUnit.DAYS.between(time1, time2));
		System.out.println("Hour difference between time1 and time2 ->" + ChronoUnit.HOURS.between(time1, time2));
		System.out.println("Minutes difference between time1 and time2 ->" + ChronoUnit.MINUTES.between(time1, time2));
		System.out.println("Seconds difference between time1 and time2 ->" + ChronoUnit.SECONDS.between(time1, time2));
		System.out.println("Milli-Seconds difference between time1 and time2 ->" + ChronoUnit.MILLIS.between(time1, time2));
		System.out.println("Micro-Seconds difference between time1 and time2 ->" + ChronoUnit.MICROS.between(time1, time2));
		System.out.println("Nano-Seconds difference between time1 and time2 ->" + ChronoUnit.NANOS.between(time1, time2));
		System.out.println("--------------------------------------------------------------------------------");
		var dateTime1 = LocalDateTime.of(1988, 4, 4, 0, 0, 0);
		var dateTime2 = LocalDateTime.now();
		System.out.println("Century difference between dateTime1 and dateTime2 ->" + ChronoUnit.CENTURIES.between(dateTime1, dateTime2));
		System.out.println("Era difference between dateTime1 and dateTime2 ->" + ChronoUnit.ERAS.between(dateTime1, dateTime2));
		System.out.println("Decades difference between dateTime1 and dateTime2 ->" + ChronoUnit.DECADES.between(dateTime1, dateTime2));
		System.out.println("Year difference between dateTime1 and dateTime2 ->" + ChronoUnit.YEARS.between(dateTime1, dateTime2));
		System.out.println("Day difference between dateTime1 and dateTime2 ->" + ChronoUnit.DAYS.between(dateTime1, dateTime2));
		System.out.println("Hour difference between dateTime1 and dateTime2 ->" + ChronoUnit.HOURS.between(dateTime1, dateTime2));
		System.out.println("Minutes difference between dateTime1 and dateTime2 ->" + ChronoUnit.MINUTES.between(dateTime1, dateTime2));
		System.out.println("Seconds difference between dateTime1 and dateTime2 ->" + ChronoUnit.SECONDS.between(dateTime1, dateTime2));
		System.out.println("Milli-Seconds difference between dateTime1 and dateTime2 ->" + ChronoUnit.MILLIS.between(dateTime1, dateTime2));
		System.out.println("Micro-Seconds difference between dateTime1 and dateTime2 ->" + ChronoUnit.MICROS.between(dateTime1, dateTime2));
		System.out.println("Nano-Seconds difference between dateTime1 and dateTime2 ->" + ChronoUnit.NANOS.between(dateTime1, dateTime2));		
		System.out.println("--------------------------------------------------------------------------------");
		
		System.out.println("-------------------- Truncating by means of ChronoUnit -------------------------");
		System.out.println(LocalTime.of(17, 15,48).truncatedTo(ChronoUnit.SECONDS)); //17:15:48
		System.out.println(LocalTime.of(17, 15,48).truncatedTo(ChronoUnit.MINUTES)); //17:15
		System.out.println(LocalTime.of(17, 15,48).truncatedTo(ChronoUnit.HOURS)); //17:00
		System.out.println(LocalTime.of(17, 15,48).truncatedTo(ChronoUnit.DAYS)); //00:00
		
		System.out.println(LocalDateTime.of(2022, 6, 14, 17, 15, 48, 200).truncatedTo(ChronoUnit.NANOS));	//2022-06-14T17:15:48.000000200
		System.out.println(LocalDateTime.of(2022, 6, 14, 17, 15, 48, 200).truncatedTo(ChronoUnit.MICROS));	//2022-06-14T17:15:48
		System.out.println(LocalDateTime.of(2022, 6, 14, 17, 15, 48, 200).truncatedTo(ChronoUnit.MILLIS));	//2022-06-14T17:15:48
		System.out.println(LocalDateTime.of(2022, 6, 14, 17, 15, 48, 200).truncatedTo(ChronoUnit.SECONDS));	//2022-06-14T17:15:48
		System.out.println(LocalDateTime.of(2022, 6, 14, 17, 15, 48, 200).truncatedTo(ChronoUnit.MINUTES));	//2022-06-14T17:15
		System.out.println(LocalDateTime.of(2022, 6, 14, 17, 15, 48, 200).truncatedTo(ChronoUnit.HOURS));	//2022-06-14T17:00
		System.out.println(LocalDateTime.of(2022, 6, 14, 17, 15, 48, 200).truncatedTo(ChronoUnit.DAYS));	//2022-06-14T00:00
		//System.out.println(LocalDateTime.of(2022, 6, 14, 17, 15,48).truncatedTo(ChronoUnit.WEEKS));	// RUNTIME EXCEPTION
		//System.out.println(LocalDateTime.of(2022, 6, 14, 17, 15,48).truncatedTo(ChronoUnit.MONTHS));	// RUNTIME EXCEPTION
		//System.out.println(LocalDateTime.of(2022, 6, 14, 17, 15,48).truncatedTo(ChronoUnit.YEARS));	// RUNTIME EXCEPTION
		/*
		var time = LocalTime.of(5, 15);
		try {
			// Attempting to add a day to an object that as only time won't work. It causes a runtime exception.
			time.plus(period1D);
		}
		catch(Exception e) {
			e.printStackTrace();
		}	// Runtime Exception: java.time.temporal.UnsupportedTemporalTypeException: Unsupported unit: Days
		*/
	}
}