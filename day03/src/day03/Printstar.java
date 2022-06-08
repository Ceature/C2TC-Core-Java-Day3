package day03;

public class Printstar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int term=6,i,j;
		for(i=1;i<=term;i++) {
			for(j=term;j>=i;j--) {
				System.out.println("*");
			}
			System.out.println();
		}

	}

}
