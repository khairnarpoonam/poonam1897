package harrystutorialcode;

class Employee{         //custom class
	int id;             //attribute
	String name;
	int salary;
	
	public void printdetails() {//method
		System.out.println("my id is" +id);
		System.out.println("my name is" +name);
		System.out.println("my salary"+ salary);
	}

}


public class Oops_Concept_Custom_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//insantiating a new employee object
		Employee poonam=new Employee();
		Employee obj=new Employee();
		
		//Setting Attributes
		poonam.id=11;
		poonam.name="Mahajan";
		poonam.salary=25;
		
		obj.id=15;
		obj.name="Khairnar";
		obj.salary=30;
		
		//Print Attributes
		System.out.println(poonam.id);
		System.out.println(poonam.name);
		System.out.println(poonam.salary);
	    System.out.println(obj.id);
		System.out.println(obj.name);
		System.out.println(obj.salary);
		
		//poonam.printdetails();//fun call buy using object
        //obj.printdetails();
	}

}
