package harrystutorialcode;

import java.util.Scanner;

public class Loops_Code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//code to print 1 to natural no.10
		
		/*int i=100;
		while(i<=200) {
			System.out.println(i);
			i++;
		}*/
		
		
		//Scanner sc=new Scanner(System.in);
		//System.out.println("Enetr a number...");
        //int n=sc.nextInt();
	    //int i=1;
	    /*while(i<=n) {
	    	System.out.println(i);
	    	i++;
	    }*/
	
       /* int i=24;
	do {
		System.out.println(i);
		i++;
	}while(i<=20);*/
		
		//odd number
		/*for(int i=0;i<=n;i++) {
		System.out.println(2*i+1);
		}*/
		
		
		//even no.
		/*for(int i=1;i<=n;i++) {
			System.out.println(2*i);
		        }*/
        
        //table of 2
       // for(int i=1;i<11;i++) {
        //	System.out.println(n*i);
       // }
        	
		//print reverse no.
       // for(int i=10;i>0;i--) {
        //	System.out.println(i);
        //}
		
		//break for for loop
      /* for(int i=0;i<5;i++){
        	System.out.println(i);
        	System.out.println("Java is great.");
        	if(i==2) {
        		System.out.println("Ending the loop.");
        		break;
        	}
       
       }
        	System.out.println("Loop ends here.");*/
       
       //break for while loop
         /*     int i=0;
        	while(i<5) {
        		System.out.println(i);
        		System.out.println("Piyush and Pranit.");
        		i++;
        		if(i==2) {
        			System.out.println("Ending the loop.");
        		     break;
        		}
        	     
        	}
		
        	System.out.println("loops ends here.");*/
		
		//break for do while loop
        	/* int i=0;
         	do{
         		i++;
         		if(i==2) {
         			System.out.println("Ending the loop.");
         		     continue;
         		}
         		System.out.println(i);
         		System.out.println("Piyush and Pranit.");
         	     
         	}while(i<5);
	    
         	System.out.println("loops ends here.");
         	*/
         //continue for for loop
         	/*for(int i=0;i<5;i++) {
         		
         		if(i==2) {
         			System.out.println("Ending the loops.");
         			continue;
         		}
         		System.out.println(i);
         		System.out.println("Piyu and Pranit");
         	}
              System.out.println("loop ends here");*/
         	 
		  //continue for while loop
		int i=0;
		while(i<5) {
			//System.out.println(i);
			//System.out.println("piyu and pranu");
		        i++;
				
		        if(i==2) {
				System.out.println("ending the loop");
				continue;
			}
			
			System.out.println(i);
		    System.out.println("piyu and pranu");
		
		}
		System.out.println("loop ends here.");
		
         	}
        
	}



