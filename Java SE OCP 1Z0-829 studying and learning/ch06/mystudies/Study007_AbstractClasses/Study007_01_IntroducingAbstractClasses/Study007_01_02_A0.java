package org.curlybrace.oopj.ocp1z0_829.ch06.mystudies.Study007_AbstractClasses.Study007_01_IntroducingAbstractClasses;

/* 
 * Terminal commands to run program
 * curlybrace@saim-MacBook-Pro src % 
 * javac org/curlybrace/oopj/ocp1z0_829/ch06/mystudies/Study007_AbstractClasses/Study007_01_IntroducingAbstractClasses/Study007_01_02_A0.java
 * curlybrace@saim-MacBook-Pro src % 
 * java org.curlybrace.oopj.ocp1z0_829.ch06.mystudies.Study007_AbstractClasses.Study007_01_IntroducingAbstractClasses.Study007_01_02_A0
 */

abstract class A0$ {
	// 1st static initializer.
	static {
		System.out.println("""
		----------------------------------------------------------------------			
		Abstract class A0$'s 1st static initializer starts.		
		----------------------------------------------------------------------	
		I n f o:
		----------------------------------------------------------------------		
		* An abstract class cannot be instantiated directly, but, can only 
		be initialized as part of the instantiation of a non-abstract
		(concrete) subclass.
		  
		* The primary difference between a constructor in an abstract class
		and a non-abstract (concrete) class is that a constructor in an 
		abstract class can be called only when it is being initialized by a
		non-abstract (concrete) subclass.
		----------------------------------------------------------------------
		Abstract class A0$'s 1st static initializer ends.
		----------------------------------------------------------------------
		"""
		);
	}
	
	// 1st instance initializer
	{
		System.out.println("""
		----------------------------------------------------------------------			
		Abstract class A0$'s 1st instance initializer starts.
		----------------------------------------------------------------------
		Abstract class A0$'s 1st instance initializer ends.
		----------------------------------------------------------------------				
		""");
	}
	
	// no-argument constructor
	A0$(){
		System.out.println("""
		----------------------------------------------------------------------			
		Abstract class A0$'s no-argument constructor starts.
		----------------------------------------------------------------------""");
		// How possible it calls the child method from here? It's about polymorphism.
		abstractMethodOfA0$("abstractMethodOfA0$() called from constructor A0$() runs ");
		//
		privateInstanceMethodOfA0$();
		//
		System.out.println("""
		----------------------------------------------------------------------
		Abstract class A0$'s no-argument constructor ends.
		----------------------------------------------------------------------				
		""");		
	}
	
	// abstract method
	protected abstract void abstractMethodOfA0$(String s);
	
	//
	private void privateInstanceMethodOfA0$() {
		System.out.println("---------------------------------------------------------------------");
		// How possible it calls the child method from here? It's about polymorphism.
		abstractMethodOfA0$("abstractMethodOfA0$() called from privateInstanceMethodOfA0$$() runs ");
		System.out.println("----------------------------------------------------------------------");		
	}
}

class A1 extends A0${
	protected void abstractMethodOfA0$(String s) {
		System.out.println(s + "In concrete implementation of abstractMethodOfA0$() in instance of Class A1.");
	}
}

public class Study007_01_02_A0 extends A0${
	protected void abstractMethodOfA0$(String s) {
		System.out.println(s + "In concrete implementation of abstractMethodOfA0$() in instance of Class Study007_01_02_A0.");
	}
	
	public static void main(String[] args) {
		System.out.println("""
				--------------------------------------------------------------------------
				Creating a new instance of Study007_01_02_A0 which is a concrete child class of A0$ starts.	
				--------------------------------------------------------------------------			
				""");
		
		var o0 = new Study007_01_02_A0();
		
		System.out.println("""
				--------------------------------------------------------------------------
				Creating a new instance of Study007_01_02_A0 which is a concrete child class of A0$ ends.	
				--------------------------------------------------------------------------			
				""");
		//
		System.out.println("""
				--------------------------------------------------------------------------
				Creating a new instance of A1 which is a concrete child class of A0$ starts.	
				--------------------------------------------------------------------------			
				""");
		
		var o1 = new A1();
		
		System.out.println("""
				--------------------------------------------------------------------------
				Creating a new instance of A1 which is a concrete child class of A0$ ends.	
				--------------------------------------------------------------------------			
				""");
		
		/*
		   -----------------
		   DOES NOT COMPILE:
		   -----------------
		   var o1 = new A0$();
		   
		   error: A0$ is abstract; cannot be instantiated
		   var o1 = new A0$();
		            ^
		   -----------------          
		 */
	}
}