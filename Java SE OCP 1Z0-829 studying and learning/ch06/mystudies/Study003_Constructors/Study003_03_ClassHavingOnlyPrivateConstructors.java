package org.curlybrace.oopj.ocp1z0_829.ch06.mystudies.Study003_Constructors;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.TimeZone;

/* Terminal commands to run program
 * curlybrace@saim-MacBook-Pro src % 
 * javac org/curlybrace/oopj/ocp1z0_829/ch06/mystudies/Study003_Constructors/Study003_03_ClassHavingOnlyPrivateConstructors.java
 * curlybrace@saim-MacBook-Pro src % 
 * java org.curlybrace.oopj.ocp1z0_829.ch06.mystudies.Study003_Constructors.Study003_03_ClassHavingOnlyPrivateConstructors     
 */

class ClassHavingOnlyPrivateConstructors {
	static {
		System.out.println("""
		--------------------------------------------------------------------------------
		Classes Having Only private Constructors 
		--------------------------------------------------------------------------------
		1) Having Only private Constructors in a class tell the compiler not to provide 
		a default no-argument constructor. 
		
		It also prevents other classes from instantiating the class.
		
		This is useful when a class has only static methods or static members or the 
		developer wants to have full control of all calls to create new instances of the 
		class.
		
		2) A class which has only private constructors, can not be extended.
		--------------------------------------------------------------------------------
		""");
	}
	
	/*static {
		ClassHavingOnlyPrivateConstructors o1 = new ClassHavingOnlyPrivateConstructors();
	}
	*/
	static {
		// Think that zone id parameter "Europe/Istanbul" is got from a property file.
		ClassHavingOnlyPrivateConstructors o1 = new ClassHavingOnlyPrivateConstructors(ZoneId.of("Europe/Istanbul"));
	}	
	
	private static LocalDate date;
	private static LocalDateTime dateTime;
	private static ZonedDateTime zonedDateTime;
	
	public static LocalDate getDate() {
		return date;
	}

	public static LocalDateTime getDateTime() {
		return dateTime;
	}

	public static ZonedDateTime getZonedDateTime() {
		return zonedDateTime;
	}
	
	private ClassHavingOnlyPrivateConstructors() {
		TimeZone zoneId = TimeZone.getDefault();
		date = LocalDate.now();
		dateTime = LocalDateTime.now();
		zonedDateTime = ZonedDateTime.now();		
	}

	private ClassHavingOnlyPrivateConstructors(ZoneId zoneId) {
		date = LocalDate.now(zoneId);
		dateTime = LocalDateTime.now(zoneId);
		zonedDateTime = ZonedDateTime.of(dateTime, zoneId);
	}
}

/*
	class InvalidClass extends ClassHavingOnlyPrivateConstructors{
	
	}
	
	DOES NOT COMPILE:
	------------------
	error: constructor ClassHavingOnlyPrivateConstructors in class ClassHavingOnlyPrivateConstructors cannot be applied to given types;
	reason: ClassHavingOnlyPrivateConstructors() has private access in ClassHavingOnlyPrivateConstructors
*/

public class Study003_03_ClassHavingOnlyPrivateConstructors{
	public static void main(String[] args) {
		System.out.println(ClassHavingOnlyPrivateConstructors.getZonedDateTime().getZone());
		System.out.println(ClassHavingOnlyPrivateConstructors.getDate());
		System.out.println(ClassHavingOnlyPrivateConstructors.getDateTime());
		System.out.println(ClassHavingOnlyPrivateConstructors.getZonedDateTime());
		/*
		 * ClassHavingOnlyPrivateConstructors o1 = new ClassHavingOnlyPrivateConstructors();
		 * 
		 * DOES NOT COMPILE : The constructor ClassHavingOnlyPrivateConstructors() is not visible
		 */
	}	
}