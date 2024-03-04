package webdriver_arch;

public class ChromeDriver implements WebDriver {
	
	public ChromeDriver() {
		System.out.println("launch chrome driver");
	}

	@Override
	public void finddElement() {
		System.out.println("find element");
		
	}

	@Override
	public void finddElements() {
		System.out.println("find elements");
		
	}

	@Override
	public void get(String Url) {
	System.out.println("enter value in element");	
	}

	@Override
	public void click(String element) {
	System.out.println("Click on element");
		
	}

	@Override
	public void sendKeys(String element, String value) {
	
	System.out.println("enter email and password");	
	}

	@Override
	public String getText(String ele) {
	System.out.println("getting the tee text");
		return null;
	}

	@Override
	public void isDisplayed() {
	System.out.println("is displaying");	
		
	}

	@Override
	public void quit() {
		System.out.println("quitting the browser");
		
		
	}

}
