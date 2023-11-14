package com.arrays;

public class array8MaxMinMETHOD {
	public static void MaxMin(int[] ar) {
		int max=ar[0];
		int min=ar[0];
		for (int i = 0; i < ar.length; i++) {
			if(ar[i]>max) {
				max=ar[i];
			
		}
			if(min>ar[i]) {
				min=ar[i];
				
			}
				
			
		
	}
System.out.println("max is: "+max+" and minumum is: "+min);
}
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6};
		MaxMin(a);
		
	}
}
