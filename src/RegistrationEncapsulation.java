
public class RegistrationEncapsulation {
	private String email;
	private String userName;
	private String password;
	
	public String getEmail() {
		return email;
	}
	public String getUserName() {
		return userName;
	}
	public String getPassword() {
		return password;
	}
		public void setEmail(String email) {
			if(email.endsWith("yahoo.com"))
			this.email = email;
			else {
				System.out.println("Please use only yahoo account");
				
		}
	}
		public void setPassword(String password) {
			if(!password.isEmpty()) {
				if(password.length()>6) {
					if(!password.contains(userName)) {
						this.password = password;
					}else {
						System.out.println("Password is too short");
					}
					}
				}else {
					System.out.println("Password cannot be empty");
			}
		
			
			
		}

}
