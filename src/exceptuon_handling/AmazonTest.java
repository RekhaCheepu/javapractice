package exceptuon_handling;

public class AmazonTest {

	public static void main(String[] args) {
		String browser="chrome";
		if( browser.equals("chromre")){
			System.out.println("chrome is launched");
		}
		else if( browser.equals("firefox")){
			System.out.println("firefox is launched");
		}
		else if( browser.equals("safari")){
			System.out.println("safari is launched");
		}
		else {
			System.out.println("please pass the right browser");
			throw new MyException("no browser exception");
		}

	}

}
