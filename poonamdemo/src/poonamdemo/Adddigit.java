package poonamdemo;

import java.util.Scanner;

public class Adddigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		//int sum=0;
		//Scanner sc=new Scanner(System.in);
		//System.out.println("enter digit:");
		
		//int n=sc.nextInt();
		int sum=0;
		
		for(int i=1;i<=n;i++) {
			sum=sum+i;
			//System.out.print(" " + i);	
		}
		System.out.print( " " + sum);
		
	}

}
