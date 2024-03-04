package oop_abstract;

public class LoginPage extends Page {
	public LoginPage() {
		System.out.println("loginpage--constructor");
	}

	@Override
	public void title() {
	System.out.println("LP-title");	
		
	}

	@Override
	public void url() {
		System.out.println("p-Url");
	}
		
	public void doLogin() {
		System.out.println("user is logged in");
	}
			
		}
		
		
	
	


