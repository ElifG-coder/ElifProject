package com.arrays;

public class array2avarege {

	public static void main(String[] args) {
		//  Write a Java program to calculate
		//  the average value of array elements
		int[] ar= {3,4,5,6};
		 int sum = 0;
	       for(int i:ar)
	        sum = sum + i;
	       //calculate average value
	        double average = sum / ar.length;
	        System.out.println("Average value of the array elements is : " + average); 
		

	}

}
