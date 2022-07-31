package org.curlybrace.oopj.ocp1z0_829.ch06.mystudies.Study008_CreatingImmutableObjects;

import java.util.ArrayList;
import java.util.List;

public final class A0 {
	static {
		System.out.println("""
		--------------------------------------------------------------------------------
		I m m u t a b l e   O b j e c t s
		--------------------------------------------------------------------------------
		* An immutable object is one that cannot change state after it is created.
		
		* The immutable objects pattern is an object-oriented design pattern.
		
		* Immutable objects are helpful when writing secure code.
		
		* Immutable objects simplify code when dealing with concurrency since they can 
		be easily shared between multiple threads.
		
		--------------------------------------------------------------------------------
		R u l e s   for   D e c l a r i n g   I m m u t a b l e   C l a s s e s
		--------------------------------------------------------------------------------
		1) Mark the class as final or make all of the constructors private.
		
		(This prevents anyone from creating a mutable subclass)
		
		2) Mark all the instance variables private and final.
		
		3) Don't define any setter methods.
		
		(2nd and 3rd rules ensure that callers don't make changes to instance variables.
		
		4) Don't allow referenced mutable objects to be modified.
		
		(This means we shouldn't expose a getter method for mutable instance fields.)
		
		5) Use a constructor to set all properties of the object, making a copy if 
		needed. 
		
		Explanation:
		------------
		If a member is a reference type and it is supplied by the caller as a parameter
		to the constructor, then the caller can modify that object with the reference.
		
		Instead of using the reference type supplied by the caller we can make a copy 
		of the object using that reference to make the object immutable.
		--------------------------------------------------------------------------------
		E X A M P L E : C l a s s   A0   i s   n o t   I m m u t a b l e 
		--------------------------------------------------------------------------------
		1st Thing That Makes This Class NOT_Immutable (that is, mutable)
		--------------------------------------------------------------------------------
			First 3 rules are followed, but 4th rule is not followed:
			
			As favoriteTeams member/variable is a mutable object and can be accessed 
			through a getter method:
					public List<String> getFavoriteTeams().
			
			To make Class A0 immutable we could apply one of 2 strategies:
		----------------------------------------------------------
		Strategy 1: Use delegate or wrapper methods to read data
		----------------------------------------------------------
			by providing 2 methods below;
			 i) public int getFavoriteTeamsCount{ 
					return favoriteTeams.size(); 
				}
			ii) public String getFavoriteTeamsItem (int index){ 
					return favoriteTeams.get(index); 
				}
		
		----------------------------------------------------------
		Strategy 2: Use Copy-on-Read Getter Method to read data
		----------------------------------------------------------	
			This approach returns a copy of the requested mutable 
			object/variable instead of the mutable object/variable.
			
			This can be an expensive operation if called frequently
			by the caller.
	
			public ArrayList<String> getFavoriteTeams(){
				return new ArrayList<String>(this.favoriteTeams);
			}		
		--------------------------------------------------------------------------------
		--------------------------------------------------------------------------------
		2nd Thing That Makes This Class NOT_Immutable (that is, mutable)
		--------------------------------------------------------------------------------
			5th rule is not followed.
	
			As favoriteTeams member/variable is a mutable object and reference to it can 
			be provided through the constructor: 
					public A0(ArrayList<String> favoriteTeams)
			
			To make Class A0 immutable we could perform a defensive copy	 in the 
			constructor.	
		--------------------------------------------------------------------------------
		Performing a Defensive Copy:
		--------------------------------------------------------------------------------
			Do not directly assign the reference provided by the caller. Instead assign 
			the reference of a copy.
	
			public A0(ArrayList<String> favoriteTeams) {
				if(favoriteTeams == null || favoriteTeams.size() == 0) 
					throw new RuntimeException("favoriteTeams required!");
				this.favoriteTeams = new ArrayList<String>(favoriteTeams);
			}		
		--------------------------------------------------------------------------------			
		""");
	}
	
	private final ArrayList<String> favoriteTeams;
	
	public A0() {
		this.favoriteTeams = new ArrayList<String>();
		this.favoriteTeams.add("FB");
	}

	public A0(ArrayList<String> favoriteTeams) {
		if(favoriteTeams == null || favoriteTeams.size() == 0) 
			throw new RuntimeException("favoriteTeams required!");
		this.favoriteTeams = favoriteTeams; // This makes A0 not-immutable (that is, mutable)
		//this.favoriteTeams = new ArrayList<String>(favoriteTeams);
	}
	
	public List<String> getFavoriteTeams(){
		return this.favoriteTeams;	// This makes A0 not-immutable (that is, mutable)
	}
	
	public static void main(String[] args) {
		var o1 = new A0();
		System.out.println(o1.getFavoriteTeams());	// Prints-->[FB]
		
		/*
		 * adds an element to the favoriteTeams member of object o1
		 * by means of the getter method.
		 * 
		 * this means o1 changes. So A0 is not immutable (that is, mutable)
		 */
		o1.getFavoriteTeams().add("GS");				// 
		System.out.println(o1.getFavoriteTeams());	// Prints-->[FB, GS]
		
		/*
		 * adds an element to the favoriteTeams member of object o1
		 * by means of the reference-type parameter of the constructor.
		 * 
		 * this means o1 changes. So A0 is not immutable. (that is, mutable)
		 */		
		var ref = new ArrayList<String>();
		ref.add("FB");
		o1 = new A0(ref);
		System.out.println(o1.getFavoriteTeams());	// Prints-->[FB]
		ref.add("GS");
		System.out.println(o1.getFavoriteTeams());	// Prints-->[FB, GS]
	}
}