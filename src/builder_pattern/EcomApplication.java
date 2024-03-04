package builder_pattern;

public class EcomApplication {
	
	public EcomApplication login(String un,String pd) {
		System.out.println("login with"+" "+un+" "+pd);
		return this;
	}
	
	public  EcomApplication search(String productName) {
		System.out.println("search product"+productName);
		return this;
	}
	public  EcomApplication search(String productName,String color) {
		System.out.println("search product"+productName+color);
		return this;
	}
	public  EcomApplication addToCart(String productName) {
		System.out.println("search product"+productName);
		return this;

}
	public  EcomApplication payment(String upi) {
		System.out.println("making payment via upi"+upi);
		return this;

}
	public  EcomApplication payment(String cc,int cvv) {
		System.out.println("making payment via cc"+cvv);
		return this;

}
	public  EcomApplication logout() {
		System.out.println("logout");
		return this;
	}
	
}