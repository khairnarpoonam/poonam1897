package harrystutorialcode;

interface Bicycle{
	final int a=45;       //can not change at run time
	void applyBreak(int decrement);
	void speedup(int increment);
	default String[] bicyclename() {
		System.out.println("names of bicycle");
		String[] bicyclename= {"Atlas","ladybird","birdflue"};
		return bicyclename;
	}
}

interface HornBicycle{
	int x=45;
	void blowhornk3g();
	void blowhornmhn();
}
class AvonCycle implements Bicycle,HornBicycle{
	int speed;
	//int x=15;
	
	void Blowhorn() {
		System.out.println("pee pee poo poo");
	}
    public void applyBreak(int decrement) {
	  System.out.println("Applying Break.");
		}
    public void speedup(int increment) {
    	System.out.println("Applying Speed Up.");
    }
    public void blowhornk3g() {
    	System.out.println("Kbhi Khushi Kbhi Gum pee pee");
    }
    public void blowhornmhn() {
    	System.out.println("Main Hoon Na poo poo");
    }
}
public class Interfaces_in_java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AvonCycle AC=new AvonCycle();
		AC.Blowhorn();
		AC.applyBreak(1);
		AC.speedup(1);
		AC.blowhornk3g();
		AC.blowhornmhn();
		String[] arr=AC.bicyclename();
		for(String item:arr) {
			System.out.println(item);
		}
		//AC.x=40;             //--error cant change value at time this is fix
	    System.out.println(AC.x);
		//you can create properties in interfaces
       //System.out.println(AC.a);
       //You can not modify the properties in interfaces as they are final
       //AC.a=454;            //--error
       //System.out.println(AC.a);
	}

}
