package harrystutorialcode;

public class Methods_Of_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		String name="Poonam";
		//String name=new String("Poonam");
		System.out.println(name);
		
		//Method->name.length();
		System.out.println(name.length());
		
		//Method->name.toUppercase();
		System.out.println(name.toUpperCase());
		
		//Method->name.toLowerCase();
		System.out.println(name.toLowerCase());
		
		//Method->name.charAt();
		System.out.println(name.charAt(3));//int value assign

		//Method->name.replace();
		System.out.println(name.replace('a','i'));
		
		//Method->name.startWith();
		System.out.println(name.startsWith("Po"));//true
		
		//Method->name.endsWith();
		System.out.println(name.endsWith("am"));//true
		
		//Method->name.substring(2);
		System.out.println(name.substring(2));//onam
		
		//Method->name.substring(1,4);
		System.out.println(name.substring(1,4));//oon
		
		//Method->name.indexOf("oo");
		System.out.println(name.indexOf("na"));//3
		
		//Method->name.indexOf("nam",3);
		System.out.println(name.indexOf("nam",3));//3
		
		//Method->name.lastIndexOf("o");
		System.out.println(name.lastIndexOf("o"));//2 last repeat character index
		
		//Method->name.lastIndexOf("o",1);
		System.out.println(name.lastIndexOf("o",1));
		
		//Method->name.equals("Poonam");
		System.out.println(name.equals("Poonam"));//true
		System.out.println(name.equals("Punam"));//false
		
		//Method->name.equalsIgnorCase("Poonam");
		System.out.println(name.equalsIgnoreCase("Poonam"));//true
		System.out.println(name.equalsIgnoreCase("POONAM"));//true
		
		//Method->name.trim()
		String nonTrimmedString="    Piyu     ";
		System.out.println( nonTrimmedString);//space is include
		
		String trimmedString=nonTrimmedString.trim();
		System.out.println(nonTrimmedString.trim());//space not include
		}

}

