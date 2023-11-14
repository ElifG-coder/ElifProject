
public class ConstructorTask1 {
	//the goal of the constructor is initialize instance variables
	static String names;
	 static int grade1,grade2,grade3;
	ConstructorTask1(String name,int gr,int gr1,int gr2){
		names=name;
		grade1=gr;
		grade2=gr1;
		grade3=gr2;
		System.out.println("Student "+name+" avarage grade is "+avarage());
	
	
	}
	static int  avarage() {
		int av=(grade1+grade2+grade3)/3;
		
	    return av;
		
		
		
	}
	public static void main(String[] args) {
		new ConstructorTask1("Ayse",10,20,30);
		
		
		
		
	}
	

}

