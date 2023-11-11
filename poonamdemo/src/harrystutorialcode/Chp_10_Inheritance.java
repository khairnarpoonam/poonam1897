package harrystutorialcode;

class Base{
	public int x;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		System.out.println("The value of X in class Base.");
		this.x = x;
	}
	 
	public void PrintMe() {
		System.out.println("I am a Method of Base class.");
	}
	
}
class Derived extends Base{   //Inheritance is used in this class using extends keyword
	
	public int y;

	public int getY() {
		return y;
	}

	public void setY(int y) {
		System.out.println("The value of Y is in derived Class.");
		this.y = y;
	}
	
}	

public class Chp_10_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Base b=new Base();
		b.setX(5);
		System.out.println(b.getX());
		
		Derived d=new Derived();
		d.setY(4);
		System.out.println(d.getY());
		d.setX(10);
		System.out.println("The value of x is call from Derived class. \n"+ d.getX());

		d.PrintMe();
		b.PrintMe();
	}

}
