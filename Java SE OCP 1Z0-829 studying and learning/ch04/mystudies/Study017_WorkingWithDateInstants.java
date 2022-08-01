package org.curlybrace.oopj.ocp1z0_829.ch04.mystudies;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.TimeZone;

/* Terminal commands to run program
 * curlybrace@saim-MacBook-Pro src % javac org/curlybrace/oopj/ocp1z0_829/ch04/mystudies/Study017_WorkingWithDateInstants.java
 * curlybrace@saim-MacBook-Pro src % java org.curlybrace.oopj.ocp1z0_829.ch04.mystudies.Study017_WorkingWithDateInstants      
 */

public class Study017_WorkingWithDateInstants {

	public static void main(String[] args) {
		System.out.println("""
		--------------------------------------------------------------------------------
		A B O U T		Instant Class
		--------------------------------------------------------------------------------
		* The Instant class represents a specific moment in time in the GMT time zone.
		--------------------------------------------------------------------------------						
		""");
		// Get host time zone.
		ZoneId hostTimeZone = TimeZone.getDefault().toZoneId();
		System.out.println("Host time zone is	->	" + hostTimeZone);
		
		// Get US time zone
		ZoneId zoneUS = ZoneId.of("US/Eastern");
		
		var localDateNow = LocalDate.now();
		var localTimeNow = LocalTime.now();
		var localDateTimeNow = LocalDateTime.now();
		//
		System.out.println("------------------------------------------------------------");		
		var gmtNow = Instant.now();
		
		System.out.println("gmtNow  		        ->	" + gmtNow);
		System.out.println("localDateTimeNow		->	" + localDateTimeNow);
		
		var gmtLater = Instant.now();
		System.out.println("gmtLater		        ->	" + gmtLater);
		
		var duration = Duration.between(gmtNow, gmtLater);
		System.out.println();
		System.out.println("duration between gmtNow&gmtLater, duration.toNanos()->" + duration + ", " + duration.toNanos());		
		//
		//
		System.out.println("------------------------------------------------------------");
		var hostZonedDateTime = ZonedDateTime.of(localDateNow, localTimeNow, hostTimeZone);
		var instantGMTForHost = hostZonedDateTime.toInstant();
		System.out.println("hostZonedDateTime -> " + hostZonedDateTime);
		System.out.println("instantGMTForHost -> " + instantGMTForHost);

		System.out.println("----------------------------------------");		
		var zonedDateTimeUS = ZonedDateTime.of(localDateNow, localTimeNow, zoneUS);
		var instantGMTForUS = zonedDateTimeUS.toInstant();
		System.out.println("zonedDateTimeUS   -> " + zonedDateTimeUS);
		System.out.println("instantGMTForUS   -> " + instantGMTForUS);		
	}
}