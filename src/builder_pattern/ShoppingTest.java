package builder_pattern;

public class ShoppingTest {

	public static void main(String[] args) {
		EcomApplication obj=new EcomApplication();
		
		obj.login("rekha@gmail.com", "rekha123")
	.search("iphone")
	.search("iphone", "pink")
	.addToCart("iphone")
	.payment("123 234 456 7899")
	.logout();
		
		
		    

	}

}
