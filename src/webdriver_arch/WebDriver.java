package webdriver_arch;

public interface WebDriver extends SearchContext {
	@Override
public void finddElement() ;
	@Override
	public void finddElements();
	

	public void get(String Url);
	
	public void click(String element);
	
	public void sendKeys(String element,String value);
	
	public String getText(String ele);
	
	public void isDisplayed();
	public void quit();
	
	

}
