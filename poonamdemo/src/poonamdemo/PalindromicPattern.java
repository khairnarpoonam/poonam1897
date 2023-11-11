package poonamdemo;

public class PalindromicPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		
		for(int i=1;i<=n;i++) {
			//space loop
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
				}
			//print 1st half number
			for(int j=i;j>=1;j--) {
				System.out.print(j);
			}
			//print 2nd half number
			for(int j=2;j<=i;j++) {//j=1
				System.out.print(j);
			}
			System.out.println();
		}
		

	}

}
