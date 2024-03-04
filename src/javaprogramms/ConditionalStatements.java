package javaprogramms;

public class ConditionalStatements {

	public static void main(String[] args) {
		int marks=99;
		if(marks>=90) {
			if(marks>=95) {
				System.out.println("grade A++");
				if(marks==100) {
					System.out.println("elizable for scholarship");
				}
				else {
					System.out.println("not elizable for Scholorship");
				}
		}else
			System.out.println("grade A");
		}

		else {
			System.out.println("grade B");
		}
		
		//browser:chrome,safari,ie,firefox;
		
		String browser="chrome";
		if(browser.equals("chrome")) {
			System.out.println("open chrome browser");
		}
		if(browser.equals("safari")) {
			System.out.println("open safari browser");
		}
		if(browser.equals("firefox")) {
			System.out.println("open firefox browser");
		}
		if(browser.equals("ie")) {
			System.out.println("open ie browser");
		}
		else {
			System.out.println("please pass the right browser");
		}

	}

}
