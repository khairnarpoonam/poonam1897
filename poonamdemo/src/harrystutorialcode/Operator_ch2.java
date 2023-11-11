package harrystutorialcode;

public class Operator_ch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    //1:Arithmatic operator
		int a=5;
		int b=4;
		int c=a+b;
		  c++;
		int d=a-b;
		int e=a*b;
		   e--;
		int f=a/b;
		int g=a%b;
		System.out.println(c);
		System.out.println(e);
		
	//2:Assignment Operator
		//int A=3;
		//int B=A;
		   //A += 3;
		   //A -= 1;
		   //A *= 8;
		   //A /= 2;
		   //  A %= 9;
		   //System.out.println(B);
		   //System.out.println(A);
		   
	//3:Comparison Operator
		   //int a=10;
		   //int b=10;
	 	   //System.out.println(a==b);//true
		   //System.out.println(a>=b);//true
		   //System.out.println(a>b);//false
		   //System.out.println(a<b);//false
		   //System.out.println(a<=b);//true
		   
	  //4:Logical operator
		   //int x=25;
		   //int y=30;
		   //int z=20;
		   //System.out.println(x<y && y>z);
		   //System.out.println(25<30 && 30>20);//true when both conditions are true in AND 
		   //System.out.println(x>y || y>z);//true in OR when at least one condition is true
		   //System.out.println(25>30 || 30<20);//false both conditions are false
          
		//5:Bitwise Operator	(& |)(0 1)
	       //System.out.println(2&3);//2->10 &3->11 o/p->10&11->10->2
	       //System.out.println(2|3);//o/p->11->3 OR
	       //System.out.println(2^3);//o/p->01->1 XOR same11 00 return false diffrent 10 01 return true
//error	        System.out.println(~2);//o/p->01->1
	       //System.out.println(2<<1);//o/p->100->4 left shift 100->4
	       //System.out.println(2>>1);//o/p->001->1 right shift 001->1
	
	}

	
}
