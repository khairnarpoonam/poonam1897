package harrystutorialcode;

class Rectangle1{
	
	public int breadth;
	public int length;
	
	public void setBreadth(int b) {
		this.breadth=b;
	}
	public int getBreadth() {
		return breadth;
	}
	public void setLength(int l) {
		this.length=l;
	}
	public int getLength() {
		return length; 
	}	
	public int AreaOfRectangle(){
	return breadth*length;
	}
	public int PerimiterOfRectangle() {
		return 2*(length+breadth);
	}
	Rectangle1(){
	System.out.println("I am a rectangle of without para constructor");
	}
	Rectangle1(int l,int b){
	System.out.println("I am a rectangle of with parameter constructor.");	
	}
}
class Cuboid extends Rectangle1{
	public int height;
	public int getHeight() {
		return height;
	}

	public void setHeight(int h) {
		this.height = h;
	}
	Cuboid(int l,int b,int h){
		super(2,3);
		System.out.println("I am a constructor of with parameter.");
	    this.height=h;
	}
	public int VolumOfCuboid() {
		return AreaOfRectangle()*height;
	}
	Cuboid(){
		System.out.println("I am a constructor of Cuboid without parameter");
	}
	
}
	

public class Rectangle_Cuboid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle1 rec=new Rectangle1();  //method of rectangle
		rec.setBreadth(3);
        rec.setLength(3);
		System.out.println("area of rectangle"+rec.AreaOfRectangle());
        System.out.println("perimeter of rectangle"+rec.PerimiterOfRectangle());
        System.out.println(rec.getLength());
        System.out.println(rec.getBreadth());
		Cuboid cu=new Cuboid();  //method of cuboid
		cu.setHeight(3);
		cu.setBreadth(3);
		cu.setLength(4);
		System.out.println(cu.getHeight());
        System.out.println(cu.getBreadth());
        System.out.println(cu.getLength());
        System.out.println("Volum of cuboid"+cu.VolumOfCuboid());
             
        }

}
