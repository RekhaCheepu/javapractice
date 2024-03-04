package oop_abstract;

public abstract class Page {
	
	public abstract void title();
	
	public abstract void url();
	
	public Page() {
		System.out.println("page class constructor");
	}
	
	public void pageTimeout() {
		System.out.println("page time out --20 sec");
	}
	public final void displayLogo() {
		System.out.println("page-logo");
	}
	public static void pageStyle() {
		System.out.println("page style");
		getPageTheme();
	}
	private static void getPageTheme() {
		System.out.println("get page theme");
	}
	

}
