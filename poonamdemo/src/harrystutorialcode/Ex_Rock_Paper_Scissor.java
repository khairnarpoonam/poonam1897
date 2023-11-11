package harrystutorialcode;

import java.util.Random;
import java.util.Scanner;

public class Ex_Rock_Paper_Scissor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//0 for Rock
		//1 for Paper
		//2 for Scissor
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 0 for Rock,1 for Paper,2 for Scissor");
        int userInput=sc.nextInt();
        
        Random random=new Random();
        int computerInput=random.nextInt();
        
        if(userInput==computerInput) {
        	System.out.println("draw");
        }
        else if(userInput==0||computerInput==2 && userInput==1||computerInput==0
        	&&userInput==2||computerInput==1) {
        	System.out.println("You win");
       }else {
	       System.out.println("computer win");
          }
 
        if(computerInput==0) {
        	System.out.println("computer choice:Rock");
        }
        else if(computerInput==1) {
        	System.out.println("computer choice:Paper");
        }
        else if(computerInput==2){
        	System.out.println("computer choice:Scissor");
        }
 }
        		
	}


