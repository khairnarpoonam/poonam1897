package harrystutorialcode;

class myemployee{           //custom class
	private int id;                 //Attributes
	private String name;
	
	public void setName(String n) {
		 name=n;
	}
	public String getName() {
		 return name;
		}
	public void setId(int i) {
		 id=i;
	}
	public int getId() {
		return id;
	}
	
}

public class Access_Modifire_Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		myemployee siso=new myemployee();//object
		
		//set attribute
		//siso.id=1;         //->create a error getter and setter
		//siso.name="Ram";
		
		//call method assign values of setter
		siso.setId(1);
		siso.setName("Ram");
		
		//call method and print getter
		System.out.println(siso.getId());
		System.out.println(siso.getName());

	}

}
