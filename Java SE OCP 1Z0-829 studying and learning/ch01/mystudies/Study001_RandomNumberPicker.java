package org.curlybrace.oopj.ocp1z0_829.ch01.mystudies;

import java.util.Random;

/**
 * @author	Saim Kuru
 * @version 1.0
 * ------------
 * Objectives:
 * ------------ 
 * 1. Understanding java.util.Random
 * ------------
 * Difficulty: Easy
 * ------------ 
 */

/* 
 * Terminal commands to run program
 * curlybrace@saim-MacBook-Pro src % javac org/curlybrace/oopj/ocp1z0_829/ch01/mystudies/Study001_RandomNumberPicker.java
 * curlybrace@saim-MacBook-Pro src % java org.curlybrace.oopj.ocp1z0_829.ch01.mystudies.Study001_RandomNumberPicker      
 */
public class Study001_RandomNumberPicker{
    public static void main(String[] args){
        Random rnd1 = new Random();
        Random rnd2 = new Random();
        Random rnd3 = new Random();
        //
        int n1 = 0;
        int n2 = 0;
        int n3 = 0;
        //
        for(int i = 0; i < 10; i++) {
        	n1 = rnd1.nextInt(10);
        	System.out.print("n1:" + n1 + ", ");
        	n2 = rnd2.nextInt(10);
        	System.out.print("n2:" + n2 + ", "); 
        	n3 = (rnd3.nextInt(10)+1) * 10;	// get random numbers divisible by 10 between 10 and 100.
        	System.out.println("n3:" + n3);  
        }
    }
}   