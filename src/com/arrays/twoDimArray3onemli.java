package com.arrays;

public class twoDimArray3onemli {

	public static void main(String[] args) {
		int[][] arr=new int[2][];
		arr[0]=new int[3];
		arr[1]=new int[4];
		
		arr[0][0]=5;
		arr[0][1]=6;
		arr[0][2]=9;
		
		
		arr[1][0]=7;
		arr[1][1]=5;
		arr[1][2]=9;
		arr[1][3]=4;
		
		   for(int i=0;i<arr.length;i++) {
	        	for(int j=0;j<arr[i].length;j++) {
	        		 System.out.print(arr[i][j]+" ");	
	        	}
	        	System.out.println();
	        }

	}

}
