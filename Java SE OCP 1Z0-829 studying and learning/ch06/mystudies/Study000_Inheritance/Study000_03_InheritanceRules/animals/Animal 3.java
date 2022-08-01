package org.curlybrace.oopj.ocp1z0_829.ch06.mystudies.Study000_Inheritance.Study000_03_InheritanceRules.animals;

public class Animal {
	static {
		System.out.println("""
		--------------------------------------------------------------------------------		
		 R u l e s   o f   I n h e r i t a n c e
		 --------------------------------------------------------------------------------
		 1) private members are never inherited.
		 
		 2) package members are inherited only if the child class and parent class are 
		 in the same package.
		 
		 3) protected members are inherited by a child-class in any package.
		 
		 4) public members are inherited by a child-class in any package.
		 
		 5) Declaring a variable with the same name as an inherited variable is referred 
		 to as hiding a variable.
		 --------------------------------------------------------------------------------
		""");
	}
	
	/*
	 * As age is marked private, this is not inherited and this is not
	 * directly accessible from the subclasses of Animal.
	 */
	private int age;	
	
	/*
	 * As name is marked protected, this is inherited (directly accessible) 
	 * by the subclasses of Animal and is accessible by the classes in the
	 * same package.
	 */
	protected String name;				
	
	public int getAge() {				// As getAge() is marked public, this is inherited (directly accessible) by the subclasses of Animal.
		return age;						// and as it is public it is actually accessible from every class. And as it returns the value of
	}									// private variable age, this method makes age indirectly accessible.
	
	public void setAge(int newAge) {		// As setAge() is marked public, this is inherited (directly accessible) by the subclasses of Animal.
		age = newAge;					// and as it is public it is actually accessible from every class. And as it sets the value of
	}									// private variable age, this method makes age indirectly accessible and modifiable.	
}