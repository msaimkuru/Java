package org.curlybrace.oopj.ocp1z0_829.ch04.mystudies;

/* Terminal commands to run program
 * curlybrace@saim-MacBook-Pro src % javac org/curlybrace/oopj/ocp1z0_829/ch04/mystudies/Study003_StringFormatting.java
 * curlybrace@saim-MacBook-Pro src % java org.curlybrace.oopj.ocp1z0_829.ch04.mystudies.Study003_StringFormatting      
 */

public class Study003_StringFormatting {

	public static void main(String[] args) {
		var fName = "Kate";
		var orderId = 5;
		System.out.println("""
		---------------------------------------- String FORMATTING ----------------------------------------
		* There are methods to format String values using formatting flags.
		* The method parameters are used to construct a formatted String in a single method call,
		rather than via a lot of format and concatenation operations.
		---------------------------------------- COMMON FORMATTING SYMBOLS ----------------------------------------
		%s	Applies to any type, commonly String values
		%d	Applies to integer values like int and long
		%f	Applies to floating-point values like float and double
		%n	Inserts a line break using the system-dependent line separator.
		----------------------------------------------------------------------------------------------------""");
		// All 3 prints the same phrase: Hello Kate, order5 is ready.
		
		// Need to utilize many concatenations without formatting methods provided by String class..
		System.out.println("Hello " + fName + ", order" + orderId + " is ready.");
		
		// No need to utilize concatenations. Utilizes static format() method of String class
		System.out.println(String.format("Hello %s, order%d is ready.", fName, orderId));
		
		// No need to utilize concatenations. Utilizes instance formatted() method of String class
		System.out.println("Hello %s, order%d is ready.".formatted(fName, orderId));
		
		System.out.println("--------------------------------------------------------------------------------");
		var name = "Saim";	// name becomes a String
		var score = 58.25;	// score becomes a double
		var total = 100;		// total becomes an int
		//
		System.out.println("%s:%n    Score: %f out of %d".formatted(name, score, total));
		//
		/* RUNTIME EXCEPTION : java.util.IllegalFormatConversionException: f != java.lang.Integer
		 * Mixing data types may cause exceptions at runtime. This sample throws an exception
		 * because an integer number int is used when expecting a floating point number value.
		 */ 
		var score2 = 58;
		try {
			System.out.println("%s:%n    Score: %f out of %d".formatted(name, score2, total));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		/* RUNTIME EXCEPTION : java.util.IllegalFormatConversionException: d != java.lang.Double
		 * Mixing data types may cause exceptions at runtime. This sample throws an exception
		 * because a floating number double (2.0 here) is used when expecting a integer 
		 * number value.
		 */ 
		var strValid = "Food: %d tons".formatted(2);
		try {
			var strInValid = "Food: %d tons".formatted(2.0);	
		}	
		catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("""
		USING format() method with FLAGS	
		--------------------------------------------------------------------------------
		* Besides supporting symbols, Java also supports optional flags between the % and
		the symbol character.
		* By default, %f displays exactly 6 digits past the decimal.
		* If you want to display only one digit after the decimal, you can use %.1f
		* The format() method relies on rounding rather than truncating	when shortening
		numbers.
		* You can also specify the total length of output by using a number before the 
		decimal point. By default, the method will fill the empty space with blank spaces.
		You can also fill the empty space with zeros by placing a single zero after the
		% symbol
		--------------------------------------------------------------------------------
		""");
		System.out.println("""
		%f		: prints number with 6 digits after decimal point
		%n1.n2f		: prints number with n2 digits after decimal point and a total length of n1 including . and space characters at left if needed
		%0n1f		: prints number with 6 digits after decimal point and a total length of n1 including . and 0 characters at left if needed
		%0n1.n2f	: prints number with n2 digits after decimal point and a total length of n1 including . and 0 characters at left if needed
		%.n2f		: prints number with n2 digits after decimal point
		--------------------------------------------------------------------------------
		""");

		var pi = 3.14159265359;
		
		System.out.format("[%f]%n", pi);					// Prints : [3.141593]
		System.out.println("[%f]".formatted(pi));		// Prints : [3.141593]
		
		System.out.format("[%12.8f]%n", pi);				// Prints : [  3.14159265]
		System.out.format("[%012f]%n", pi);				// Prints : [00003.141593]
		System.out.format("[%012.2f]%n", pi);			// Prints : [000000003.14]
		System.out.format("[%12.2f]%n", pi);				// Prints : [        3.14]
		System.out.format("[%.3f]%n", pi);				// Prints : [3.142]
		
		//
		// if the defined total length is smaller than the output length, it is not a problem
		System.out.format("[%1.3f]%n", 12.2589);				// Prints : [12.259]
		System.out.format("[%1.4f]%n", 12.2589);				// Prints : [12.2589]
	}
}