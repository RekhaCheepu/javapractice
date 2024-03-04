package javaprogramms;

public class Student {
	public int getStudentMarks(String studentName) {
		System.out.println("get student marks");
		int marks=-1;
		if(studentName.equals("Jeni")) {
			marks=90;
			//return 90;
		}
		else if(studentName.equals("Iva")) {
			marks=95;
			//return 95;
		}
		else if(studentName.equals("Rekha")) {
			marks=100;
		//	return 100;
			
		}
		else {
			System.out.println("student name is not found");
			//return -1;
			marks=-1;
		}
		return marks;
	}

	public static void main(String[] args) {
		Student st=new Student();
	int j=	st.getStudentMarks("Rekha");
	System.out.println(j);
	int i=st.getStudentMarks("Sridhar");
	System.out.println(i);
	if (i==-1){
		System.out.println("donot print the mark sheet");
	}

	}

}
