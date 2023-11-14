
public class ConsTask2 {
	//constructor olmadan ConstructorTask1'i bu sekilde yapabiliriz. Constructor ne icin gerek????
	
	static int av(String name,int gr1,int gr2,int gr3) {
		int avarage=(gr1+gr2+gr3)/3;
		System.out.println(name+" has "+avarage);
		return avarage;
	}
	public static void main(String[] args) {
		av("Ayse",10,20,30);
		
		
	}

}
