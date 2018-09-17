package main;

public class MyClass {
	public static void main(String[] arg){
		/*MyClass n =new MyClass();
		String great =n.abc("Abir");
		System.out.println(great);*/
		Greed great = (name)->"Hello "+name;
		System.out.println(great.abc("Abir"));
		
	}

	/*@Override
	public String abc(String name) {
		// TODO Auto-generated method stub
		return "Hello "+name;
	}*/

} 
