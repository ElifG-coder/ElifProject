package com.arrays;
import java.util.Arrays;

public class array12checknumberAvaliable {

	public static void main(String[] args) {
		/* Write a Java program to check 
		if an array of integers without 0 and -1.*/
		int[] a=new int[]{-5,4,3,-6,2,8};
		System.out.println("Original array is:"+Arrays.toString(a));
		System.out.println("Result is:"+test(a));
	}
	public static boolean test(int[] numbers) {
		for(int num:numbers)
			if(num==0||num==-1)
				return false;
		return true;

		
	}

}
