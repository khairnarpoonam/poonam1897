package harrystutorialcode;

import java.util.Scanner;

public class Specific_Exception_by_catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] marks=new int[3];
		marks[0]=12;
		marks[1]=42;
		marks[2]=72;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array index");
		int ind=sc.nextInt();
		System.out.println("Enter the number witch divide array index values");
		int num=sc.nextInt();
		try {
			System.out.println("The value of array index is" +marks[ind]);
		System.out.println("the value of array index/number is" +marks[ind]/num) ;
		}
		catch(ArithmeticException e) {
			System.out.println("ArithmaticException occured!");
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundException occured!");
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println("Anather Exception is Occured");
		    System.out.println(e);
		}
		System.out.println("Exit the pgm");

	}

}
