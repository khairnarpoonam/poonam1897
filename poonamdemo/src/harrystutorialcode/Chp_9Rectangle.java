package harrystutorialcode;

class Sphere{
	int radius;
	
	public double volumOfSphere() {
		return (1.33f*Math.PI*radius*radius*radius);    //1.33f=4/3 but written in this form
	}
	public double surfaceOfSphere() {
		return 4*Math.PI*radius*radius;
	}
	public Sphere() {      //constructor
		radius=6;
	}
	public Sphere(int r) {   //consructor overloaded
		radius=r;
	}
	public void setRadius(int r) {
		radius=r;
	}
	public int getRadius() {
		return radius;
	}
}
class Rect{
	int length;
	int breadth;
	
	
	public int getLength() {
		return length;
	}
	public void setLength(int l) {
		this.length = l;
	}
	public int getBreadth() {
		return breadth;
	}
	public void setBreadth(int b) {
		this.breadth = b;
	}
	
	
	public Rect() {
		length=10;
		breadth=5;
	}
	public Rect(int l,int b) {
		length=l;
		breadth=b;
	}
}

public class Chp_9Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rect rc=new Rect();      //object for rectangle custom class
	    Sphere sp=new Sphere();   //object for Sphere custom class
		
	    System.out.println(sp.volumOfSphere());
	    System.out.println(sp.surfaceOfSphere());
	    System.out.println(rc.getLength());
		System.out.println(rc.getBreadth());
		System.out.println(sp.getRadius());
        	}

}
