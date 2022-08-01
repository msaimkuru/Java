package org.curlybrace.oopj.ocp1z0_829.ch06.mystudies.Study001_Inheritance;

/**
 * @author	Saim Kuru
 * @version 1.0
 * ------------
 * Objectives:
 * ------------ 
 * Understanding Inheritance of Both Static and Instance variables.
 * Understanding Variable Hiding 
 * ------------
 * Difficulty: Medium
 * ------------ 
 */

/* Terminal commands to run program
 * curlybrace@saim-MacBook-Pro src % javac org/curlybrace/oopj/ocp1z0_829/ch06/mystudies/Study001_Inheritance/A1.java
 * curlybrace@saim-MacBook-Pro src % java org.curlybrace.oopj.ocp1z0_829.ch06.mystudies.Study001_Inheritance.A1      
 */

class A0{
	//ii: instance variable i, ij: instance variable j
	//si: static variable i, sj: static variable j
	public String ii = "ii: initialized in ClassA0";			// ii is inherited by subclass A1 and A2
	public static String si = "si: initialized in ClassA0";	// si is inherited by subclass A1 and A2
	
	public String ij = "ij: initialized in ClassA0"; 			// ij is inherited by A2, is not inherited by subclass A1, it 's hidden by subclass A1
	public static String sj = "sj: initialized in ClassA0";	// sj is inherited by A2, is not inherited by subclass A1, it 's hidden by subclass A1
}


public class A1 extends A0 {
	/*
	 *  We inherit only ii and si from ClassA0.
	 *  We don't inherit ij and sj from ClassA0, we hide them in this subclass.
	 *  So any change made to ii and si in this class/instance will be seen at superclass the same way,
	 *  but any change made to ij and sj in this class/instance won't be seen at superclass.
	 */  
	public String ij = "ij: initialized in A1";
	public static String sj = "sj: initialized in A1";
	
	public A1() {
		this.ii = this.ii + "-modified in A1()";
		A1.si = A1.si + "-modified in A1()";
		
		this.ij = this.ij + "-modified in A1()";
		A1.sj = A1.sj + "-modified in A1()";
	}
	
	public void printVars() {
		// ii and si are inherited from ClassA0
		System.out.println("------------------------------ A1.printvars() ------------------------------");	
		System.out.println("""
						   -------------------- Note ---------------------------
						   We inherit only ii and si from A0. We don't inherit 
						   ij and sj from A0, we hide them in this A1 subclass.
						   -----------------------------------------------------""");
		System.out.println(" this.ii-->" + this.ii +"\nsuper.ii-->" + super.ii);
		System.out.println();
		System.out.println(" this.si-->" + this.si +"\nsuper.si-->" + super.si);
		System.out.println("""
				   -------------------- Consequence --------------------
				   As seen; both ii and si variables are seen 
				   t h e  s a m e in the subclass and superclass.
				   -----------------------------------------------------""");
		
		System.out.println();
		
		// ij and sj are not inherited from ClassA0, they are hidden in this subclass
		System.out.println(" this.ij-->" + this.ij +"\nsuper.ij-->" + super.ij);	
		System.out.println();
		System.out.println(" this.sj-->" + this.sj +"\nsuper.sj-->" + super.sj);		
		System.out.println("""
				   -------------------- Consequence --------------------
				   As seen; both ij and sj variables are seen 
				   d i f f e r e n t in the subclass and superclass.
				   -----------------------------------------------------""");		
		System.out.println();
		
		System.out.println("(ClassA0)this.si-->" + ((A0) this).si);
		System.out.println("(A1)this.si-->" + ((A1) this).si);
		
		System.out.println();
		
		System.out.println("(ClassA0)this.sj-->" + ((A0) this).sj);
		System.out.println("(A1)this.sj-->" + ((A1) this).sj);
		
		System.out.println("----------------------------------------------------------------------------");		
	}
	
	public static void main(String[] args) {
		A1 o1 = new A1();
		//
		o1.printVars();
		
		A2 o2 = new A2();
		//
		o2.printVars();
		//
		//Let's print what is going on as a table
		System.out.println("""
		--------------------------Table of The Flow -------------------------------------		
			Types
		varia
		bles 		
			super.xy	this.xy			super.xy		this.xy
			A0<--A1		A1			A0<--A2			A2
		---------------------------------------------------------------------------------		
		ii	A0*A1(ii)	A0*A1(ii)		A0*A2(ii)		A0*A2(ii)
		---------------------------------------------------------------------------------
		si	A0*A1(si)	A0*A1(si)		A0*A1*A2(si)		A0*A1*A2(si)
		---------------------------------------------------------------------------------
		ij	A0(ij)		A1*A1(ij)		A0*A2(ij)		A0*A2(ij)
		---------------------------------------------------------------------------------
		sj	A0(sj)		A1*A1(sj)		A0*A2(sj)		A0*A2(sj)
		---------------------------------------------------------------------------------
		                 H o w    T o    R e a d    t h e    T a b l e
		---------------------------------------------------------------------------------
		xy of super.xy or this.xy: This corresponds to the variables in the rows, namely
					   ii, si, ij, and sj.
		A0<--A1: Object of Class A0 from which Class A1 extended
		A1     : Object of Class A1
		A0<--A2: Object of Class A0 from which Class A2 extended
		A2     : Object of Class A2
		X(z)   : Variable z processed by X object
		X*Y(z) : Variable z first processed by X object and then Y object 
		---------------------------------------------------------------------------------
		""");
	}
}

class A2 extends A0{
	// We inherit ii, si, ij and sj from ClassA0 which means we don't hide them,
	// so any change made to them in this class/instance will be seen at superclass the same way.
	public A2() {
		this.ii = this.ii + "-modified in A2()";
		A2.si = A2.si + "-modified in A2()";
		
		this.ij = this.ij + "-modified in A2()";
		A2.sj = A2.sj + "-modified in A2()";
	}	
	
	public void printVars() {
		// ii, si, ij and sj is inherited from ClassA0.
		System.out.println("------------------------------ A2.printvars() ------------------------------");
		System.out.println("""
				   -------------------- Note ---------------------------
				   We inherit ii, si, ij, and sj from A0.
				   -----------------------------------------------------""");		
		System.out.println(" this.ii-->" + this.ii +"\nsuper.ii-->" + super.ii);
		System.out.println(" this.si-->" + this.si +"\nsuper.si-->" + super.si);
		System.out.println();
		
		System.out.println(" this.ij-->" + this.ij +"\nsuper.ij-->" + super.ij);
		System.out.println(" this.sj-->" + this.sj +"\nsuper.sj-->" + super.sj);
		System.out.println("""
				   -------------------- Consequence --------------------
				   As seen; all ii, si, ij and sj variables are seen
				   t h e  s a m e in the subclass and superclass.
				   -----------------------------------------------------""");		
		System.out.println();
		
		System.out.println("(ClassA0)this.si-->" + ((A0) this).si);						
		System.out.println("(A2)this.si-->" + ((A2) this).si);						
		
		System.out.println();
		
		System.out.println("(ClassA0)this.sj-->" + ((A0) this).sj);
		System.out.println("(A2)this.sj-->" + ((A2) this).sj);
		
		System.out.println("----------------------------------------------------------------------------");		
	}	
}