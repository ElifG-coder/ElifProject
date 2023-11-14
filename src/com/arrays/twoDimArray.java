package com.arrays;

public class twoDimArray {

	public static void main(String[] args) {
		int[][] arr=new int[2][2];
		arr[0][0]=1;
        arr[0][1]=5;
        
        
        arr[1][0]=6;
        arr[1][1]=4;
       
        for(int i=0;i<=1;i++) {
        	for(int j=0;j<=1;j++) {
        		 System.out.print(arr[i][j]+" ");	
        	}
        	System.out.println();
        }
       
	}

}
