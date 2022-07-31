package org.curlybrace.oopj.ocp1z0_829.ch05.mystudies;

import java.util.Arrays;

/* Terminal commands to run program
 * curlybrace@saim-MacBook-Pro src % javac org/curlybrace/oopj/ocp1z0_829/ch05/mystudies/Study003_MethodsUsingVarargs.java
 * curlybrace@saim-MacBook-Pro src % java org.curlybrace.oopj.ocp1z0_829.ch05.mystudies.Study003_MethodsUsingVarargs      
 */

public class Study003_MethodsUsingVarargs {

	public static String varargsMethod1(int... steps) {
		return steps.length + ", " + Arrays.toString(steps);
	}

	public static String varargsMethod2(int start, int... steps) {
		return start + ", " + steps.length + ", " + Arrays.toString(steps);
	}
	
	/* DOES NOT COMPILE : varargs parameter must be the last parameter
	 * public void varargsMethod3(int... steps, int start) {}
	 */

	/* DOES NOT COMPILE : varargs parameter must be the last parameter
	 * public void varargsMethod4(int... steps, int... start) {}
	 */
	
	public static void main(String[] args) {
		System.out.println("""
		--------------------------------------------------------------------------------
		Rules for Creating a Method with a Varargs Parameter
		--------------------------------------------------------------------------------
		1) A method can have at most one Varargs parameter.
		2) If a method contains a Varargs parameter, it must be the last parameter in
		the list.
		--------------------------------------------------------------------------------
		E X A M P L E 1 (Calling Methods with Varargs)
		--------------------------------------------------------------------------------
		* When calling a method regardless of passing an array or listing the elements 
		of an array for the varargs parameter the method will receive an array. Java
		creates the array for the varargs parameter when we call the method with element 
		list for the vararg parameter.
		* If we omit the varargs parameter when calling the method Java will create an
		array of zero length for the varargs parameter.
		--------------------------------------------------------------------------------
		"""
		);
		
		System.out.println("Calling varargsMethod1(new int[]{30, 50, 20}) --> %s".formatted(varargsMethod1(new int[]{30, 50, 20})));
		System.out.println("Calling varargsMethod1(10, 20, 30) --> %s".formatted(varargsMethod1(10, 20, 30)));
		
		System.out.println("Calling varargsMethod2(0, new int[]{30, 50, 20}) --> %s".formatted(varargsMethod2(0, new int[]{30, 50, 20})));
		System.out.println("Calling varargsMethod2(0, 10, 20, 30) --> %s".formatted(varargsMethod2(0, 10, 20, 30)));

		System.out.println("Calling varargsMethod1() --> %s".formatted(varargsMethod1()));
		
		int[] arr = new int[0];
		
		System.out.println("arr.length --> %s".formatted(arr.length));
		
		try {
			varargsMethod1(null);
		}
		catch(Exception e) {
			e.printStackTrace();
		}/* RUNTIME EXCEPTION : java.lang.NullPointerException: Cannot read the array length because "steps" is null
		  * at org.curlybrace.oopj.ocp1z0_829.ch05.mystudies.Study003_MethodsUsingVarargs.varargsMethod1(Study003_MethodsUsingVarargs.java:13)
		  */
	}
}