package com.loops;

public class NestedForLoop8 {

	public static void main(String[] args) {
		  for(int i = 69; i >= 65; i--)
		  {
		 // Inner for loop.
		   for(int j = 65; j <= i; j++) {
		     char ch = (char)j;	
		     System.out.print(ch+ " ");
		    }
		   System.out.println(" ");
		  }
	}

}
