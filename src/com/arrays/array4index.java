package com.arrays;

public class array4index {
	/*Write a Java program to find 
	 *the index of an array element.*/
	public static void findindex(int[] ar,int a) {
		int i;
		for( i=0;i<ar.length;i++) {
			if(ar[i]==a) {
				
				System.out.print("index of "+a+" is " +i);
			}
				
				
			
		}
		
		
			
		System.out.println();
		
	}
	public static void main(String[] args) {
		
		int[] ar= {3,4,5,6};
		findindex(ar,5);
		/*for( int i=0;i<ar.length;i++) {
			 
				
				System.out.println("index of "+ar[i]+" is " +i);
			
		}*/
		
		
		}
	
}

