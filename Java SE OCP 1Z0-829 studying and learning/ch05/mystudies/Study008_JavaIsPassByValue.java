package org.curlybrace.oopj.ocp1z0_829.ch05.mystudies;

/* Terminal commands to run program
 * curlybrace@saim-MacBook-Pro src % javac org/curlybrace/oopj/ocp1z0_829/ch05/mystudies/Study008_JavaIsPassByValue.java
 * curlybrace@saim-MacBook-Pro src % java org.curlybrace.oopj.ocp1z0_829.ch05.mystudies.Study008_JavaIsPassByValue      
 */

public class Study008_JavaIsPassByValue {
	static {
	System.out.println("""
	--------------------------------------------------------------------------------
	J a v a  I s  a  P a s s  b y  V a l u e  L a n g u a g e 
	--------------------------------------------------------------------------------	
	* Java uses pass-by-value to get data into a method.
	* Assigning a new primitive or reference to a parameter doesn't change the 
	caller.
      In pass by value languages when calling a method a copy of variable is made 
	and the method parameter receives that copy. So, assignments made in method to 
	the parameter doesn't affect caller.
	--------------------------------------------------------------------------------	
	""");	
	}

	/* In this method assignment is made to the primitive num parameter which is a 
	 * copy of the caller's primitive argument. So the variable num of method main is 
	 * not affected, it has still the value of 5.
     */
	public static void passByValueExample1(int num) {
		num = num + 1; // here num is a primtive type copy of the calling method's argument.
	}

	/* In this method assignment is made to the reference-type s parameter which is a 
	 * copy of the caller's reference-typw argument. Before this assignment, it holds
	 * the same object address which the argument has. After this assignment it holds
	 * a new address, but the variable oldString of method main is not affected, it 
	 * still points to object "Old String".
     */	
	public static void passByValueExample2(String s) {
		s = "New String"; // here s is a reference type copy of the calling method's argument.
	}	
	
	/* In this method instead of an assignment on parameter (a-copy-of argument) a
	 * method call on parameter is made. Parameter holds the same address with the 
	 * argument so they point to the same StringBuilder object. StringBuilder is not
	 * immutable, so append() method changes its contents. That's why object pointed 
	 * to by variable sb of method main now has a different content.
     */	
	public static void passByValueExample3(StringBuilder s) {
		s.append(" and had some experience"); // here s is a reference type copy of the calling method's argument.
	}		
	
	public static void main(String[] args) {
		int num = 5;
		// Example 1
		passByValueExample1(num);
		System.out.println("E X A M P L E  1\n--------------------\n" + "num->" + num);
		
		// Example 2
		String oldString = "Old String";
		System.out.println("--------------------\nE X A M P L E  2\n--------------------\n" + "oldString->" + oldString);
		passByValueExample2(oldString);
		System.out.println("oldString->" + oldString);
		
		// Example 3
		StringBuilder sb = new StringBuilder("Just Born");
		System.out.println("--------------------\nE X A M P L E  3\n--------------------\n" + "sb->" + sb);
		passByValueExample3(sb);
		System.out.println("sb->" + sb);		
	}
}