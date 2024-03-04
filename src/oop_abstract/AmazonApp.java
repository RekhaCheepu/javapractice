package oop_abstract;

public class AmazonApp {

	public static void main(String[] args) {
		
		LoginPage lp=new LoginPage();
		lp.displayLogo();
		lp.doLogin();
		lp.title();
		lp.url();
		//lp.pageStyle();
		Page.pageStyle();
		//LoginPage.pageStyle();

		Page p= new LoginPage();
		p.title();
		p.url();
		p.displayLogo();
		
	}

}
