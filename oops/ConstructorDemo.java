package oops;

public class ConstructorDemo {
	//Default constructor
	ConstructorDemo()
	{
	System.out.println("Default Constructor created");		
	}
	 
	
	//Parameterized Constructor
	int id;
	String name;
	ConstructorDemo(int i,String n)
	{
		id=i;
		name=n;
	}
	void display()
	{
		System.out.println(id+ " " +name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Default constructor
		ConstructorDemo d=new ConstructorDemo();
		
		//Parameterized Constructor
		ConstructorDemo c1=new ConstructorDemo(111,"Shital");
		ConstructorDemo c2=new ConstructorDemo(112,"Diksha");
		
		c1.display();
		c2.display();
		
		
	}

}
