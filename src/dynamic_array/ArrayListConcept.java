package dynamic_array;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		ArrayList ar=new ArrayList();
		
		ar.add(100);
		ar.add(200);
		ar.add("java");
		ar.add(12.33);
		ar.add(true);
		ar.add('a');
		System.out.println(ar.size());
		
		System.out.println(ar.get(0));
		
		for(int i=0; i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		for(Object e: ar) {
			System.out.println(e);
		}
		
		ArrayList<String> stName=new ArrayList<String>();
		stName.add("Tom");
		stName.add("peter");
		stName.add("Ravi");
		stName.add("Henry");
		System.out.println(stName.size());
	
		ArrayList<Integer>stMarks=new ArrayList<Integer>();
		stMarks.add(100);
		stMarks.add(200);
		
		ArrayList<Object>empData=new ArrayList<Object>();
		
		empData.add("Raj");
		empData.add(25);
		empData.add(34.55);
		empData.add(true);
		empData.add('M');
		
		System.out.println(empData.size());
		
		System.out.println(empData);
		
		for (int i=0;i<empData.size();i++) {
			System.out.println(empData.get(i));
			if(empData.get(i).equals(true)) {
				System.out.println("elizable for hike");
			}
			
			for(Object e:  empData) {
				System.out.println(e);
			}
			
			
			
			
			
			
		}
		
		
		
		
	}

}
