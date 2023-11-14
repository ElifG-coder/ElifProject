
public class UserClass {
	 String name;
	long phoneNum;
	public UserClass(String name,long phoneNum){
		this.name=name;
		this.phoneNum=phoneNum;
	}

}
class UserInfo extends UserClass{
	String adress;
	UserInfo(String name,long phoneNum,String adress){
		//super(name,phoneNum);
		super("Elif", 3463035257L);//HARD CODING
		this.adress=adress;
		
	}
	
}
