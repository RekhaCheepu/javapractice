package javaprogramms;

import java.util.Arrays;

public class ArraysConcept {

	public static void main(String[] args) {
	
//		int i[]=new int[4];
//		i[0]=10;
//		i[1]=20;
//		i[2]=30;
//		i[3]=40;
//		
//		System.out.println(i.length);
//		
//	int len=	i.length;
//	
//	System.out.println(Arrays.toString(i));
//	
//	for(int k=0;k<=len-1;k++) {
//		System.out.println(i[k]);
//	}
//	
//	int j=0;
//	while(j<=len-1) {
//		System.out.println(i[j]);
//		j++;
//	}
//	for(int k=0;k<=len-1;k++) {
//		System.out.println(i[k]);
//		if(i[k]==30) {
//			System.out.println("bye");
//			break;
//		}
//	}
	
//	double d[]=new double[3];
//	d[0]=12.22;
//	d[1]=22.33;
//	d[2]=33.44;
//	
//	
//	for(int z=0; z<=len-1;z++) {
//		System.out.println(d[z]);
//	}
//	char c[]=new char[4];
//	c[0]='A';
//	c[1]='a';
//	c[2]='$';
//	c[3]='h';
//	for(int l=0;l<=len-1;l++) {
//	System.out.println(c[l]);
//	
//	}

//	
//	String emp[]= new String[4];
//	
//	emp[0]="Tom";
//	emp[1]="Peter";
//	emp[2]="Lisa";
//	emp[3]="Raj";
//	
//	System.out.println("total employees are:"+emp.length);
//	
//	System.out.println("employee names are:"+Arrays.toString(emp));
//	
//	for(int e=0;e<=emp.length-1;e++) {
//		System.out.println(emp[e]);
//		
//		if (emp[e].equals("Peter")){
//			
//			System.out.println(emp[e]+" "+"he is a manager");
//			
//			
//		}
//		
//		String employee[]=new String[5];
//		
//		employee[0]="Tom";
//		employee[1]="Peter";
//		employee[2]="Lisa";
//		employee[3]="Raj";
//		employee[4]="Rani";
//		
//		for(String a:employee) {
//			System.out.println(a);
//			
//		}
//		
//		int p[]= {1,2,3,4,9,11,38,49,82,97};
//		
//		System.out.println(p.length);
//		
//		System.out.println("Li ="+0);
//System.out.println("Hi ="+(p.length-1));
//
//String str[]= {"Java","Python","Dot net,Oracle"};
//System.out.println(Arrays.toString(str));
//System.out.println(str.length-1);
//System.out.println(2+":"+str[1]);
	 
		Object empData[]=new Object[5];
		
		empData[0]="Vani";
		empData[1]=30;
		empData[2]=35.45;
		empData[3]='f';
		empData[4]=true;
		System.out.println(":::::::::::::::::::::::::::::::::::::::");
		
		System.out.println(Arrays.toString(empData));
//		
//		
//		for (int m=0;m<=empData.length-1;m++){
//		
//		System.out.println(empData[m]);
//		}	
//		for(Object e:empData) {
//			System.out.println(e);
//		}
			
		Object userInfo[]=new Object[5];
		userInfo[0]="Sameer";
		userInfo[1]=29;
		userInfo[2]=45.87;
		userInfo[3]='m';
		userInfo[4]=false;
		
		System.out.println(userInfo.length);
		
		for(int r=0;r<=userInfo.length-1;r++) {
		System.out.println(userInfo[r]);
		System.out.println("-----------------------------");
		
		for(Object f:userInfo) {
			System.out.println(f);
		}
			
			
			
			
		}			
			
		}
	

}
