package day03;

public class Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j, i;
		for(i=0;i<=2;i++) {
			for(j=i;j<=5;j++) {
				if(j==4) {
					continue;
				}
			}
			System.out.println(j);
		}

	}

}
