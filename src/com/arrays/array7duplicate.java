package com.arrays;

public class array7duplicate {

	public static void main(String[] args) {
		/* Write a Java program to find the duplicate values of 
		an array of integer values*/
		int[] a = {25, 14, 56, 77, 36, 56, 77, 18, 29, 49};
		
		for (int i = 0; i < a.length; i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]&&(i!=j)) {
					System.out.println("duplicate num "+a[j]);	
				
			}
			
				
				
			}
			
		}


	}

}
