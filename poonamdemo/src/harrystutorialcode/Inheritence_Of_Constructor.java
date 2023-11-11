package harrystutorialcode;

class Basic1{
	
 public Basic1() {
		System.out.println("I am a constructor in Base1.\n");
	}
 
 public Basic1(int x) {
	    System.out.println("I am an overloaded constructor of class Basic1 with parameter x :"+x);
 }
 
}
 
class Derived1 extends Basic1{
	
public Derived1(int x,int y){
	super(x);
	System.out.println("I am an overloaded constructor of class Derived1 with parameter y is :" +y);
	}
public Derived1() {
	//super();
	System.out.println("I am a constructor of class Derived1.");
  }
}
class ChildOfDerived extends Derived1{
  ChildOfDerived(){
	  //super();
	  System.out.println("I am an constructor of childofderived. ");
	  }	
  ChildOfDerived(int x,int y,int z){
	  super(x, y);
	 System.out.println("I am an Overloaded constructor of childofderived class with parameter z as:" +z); 
  }
}
public class Inheritence_Of_Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Basic1 b=new Basic1(3);
		//Derived1 d=new Derived1();
        //ChildOfDerived cd=new ChildOfDerived();
	}

}
