package javaprogramms;

public class Customer {
	
	public Customer() {
		System.out.println("0 param const");
	}
	public Customer(int i) {
		System.out.println("1 param const"+i);
	}
	public Customer(int i,int j) {
		System.out.println("2 param const"+i+j);
	}
	public Customer(int i, String p) {
		System.out.println("2 param const"+i+p );
	}
	public Customer(String p,int i) {
		System.out.println("2 param const"+i+p );	
	}

	public static void main(String[] args) {
		
Customer c1=new Customer();
Customer c2=new Customer(10);
Customer c3=new Customer("big",8);


	}

}
