package org.curlybrace.oopj.ocp1z0_829.ch04.mystudies;

/* Terminal commands to run program
 * curlybrace@saim-MacBook-Pro src % javac org/curlybrace/oopj/ocp1z0_829/ch04/mystudies/Study002_ImportantStringMethods.java
 * curlybrace@saim-MacBook-Pro src % java org.curlybrace.oopj.ocp1z0_829.ch04.mystudies.Study002_ImportantStringMethods      
 */

public class Study002_ImportantStringMethods {
	public static void main(String[] args) {
		var name = "animals";
		System.out.println("""
		-----------------------------------------------------------------------------------------------
		A B O U T  String I M M U T A B I L I T Y:
		-----------------------------------------------------------------------------------------------
		* String is immutable (unchangeable).
		* This means calling a method on a String will return a different String object rather than
		changing the value of the object referred to by the original String reference.
		-----------------------------------------------------------------------------------------------	
		""");		
		//
		System.out.println("--------------------String method length()--------------------");
		System.out.println("1)" + name.length());	// Prints ->7
		//
		System.out.println("--------------------String method charAt()--------------------");
		System.out.println("1)" + name.charAt(0));	// Prints ->a
		System.out.println("2)" + name.charAt(6));	// Prints ->s
		try {
			System.out.println("3)" + name.charAt(7));	// RUNTIME EXCEPTION : java.lang.StringIndexOutOfBoundsException: String index out of range: 7
		}
		catch(Exception e) {
			System.out.print("3)"); 
			e.printStackTrace();
		}
		System.out.println("--------------------String method indexOf()--------------------");
		System.out.println("1)" + name.indexOf('a'));	// Prints ->0
		System.out.println("2)" + name.indexOf("al"));	// Prints ->4
		System.out.println("3)" + name.indexOf('a', 4));	// Prints ->4
		System.out.println("4)" + name.indexOf("al", 111));	// Prints ->-1
		System.out.println("5)" + name.indexOf(32768));	// Prints ->-1
		System.out.println("6)" + name.indexOf("ax"));	// Prints ->-1
		
		System.out.println("--------------------String method substring()--------------------");
		System.out.println("""
		-----------------------------------------------------------------------------------------------
		substring() method:
		-----------------------------------------------------------------------------------------------
		1) public String substring(int beginIndex): Returns substring from the original string starting 
		from the beginIndex.
		2) public String substring(int beginIndex, int endIndex): Returns substring from the original 
		string starting from the beginIndex up to the endIndex but endIndex is not included.
		-----------------------------------------------------------------------------------------------	
		""");

		System.out.println("1)" + name.substring(0,0).isEmpty() + "-" + name.substring(0,0).isBlank());	// Prints ->true-true
		System.out.println("1)" + name.substring(3));	// Prints ->mals
		System.out.println("2)" + name.substring(name.indexOf('m')));	// Prints ->mals
		System.out.println("3)" + name.substring(3, 4));	// Prints ->m
		System.out.println("4)" + name.substring(3, 7));	// Prints ->mals		
		System.out.println("5)" + name.substring(3, 3));	// Prints empty string					
		try {
			System.out.println("6)" + name.substring(3, 2));		
		}
		catch(Exception e) {
			System.out.print("6)"); 
			e.printStackTrace();
		}	// RUNTIME EXCEPTION : java.lang.StringIndexOutOfBoundsException: begin 3, end 2, length 7
		
		try {
			System.out.println("7)" + name.substring(3, 8));			
		}
		catch(Exception e) {
			System.out.print("7)"); 
			e.printStackTrace();
		}	// RUNTIME EXCEPTION : java.lang.StringIndexOutOfBoundsException: begin 3, end 8, length 7
		
		System.out.println("--------------------String method toLowerCase() and toUpperCase--------------------");
		System.out.println("1)" + name.toUpperCase());	// Prints ->ANIMALS
		System.out.println("2)" + name.toLowerCase());	// Prints ->animals		
		
		System.out.println("--------------------String method equals() and equalsIgnoreCase()--------------------");
		System.out.println("1)" + "abc".equals("ABC"));	// Prints ->false
		System.out.println("2)" + "ABC".equals("ABC"));	// Prints ->true
		System.out.println("3)" + "abc".equalsIgnoreCase("ABC"));	// Prints ->true
		
		System.out.println("--------------------String method startsWith(), endsWith() and contains()--------------------");
		System.out.println("1)" + "abc".startsWith("a"));	// Prints ->true
		System.out.println("2)" + "abc".startsWith("A"));	// Prints ->false
		System.out.println("3)" + "abc".endsWith("c"));	// Prints ->true
		System.out.println("4)" + "abc".endsWith("C"));	// Prints ->false
		System.out.println("5)" + "abc".contains("c"));	// Prints ->true
		System.out.println("6)" + "abc".contains("C"));	// Prints ->false		
		
		System.out.println("--------------------String method replace()--------------------");
		System.out.println("1)" + "abcabc".replace('a','A'));	// Prints ->AbcAbc
		System.out.println("2)" + "abcabc".replace("a","A"));	// Prints ->AbcAbc
		System.out.println("3)" + "abcabc".replace("ab","AB"));	// Prints ->ABcABc	
		System.out.println("4)" + "abcabc".replace("x","y"));	// Prints ->abcabc
		
		System.out.println("--------------------String method trim(), strip(), stripLeading(), stripTrailing()--------------------");
		String textToRemoveWhitespaces = " abc\t\r\n ";
		System.out.println("""
		-----------------------------------------------------------------------------------------------
		trim() and strip() methods:
		-----------------------------------------------------------------------------------------------
		1) 2 methods remove whitesapces(tab, space, carriage return and new line characters) from the 
		beginning and end of a string.
		2) strip() is the same as trim() except strip() also supports Unicode.
		-----------------------------------------------------------------------------------------------	
		""");		
		System.out.println("1)" + textToRemoveWhitespaces.trim());	// Prints ->abc
		System.out.println("2)" + textToRemoveWhitespaces.strip());	// Prints ->abc
		System.out.println("3)" + textToRemoveWhitespaces.stripLeading());	// Prints ->abc(with tab, carriagereturn and linefeed at end)	
		System.out.println("4)" + textToRemoveWhitespaces.stripTrailing());	// Prints ->" abc"
		
		System.out.println("--------------------String INDENTATION METHODS-------------------");
		System.out.println("--------------------String method indent(), stripInddent()--------------------");
		System.out.println("""
				---------------------------------------------------------------------------------------------
				public String indent(int numberSpaces) method()
				---------------------------------------------------------------------------------------------
				Note: whitespaces consist of spaces, tabs and newlines (carriagereturns or linefeeds).
				---------------------------------------------------------------------------------------------
				The indent() method adds the same number of blank spaces to the beginning of each line if you 
				pass a positive number. If you pass a negative number, it tries to remove that number of
				whitespace characters from the beginning of the line. If you pass zero the indentation will 
				not change.
				
				If you call indent() with a negative number and try to remove more whitespace characters than
				are present at the beginning of the line, Java will remove all that it can find.
				
						
				indent() method also normalizes whitespace characters by 
					* adding a line break to the end of the string if not already there
					* any line breaks are converted to the \n format regardless of the OS which uses 
					\r\n or \n.
				---------------------------------------------------------------------------------------------
				stripIndent() method()
				---------------------------------------------------------------------------------------------
				This method gets rid of all incidental whitespaces. This means that all non-blank lines are
				shifted left so the same number of whitespace characters are removed from each line. Like 
				indent() \r\n is turned into \n. However, the stripIndent() method does not add a trailing 
				line break if it is missing.
				"""
				);
		var textBlock = """
				a
				 b
				c""";
		var text = " a\n" +
				   "  b\n" +
				   " c";
		System.out.println("01)" + textBlock.length());	// Prints ->6
		System.out.println("02)" + text.length());	// Prints ->9

		System.out.println("03)\n" + textBlock.indent(1));	
		System.out.println("03)" + textBlock.indent(1).length());	// Prints ->10
		System.out.println("04)\n" + text.indent(1));
		System.out.println("04)" + text.indent(1).length());	// Prints ->13
		System.out.println("05)\n" + textBlock.indent(-1));
		System.out.println("05)" + textBlock.indent(-1).length());	// Prints ->6
		System.out.println("06)\n" + text.indent(-1));
		System.out.println("06)" + text.indent(-1).length());	// Prints ->7
		System.out.println("07)\n" + text.indent(-2));
		System.out.println("07)" + text.indent(-2).length());	// Prints ->6		
		System.out.println("08)\n" + text.indent(-200));
		System.out.println("08)" + text.indent(-200).length());	// Prints ->6
		
		System.out.println("09)\n" + textBlock.stripIndent());
		System.out.println("09)" + textBlock.stripIndent().length());	// Prints ->6
		System.out.println("10)\n" + text.stripIndent());
		System.out.println("10)" + text.stripIndent().length());	// Prints ->6
		
		System.out.println("--------------------String method translateEscapes()--------------------");
		var str = "1\\t2";
		System.out.println("1)" + str);	// Prints ->1\t2
		System.out.println("2)" + str.translateEscapes());	// Prints ->1	2	

		System.out.println("--------------------String method isEmpty(), isBlank()--------------------");
		System.out.println("1)" + " ".isEmpty());	// Prints false
		System.out.println("2)" + "".isEmpty());	// Prints true
		System.out.println("3)" + " ".isBlank());	// Prints true
		System.out.println("4)" + "".isBlank());	// Prints true
	}	
}