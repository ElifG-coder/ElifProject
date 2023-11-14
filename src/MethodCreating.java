
public class MethodCreating {
	//compare two numbers and then identify largest number is even or odd
	/*int a,b;
	  int largest(){*///parametresiz kullanim
	int largest(int a,int b) {
		int largest;
		if (a>b) {
			largest=a;
		}else {
			largest=b;
		}return largest;
	}
	
	boolean isOdd(int a) {
		boolean isOdd;
		if(a%2==0) {
			isOdd=false;
		}else {
			isOdd=true;
		}return isOdd;
	}
	public static void main(String[] args) {
		MethodCreating obj=new MethodCreating();
		/*obj.a=13;
		obj.b=7;
		int num=obj.largest();*///parametresiz cagirma
		int num=obj.largest(13,4);
		boolean result=obj.isOdd(num);
		/*CountryMethods result1=new CountryMethods();//burada tamamen meraktan baska bir classtan methodu object create ederek 
		  boolean res=result1.isOdd1(num);//cagirsam ve icine baska bir classtan gelen methodun sonucu olan variable 
		  System.out.println(res);///koysam olurmu diye bu islemleri yaptim. oluyor*/
		System.out.println(result);
		//System.out.println(obj.isOdd(num));// eger isOdd methodunu return type koymadan bu sekilde yazsak boyle kabul etmiyor
	}

}
