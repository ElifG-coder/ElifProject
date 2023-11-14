package com.arrays;

public class array3contains {
	/*Write a Java program to test 
	 if an array contains a specific value
	 */
	public static boolean contains(int[] ar,int item) {
		for(int i:ar) {
			if(item==i) {
				return true;
			}
		}
		return false;
				
	}
	
	}


