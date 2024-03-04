package dynamic_array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class ArrayListMethods {

	public static void main(String[] args) {
	ArrayList<Integer>marksList=new ArrayList<Integer>();
	
	marksList.add(100);
	marksList.add(200);
	marksList.add(450);
	marksList.add(150);
	marksList.add(600);
	marksList.add(98);
	System.out.println(marksList.get(5));
	marksList.add(101);
	//marksList.add(null);
	System.out.println(marksList);
	
	marksList.remove(3);
	System.out.println(marksList);
	
	marksList.add(3, 1100);
	System.out.println(marksList.get(3));
	System.out.println(marksList);
	
	Collections.sort(marksList);
	System.out.println(marksList);
	
	Collections.swap(marksList, 2, 3);
	System.out.println(marksList);
	
	ArrayList<String>stNames=new ArrayList<String>();
	stNames.add("tom");
	stNames.add("ben");
	stNames.add("sarah");
	stNames.add("meera");
	Collections.sort(stNames);
	System.out.println(stNames);
	ArrayList<String>subjectName=new ArrayList<String>();
	
	subjectName.add("java");
	subjectName.add("python");
	subjectName.add("Ruby");
	subjectName.add("c#");
	subjectName.add("go");
	
	stNames.addAll(subjectName);
	System.out.println(stNames);
	
	
	List<String> currList=Arrays.asList("USD","INR","JPY","EUR");
	
	System.out.println(currList.size());
	System.out.println(currList);
	
	String lang[]= {"java","python","Ruby","Go"};
	
	List<String>langList=Arrays.asList(lang);
	
	System.out.println(langList.size());
	System.out.println(langList);
	
	
	
	ArrayList<String>marksList1=new ArrayList<String>(5);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	}

}
