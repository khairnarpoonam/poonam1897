import java.util.Scanner;

public class Nested_try_catch_block {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] marks=new int[3];
		marks[0]=45;
		marks[1]=65;
		marks[2]=55;
		Scanner sc=new Scanner(System.in);
		boolean f=true;
		while(f) {
			System.out.println("Enter your array index as a input");
		    int ind=sc.nextInt();
		try {
			System.out.println("Welcone in java video 82");
			
		try{
			System.out.println(marks[ind]);
			f=false;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("sry this index does not exist!");
		    System.out.println("Exception in level 2");
		   }
		}
		catch(Exception e) {
			System.out.println("Exception Occured in level 1");
			System.out.println(e);
			}
		
		}
		
	}

}
