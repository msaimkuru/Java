package org.curlybrace.oopj.ocp1z0_829.sysoutsamples;

import java.util.ArrayList;
import java.util.List;

/* Terminal commands to run program
 * curlybrace@saim-MacBook-Pro src % javac org/curlybrace/oopj/ocp1z0_829/sysoutsamples/Study001_SysOutWithDifferentTypeOfArguments.java
 * curlybrace@saim-MacBook-Pro src % java org.curlybrace.oopj.ocp1z0_829.sysoutsamples.Study001_SysOutWithDifferentTypeOfArguments     
 */

public class Study001_SysOutWithDifferentTypeOfArguments {

	public static void main(String[] args) {
		List<Integer> listI = new ArrayList<>();
		listI.add(10);
		listI.add(20);
		//
		for(var item : listI) {
			System.out.print(item + ", ");
		}
		System.out.println();
		System.out.println("----------------------------------------");
		//
		for(int item : listI) {
			System.out.print(item + ", ");
		}
		System.out.println();
		System.out.println("----------------------------------------");		
		//
		for(Object item : listI) {
			System.out.print(item + ", ");
		}
		System.out.println();
		System.out.println("----------------------------------------");
		//
		Object o = new Object();
		System.out.println(o);
		String x = "ab0000000000000" + o;
		System.out.println(x);
	}
}