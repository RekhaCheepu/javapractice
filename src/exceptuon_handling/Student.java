package exceptuon_handling;

public class Student {
	public static int getMarks(String name) {
		System.out.println("marks for :"+name);
		if(name.equals("Aarya")) {
			try {
			int i=9/0;
			}
			catch(ArithmeticException e) {
				return 65;
		}
			finally {
				System.out.println("print mark sheet");
				return 75;
			}
			//return 90;
		}
		else if(name.equals("Ram")){
			return 95;
		}
		else if(name.equals("Swathi")) {
			return 80;
		}
		else {
			System.out.println("student not found");
			return -1;
		}
		
	}

	public static void main(String[] args) {
		
		int m1=getMarks("Aarya");
		System.out.println(m1);
	}

}
