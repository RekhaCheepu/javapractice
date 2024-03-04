package exceptuon_handling;

public class ThrowKeyword {

	public static void main(String[] args) {
		String data=null;
		if(data==null) {
			try {
				throw new Exception("DataNotFoundException");
			}
			catch(Exception e) {
				System.out.println("data not found exception");
				e.printStackTrace();
			}
		}
		System.out.println("logout");

	}

}
