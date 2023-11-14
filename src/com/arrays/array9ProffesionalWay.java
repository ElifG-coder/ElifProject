package com.arrays;
import java.util.Arrays;

public class array9ProffesionalWay {

	public static void main(String[] args) {
		 int[] a = {
		            1789, 2035, 1899, 1456, 2013, 
		            1458, 2458, 1254, 1472, 2365, 
		            1456, 2165, 1457};
		  System.out.println("Original array : "+Arrays.toString(a));  
		   for(int i =0;i<a.length/2;i++)
		  {
			   System.out.print(a[i]+" ");
		 int temp = a[i];
		    a[i] = a[a.length - i - 1];
		    a[a.length - i - 1] = temp;
			   System.out.print(a[i]+" ");
			   
		  }
		   
		    System.out.println("\nReverse array : "+Arrays.toString(a));
		    int b=8;
		    int c=7;
		    int temp=b;
		    b=c;
		    c=temp;
		    System.out.println(c);
		    
		    		
		    
		 }

}
