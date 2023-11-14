package com.loops;

public class NestedForLopp2 {

	public static void main(String[] args) {
		//triangle
		  for(int i = 1; i <= 5; i++)
		  {
		 // Inner for loop.
			for(int j = 1; j <= i; j++){
		     System.out.print("*"+" ");
		    }
		   System.out.println("");
		  }
	}

}
