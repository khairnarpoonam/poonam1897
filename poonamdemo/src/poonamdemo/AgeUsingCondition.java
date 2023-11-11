package poonamdemo;

import java.util.Scanner;

public class AgeUsingCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
	 Scanner sc=new Scanner(System.in);
     System.out.println("enter age");
     
     int age=sc.nextInt();
     
         if(age>18) {
    	 System.out.println("Adult");
       }else {
    	 System.out.println("Not Adult");
      }
     
	}

}
