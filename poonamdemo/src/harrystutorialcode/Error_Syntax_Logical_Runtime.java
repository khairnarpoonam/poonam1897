package harrystutorialcode;

import java.util.Scanner;

public class Error_Syntax_Logical_Runtime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    
		//Syntax Error
		//int a=4  //->no semicolon!
		// b=8;  //->no declaratio!
		//int c=a+b;
		//System.out.println("addition of a and b is "+ c);

		//Logical Error
		//print the prime between no.1 to 10
		//System.out.println(2);
		//for(int i=1;i<5;i++) {
		//	System.out.println(2*i+1);  //o/p->2,3,5,7,9 but 9 is not prime no.
		//}
		//Runtime Error
		int k;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your input");
		k=sc.nextInt();
		System.out.println("Integer part of 1000 divided by k is " +1000/k);
		//1000/0-> Runtime Error 
		}

}
