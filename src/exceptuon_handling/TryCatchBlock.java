package exceptuon_handling;

public class TryCatchBlock {

	public static void main(String[] args) {
		
		System.out.println("Hi");
		
		System.out.println("Hi");
		System.out.println("Hi");
		try {
		
		int i=9/0;
		}
		catch(ArithmeticException e) {
			System.out.println("Exception is coming");
			e.printStackTrace();
			
			
		}
		System.out.println("bye");
	}

}
