package oops;

public class Calculation {
	void add(int a, int b)
	{
		System.out.println("Addition: "+(a+b));
	}
	void subtract(int a , int b)
	{
		System.out.println("Subtraction: "+(a-b));
	}
	void multiply(int a ,int b)
	{
		System.out.println("Multiplication:"+(a*b));
	}
	int mult(int a, int b)
	{
		return a*b;
	}
	String msg(String name)
	{
		return "Hello" +name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculation c=new Calculation();
		c.add(12, 23);
		c.subtract(23,3);
		c.multiply(2,3);
		System.out.println("Multiply: "+c.mult(4, 6));
		int m=c.mult(12, 4);
		System.out.println("Multiply:" +m);
		System.out.println(c.msg(" Shital"));
	}

}
