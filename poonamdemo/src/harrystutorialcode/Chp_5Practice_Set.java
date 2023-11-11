package harrystutorialcode;

import java.util.Scanner;

public class Chp_5Practice_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Problem no.1
		//print star pattern->1
		//int n=4;
		/*for(int i=n;i>0;i--) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
		System.out.print("\n");
		}*/
	  
		
		// print star pattern ->2
		//for(int i=0;i<n;i++) {
		  // for(int j=1;j<=i+1;j++) {
			//   System.out.print("*");
         //   }
		   //System.out.print("\n");
	 //}
	
		//print star pattern->3
		/*for(int i=1;i<=n;i++) {
		     for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
		for(int j=1;j<=i;j++) {
			System.out.print("*");
		   }
	System.out.println();
		}*/
	
		//Problem no.2
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int i=0;
		int sum=0;
		while(i<n){
			sum=sum+(2*i);
			i++;
		}
		System.out.print("sum of even no.is : ");
		System.out.println(sum);*/
		
		//addition of even no by using for loop
		  /* int n=5;
	        int sum=0;	
			for(int i=0;i<n;i++) {//0+2+4+6+8=20
				sum=sum+(2*i);
			}		
			System.out.print("Sum of even no.is: ");
            System.out.print(sum);	*/	
	
		
	    //Problem no 3->take users input and print table
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		for( int i=1;i<=10;i++) {
			System.out.println(i*n);
		}*/
	     
		//Problem no.->4 Multiplication of table in reverse order
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		for( int i=10;i>=1;i--) {
			System.out.println(i*n);
		}*/
		
		//Problem no.->5 Factorial on given no.
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int factorial=1;
		for(int i=n;i>=1;i--) {
		 factorial=factorial*i;
		     }
	System.out.println(factorial);*/
	
	//factorial by using while loop
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int factorial=1;
		int i=n;
	while(i>=1) {
		factorial=factorial*i;
		i--;
	}
	System.out.println(factorial);*/
	
	//Problem no.6->question 1 using while loop
	/*	int n=4;
	    int i=n;
	    int j=0;
	while(i>0 || j<i) {
		System.out.print("*");
		i--;
		j++;
		
	}
	System.out.print("\n");*/
	
	//problem no.9->sum of no.in table
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	int n=sc.nextInt();
	int sum=0;
	for( int i=1;i<=10;i++) {
		//sum += (i*n);//or
		sum=sum+(i*n);
	}
	
	System.out.println(sum);
	
	}
	

}
