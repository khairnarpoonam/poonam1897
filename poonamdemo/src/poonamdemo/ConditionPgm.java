package poonamdemo;

import java.util.Scanner;

public class ConditionPgm {

	private static final int case1 = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a button");
		
		int button=sc.nextInt();
		
		/*if(button==1) {
	      System.out.println("Hello");
		}else if(button==2) {
			System.out.println("Namste");
		}else if(button==3) {
			System.out.println("Bonjour");
		}else {
			System.out.println("Invalid ");
		}*/
	  
	   switch(button) {
	   
	   case1:System.out.println("Hello");
	   break;
	   
	   case2:System.out.println("Namste");
	   break;
	   
	   case3:System.out.println("Bonjour");
	   break;
	   
	   default:System.out.println("Invalid");
	   
	   }
	
	}

	

}
