package harrystutorialcode;

import java.util.Scanner;

public class Chp_2_Practice_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Question no.1
		
		//float a=7/4*9/2;//o/p->4.0
		//float a=7/4.0f*9/2.0f;//o/p->7.875
		//System.out.println(a);
		
		//Question no.2
		//(char)is the type cast
		//encrypt_grade
        char grade='A';
        //grade=(char)(grade + 8);//char+int->int we want grade so add(char)
        //System.out.println(grade);//->o/p I
	
	    //decrypt grade
        //grade=(char)(grade - 8);//char+int->int we want grade so add(char)for type cast
        //System.out.println(grade);//o/p->A
        
	
        //Question no.3
       // int a=10;
        //Scanner sc=new Scanner(System.in);
        //System.out.println("Enter a Number");
        //int b=sc.nextInt();
        //if(b>a) {
        //	System.out.println("User's no.is greater");
        //}else {
        //	System.out.println("User's no.is not greater");
        //}
        //System.out.println(b>6);
        
        
        //Question no.4
       /* int v=8;
        int u=3;
        int a=2;
        int s=1;
       // int exp=(v*v)-(u*u)/2*a*s;//o/p->56
       // int exp=(v*v)-(u*u)/(2*a*s);//0/p->62
        int exp=((v*v)-(u*u))/(2*a*s);//o/p->13
        System.out.println(exp);*/

        //Qyestion no.5
        int x=7;
        int a=7*49/7+35/7;
        System.out.println(a);
        
	}


}
