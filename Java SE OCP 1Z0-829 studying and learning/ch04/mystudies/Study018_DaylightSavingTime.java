package org.curlybrace.oopj.ocp1z0_829.ch04.mystudies;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/* Terminal commands to run program
 * curlybrace@saim-MacBook-Pro src % javac org/curlybrace/oopj/ocp1z0_829/ch04/mystudies/Study018_DaylightSavingTime.java
 * curlybrace@saim-MacBook-Pro src % java org.curlybrace.oopj.ocp1z0_829.ch04.mystudies.Study018_DaylightSavingTime      
 */

public class Study018_DaylightSavingTime {

	public static void main(String[] args) {
		ZoneId zoneUS = ZoneId.of("US/Eastern");
		LocalDateTime ldt = LocalDateTime.of(2022, 3, 13, 1, 30);
		ZonedDateTime zonedDateTimeUS = ZonedDateTime.of(ldt, zoneUS);
		//
		System.out.println("""
		--------------------------------------------------------------------------------
		About D A Y L I G H T	S A V I N G		T I M E		on		M A R C H
		--------------------------------------------------------------------------------
		On 13th March, 2022, In US Clocks are moved forward an hour at 2.00 a.m. So the 
		clocks go from 1.59 a.m. to 3.00 a.m.
		
		In the example below we add an hour to 1.30 a.m. on 13th of March, 2022 which
		results in 03.30 because of the daylight saving time. While clock goes forward
		1 hour, time-zone offset changes from -05:00 to -04:00 as well.
		
		Observe how GMT Time moves smoothly from 06:30 to 07:30 as expected just because
		we only added an hour.
		--------------------------------------------------------------------------------
		""");
		System.out.println("-------------------- 13.03.2022 at 01:30 o'clock US/Eastern Zone ----------------------------------");
		System.out.println("zonedDateTimeUS                            -> " + zonedDateTimeUS);
		System.out.println();
		System.out.println("Offset of zonedDateTimeUS" + "\n"                 
                          +"(zonedDateTimeUS.getOffset()               -> " + zonedDateTimeUS.getOffset());		
		System.out.println();
		System.out.println("GMT value for zonedDateTimeUS" + "\n" 
		                  +"(zonedDateTimeUS.instant())                -> " + zonedDateTimeUS.toInstant());
		System.out.println();
		System.out.println("-------------------- Add 1 Hour on 13.03.2022 at 01:30 o'clock US/Eastern Zone --------------------");		
		System.out.println("zonedDateTimeUS + 1 Hour" + "\n"                 
		                  +"(zonedDateTimeUS.plusHours(1))             -> " + zonedDateTimeUS.plusHours(1));
		System.out.println();
		System.out.println("Offset of zonedDateTimeUS + 1 Hour" + "\n"                 
                          +"(zonedDateTimeUS.plusHours(1)).getOffset() -> " + zonedDateTimeUS.plusHours(1).getOffset());
		System.out.println();
		System.out.println("GMT value for zonedDateTimeUS + 1 Hour" + "\n" 
		                  +"(zonedDateTimeUS.plusHours(1).instant())   -> " + zonedDateTimeUS.plusHours(1).toInstant());
		//
		//
		LocalDateTime ldt2 = LocalDateTime.of(2022, 11, 6, 1, 30);
		ZonedDateTime zonedDateTimeUS2 = ZonedDateTime.of(ldt2, zoneUS);
		//
		System.out.println("""
		--------------------------------------------------------------------------------
		About D A Y L I G H T	S A V I N G		T I M E		on		NOVEMBER
		--------------------------------------------------------------------------------
		On 6th November, 2022, In US Clocks are moved back an hour at 2.00 a.m. So the 
		clocks go from 1.59 a.m. to 1.00 a.m.
		
		In the example below we add an hour to 1.30 a.m. on 6th of November, 2022 which
		results in 01.30 because of the daylight saving time. While clock goes back
		1 hour, time-zone offset changes from -04:00 to -05:00 as well.
		
		Observe how GMT Time moves smoothly from 05:30 to 06:30 as expected just because
		we only added an hour.
		--------------------------------------------------------------------------------
		""");
		System.out.println("-------------------- 06.11.2022 at 01:30 o'clock US/Eastern Zone ----------------------------------");
		System.out.println("zonedDateTimeUS2                            -> " + zonedDateTimeUS2);
		System.out.println();
		System.out.println("Offset of zonedDateTimeUS2" + "\n"                 
                          +"(zonedDateTimeUS2.getOffset()               -> " + zonedDateTimeUS2.getOffset());		
		System.out.println();
		System.out.println("GMT value for zonedDateTimeUS2" + "\n" 
		                  +"(zonedDateTimeUS.instant())                 -> " + zonedDateTimeUS2.toInstant());
		System.out.println();
		System.out.println("-------------------- Add 1 Hour on 06.11.2022 at 01:30 o'clock US/Eastern Zone --------------------");		
		System.out.println("zonedDateTimeUS2 + 1 Hour" + "\n"                 
		                  +"(zonedDateTimeUS2.plusHours(1))             -> " + zonedDateTimeUS2.plusHours(1));
		System.out.println();
		System.out.println("Offset of zonedDateTimeUS2 + 1 Hour" + "\n"                 
                          +"(zonedDateTimeUS2.plusHours(1)).getOffset() -> " + zonedDateTimeUS2.plusHours(1).getOffset());
		System.out.println();
		System.out.println("GMT value for zonedDateTimeUS2 + 1 Hour" + "\n" 
		                  +"(zonedDateTimeUS2.plusHours(1).instant())   -> " + zonedDateTimeUS2.plusHours(1).toInstant());		
	}
}