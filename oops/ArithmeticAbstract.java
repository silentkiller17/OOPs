package oops;

abstract class MyClass{
	//abstract method
	abstract void calculate(double x);
}
class Square extends MyClass{
	void calculate(double x) {
		System.out.println("Square="+(x*x));
	}
}
class SquareRoot extends MyClass
{
	void calculate(double x)
	{
		System.out.println("Square Root="+Math.sqrt(x));
	}
}
public class ArithmeticAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//create Sub class objects
		Square object1=new Square();
		object1.calculate(4);
		SquareRoot object2=new SquareRoot();
		object2.calculate(4);
		//Reference to the abstract class
		//MyClass reference=new MyClass();Abstract class cannot be instantiated
		MyClass reference;
		reference=object1;
		object1.calculate(5);
		
	}

}
