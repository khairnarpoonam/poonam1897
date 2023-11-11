package harrystutorialcode;

class Cylinder2{            //custom class
	private int radius;   //access modifire private or attribute
	private int height;
	
	//constructor used in Question 3
	public Cylinder2() {
		radius=10;
		height=22;
	}
	public Cylinder2(int r,int h) {   //constructor overloaded
		radius=r;
		height=h;
	}
	public float volumOfCylinder() {    //method
		return 3.14f*radius*radius*height;
	}	
	public float surfaceArea() {
		return 2*3.14f*radius*height+2*3.14f*radius*radius;
	}
	
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
}

public class Chp_9Practice_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cylinder2 cl=new Cylinder2(4,8);    //object
		/*cl.setRadius(5);          //set attribute by using object
		cl.setHeight(8);
		cl.surfaceArea();
		cl.volumOfCylinder();*/
		
		//print method
		System.out.println("Volum Of cylinder is: " +cl.volumOfCylinder());
		System.out.println("Total surfaceArea of Cylinder is: " +cl.surfaceArea());
		System.out.println("Radius of the Cylinder: " +cl.getRadius());
		System.out.println("Height of the Cylinder: " +cl.getHeight());

	}


	}


