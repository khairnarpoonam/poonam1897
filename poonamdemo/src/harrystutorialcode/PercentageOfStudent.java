package harrystutorialcode;

import java.util.Scanner;

public class PercentageOfStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("Enetr 1st Subject Marks");
		int s1=sc.nextInt();
		System.out.println("enter 2nd subject marks");
		int s2=sc.nextInt();
		System.out.println("enter 3rd subject marks");
		int s3=sc.nextInt();
		System.out.println("enter 4th subject marks");
		int s4=sc.nextInt();
		System.out.println("enter 5th subject marks");
		int s5=sc.nextInt();
		int total_marks=s1+s2+s3+s4+s5;
		System.out.println(total_marks);
		float percentage=total_marks*100/500;
		System.out.println(percentage);
	}

}
