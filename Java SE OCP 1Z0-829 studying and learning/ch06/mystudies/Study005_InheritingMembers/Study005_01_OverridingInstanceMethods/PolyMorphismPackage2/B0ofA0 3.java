package org.curlybrace.oopj.ocp1z0_829.ch06.mystudies.Study005_InheritingMembers.Study005_01_OverridingInstanceMethods.PolyMorphismPackage2;

import org.curlybrace.oopj.ocp1z0_829.ch06.mystudies.Study005_InheritingMembers.Study005_01_OverridingInstanceMethods.PolyMorphismPackage1.A0;

/* 
 * Terminal commands to run program
 * curlybrace@saim-MacBook-Pro src % 
 * javac org/curlybrace/oopj/ocp1z0_829/ch06/mystudies/Study005_InheritingMembers/Study005_01_OverridingInstanceMethods/PolyMorphismPackage2/B0ofA0.java
 * curlybrace@saim-MacBook-Pro src % 
 * java org.curlybrace.oopj.ocp1z0_829.ch06.mystudies.Study005_InheritingMembers.Study005_01_OverridingInstanceMethods.PolyMorphismPackage2.B0ofA0
 */

/* -------
 * Note:
 * -------
 *	It is important to understand that it is the type of the reference variable—not
	the type of the object that it refers to—that determines what members can be
	accessed. That is, when a reference to a subclass object is assigned to a
	superclass reference variable, you will have access only to those parts of the
	object defined by the superclass
 */

/*
------------------------------------	-------------------------------------------------------
 						C l a s s   M e m b e r   A c c e s s
------------------------------------	-------------------------------------------------------
									Private 		No Modifier 			Protected 		Public
												(Package-private)
------------------------------------	-------------------------------------------------------
Same class 							Yes 			Yes 					Yes 			Yes
------------------------------------	-------------------------------------------------------
Same package subclass 				No 			Yes 					Yes 			Yes
------------------------------------	-------------------------------------------------------
Same package non-subclass 			No 			Yes 					Yes 			Yes
------------------------------------	-------------------------------------------------------
Different package subclass 			No 			No 					Yes 			Yes
------------------------------------	-------------------------------------------------------
Different package non-subclass 		No 			No 					No 				Yes
------------------------------------	-------------------------------------------------------
 */
public class B0ofA0 extends A0{
	String getPackagePrivateInstanceString1() {
		return "B0ofA0 redeclared method getPackagePrivateInstanceString1(): ";
	}

	void setPackagePrivateInstanceString1(String s) {
		System.out.println("B0ofA0 redeclared method setPackagePrivateInstanceString1(String)" + s);
	}

	@Override
	protected String getProtectedInstanceString1() {
		return protectedInstanceString1;
	}

	@Override
	protected void setProtectedInstanceString1(String protectedInstanceString1) {
		this.protectedInstanceString1 = "B0ofA0.setProtectedInstanceString1(): " + protectedInstanceString1 + " protectedInstanceString1";		
	}
	
	public static void main(String[] args) {
		/*
		 * This is an application of polymorphism.
		 */
		A0 a0 = new B0ofA0();
		A0 a0_2 = new A0();
		//a0.setPackagePrivateInstanceString1(" sets..");
		//System.out.println(a0.getPackagePrivateInstanceString1());
		
		//a0_2.setProtectedInstanceString1(" sets..");
		/*
		a0.setProtectedInstanceString1(" sets..");

         error: setProtectedInstanceString1(String) has protected access in ClassA0
		 a0.setProtectedInstanceString1(" sets..");
		   ^
		*/
		
		/*
		 * Reason: The method getProtectedInstanceString1() from the type ClassA0 is not visible
		
		System.out.println(a0.getProtectedInstanceString1());
         
         error: getProtectedInstanceString1() has protected access in ClassA0
		 System.out.println(a0.getProtectedInstanceString1());
		                      ^
         */
		
		B0ofA0 b0ofa0 = new B0ofA0();
		System.out.println(b0ofa0.getProtectedInstanceString1());
		b0ofa0.setProtectedInstanceString1("sets");
		System.out.println(b0ofa0.getProtectedInstanceString1());
		
		System.out.println();
		
		b0ofa0.setPackagePrivateInstanceString1("...");
		System.out.println(b0ofa0.getPackagePrivateInstanceString1());
	}
}