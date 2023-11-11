package harrystutorialcode;

import java.util.Scanner;

public class Chp_4Practice_set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Problem->1
		/*int a=17;
		 if(a==11) {
			 System.out.println("I am 11");
		 }
		 else{
			 System.out.println("I am not 11");
		 }*/
		
		//Problem->2
		/*System.out.println("Enter a marks of 3 subject");
		Scanner sc=new Scanner(System.in);
        
		System.out.println("Enter a marks of Physics");
		byte m1=sc.nextByte();
		
		System.out.println("Enter a marks of Chemistry");
		byte m2=sc.nextByte();
		
		System.out.println("Enter a marks of Math");
		byte m3=sc.nextByte();
		  
		float avg=(m1+m2+m3)/3.0f;
		 if(avg>=40 && m1>=33 && m2>=33 && m3>=33) {
			 System.out.println("Congratulation,You have been Promoted ");
			 }
		 else {
			 System.out.println("Sorry,you have not Promoted,Try again");
		 }*/
		 
		 //Problem->3
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Income: ");
		float income=sc.nextFloat();
		float tax=0;
		
		if(income<2.5f) {
			tax=tax+0;
		}
		else if(income>2.5 && income<=5){
			tax=tax+0.05f * (income-2.5f);//o/p->0.1
		}
		else if(income>5 && income<=10) {
			tax=tax+0.05f* (5.0f-2.5f);
			tax=tax+0.2f * (income-5.0f);
		}
		else if(income>10) {
			tax=tax+0.05f * (5.0f-2.5f);
			tax=tax+0.2f * (10.0f-5.0f);
			tax=tax+0.3f * (income-10.0f);
	     }
		System.out.println("Tax paid by the employee is: " +tax);
	*/


        //Problem no.->4
    /*Scanner sc=new Scanner(System.in);
    System.out.println("Enter a day...");
    int day=sc.nextInt();
    
    switch(day) {
    case 1:System.out.println("Monday");
           break;
    case 2:System.out.println("Tuesday");
           break;
    case 3:System.out.println("Wednesday");
           break;
    case 4:System.out.println("Thursday");
           break;
    case 5:System.out.println("Friday");
           break;
    case 6:System.out.println("Saturday");
            break;
    case 7:System.out.println("Sunday");
           break;
    default:System.out.println("no any day");       

    } */  
    
    //Problem 6
	/*Scanner sc = new Scanner(System.in); {
		String website=sc.next();
		
		if(website.endsWith(".com")) {
			System.out.println("this website is Commertial ");
		}
		else if(website.endsWith(".org")) {
			System.out.println("this website is Organisation ");
		}
		else if(website.endsWith(".in")) {
			System.out.println("this website is Indian ");
		}
		
		else {
		System.out.println("no such a type of website");
		}
	}*/





       //Problem no->5

        int year;
         boolean leap=true;
         Scanner sc=new Scanner(System.in);
         System.out.println("Enetr a year:  ");
         year=sc.nextInt();
         
         if(year % 4 == 0) {
        	 leap=true;
         }
        	 /*if(year % 100 == 0) {
        		 if(year % 400 == 0) {
        			 leap=true;
        		 }else{
        		    leap=false;
        		 }
        		 leap=false;
        	 }else {
        		 leap=true;
        	 }
         }*/else {
        		 leap=false;
        		 }
         
         System.out.println(year +"this year is leap year. " +leap);
	
	}
	
}





	



	
