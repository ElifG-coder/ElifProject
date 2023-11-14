package com.arrays;

public class array8MaxMin {

	public static void main(String[] args) {
		/* Write a Java program to find 
		 * the maximum and minimum value of an array. 
		 */
		
		int[] ar= {1,2,3,4,5,6};
		int min=ar[0];
		for(int i=1;i<ar.length;i++) {//index'i 1 den baslattim cunku 0.index zaten min dedik tekrar kendisiyle karsilastirmaya gerek yok.
			if(min>ar[i]) {
				min=ar[i];
				
			}
			
		}
		System.out.println("Minumum number is "+min);
		
		int max=ar[0];
	
		for(int i=1;i<ar.length;i++) 
			if(ar[i]>max) 
				max=ar[i];
				
	System.out.println("Maximum number is "+max);
			}

}
