package javaprogramms;

public class Browser {
	public boolean launchBrowser(String browserName){
		System.out.println("launching the browser"+browserName);
		boolean flag=false;
		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			System.out.println("chrome is launched");
			flag=true;
			break;
		case "safari":
			System.out.println("safari is launched");
			flag=true;
			break;
		case "firefox":
			System.out.println("firefox is launched");
			flag=true;
			break;

		default:
			System.out.println("please pass the right browser"+browserName);
			break;
		}
		return flag;
			

		}	
		
	
	public static void main(String[] args) {
		
		Browser br=new Browser();
		boolean b1=br.launchBrowser("Chrome ");
		System.out.println(b1);
		
	

}
}