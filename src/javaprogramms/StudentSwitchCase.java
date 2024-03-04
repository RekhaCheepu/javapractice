package javaprogramms;

public class StudentSwitchCase {
	
	public int getStudentMarks(String studentName) {
		System.out.println("getting the marks of "+studentName);
		int marks=-1;
		switch (studentName) {
		case "Iva":
			marks=90;
			break;
			
			case "Isha":
				marks=95;
				break;
				
				case "Sam":
					marks=100;
					break;

		default:
			System.out.println("Student name is not found");
			return -1;
			}
				return marks;
				}
		
	public static void main(String[] args) {
		
		StudentSwitchCase sc=new StudentSwitchCase();
		int i=sc.getStudentMarks("Isha");
		System.out.println(i);
		

	}

}
