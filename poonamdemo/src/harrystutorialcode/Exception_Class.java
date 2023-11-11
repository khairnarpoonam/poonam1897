package harrystutorialcode;

import java.util.Scanner;

class MyException extends Exception{
	
	public String toString() {
		return "I am toString()";
	}
	public String toMessage() {
		return "I am getMessage()";
	}
}
class MyNewException extends Exception{
	public String toString() {
		return "Age cannot be Greater than 125.";
	}
	public String toMessage() {
		return "Make sure that the value of age entered is correct";
	}
}

public class Exception_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int a;
	      Scanner sc=new Scanner(System.in);
	      System.out.println("Enter the input");
	      a=sc.nextInt();
	  if(a<9)
		try {
		 // throw new MyException();//MyException class as a method throw 
		  throw new ArithmeticException ("This is an Exception"); 
		}
		catch(Exception e){
			System.out.println(e.toString());
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.out.println("pgm finished!");
		}
		    System.out.println("Finished!");
	}

}
