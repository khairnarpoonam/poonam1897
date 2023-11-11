package harrystutorialcode;

class EkClass{                 //custom class
	int a;
	
	public int getA() {        //getter
		return a;
	}
	
	EkClass(int a) {     //constructor with 1 parameter
		this.a=a;
		System.out.println("I am constructor of EkClass with parameter a is." +a);
	}
	
	public int retrunOne() {       //method
		return 5;
	}
	
}

class DoClass extends EkClass{  //inheritance class
	
	DoClass(int c){              //constructor with 1 parameter
		super(4);                 //keyword call parent constructor  
		System.out.println("I am a constructor of DoClass.");
	}
}
public class This_Super_Keyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EkClass e=new EkClass(5);
		DoClass d=new DoClass(3);
		
		System.out.println(e.getA());
		e.retrunOne();

	}

}
