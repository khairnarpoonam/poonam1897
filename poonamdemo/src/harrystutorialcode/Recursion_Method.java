package harrystutorialcode;

public class Recursion_Method {
	/*static int factorial(int n) {
		if(n==0||n==1) {
			return 1;
		}
		else {
			return n*factorial(n-1);
		}
		
	}
	static int factorial_iteration(int n) {
		if(n==0||n==1) {
			return 1;
		}
		else {
			  int product=1;
			for(int i=1;i<=n;i++) {
			  product *= i;
			  
			}
			return product;
		}
	}*/
	static int fibnocci(int n) {
		int n1=0;int n2=1; int sum=0;
		System.out.print(n1 + " " + n2 );
		   for(int i=0;i<n;i++) {
			sum=n1+n2;
			System.out.print(" "+sum+" ");
			n1=n2;
			n2=sum;
		}
			return sum;
		
	}	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int x=5;
   // System.out.println("The factorial of x is: " + factorial(x));
   //System.out.println("The factorial value of x is:" + factorial_iteration(x));
	System.out.println("the fibnocci series is :"  +  fibnocci(x));
	}
}
