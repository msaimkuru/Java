package org.curlybrace.oopj.ocp1z0_829.ch05.mystudies;

/* Terminal commands to run program
 * curlybrace@saim-MacBook-Pro src % javac org/curlybrace/oopj/ocp1z0_829/ch05/mystudies/Study005_StaticMethodsAndVariables.java
 * curlybrace@saim-MacBook-Pro src % java org.curlybrace.oopj.ocp1z0_829.ch05.mystudies.Study005_StaticMethodsAndVariables      
 */

public class Study005_StaticMethodsAndVariables {
	public static int count = 0;
	
	public Study005_StaticMethodsAndVariables() {
		count++;
	}
	
	public static void main(String[] args) {
		System.out.print("""
		--------------------------------------------------------------------------------
		Static Methods And Variables
		--------------------------------------------------------------------------------
		* Static methods have 2 main purposes;
		1- For Utility or Helper Methods that don't require any object state. Since 
		there is no need to access instance variables, having static methods eliminates
		the need for the caller to instantiate an object just to call the method.
		
		2- For state that is shared by all instances of a class like a counter.
		--------------------------------------------------------------------------------
		Accessing a Static Variable
		--------------------------------------------------------------------------------
		* We put the class name before the static method or static variable to access
		them.
		* We can also use reference to an instance of the class to access static 
		members. In that case compiler checks for the type of the reference and uses
		that instead of the object. So the reference could also be assigned to a null!
		--------------------------------------------------------------------------------		 		
		""");
		System.out.println(String.format("Study005_StaticMethodsAndVariables.count -> %d", Study005_StaticMethodsAndVariables.count));
		var c1 = new Study005_StaticMethodsAndVariables();
		System.out.println(String.format("After creating an instance, c1.count -> %d", c1.count));
		var c2 = new Study005_StaticMethodsAndVariables();
		System.out.println(String.format("After creating an instance, c2.count -> %d", c2.count));
		System.out.println(String.format("Study005_StaticMethodsAndVariables.count -> %d", Study005_StaticMethodsAndVariables.count));
				
		System.out.print("""
				--------------------------------------------------------------------------------
				Let's assign null to the c1 and c2 references. Still we can read static varible 
				via references or the Class.
				--------------------------------------------------------------------------------
				"""
		);		
		c1 = null;
		c2 = null;
		System.out.println(String.format("Study005_StaticMethodsAndVariables.count -> %d", Study005_StaticMethodsAndVariables.count));
		System.out.println(String.format("c1.count -> %d", c1.count));
		System.out.println(String.format("c2.count -> %d", c2.count));
		System.out.println(String.format("Study005_StaticMethodsAndVariables.count -> %d", Study005_StaticMethodsAndVariables.count));		
	}
}
