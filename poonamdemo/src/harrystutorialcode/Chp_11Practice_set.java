package harrystutorialcode;

abstract class Telephone{
	abstract void ring();
	abstract void lift();
	abstract void disconnect();
	
}
class SmartTelephone extends Telephone{
	public void ring() {
		System.out.println("Ringing..");
	}
	public void lift() {
		System.out.println("Lifting...");
	}
	public void disconnect() {
		System.out.println("Disconnecting...");
    }
    public void meth() {
    	System.out.println("I am Method of SmartPhone");
	}
}

/*abstract class Pen{
	abstract void write();
	abstract void refill();
} 
class FountainPen extends Pen{
	public void changenib() {
		System.out.println("Change the nib!");
	}
	public void write() {
		System.out.println("I am method write!");
	}
	public void refill(){
		System.out.println("I am method refill!");
	}
	
}*/
/*class Monkey{
	public void bite() {
		System.out.println("Bite monkey.");
	}
	public void jump() {
		System.out.println("Jump monkey.");
	}
}
interface BasicAnimal{
	void eat();
	void sleep(); 
}
class Human extends Monkey implements BasicAnimal{
	public void eat() {
		System.out.println("eating");
	}
	public void sleep() {
		System.out.println("sleep");
	} 
	public void speak() {
		System.out.println("Speak human");
	}
}*/

public class Chp_11Practice_set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("I am main Method!");
		/*Pen p=new FountainPen();
        FountainPen fp=new FountainPen();
        fp.changenib();
        fp.write();
        fp.refill();
        p.refill();
        p.write();
       // p.changenib();   //this method is not execute becz this method from sub class
        */
         /* Human h=new Human();
          BasicAnimal ba=new Human();
          Monkey m=new Human();
		  //ba.speak();
          //m.speak();
          h.speak();*/
		
		Telephone tel=new SmartTelephone();//Demonstrative Polymorphism
          tel.ring();
          tel.lift();
          tel.disconnect();
          //tel.meth();
        SmartTelephone st=new SmartTelephone();//sub class object execute all methods
        st.ring();
        st.lift();
        st.disconnect();
        st.meth();
        
	}

}
