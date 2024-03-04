package webdriver_arch;

public class AmazonTest {
	static WebDriver driver;
	public static void main(String[] args) {
		
		String browser="ie";
		if (browser.equalsIgnoreCase("chrome")){
			driver=new ChromeDriver();
		System.out.println("chrome is launched");
		}
		else if(browser.equalsIgnoreCase("Firefox")) {
			driver=new FirefoxDriver();
			System.out.println("firefox is launched");
		}
		else if(browser.equalsIgnoreCase("Safari")) {
			driver=new Safari();
			System.out.println("Safari is launched");
		}
		else {
			System.out.println("please pass the right browser"+" "+browser);
		}
		
	//ChromeDriver driver=new ChromeDriver();
	//FirefoxDriver driver=new FirefoxDriver();
	//Safari driver=new Safari();
	driver.get("https//amazon.com");
	driver.finddElement();
	driver.finddElements();
	driver.getText("Rekha");
	driver.sendKeys("rekha", "rekha123");
	driver.isDisplayed();
	driver.quit();
	AmazonTest.driver.click("launch")
	;

	}

}
