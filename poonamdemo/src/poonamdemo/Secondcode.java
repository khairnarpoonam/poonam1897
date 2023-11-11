package poonamdemo;

public class Secondcode {
	 //Swapping num

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		
		/*a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swaping value of a  and b is " +a+   +b);*/
        /* a=a*b;
         b=a/b;
         a=a/b;
        System.out.println("after swaping value of a  and b is " +a+   +b);*/
		/*b=a+b-(a=b);
		System.out.println("after swaping value of a  and b is " +a+   +b);*/
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("after swaping value of a  and b is " +a+   +b);
		
	}

}
