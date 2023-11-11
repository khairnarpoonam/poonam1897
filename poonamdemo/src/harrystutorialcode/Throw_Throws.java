package harrystutorialcode;
class NegativeRadiusException extends Exception{   //custom class
	public String toString() {
		return "Radius can not be Negative! ";
	}
	public String getMessage() {
		return "radius can not be Negative!";
	}
}	

public class Throw_Throws {

public static double area(int r) throws NegativeRadiusException{
		if(r<0) {
			throw new NegativeRadiusException();//custom class throw
		}
		double result=Math.PI*r*r;
		return result;
	}
public static int divide(int a,int b)throws ArithmeticException{
	//made by harry
	int result=a/b;
	return result;
    }
public static void main(String[] args) {
	// TODO Auto-generated method stub
	//Shivam uses divide function created by Harry
	try {
		int c=divide(6,0);      //Exception
		System.out.println(c);
		double ar=area(-2);      //Exception
		System.out.println(ar);
	}
	catch(Exception e) {
		System.out.println("Exception");
	}
	}

}
