package org.curlybrace.oopj.ocp1z0_829.ch06.mystudies.Study003_Constructors;

/* Terminal commands to run program
 * curlybrace@saim-MacBook-Pro src % 
 * javac org/curlybrace/oopj/ocp1z0_829/ch06/mystudies/Study003_Constructors/Study003_01_DeclaringConstructors.java
 * curlybrace@saim-MacBook-Pro src % 
 * java org.curlybrace.oopj.ocp1z0_829.ch06.mystudies.Study003_Constructors.Study003_01_DeclaringConstructors    
 */

public class Study003_01_DeclaringConstructors {
	static {
		System.out.println("""
		--------------------------------------------------------------------------------
		C O N S T R U C T O R S
		--------------------------------------------------------------------------------
		What Is a Constructor?
		--------------------------------------------------------------------------------
		A constructor is a special method that matches the name of the class and has no
		return type. It is called with the new keyword to create a new instance of the 
		class.
		
		To create an object is called instantiation. By help of constructors we create
		new instances of classes called objects. When we write new followed by the name
		of the class that we want to instantiate the constructor is called.
		
		When Java sees the new keyword, it allocates memory for the new object. It then
		looks for a constructor with a matching signature and calls it.
		--------------------------------------------------------------------------------
		R u l e s   f o r   C o n s t r u c t o r s
		--------------------------------------------------------------------------------
		1) The name of the constructor must be the same of the Class name.
		
		2) Constructors don't and can't have any return type, not even void.
		
		3) A class can have multiple constructors as long as each constructor has a
		unique constructor signature.
		
		4) CONSTRUCTOR OVERLOADING:
		
		Like methods with the same name but different signatures, declaring multiple
		constructors with different signatures is called CONSTRUCTOR OVERLOADING.
		
		5) COMPILER ENHANCEMENTS 1 (DEFAULT NO-ARGUMENT CONSTRUCTOR):
		
		Every class in Java has a constructor, whether you code one or not. Compiler 
		inserts the default (no-arguments) constructor when no constructors are
		defined by the developer.
		
		!!!It doesn't insert a default constructor if there is any constructor defined.
		
		The default constructor has an empty parameter list and an empty body. Actually
		not an empty body, but having only a call super() statement which calls the
		default no-argument constructor of the direct parent class.
		
		The default constructor is added automatically by the compiler (when there is 
		no user defined constructor) to the .class file. So this auto-generated default 
		constructor isn't seen on .java source files.
		
		6) Constructors cannot call itself.
		
		7) Java doesn't allow cyclic constructor calls. It doesn't compile if there is a
		cyclic constructor call.
		
		8) The first line of every constructor is a call either
				to a parent constructor using super([parameters]) or 
				to an overloaded constructor using this([parameters])
		
		9) Rule about this() call:
		--------------------------
		The first statement of every constructor is either a call to a parent 
		constructor using super([parameters]) or another constructor in the class using 
		this([parameters]).
				
		If a constructor calls this([parameters]) then this([parameters]) call must be 
		the first statement of the constructor. And there can only be once of a
		this([parameters]) call in a constructor.
		
		10) Rule about super() call:
		--------------------------
		The first statement of every constructor is either a call to a parent 
		constructor using super([parameters]) or another constructor in the class using 
		this([parameters]).
		
		If a constructor calls super([parameters]) then super([parameters]) call must be 
		the first statement of the constructor. And there can only be once of a 
		super([parameters]) call in a constructor.
		
		The call to super([parameters]) always refers to the most direct Parent.
		--------------------------------------------------------------------------------
		
		11) COMPILER ENHANCEMENTS 2:
		 
		If we don't explicitly call this([parameters]) or super([parameters]) at the 
		first line of a constructor, Java compiler automatically inserts a call to the 
		no-argument constructor super() as the first line of the constructor.
		
		If our class doesn't explicitly extend another class than it implicitly
		extends java.lang.Object class. And if we don't explicitly call 
		this([parameters]) or super([parameters]) at the first line of a constructor
		in this class, then java automatically inserts a super() call which calls
		the no-argument constructor of java.lang.Object.
		
		-----
		NOTE:
		-----
		Let's say we have a class that has constructors but doesn't include a no 
		argument constructor. If we define a subclass with no constructors, or define 
		a subclass with a constructor that doesn't include a super([parameters]) call,
		then this subclass C A N N O T C O M P I L E !!!
		"""
		);
	}
	
	public Study003_01_DeclaringConstructors(){
		/*
		 this();
		 
		 DOES NOT COMPILE:
		 ------------------
		 
		 error: recursive constructor invocation
	     public Study003_01_DeclaringConstructors(){
	            ^
 		 */
		System.out.println("""
				--------------------------------------------------------------------------------------------------------------------
				------------------------------ Now In Constructor: Study003_01_DeclaringConstructors() ------------------------------
				Now In Constructor: Study003_01_DeclaringConstructors()
				
				As this class doesn't explicitly extend a class, it implicitly extends java.lang.Object class. 
				And as we don't have an explicit super([parameters]) or this ([parameters]) call in this 
				constructor Java automatically inserts a super() call in the first line of this constructor 
				which calls the no-argument constructor of java.lang.Object
				--------------------------------------------------------------------------------------------------------------------""");
	}
	
	//Overloading constructor 1
	public Study003_01_DeclaringConstructors(String s){
		System.out.println("Now In Constructor: Study003_01_DeclaringConstructors(String)-->" + s );
		System.out.println("----------------------------------------");
		/*
		 this();
		 
		 DOES NOT COMPILE: Constructor call must be the first statement in a constructor
		 --------------------------------------------------------------------------------
		 error: call to this must be first statement in constructor
		 this();
		     ^
		 */ 		
	}

	//Overloading constructor 2
	public Study003_01_DeclaringConstructors(String s1, String s2){
		this("Constructor called from constructor Study003_01_DeclaringConstructors(String, String)");
		System.out.println("Now In Constructor: Study003_01_DeclaringConstructors(String, String)-->" + s1 + ", " + s2 );
		System.out.println("----------------------------------------");
	}
	
	public static void main(String[] args) {
		var o1 = new Study003_01_DeclaringConstructors();	
		var o2 = new Study003_01_DeclaringConstructors("Overloading constructor 1 called by new");	
		var o3 = new Study003_01_DeclaringConstructors("Overloading constructor 2 called by new","Trying Out My Best");
		
		System.out.println();
		System.out.println("---------------------------------------- Creating child objects ----------------------------------------");
		var co1 = new C1(0);
	}
}

class C1 extends Study003_01_DeclaringConstructors{
	public C1(int x) {
		super();
		System.out.println("Now In Constructor: C1(int)");
		System.out.println("--------------------------------------------------------------------------------------------------------------------");
	}
}

/*
 class C2OfC1 extends C1{ 

 }

 DOES NOT COMPILE: 
 ------------------
 Java compiler inserts a default no-argument constructor into C2OfC1 as below:
   
 public C2OfC1(){ super();}
   
 Since parent class doesn't have no-argument constructor it doesn't compile. 
 */

//This compiles.
class C2OfC1 extends C1{
	public C2OfC1() {
		super(0);
	}
}