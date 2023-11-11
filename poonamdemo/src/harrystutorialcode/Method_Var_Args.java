package harrystutorialcode;

public class Method_Var_Args {
	static int sum(int a,int...arr) {//int a is given to method sum pass atleast 1 argument in calling
		int result=0;
		for(int element:arr) {
			result += element;
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
   System.out.println("Welcome to varargs tutorial!");
   System.out.println("The sum of values 4 and 5 : " +  sum(4,5));
   System.out.println("The sum of values2,4 and 5: " + sum(2,4,5));
   System.out.println("The sum of values3,2,4 and 5: " + sum(3,2,4,5));
   System.out.println("The sum of values1,3,2 4 and 5: " + sum(1,3,2,4,5));
   System.out.println("The sum of values 4: " + sum(4));//pass atleast 1 argument because int a in method
			
	}

}
