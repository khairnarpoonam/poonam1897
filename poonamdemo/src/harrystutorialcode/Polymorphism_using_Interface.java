package harrystutorialcode;

interface micamera{
	void takephoto();
	void takevideo();
	void shortvideo();
	default void portrait() {
		System.out.println("Take photo in portrait mode..");
	}
}
interface GPS{
	void foryou();
	void topcharts();
	void children();
	void event();
	default void categories() {
		System.out.println("Take many option like Action,Adventure");
	}
}
interface mediaplayer{
	void playlist();
	void charts();
	void radio();
	void videos();
}
class cellphone3 {
	void google() {
		System.out.println("Search world Information");
	}
	void calculator() {
		System.out.println("used in mathetical calculation");
	}
	String[] calendor() {
	String[] weekday= {"mon","tue","wed","thur","fri","sat","sun"};
	return weekday;
	}
}
class MiSmartPhone extends cellphone3 implements micamera,GPS,mediaplayer{
	public void takephoto() {
		System.out.println("taking closeup pick...");
	}
	public void takevideo() {
		System.out.println("taking video properly..");
	}
	public void shortvideo() {
		System.out.println("make Short video..");
	}
	public void foryou() {
		System.out.println("games are making for you.");
	}
	public void topcharts() {
		System.out.println("play games using chart form.");
	}
	public void children() {
		System.out.println("Games for children");
	}
	public void event() {
		System.out.println("games event to play.");
	}
	public void playlist() {
		System.out.println("list of song");
	}
	public void charts() {
		System.out.println("charts in game");
	}
	public void radio() {
		System.out.println("radio mode is on");
	}
	public void videos() {
		System.out.println("video song play");
	}
	public void gallery() {
		System.out.println("stored photoes in gallery");
	}
	
}
public class Polymorphism_using_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MiSmartPhone obj=new MiSmartPhone();
		obj.calculator();
	    String[] arr = obj.calendor();
	    for(String item:arr)
	    	System.out.println(item);
	    obj.gallery();
	    obj.google();
	    obj.portrait();
//make reference from interface and object from class miSmartphone	    
// Similarly dynamic method dispatch  
	    GPS g=new MiSmartPhone(); //polymorphism used here
	    g.children();
	    g.topcharts();
	    g.categories();
	    //g.calculator();  //->error is not the method of GPS
	    mediaplayer mp=new MiSmartPhone(); //dynamic method dispatch or polymorhism
	    mp.radio();
	    mp.videos();
	  //mp.gallery;  ->this method is not in mediaplayer is the method of class mismartphone
	  
	
	
	}

}








