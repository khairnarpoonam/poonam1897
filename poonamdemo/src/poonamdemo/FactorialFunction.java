package poonamdemo;

import java.util.Scanner;

public class FactorialFunction {
	
	public static void calculateFactorial(int n) {
		if(n<0) {
			System.out.println("invalid number");
			return;
		}
		 int factorial=1;
		 for(int i=n;i>=1;i--) {
			 factorial=factorial*i;
		       }
			 System.out.println(factorial);
			 return;//void is in the func so you write or not return 
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		calculateFactorial(n);
		
	}

}
