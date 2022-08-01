package org.curlybrace.oopj.ocp1z0_829.ch04.mystudies;


/* Terminal commands to run program
 * curlybrace@saim-MacBook-Pro src % javac org/curlybrace/oopj/ocp1z0_829/ch04/mystudies/Study013_CalculatingWithMathAPI.java
 * curlybrace@saim-MacBook-Pro src % java org.curlybrace.oopj.ocp1z0_829.ch04.mystudies.Study013_CalculatingWithMathAPI      
 */

public class Study013_CalculatingWithMathAPI {

	public static void main(String[] args) {
		System.out.println("""
		--------------------------------------------------------------------------------
		Math API min() and max() methods
		--------------------------------------------------------------------------------		
		""");
		float fmin = Math.min(13.0f, 10.1f);
		float fmax= Math.max(13, 10);
		double dmin =  Math.min(13.0f,  10.1f);
		double dmax =  Math.max(13.0,  10.1);
		
		System.out.println("fmin = %.2f \nfmax = %.2f\ndmin = %.2f\ndmax = %.2f".formatted(fmin,fmax,dmin,dmax));
		
		System.out.println("""
		--------------------------------------------------------------------------------
		Math API round() method
		--------------------------------------------------------------------------------		
		""");
		int roundedFloat = Math.round(13.5f);
		long roundedDouble = Math.round(13.5);
		
		System.out.println("roundedFloat = %d \nroundedDouble = %d".formatted(roundedFloat,roundedDouble));

		System.out.println("""
		--------------------------------------------------------------------------------
		Math API  ceil() and floor() methods
		--------------------------------------------------------------------------------		
		""");		
		double dfloor = Math.floor(131.7);
		double dceil = Math.ceil(131.7);
		
		System.out.println("dfloor = %f \ndceil = %f".formatted(dfloor,dceil));
		
		System.out.println("""
		--------------------------------------------------------------------------------
		Math API  pow() method
		--------------------------------------------------------------------------------		
		""");		
		double pow162 = Math.pow(16,2);
		double pow162_1 = Math.pow(16,0.5);
		
		System.out.println("pow(16,2) = %f \npow(16,1/2) = %f".formatted(pow162,pow162_1));		

		System.out.println("""
		--------------------------------------------------------------------------------
		Math API  random() method
		--------------------------------------------------------------------------------
		* The random() method returns a value in range[0,1)
		--------------------------------------------------------------------------------				
		""");
		double randomN = Math.random();

		System.out.println("randomN = %f".formatted(randomN));
		System.out.println("randomN = %.3f".formatted(randomN));
	}
}