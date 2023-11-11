package poonamdemo;

import java.util.Scanner;

public class TableClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int n=2;
		 
		 for(int i=1;i<11;i++) {
	   //int mul=n*i;
	   System.out.println(mul);		
		}*/
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n Number");
		int n=sc.nextInt();
		
		for(int i=1;i<11;i++) {
			System.out.println(n*i);
		}

	}

}
