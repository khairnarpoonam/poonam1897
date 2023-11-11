package poonamdemo;

import java.util.Scanner;

public class CountDigitiNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a number");
		
		Scanner sc=new Scanner(System.in);
		   int num=sc.nextInt();
		
		/*int num=1234;*/
		 int count=0;
		
		while( num>0) {
			 num=num/10;
			 count++;
		
		}
		System.out.println("number of digit is:" +count++);

	}

}
