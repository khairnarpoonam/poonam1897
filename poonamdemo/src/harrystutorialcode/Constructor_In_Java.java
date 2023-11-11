package harrystutorialcode;

class Employee2{
	private int salary;
	
	public Employee2(int i) {
		salary=i;
	}
	public Employee2() {
		salary=10000;
	}
	public void setSal(int s) {
		salary=s;
	}
	public int getSal() {
		return salary;
	}
}
/*class MyMainEmployee{
	private int id;
	private String name;
		
	public MyMainEmployee(int myid,String myname) {
		 id=myid;
		 name=myname;
	}
	public MyMainEmployee() {  //constructor overloaded same like a method overloaded
		id=1;
		name="Panu";
	}
	public MyMainEmployee(String myname) {
			name=myname;
	}
	public MyMainEmployee(int i) {
		id=i;
	}
		
	public void setId(int i) {
		id=i;
	}
	public void setName(String n) {
		name=n;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
}*/

public class Constructor_In_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//MyMainEmployee com=new MyMainEmployee("Krishna");
		  Employee2 code=new Employee2(10000);
		   //com.setId(10);    //avoid repetation of values assign
           //com.setName("JAVA");
           //System.out.println(com.getId());
           //System.out.println(com.getName());
           System.out.println("salary of employee  " +code.getSal());
	}

}
  