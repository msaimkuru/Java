package org.curlybrace.oopj.ocp1z0_829.ch02.mystudies;

/**
 * @author	Saim Kuru
 * @version 1.0
 * ------------
 * Objectives:
 * ------------ 
 * 1. Understanding Bitwise Complement operator
 * ------------
 * Difficulty: Medium
 * ------------ 
 */

/* 
 * Terminal commands to run program
 * curlybrace@saim-MacBook-Pro src % javac org/curlybrace/oopj/ocp1z0_829/ch02/mystudies/Study001_BitWiseComplement.java
 * curlybrace@saim-MacBook-Pro src % java org.curlybrace.oopj.ocp1z0_829.ch02.mystudies.Study001_BitWiseComplement      
 */
public class Study001_BitWiseComplement {
	static {
		System.out.println("""
		--------------------------------------------------------------------------------
		B i t w i s e   C o m p l e m e n t   o f   a   N u m b e r
		--------------------------------------------------------------------------------
		To find the bitwise complement of a number: 
		Multiply it by negative one and then subtract one.
		
		This is because when an n-bit number k added by its bitwise complement ~k 
		should give a result of n bits of 1: 111...11
		
		For an n bit integral signed binary number k, -k = 2**n - k.
		
		Therefore -k - 1 = 2**n - k - 1.
		
		This implies k + (-k - 1)  = 2**n - 1, which is n bits of 1: 111...11, which
		means  (-k - 1) is bitwise complement of k, (~k).
		--------------------------------------------------------------------------------
		B i t w i s e   C o m p l e m e n t   O p e r a t o r (~)
		--------------------------------------------------------------------------------
		1- Bitwise complement operator(~) is only defined for integral numeric types
		(byte, short, char, int and long).
		--------------------------------------------------------------------------------
		""");
	}
	
	public static void main(String[] args) {
		byte b0 = 0;
		byte b1 = (byte) 1;
		byte b2 = 2;
		byte b3 = 3;
		byte b127 = 127;
		//
		byte bitwiseComplementOfb0 = (byte)~b0;
		byte bitwiseComplementOfb1 = (byte)~b1;
		byte bitwiseComplementOfb2 = (byte)~b2;
		byte bitwiseComplementOfb3 = (byte)~b3;
		byte bitwiseComplementOfb127 = (byte)~b127;
		//
		System.out.println("bitwise complementOf 0 is " + bitwiseComplementOfb0);
		System.out.println("bitwise complementOf 1 is " + bitwiseComplementOfb1);
		System.out.println("bitwise complementOf 2 is " + bitwiseComplementOfb2);
		System.out.println("bitwise complementOf 3 is " + bitwiseComplementOfb3);
		System.out.println("bitwise complementOf 127 is " + bitwiseComplementOfb127);
		//
		// Bitwise complement operator(~) is only defined for integral numeric types
		// (byte, short, char, int and long).
		float f0 = 3.0f;
		float bitwiseComplementOff0;
		
		/*
		bitwiseComplementOff0 = ~f0;
		
		DOES NOT COMPILE:
		------------------
		error: bad operand type float for unary operator '~'
		bitwiseComplementOff0 = ~f0;
		                        ^
		*/                        
	}
}