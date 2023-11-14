package com.arrays;

public class array10CommonElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] array1 = {"Python", "JAVA", "PHP", "C#", "C++", "SQL"};
		 
	       String[] array2 = {"MySQL", "SQL", "SQLite", "Oracle", "PostgreSQL", "DB2", "JAVA"};
	       for (int i = 0; i < array1.length; i++) {
	    	   for (int j = 0; j < array2.length; j++) {
	    		   if(array1[i].equals(array2[j])) {
	    			   System.out.println(array1[i]);
	    			  
	    		   }
				
			}
			
		}
	}

}
