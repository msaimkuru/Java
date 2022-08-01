package org.curlybrace.oopj.ocp1z0_829.unreachablecodesamples;

/* Terminal commands to run program
 * curlybrace@saim-MacBook-Pro src % javac org/curlybrace/oopj/ocp1z0_829/unreachablecodesamples/Study001_BreakContinueReturnUnReachableCodes
 * curlybrace@saim-MacBook-Pro src % java org.curlybrace.oopj.ocp1z0_829.unreachablecodesamples.Study001_BreakContinueReturnUnReachableCodes     
 */

public class Study001_BreakContinueReturnUnReachableCodes {

	public static void main(String[] args) {
		System.out.println("""
		GOOD TO KNOW:
		------------------------------------------------------------------------------------------
		Any statements immediately following a break, continue, or return statement will cause the
		compiler to report an error.	
		------------------------------------------------------------------------------------------""");
		
		for(int i = 0; i < 10; i++) {
			if(i % 2 == 1) {
				break;
				//System.out.println(i);		//DOES NOT COMPILE	 : Unreachable code
			}
		}

		for(int i = 0; i < 10; i++) {
			if(i % 2 == 1) {
				continue;
				//System.out.println(i);		//DOES NOT COMPILE	 : Unreachable code
			}
		}
		
		for(int i = 0; i < 10; i++) {
			if(i % 2 == 1) {
				return;
				//System.out.println(i);		//DOES NOT COMPILE	 : Unreachable code
			}
		}
	}
}