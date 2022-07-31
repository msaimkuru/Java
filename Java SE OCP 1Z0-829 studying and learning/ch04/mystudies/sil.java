package org.curlybrace.oopj.ocp1z0_829.ch04.mystudies;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;

public class sil {

	public static void main(String[] args) {
		System.out.println(LocalTime.now());
		System.out.println(LocalDate.now());
		System.out.println(LocalDateTime.now());
		System.out.println(ZonedDateTime.now());
		//
		//System.out.println(LocalTime.of(8,15,30,200));
		//System.out.println(LocalDate.of(1988,4,4));
		//System.out.println(LocalDateTime.of(1988,4,4,11,55,0,0));
		var zoneTR = ZoneId.of("Europe/Istanbul");
		var date = LocalDate.of(2021, 11,15);//LocalDate.of(1988, 4, 4);
		var time = LocalTime.of(16, 0, 0, 0);//LocalTime.of(11, 55, 0, 0);
		var zonedDateTimeEYTR = ZonedDateTime.of(date, time, zoneTR);
		var zonedDateTimeTR = ZonedDateTime.now(zoneTR);
		System.out.println("zonedDateTimeEYTR	->%s".formatted(zonedDateTimeEYTR));
		System.out.println("zonedDateTimeTR	->%s".formatted(zonedDateTimeTR));
		System.out.println(ChronoUnit.SECONDS.between(zonedDateTimeEYTR, zonedDateTimeTR));
		System.out.println(ChronoUnit.MINUTES.between(zonedDateTimeEYTR, zonedDateTimeTR));
		System.out.println(ChronoUnit.HOURS.between(zonedDateTimeEYTR, zonedDateTimeTR));
		System.out.println(ChronoUnit.DAYS.between(zonedDateTimeEYTR, zonedDateTimeTR));
		System.out.println(ChronoUnit.MONTHS.between(zonedDateTimeEYTR, zonedDateTimeTR));
		System.out.println(ChronoUnit.YEARS.between(zonedDateTimeEYTR, zonedDateTimeTR));

		//System.out.println(zonedDateTimeTR.plusDays(1));
		
		Period p = Period.of(1, 6, 0);
		//System.out.println(zonedDateTimeTR.plus(p));
		//System.out.println(zonedDateTimeTR.minus(p));
		
		var numbers = "012345678".indent(1);
		System.out.println(numbers + "," + numbers.length());
		numbers = numbers.stripLeading();
		System.out.println(numbers + "," + numbers.length());
		System.out.println(numbers.substring(1,3));
		System.out.println(numbers.substring(7,7));
		System.out.println(numbers.substring(7));
		
		double d = 3;
		float f = 2f;
		double[] darr = {d,f};
		
		System.out.println(Arrays.toString(darr));
		
		//Math.pow
	}
}