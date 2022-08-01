package org.curlybrace.oopj.ocp1z0_829.ch04.mystudies;

/* Terminal commands to run program
 * curlybrace@saim-MacBook-Pro src % javac org/curlybrace/oopj/ocp1z0_829/ch04/mystudies/Study006_StringPool.java
 * curlybrace@saim-MacBook-Pro src % java org.curlybrace.oopj.ocp1z0_829.ch04.mystudies.Study006_StringPool      
 */

public class Study006_StringPool {

	public static void main(String[] args) {
		System.out.println("""
		--------------------------------------------------------------------------------
		S T R I N G		P O O L
		--------------------------------------------------------------------------------
		* String pool is also known as intern pool and is a location in JVM
		* String pool concept is a solution for excessive memory usage for repeating
		strings. String pool solves the problem by providing the means for reusing common 
		strings.
		* String pool contains literal values and constants that appear in the program.
		* The intern() method of String forces JVM to use the string pool for a string
		instance itself
		--------------------------------------------------------------------------------
		E X A M P L E S
		--------------------------------------------------------------------------------	
		""");
		
		var x = "Hello World";
		var y = "Hello World";
		
		System.out.println("Example 1) \n" + String.format("x:\"%s\"\ny:\"%s\"\nx == y -> %s", x, y, x == y));
		System.out.println("""
		Here it prints true, because String literals are pooled. The JVM created only one
		literal in memory. The x and y variables both point to the same location in 
		memory.
		--------------------------------------------------------------------------------
		""");

		var x2 = "Hello World";
		var y2 = " Hello World  ".trim();
		
		System.out.println("Example 2) \n" + String.format("x2:\"%s\"\ny2:\"%s\"\nx2 == y2 -> %s", x2, y2, x2 == y2));
		System.out.println("""
		Here it prints false, although x2 and y2 has the same characters. It is because 
		y2 is computed at runtime. Since it is not the same at compile time, a new String 
		object is created for y2.
		--------------------------------------------------------------------------------
		""");

		var x3 = "Hello World";
		var y3 = "Hello ";
		y3 += "World";
		
		System.out.println("Example 3) \n" + String.format("x3:\"%s\"\ny3:\"%s\"\nx3 == y3 -> %s", x3, y3, x3 == y3));
		System.out.println("""
		Here it prints false, although x3 and y3 has the same characters. It is because 
		y3 is applied an += operation and it is just like calling a method and results in
		a new String.
		--------------------------------------------------------------------------------
		""");
		
		var x4 = "Hello World";
		var y4 = new String ("Hello World");
		
		System.out.println("Example 4) \n" + String.format("x4:\"%s\"\ny4:\"%s\"\nx4 == y4 -> %s", x4, y4, x4 == y4));
		System.out.println("""
		Here it prints false, It is because while x4 declaration says to use the string 
		pool the y4 declaration forces JVM to create a new instance of a String.
		--------------------------------------------------------------------------------
		""");

		var x5 = "Hello World";
		var y5 = new String ("Hello World").intern();
		
		System.out.println("Example 5) \n" + String.format("x5:\"%s\"\ny5:\"%s\"\nx5 == y5 -> %s", x5, y5, x5 == y5));
		System.out.println("""
		Here it prints true, It is because x5 declaration says to use the string 
		pool and the y4 declaration forces JVM first to create a new instance of a 
		String but then to intern it and use the string pool.
		--------------------------------------------------------------------------------
		""");		
		
		var s1 = "rat" + 1;
		var s2 = "r" + "a" + "t" + "1";
		var s3 = "r" + "a" + "t" + new String("1");

		System.out.println("Example 6) \n" + String.format("s1:\"%s\"\ns2:\"%s\"\ns1 == s2 -> %s", s1, s2, s1 == s2));
		System.out.println("""
		Here it prints true, It is because s1 and s2 declarations are compile-time 
		constants and "rat1" literal is put in string pool once and s1 and s2 both point
		to the same "rat1" instance.
		-----------------------------------------
		""");
		
		System.out.println(String.format("s1:\"%s\"\ns3:\"%s\"\ns1 == s3 -> %s", s1, s3, s1 == s3));
		System.out.println("""
		Here it prints false, It is because while s1 declaration is a compile-time 
		constant and "rat1" literal is put in string pool s3 declaration has a 
		String constructor. A new String instance is created for s3.
		-----------------------------------------
		""");

		System.out.println(String.format("s1:\"%s\"\ns3:\"%s\"\ns1 == s3.intern() -> %s", s1, s3, s1 == s3.intern()));
		System.out.println("""
		Here it prints true, It is because intern() called on s3 makes s3 refer to the
		same instance which s1 refers to.
		--------------------------------------------------------------------------------
		""");
	}
}