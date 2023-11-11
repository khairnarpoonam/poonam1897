package harrystutorialcode;

class CellPhone{
	// initialise attribute
	String tune;
	String vib;
	
	//Method
	
	public String printRing(String n) {
		System.out.println("Ring of Cellphone..");
		return tune=n;
	}
	public String printVibrating(String v) {
		System.out.println("Sound of vibration..");
		return vib=v;
	}
	public void ring() {
		System.out.println("Ringing.....");
	}
	public void vibrate() {
		System.out.println("Vibrating...");
	}
	public void callfriend() {
		System.out.println("calling Sheetal....");
	}
	
}
class Employee1{
	int salary;
	String name;
	
	public void setName(String n) {
		name=n;
	}
	
	public String getName() {
		return name;
	}
	
	public int getSalary() {
		return salary;
	}
}	
class square{         //class
	int side;         //attribute
	
	public int area() {      //method
	return side*side;        //area of square=side*side=a^2
   
	}
	public int perimeter() {   //method
		return 4*side;        //perimiter of square=4*sise=4*a
	}
}
class rectangle{
	int width;
	int length;
	
	public int area() {
		return width*length;
	}
	public int perimeter() {
		return 2*width+2*length;
	}
	
}
class circle{
	int radius;
	
	public float area() {
		return 3.14f*radius*radius;
	}
	public float perimeter() {
		return 2*3.14f*radius;
	}
}

class tommy{
	
	public void hit() {
		System.out.println("Hitting the enemy.");
	}
	public void run() {
		System.out.println("Running from the enemy.");
	}
	public void fire() {
		System.out.println("Firing on the enemy.");
	}
}
public class Chp_8Practice_set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Problem no.1
		Employee1 piyu=new Employee1();//object
		Employee1 panu=new Employee1();
		
		//set attribut
		piyu.setName("POONAM");
		piyu.salary=2344;
		panu.setName("SHITAL");
		panu.salary=1233;
		
		//call function then print
		System.out.println(piyu.getName());
		System.out.println(piyu.getSalary());
		System.out.println(panu.getName());
		System.out.println(panu.getSalary());
		
		//Problem no.2
		CellPhone mi=new CellPhone();//object
         
		//set attribute
		//mi.tune="merabholahaibhandari";
		//mi.vib="guuuuuuuuuuur...";
		
		//call and print method
       // System.out.println(mi.printRing());
       // System.out.println(mi.printVibrating());
        
        //OR Question 2 
        mi.callfriend();
        mi.vibrate();
        mi.ring();
        
        //Problem no.3->square area and perimeter
        square sq=new square();//object
        sq.side=5;             //set attribute
        System.out.println(sq.area());
        System.out.println(sq.perimeter());
        
        //Problem no.->4 rectangle area and perimeter
        rectangle rec=new rectangle();
        rec.width=2;
        rec.length=4;
        System.out.println(rec.area());
        System.out.println(rec.perimeter());
        
        //Problem no.->5 Rockstar Game
        tommy player=new tommy();
        player.hit();
        player.run();
        player.fire();
        
        //Problem no.->6 circle area and perimeter
        circle cir=new circle();
        cir.radius=5;
        System.out.println(cir.area());
        System.out.println(cir.perimeter());
	}

}













