package oops;
import java.util.*;
class Vehicle
{
	public void carname()
	{
		System.out.println(" Audi");
	}
}

class Car extends Vehicle
{
	void speed()
	{
		System.out.println("Drive in moderate speed");
	}
}
public class SingleInheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		Car c=new Car();
		c.carname();
		c.speed();		
	}
}
