package harrystutorialcode;

public class Chp_7Practice_Set {
	//Problem No.->1
	static void table(int  n) {
	       
	       for(int i=1;i<=10;i++) {
		    // System.out.println("table of n no.is" +n*i);
	    	   System.out.format("%d*%d=%d\n",i,n,i*n);
		}
	       
	}
	//Problem No.->2
	static void pattern(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
	//Problem No.->3 add first n natural no.using function
	static int add(int n) {
		int sum=0;
		for(int i=0;i<=n;i++) {
			sum +=i;
		}
		return sum;
	}
	
	//problem no.->3add first n natural no.using recursion
	static int sumRec(int n) {
		//Base condition
		if(n==1) {
			return 1;
		}
		return n+sumRec(n-1);
	}
	//Problem No.->4 print pattern using fun/method
	static void pattern1(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i;j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		} 
	}
	
	//Problem No->5 Print nth term of Fibnocci series using Method
	static int fibnocci(int n) {
		int n1=0;int n2=1;int sum=0;
		System.out.print(n1 + " " + n2);
		
		for(int i=0;i<n;i++) {
		sum=n1+n2;
		System.out.print(" "+ sum +" ");
		n1=n2;
		n2=sum;
		}
		return sum;
	}
	//Problem No->5 Print nth term of Fibnocci series using recursion Method
	static int fib(int n) {
		if(n==1) {         //n->index 0 give 1
			return 0;
		}
		else if(n==2) {    //n->index 1 give 1
			return 1;
		}
		else {
			return fib(n-1)+fib(n-2);//add no.of index value
		}
	}
	
	//Problem no.6->Calculate avrage using set of given no.(vararg)
	static int avrage(int...arr) {
		int sum=0;
		int avg = 0;
		for(int e:arr) {
			sum +=e;
			avg=sum/2;
		}
		return avg;
	}
	//Problem no.8->repeat 2 using recursion
	static void pattern_rec(int n) {
		if(n>0) {
			pattern_rec(n-1);
			for(int i=0;i<n;i++) {
			System.out.print("*");	
			}
			System.out.println(" ");
		}
		
	}
	//problem no.7->repeat 4 using recursion
	static void pattern_Rec(int n) {//error
		if(n>0) {
			pattern_rec(n);
			for(int i=0;i<=n;i++) {
				for(int j=0;j<n-i;j++)
			System.out.print("*");	
			}
			System.out.println(" ");
		}
		
	}
	//problem no->problem no.3 recursion/iteration
	static int sum_Rec(int n) {
		if(n==0) {
			return 0;
		}
		else if(n==1) {
			return 1;
		}
		else {
			int add=0;
			for(int i=0;i<n;i++) {
				add +=i;
			}
		return add;
		}
		
	}
	static float CtoF(float n) {
		float cal=1;
		if(n==0) {
			return 32;
		}
		else {
			for(float i=1;i<=n;i++) {
				 cal=i*9/5+32;
				}
			
		}
		return cal;
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//problem 1
		//table(3);
		//problem 2
		//pattern(6);
		//problem 3
		//int x=5;
		//System.out.println("The sum of first 5 no.is: " +add(x));
		//problem 3 recursion
		//int c=sumRec(1);
		//System.out.println(c);
		//Problem 4 
	    //pattern1(6);
		//problem no 5
	    //int f=5;
	    //System.out.println("The fibnocci of 5 no.is:" +fibnocci(f));
//problem no.5 using recursion
//int result=fib(3);
//System.out.println(result);
	    //System.out.println("The avrage of given set is:" +avrage(1,4,2,3));
	    //System.out.println("The avrage of given set is:" +avrage(10,40,20,30));
	    //problem no 8
	   // pattern_rec(4);
//problem no 7
//pattern_Rec(4);
        //Problem no.->10
      //  int cal=sum_Rec(5);
      // System.out.println(cal);
        float a=0;
        System.out.println(CtoF(a));
	}

}
