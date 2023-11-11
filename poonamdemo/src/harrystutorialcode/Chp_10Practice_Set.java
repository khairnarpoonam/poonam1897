
package harrystutorialcode;

class Circle{
	public int radius;
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	Circle(){
		System.out.println("I am non parametrized constructor .");
	}
	
	Circle(int r){
		System.out.println("I am parameterized constructor. ");
		this.radius=r;
	}
	
	public double Area() {
		return Math.PI*radius*radius;
	}
}
class Cylinder extends Circle{
	public int height;
	//public int radius;
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	Cylinder(){
		System.out.println("I am non parameterized constructor ");
	}

	Cylinder(int r,int h){
	     //super(2);
		System.out.println("I am parameterized constructor");
		this.height=h;
	}
		
  public double Volume() {
	  return Math.PI*radius*radius*height;
  
	}
}
public class Chp_10Practice_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle c=new Circle(2);
		Cylinder cl=new Cylinder(2,3);//take radius from super keyword height take from the same object object 
        //c.setRadius(5);
        System.out.println(c.getRadius());
        System.out.println("Area of Circle"+c.Area());
        //cl.setHeight(4);
        System.out.println(cl.getHeight());
        System.out.println("Volume of Cylinder"+cl.Volume());
          
	}

}
