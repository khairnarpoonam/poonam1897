package harrystutorialcode;

import java.util.Scanner;
class MaxRetriesException extends Exception{
	
}

class MaxIndexException extends Exception{
	public String toString() {
		return "Input the Index value not greater than 2";
	     }
	public String getMessage() {
		return "Make sure that the index value is in limit or correct";
	   }
	
}

public class Chp_14Practice_Set {

	public static void main(String[] args)throws MaxRetriesException ,MaxIndexException  {
		// TODO Auto-generated method stub
		//problem no 1
		//int a=4 ->Syntax Error no ;
        int age=78;
        int year_born =2000-78;//->Logical Error
       // System.out.println(6/0); //->Run Time Error
        
        //Problem no.2
        try {
        	int a=666/0;
        }
        catch(ArithmeticException e){
        	System.out.println("HaHa");
        }
        catch(IllegalArgumentException e) {
        	System.out.println("HeHe");
        }
        //Problem no.3
        boolean flag=true;
        int i=0;
        int index;
        int[] marks=new int[3];
        marks[0]=8;
        marks[1]=33;
        marks[2]=24;
        Scanner sc=new Scanner(System.in);
        while(flag && i<5) {
        	try {
        	System.out.println("Enter your index input");
        	index=sc.nextInt();
        	System.out.println(" The value of index input " +marks[index]);
           	break;
        	}
            catch(Exception e){
            System.out.println(e.toString());
            System.out.println(e.getMessage());
            //e.printStackTrace();
        	//System.out.println("Invalid Index");
              i++;
            }
         }
        if(i>=5) {
        	System.out.println("ERROR");
           throw new MaxIndexException ();
           //throw new MaxRetriesException();
        }
	}

}
