package com.arrays;

public class array4indexWhile {
	public static int findindex(int[]ar,int a) {
		int i=0;
		while(i<ar.length) 
			if(ar[i]==a) 
				return i;
			
			else i=i+1;
		
		return -1;
	}
	public static void main(String[] args) {
		int[] ar= {3,4,5,6};
		
		System.out.println("Index position of 7 is: " + findindex(ar, 7));
	}

}

