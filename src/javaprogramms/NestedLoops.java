package javaprogramms;

public class NestedLoops {

	public static void main(String[] args) {
		
//		for( int i=0;i<=9;i++) {
//		for(int j=0;j<=9;j++) {
//			System.out.print(i+""+j+" ");
//		}
//		System.out.println();
//		}
		
		for(char c='a';c<='z';c++) {
			for(char d='A';d<='Z';d++) {
				System.out.print((int)c+""+(int)d+"   ");
				}
			System.out.println();
		}

}
}