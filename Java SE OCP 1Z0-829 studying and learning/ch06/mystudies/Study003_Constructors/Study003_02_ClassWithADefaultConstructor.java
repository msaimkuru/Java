package org.curlybrace.oopj.ocp1z0_829.ch06.mystudies.Study003_Constructors;

/* Terminal commands to run program
 * curlybrace@saim-MacBook-Pro src % 
 * javac org/curlybrace/oopj/ocp1z0_829/ch06/mystudies/Study003_Constructors/Study003_02_ClassWithADefaultConstructor.java
 * curlybrace@saim-MacBook-Pro src % 
 * java org.curlybrace.oopj.ocp1z0_829.ch06.mystudies.Study003_Constructors.Study003_02_ClassWithADefaultConstructor    
 */

class AnotherClassWithADefaultConstructor{}

class ClassWithoutADefaultConstructor1{
	public ClassWithoutADefaultConstructor1(){}
}

class ClassWithoutADefaultConstructor2{
	public ClassWithoutADefaultConstructor2(boolean b){}
}

class ClassWithoutADefaultConstructor3{
	private ClassWithoutADefaultConstructor3(){}
}

public class Study003_02_ClassWithADefaultConstructor {
	static {
		System.out.println("""
		--------------------------------------------------------------------------------
		D E F A U L T    C O N S T R U C T O R (aka. default no-argument constructor)
		--------------------------------------------------------------------------------
		* ClassWithADefaultConstructor() default constructor is called.
		
		* If we don't include any constructors in the class, Java will create one for us
		without any parameters and with an empty code block. Actually not an empty body, 
		but having only a call super() statement which calls the default no-argument 
		constructor of the direct parent class.
		
		Java adds this constructor not in the .java file but in the compiled .class 
		file.
		
		This Java-created constructor is called the default constructor. It is also
		referred to as default no-argument constructor.
		--------------------------------------------------------------------------------
		""");		
	}
	
	public static void main(String[] args) {
		var o1 = new Study003_02_ClassWithADefaultConstructor();
		
		new AnotherClassWithADefaultConstructor();
		
		new ClassWithoutADefaultConstructor1();

		/*
		 * new ClassWithoutADefaultConstructor2();
		 * 
		 * -----------------
		 * DOES NOT COMPILE:
		 * -----------------
		 * The constructor ClassWithoutADefaultConstructor2() is undefined
		 */
		
		/*
		 * new ClassWithoutADefaultConstructor3();
		 * 
		 * -----------------
		 * DOES NOT COMPILE:
		 * -----------------
		 * The constructor ClassWithoutADefaultConstructor3() is undefined
		 */
	}
}