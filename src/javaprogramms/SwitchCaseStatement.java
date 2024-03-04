package javaprogramms;

public class SwitchCaseStatement {

	public static void main(String[] args) {

		String browser = "Chrome";

		switch (browser.toLowerCase()) {
		case "chrome":
			System.out.println("launch chrome browser");
			break;

		case "firefox":
			System.out.println("launch firefox browser");
			break;

		case "safari":
			System.out.println("launch safari browser");
			break;

		case "ie":
			System.out.println("launch ie browser");
			break;
		default:
			System.out.println("please pass the right browser...." + browser);
			break;
		}

		String day = "Monday";

		switch (day.toLowerCase()) {
		case "monday":
			System.out.println("workimg day");
			break;
		case "tuesday":
			System.out.println("workimg day");
			break;
		case "wednesday":
			System.out.println("workimg day");
			break;
		case "thursday":
			System.out.println("workimg day");
			break;
		case "friday":
			System.out.println("workimg day");
			break;
		case "saturday":
			System.out.println("holiday");
			break;
		case "sunday":
			System.out.println("holiday");
			break;

		default:
			System.out.println("please passs the right day----" + day);
			break;
		}

		String env = "qa";
		switch (env.toLowerCase()) {
		case "qa":
			System.out.println("run the test cases in qa environment");
			break;
		case "dev":
			System.out.println("run the test cases in dev environment");
			break;
		case "prod":
			System.out.println("run the test cases in prod environment");
			break;
		case "uat":
			System.out.println("run the test cases in uat environment");
			break;

		default:
			System.out.println("please pass the right enveronment..." + env);
			break;
		}
		
		

	}
	
	
	
}
