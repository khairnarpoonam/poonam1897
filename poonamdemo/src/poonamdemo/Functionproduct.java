package poonamdemo;

import java.util.Scanner;

public class Functionproduct {
	public static int calculateProduct(int a,int b) {
		return a*b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("product of 2 numbers is:" + calculateProduct(a,b));

	}

}
