package javaprogramms;

public class StringReverse {

	public static void main(String[] args) {
		
//		String s="excellent";
//		StringBuffer sb=new StringBuffer(s);
//		sb.reverse();
//		System.out.println(sb);
		
		String text="beautiful";
		int length=text.length();
		String rev="";
		for(int i=length-1;i>=0;i--) {
			rev=rev+text.charAt(i);
		}
		
			System.out.println(rev);
		

	}

}
