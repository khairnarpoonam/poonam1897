package poonamdemo;

import java.util.Scanner;

public class SolidRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int n=4;
		int m=5;
		//nested loop
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
				System.out.print("*");
			}
			System.out.println();
		}*/
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		 int r=sc.nextInt();
		 int c=sc.nextInt();
		 for(int i=1;i<=r;i++) {
			 for(int j=1;j<=c; j++) {
				 System.out.print("*");
			 }
			 System.out.println();
		 }

	}

}
