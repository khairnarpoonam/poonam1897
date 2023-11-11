package poonamdemo;

import java.util.Scanner;

  public class MyNameFunction {
  public static void printName(String name) {//function name start with small letter then used capital call camel case
	   System.out.println(name);
           return;
    }
	
	public static void main(String args[]) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in) ;
	    String name=sc.next();
		printName(name);//call kiya function ko
		}

	
	}


