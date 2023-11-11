package poonamdemo;

import java.util.Scanner;

public class EvenAndOddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		
		int x=sc.nextInt();
		
		if(x%2==0) {
			System.out.println("Number is Even");
		}else {
			System.out.println("Number is odd");
		}

	}

}
