package harrystutorialcode;

class Phone{
	public void Showtime() {
		System.out.println("Time is 8am.");
	}

    public void meth() {
    	System.out.println("I am a method of class phone");
    	
    }
}
class SmartPhone extends Phone{
	public void music() {
		System.out.println("playing music.");
	}
	public void meth() {        //overriding method
	System.out.println("I am a method of class SmartPhone.");
	}
}
public class Dynamic_Method_Dispatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Phone p=new Phone();
		SmartPhone sp=new SmartPhone();
		Phone ps=new SmartPhone();  //Dynamic Method Dispatch
		ps.meth();   //execute meth of SmartPhone
        sp.meth();
	     p.meth();
		sp.music();
		//ps.music();  //give error only execute the method of phone not a SmartPhone
	      ps.Showtime();
	      sp.Showtime();
	      p.Showtime();
	      sp.music();
	      
	}

}
