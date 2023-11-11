package poonamdemo;

import java.util.Scanner;

public class EqualGreaterLesser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 Numbers");
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		if(a==b) {
			System.out.println("Equal");
		}else if (a>b){
			System.out.println("a is greter");
		}else {
			System.out.println("a is lesser");
			
		}

	}

}
