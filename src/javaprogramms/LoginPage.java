package javaprogramms;

public class LoginPage {
	String userName;
	String passWord;
	
	public LoginPage(String userName,String password) {
		this.userName=userName;
		this.passWord=password;
			
	}
	public void doLogin() {
		System.out.println("enter user name"+userName);
		System.out.println("enter password"+passWord);
		System.out.println("click on login button");
		System.out.println("user is logged in");
	}

	public static void main(String[] args) {
		LoginPage lp1=new LoginPage("rekha@gmail.com","rekha123");
		lp1.doLogin();
		LoginPage lp2=new LoginPage("john@gmail.com","john123");
		lp2.doLogin();
		
		

	}

}
