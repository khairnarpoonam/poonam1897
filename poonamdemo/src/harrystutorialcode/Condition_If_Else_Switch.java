package harrystutorialcode;

import java.util.Scanner;

public class Condition_If_Else_Switch {

	

	public static void main(String[] args) {
		// TODO Auto-generated method 
       //int age=18;
       /*boolean cond=(age==18);
       if(cond) {
    	   System.out.println("You are Adult");
    	     }
       else {
    	   System.out.println("You are not Adult");
       }*/
		
       /*if(age>18) {
    	   System.out.println("You are Adult");
    	     }
       else {
    	   System.out.println("You are not Adult");
       }*/
       
       /*System.out.println("enter input from user");
       Scanner sc=new Scanner(System.in);
       
       boolean a=sc.nextBoolean();
       boolean b=sc.nextBoolean();
       System.out.println("For logical AND....");
       // boolean a=true;
       //boolean b=false;
       
       if(a&&b) {
    	   System.out.println("Yes");
    	  }
       else   {
    	   System.out.println("No");
       }
       
       
       System.out.println("For logical OR....");
       
       if(a||b) {
    	   System.out.println("Yes");
       }
       else {
    	   System.out.println("No");
       }
       
       
       System.out.println("For logical NOT...");
       
       System.out.print("Not(a) is:  ");
       System.out.println(!a);
       System.out.print("Not(b) is:  ");
       System.out.print(!b);*/
       
       //System.out.println("Enter your age");
       Scanner sc=new Scanner(System.in);
        //int age=sc.nextInt();
       
        
        /*if(age>56) {
        	System.out.println("You are Experienced!");
        }
        else if(age>46) {
        	System.out.println("You are semi-Experienced!");
        }
        else if(age>36) {
        	System.out.println("You are semi-semi-Experienced!");
        }
        else {
        	System.out.println("You are not Experienced!");
        }
       
        if(age>2) {
        	System.out.println("You are not a baby!");
        }*/
       /* switch(age) {
        case 18:System.out.println("You are going to become a Adult!");
                break;
        case 23:System.out.println("You are going to join a Job!");
                break;
        case 60:System.out.println("You are going to become retired!");
                break;
        default:System.out.println("You are happy in your life");
        }*/
       System.out.println("Enter your name..");
        String str=sc.next();
        switch(str) {
        case "Poonam" :System.out.println("You are going to become a Adult!");
                break;
        case "Piyush" :System.out.println("You are going to join a Job!");
                break;
        case"Prashant":System.out.println("You are going to become retired!");
                break;
        default:System.out.println("You are happy in your life");
        }
        
        }
	
}
	
	


