package oop_encapsulation;

public class UserLogin {

	public static void main(String[] args) {
		LoginPage lp1=new LoginPage("Puja","P123","manager");
		System.out.println(lp1.getUserName());
		System.out.println(lp1.getPassWord());
		System.out.println(lp1.role);
		
		lp1.role="admin";
		
		System.out.println(lp1.role);
		
		System.out.println(lp1.getUserInfo());
		
		Application.getInfo();
		
		
	}

}
