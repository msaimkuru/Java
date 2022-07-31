package org.curlybrace.oopj.ocp1z0_829.ch06.mystudies.Study007_AbstractClasses.Study007_01_IntroducingAbstractClasses;

/* 
 * Terminal commands to run program
 * curlybrace@saim-MacBook-Pro src % 
 * javac org/curlybrace/oopj/ocp1z0_829/ch06/mystudies/Study007_AbstractClasses/Study007_01_IntroducingAbstractClasses/Canine.java
 * curlybrace@saim-MacBook-Pro src % 
 * java org.curlybrace.oopj.ocp1z0_829.ch06.mystudies.Study007_AbstractClasses.Study007_01_IntroducingAbstractClasses.Canine
 */
abstract class AbsClass1{
	protected abstract void doIt();
}

abstract class AbsClass2 extends AbsClass1{
	@Override
	protected abstract void doIt();
}

public abstract class Canine {
	static {
		System.out.println("""
		--------------------------------------------------------------------------------
		I n t r o d u c i n g   A b s t r a c t   C l a s s e s
		--------------------------------------------------------------------------------
		* When designing a model, we sometimes want to create an entity that cannot be
		instantiated directly. We want other developers to be able to create instances 
		of the subclasses, but perhaps we don't want them to be able to create a parent 
		class instance.
		
		In other words, we want to enforce all objects of references of type of abstract 
		parent classes to have a particular subclass type.
		
		* An abstract class is a class declared with the a b s t r a c t modifier.
		
		* An abstract class cannot be instantiated directly.
		
		* An abstract class can extend a concrete class or an abstract class, and vice 
		versa. 		
		
		--------------------------------------------------------------------------------
		R u l e s   f o r   A b s t r a c t   C l a s s e s
		--------------------------------------------------------------------------------
		1) An abstract class cannot be instantiated directly and may contain 
		a b s t r a c t   m e t h o d s  as well as  c o n c r e t e   m e t h o d s.
						
		2) An abstract class cannot be instantiated directly, but, can only be 
		initialized as part of the instantiation of a non-abstract/concrete subclass.
		
		3) An abstract class can have (but is not required) abstract methods. A
		non-abstract/concrete class cannot have abstract methods.
		
		4) An abstract class can contain all of the same members as a non-abstract class
		, including variables, static and instance methods, constructors, etc.
		
		5) Like the final modifier, the abstract modifier can be placed before or after
		the access modifier in class and method declarations.
		
		6) The abstract modifier cannot be placed after the class keyword in a class
		declaration or after the return type in a method declaration.
		
		7) The first concrete subclass that extends an abstract class is required to
		implement all inherited abstract methods. This includes implementing any
		inherited abstract methods from inherited interfaces.
		
		8) Java does not permit a class or method to be marked both abstract and final.
		
		9) Abstract classes are initialized with constructors in the same way as non-
		abstract classes. For example, if an abstract class does not provide a 
		constructor, the compiler will automatically insert a default no-argument
		constructor.
		
		10) the primary difference between a constructor in an abstract class and a
		non-abstract class is that a constructor in an abstract class can be called only 
		when it is being initialized by a non-abstract subclass. This makes sense, as
		abstract classes cannot be directly instantiated.
		
		--------------------------------------------------------------------------------
		I n t r o d u c i n g   A b s t r a c t   M e t h o d s
		--------------------------------------------------------------------------------				
		* An abstract method is a method declared with the abstract modifier that does 
		not define a body. 
		
		Put another way, an abstract method forces subclasses to override the method. 
		This helps the polymorphism, of course.
		
		By declaring a method abstract, we can guarantee that some version will be 
		available on an instance without having to specify what that version is in the
		abstract parent class.
		
		--------------------------------------------------------------------------------
		R u l e s   f o r   A b s t r a c t   M e t h o d s
		--------------------------------------------------------------------------------
		1- An abstract method is always declared without a body. It also includes a 
		semicolon (;) after the method declaration.
		
		2- Only instance methods can be marked abstract within a class, not variables, 
		constructors, or static methods.
		
		3- An abstract method can only be declared in an abstract class or an interface.
		
		4- A non-abstract (concrete) class that extends an abstract class must implement
		all inherited abstract methods.
		
		5- A method cannot be marked as both abstract and final.
		
		6- A method cannot be marked as both abstract and private.
		
		7- An abstract method can be overridden with another abstract method declaration
		or a concrete method implementation.
		
		8- Overriding an abstract method follows the existing rules for overriding
		methods.
		
		--------------------------------------------------------------------------------
		W h e n   T o   U s e   A b s t r a c t   C l a s s e s
		--------------------------------------------------------------------------------
		An abstract class is most commonly used when we want another class to inherit
		properties of a particular class, but we want the subclass to fill in some of
		the implementation details.
		
		Abstract classes can be used to define a framework that other developers write
		subclasses against.
		
		--------------------------------------------------------------------------------
		E x a m p l e   M o d e l
		--------------------------------------------------------------------------------
		* In the example model here, other developers can create instances of Wolf, Fox,
		or Coyote, but not Canine. Sure, they can pass a variable reference as a Canine, 
		but the underlying object must be a subclass of Canine at runtime.
		--------------------------------------------------------------------------------
		""");
	}
	
	// An abstract method
	public abstract String getSound();
	
	// A concrete method
	public void bark() {
		System.out.println(getSound());
	}
	// 
	/* 
	 * Note: Hey! We can write main() method in an abstract method!
	 */
	public static void main(String[] args) {
		Canine c = new Fox();
		c.bark();
	}
}

class Wolf extends Canine{
	public String getSound() {
		return "Woooooooof!";
	}
}

class Fox extends Canine{
	public String getSound() {
		return "Squeak!";
	}	
}

class Coyote extends Canine{
	public String getSound() {
		return "Roar!";
	}	
}

/*
class FennecFox extends Canine{
	public int getSound() {
		return 10;
	}	
}

DOES NOT COMPILE:
------------------
Reason: Invalid method override for the abstract method getSound() of the parent class: 
non-covariant return types.

error: FennecFox is not abstract and does not override abstract method getSound() in Canine
class FennecFox extends Canine{
^
error: getSound() in FennecFox cannot override getSound() in Canine
	public int getSound() {
	           ^
  return type int is not compatible with String
*/

/*
class ArcticFox extends Canine{}

DOES NOT COMPILE:
-----------------
Reason: It should override abstract method getSound() of the parent class.

error: ArcticFox is not abstract and does not override abstract method getSound() in Canine
class ArcticFox extends Canine{}
^
*/

/*
class DireWolf extends Canine{
	public abstract void rest();
	
	public String getSound() {
		return "Roof!";
	}	
}

DOES NOT COMPILE:
-----------------
Reason: A non-abstract (concrete) class cannot declare an abstract method. 

error: DireWolf is not abstract and does not override abstract method rest() in DireWolf
class DireWolf extends Canine{
^
1 error
*/

/*
class Jackal extends Canine{
	public abstract String name;

	public String getSound() {
		return "Laugh!";
	}	
}

DOES NOT COMPILE:
------------------
Reason: Variables cannot be marked abstract.

error: modifier abstract not allowed here
	public abstract String name;
	                       ^
1 error

*/