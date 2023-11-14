import java.util.Scanner;

public class StringManipulations1 {

	public static void main(String[] args) {
		String confirmedPassword=null;
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter username");
		String userName=scan.nextLine();
		System.out.println("please enter password");
		String password=scan.nextLine();
		if(!(userName.isEmpty()||password.isEmpty())) {
			if(password.length()>=8) {
				if(!(password.contains(userName))) {
					System.out.println("Please confirm password");
						confirmedPassword=scan.nextLine();
						if(password.equals(confirmedPassword)) {
							System.out.println("Your account is created");
						}else {
							System.out.println("Passwords are not matched");
						}
				
					}else {
					System.out.println("Password cannot contain username");
		}
			}else{
				System.out.println("Password is too short");
			}
		}else {
				System.out.println("Username and password can't be empty");
				
		     }
		}
}

	


