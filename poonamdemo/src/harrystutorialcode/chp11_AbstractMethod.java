package harrystutorialcode;

abstract class parent{
	public void sayhello() {
		System.out.println("HELLO");
	}
     abstract void greet();
		
}
class Child extends parent{
	public void on() {
		System.out.println("turning on.");
	}
	 void greet() {
		System.out.println("Good morning");
	}
}
abstract class child1 extends parent{
	void off() {
		System.out.println("turnning off");
	}
}

public class chp11_AbstractMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//parent obj=new parent();   //--error
        Child c=new Child();
        //child1 gc=new child1();    //--error
        c.greet();
        c.sayhello();
        c.on();
        //c.off();                  //--error
       
	}

}

