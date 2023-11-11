package harrystutorialcode;

import java.util.Scanner;

public class Conditional_Code_Practice {

	private static final int case1 = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter your input .");
//		int age=sc.nextInt();
//		if(a>18) {
//			System.out.println("You can drive the car.");
//		else {
//			System.out.println("You can not drive the car.");
//		}
//		
//        if(age<18) {
//        	System.out.println("you are adult.");
//        }
//        else if(age==18) {
//        	System.out.println("you are age is completed.");
//        }
//        else {
//        	System.out.println("you are not adult.");
//        }
		
//		System.out.println("Enter a marks of 3 subject.");
//		Scanner sc=new Scanner(System.in);
//		
//		System.out.println("Enter marks of subject 1");
//		int sub1=sc.nextInt();
//		
//		System.out.println("Enter marks of subject 2");
//		int sub2=sc.nextInt();
//		
//		System.out.println("Enter marks of subject 3");
//		int sub3=sc.nextInt();
//		
//		int total=sub1+sub2+sub3;
//		int percent=total*100/300;
//		System.out.println(total);
//		System.out.println(percent);
//		
//		if(percent>=40&&sub1>=33&&sub2>=33&&sub3>=33) {
//			System.out.println("Congratulation,You have been Pramoted.");
//		}
//		else {
//			System.out.println("Sorry,you have not Pramoted ,Try again.");
//		}
//		
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter your Income.");
//		float income=sc.nextFloat();//income is laks
//		float tax=0;
//		if(income<2.5f) {
//			tax=tax+0;
//		}
//		else if(income>2.5f && income<5.0f) {
//			tax=tax+0.05f*(income-2.5f);
//		}
//		else if(income>5.0f && income<=10f) {
//			tax=tax+0.05f*(income-2.5f);
//			tax=tax+0.2f*(income-5.0f);
//		}
//		else if(income>10.0f) {
//			tax=tax+0.05f*(income-2.5f);
//			tax=tax+0.2f*(income-5.0f);
//			tax=tax+0.3f*(income-10.0f);
//		}
//		System.out.println("Tax paid by employee is:"+tax);
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter a day number.");
//		int number=sc.nextInt();
//	
//		switch(number){
//		case 1:System.out.println("Monday");
//	           break;
//	    case 2:System.out.println("Tuesday");
//			   break;      
//	    case 3:System.out.println("Wednesday");
//			   break;
//		case 4:System.out.println("Thursday");
//			   break;
//		case 5:System.out.println("Friday");
//			   break;	
//	    case 6:System.out.println("Saturday");
//			   break;	
//		case 7:System.out.println("Sunday");
//			   break;
//	   default:System.out.println("No any day accur.");   
//	   }
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a website");
		String website=sc.next();
		
		if(website.endsWith(".com")) {
			System.out.println("Commertial website");
		}
		else if(website.endsWith(".org")) {
			System.out.println("Organisation website");
		}
		else if(website.endsWith(".in")) {
			System.out.println("Indian website");
		}
		
		
		
		
		
		
		
		
		
	}

}
