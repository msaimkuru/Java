package org.curlybrace.oopj.ocp1z0_829.ch04.mystudies;

/* Terminal commands to run program
 * curlybrace@saim-MacBook-Pro src % javac org/curlybrace/oopj/ocp1z0_829/ch04/mystudies/Study004_StringBuilderAndItsMethods.java
 * curlybrace@saim-MacBook-Pro src % java org.curlybrace.oopj.ocp1z0_829.ch04.mystudies.Study004_StringBuilderAndItsMethods      
 */

public class Study004_StringBuilderAndItsMethods {

	public static void main(String[] args) {
		var sb1 = new StringBuilder();
		var sb2 = new StringBuilder(5);
		var sb3 = new StringBuilder("animals");
		//
		
		System.out.println("""
		--------------------------------------------------------------------------------
		StringBuilder and Its Methods
		-----------------------------
		Note: In contrary to String, StringBuilder is not I M M U T A B L E.
		--------------------------------------------------------------------------------
		""");		
		System.out.println(String.format("Length, capacity of sb1 is:%d, %d",sb1.length(), sb1.capacity()));	// Prints ->Length, capacity of sb1 is:0, 16
		System.out.println(String.format("Length, capacity of sb2 is:%d, %d",sb2.length(), sb2.capacity()));	// Prints ->Length, capacity of sb2 is:0, 5
		System.out.println(String.format("Length, capacity of sb3 is:%d, %d",sb3.length(), sb3.capacity()));	// Prints ->Length, capacity of sb3 is:7, 23
		
		System.out.println("""
				
		--------------------------------------------------------------------------------
		substring(), indexOf(),length() and charAt() METHODS (doesn't change the object itself)
		--------------------------------------------------------------------------------
		 * substring(), indexOf(),length() and charAt() methods of StringBuilder work exactly the same
		   as in the String class.
		 * Notice that substring() method returns a String rather than a StringBuilder. That is why sb3
		   doesn't change with this operation. 
		 """);
		String sub = sb3.substring(sb3.indexOf("a"), sb3.indexOf("al"));
		int len = sb3.length();
		char ch = sb3.charAt(6);
		
		System.out.println("""
				
		--------------------------------------------------------------------------------
		append() METHOD (changes the object itself, StringBuilder is not immutable)
		--------------------------------------------------------------------------------
		 """);
		var sb4 = new StringBuilder().append(1).append("c");
		sb4.append("-").append(true);
		System.out.println(String.format("sb4: %s", sb4));	// Prints ->sb4: 1c-true
		
		System.out.println("""
				
		--------------------------------------------------------------------------------
		insert() METHOD (changes the object itself, StringBuilder is not immutable)
		--------------------------------------------------------------------------------
		 """);
		var sb5 = new StringBuilder("animals");
		sb5.insert(7,"-");
		sb5.insert(0,"-");
		sb5.insert(4,"-");
		System.out.println(String.format("sb5: %s", sb5));	// Prints ->sb5: -ani-mals-
		//
		try {
			sb5.insert(14,"-");
		}
		catch(Exception e) {
			e.printStackTrace();
		}	// RUNTIME EXCEPTION : java.lang.StringIndexOutOfBoundsException: offset 14, length 10

		System.out.println(String.format("sb5: %s", sb5));	// Prints ->sb5: -ani-mals-
		
		System.out.println("""
				
		--------------------------------------------------------------------------------
		delete() METHOD (changes the object itself, StringBuilder is not immutable)
		--------------------------------------------------------------------------------
		 """);
		var sb6 = new StringBuilder("abcdef");
		sb6.delete(1, 3); // sb = adef
		try {	
			sb6.deleteCharAt(10);
		}
		catch(Exception e) {
			e.printStackTrace();
		}	// RUNTIME EXCEPTION : java.lang.StringIndexOutOfBoundsException: index 10, length 4
		
		/* unlike deleteCharAt() method delete() does not produce runtime exception when you
		 * specify a second parameter that is past the end of the StringBuilder
		 */
		sb6.delete(2, 1000); //	sb = ad
		System.out.println(String.format("sb6: %s", sb6)); // Prints ->sb6: ad
		
		System.out.println("""
				
		--------------------------------------------------------------------------------
		replace() METHOD (changes the object itself, StringBuilder is not immutable)
		-----
		Note:
		-----
		* The replace() method works differently for StringBuilder than it did for String
		* public StringBuilder replace(int startIndex, int endIndex, String newString)
		* First, Java deletes the characters from startIndex to endIndex
		  (endIndex is not included)
		* Then Java inserts the newString at index startIndex  
		--------------------------------------------------------------------------------
		 """);
		var sb7 = new StringBuilder("pigeon dirty");
		sb7.replace(3, 6, "dty");
		System.out.println(String.format("sb7: %s", sb7));	// Prints ->sb7: pigdty dirty
		
		sb7 = new StringBuilder("pigeon dirty");
		sb7.replace(3, 100, "");
		System.out.println(String.format("sb7: %s", sb7));	// Prints ->sb7: pig

		System.out.println("""
				
		--------------------------------------------------------------------------------
		reverse() METHOD (changes the object itself, StringBuilder is not immutable)
		--------------------------------------------------------------------------------
		 """);
		var sb8 = new StringBuilder("ABC 123");
		sb8.reverse();
		System.out.println(String.format("sb8: %s", sb8));	// Prints ->sb8: 321 CBA
		
		System.out.println(String.format("sb8.toString(): %s", sb8.toString()));	// Prints ->sb8.toString(): 321 CBA	
	}
}