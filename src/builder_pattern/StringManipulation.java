package builder_pattern;

import java.util.Arrays;

public class StringManipulation {

	public static void main(String[] args) {
//		String s="testing";
//		String s1="100";
//		String str="hi this is my java code and i am so happy";
//		System.out.println(str.length());
//		System.out.println(s.length());
//	int len=	str.length();
//	int li=0;
//	int hi=len-1;
//	System.out.println("LI="+li);
//	System.out.println(("HI="+hi));
//	System.out.println("length="+len);
//	
//	System.out.println(str.charAt(0));
//	System.out.println(str.charAt(40));
////	System.out.println(str.charAt(41));
//	System.out.println("--------------------------------");
//	System.out.println(str.indexOf('i'));
//	System.out.println(str.indexOf('i',2));
//	System.out.println(str.indexOf('i',(str.indexOf('i')+1)));
//	
//	System.out.println(str.indexOf('i',(str.indexOf('i',(str.indexOf('i')+1)))+1));
//	System.out.println(str.indexOf('i',(str.indexOf('i',(str.indexOf('i')+1)))+1)+1);
//	System.out.println(str.indexOf("java"));
//	System.out.println(str.indexOf("python"));
//	
//	String t1="hello world";
//	String t2="hello world";
//	System.out.println(t1.equals(t2));
//	System.out.println(t1==t2);
//	
//	String t3=new String("hello naveen");
//	String t4="hello naveen";
//	String t5=new String("hello ");
//	String t6="hello world";
//	String t7="hello world";
//	
//	System.out.println(t3==t4);
//	System.out.println(t3.equals(t4));
//	String p1="hello testing";
//	p1=p1+"java";
//	System.out.println(p1);
//	
//	String l1="selenium";
//	String l2=l1.toUpperCase();
//	
//	 l1=l1.toUpperCase();
//	 String pop="hello amazon app";
//	 System.out.println(pop.contains("amazon"));
//	 String h1="   hello world  ";
//	 System.out.println(h1.trim());
//	 String h2="hello world";
//	 System.out.println(h2.replace(" ", ""));
//	 
//	 System.out.println(h2.replace('o', 'l'));
//	 
//	 String dob="01-01-2000";
//	 System.out.println(dob.replace('-','/'));
//	 
//	 StringBuilder sb1=new StringBuilder("Naveen");
//	// sb1.append("Automation");
//	// System.out.println(sb1);
//	 
//	 StringBuilder sb2=new StringBuilder("Naveen");
//	 System.out.println(sb1==sb2);
//	 System.out.println(sb1.equals(sb2));
//	 System.out.println(sb1.toString().equals(sb2.toString()));
//	 
//	 String pl="selenium";
//	StringBuilder spl= new StringBuilder(pl);
//	spl.append("testing");
//	System.out.println(spl);
	
	String sl="java_python_ruby_dotnet";
	String sp[]=sl.split("_");
	System.out.println(sp[0]);
	System.out.println(sp[1]);
	
	String pool= "xXtestingxXseleniumXxXjavaXXxXAutomation";
	String arr[]=pool.split("xX");
	System.out.println(arr[0].length());
	System.out.println(arr[1]);
	System.out.println(arr[4]);
	
	String data="tom;peter;30;pune;india;SDET1";
	String d[]=data.split(";");
	System.out.println(Arrays.toString(d));
	
	String test="selenium";
	
	 StringBuilder stb=new StringBuilder(test);
	 stb.reverse();
	 System.out.println(stb);
	 
	int length= test.length();
	String rev="";
	for(int i=length-1;i>=0;i--) {
	
	rev=rev+test.charAt(i);
	}
	System.out.println(rev);
	
	
	String w="cricket";
	StringBuffer sw=new StringBuffer(w);
	System.out.println(sw.reverse());
	
	int wlen=w.length();
	String reverse="";
	for(int j=wlen-1;j>=0;j--) {
		reverse =reverse+w.charAt(j);
	
	}
	System.out.println(reverse);
	
	
	String messg="your user name is naveenautomation";
	//String newstr=messg.substring(7);
	//System.out.println(newstr);
	//String newstr=messg.substring(7,20);
	//System.out.println(newstr);
	
	String newstr=messg.substring(messg.indexOf("is")+3, messg.length());
	System.out.println(newstr);
	
	String info="your password is rekha123";
	
	String str=info.substring(info.indexOf("is")+3,info.length());
	System.out.println(str);
	
	String uid=info.substring(info.indexOf("is")+3);
	System.out.println(uid);
	
	
	String m1="your id is testautomation so plz login to app";
	String newm1=m1.substring(m1.indexOf("is")+3, m1.indexOf("so")-1);
System.out.println(newm1);	

String newm2=m1.substring(m1.indexOf("is")+3);
	
	System.out.println(newm2);
	
	String f="family";
	StringBuilder sf=new StringBuilder(f);
	System.out.println(sf.reverse());
	int fLen=f.length();
	String reversef="";
	for (int F=fLen-1;F>=0;F--) {
		reversef=reversef+f.charAt(F);
		System.out.println(reversef);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
