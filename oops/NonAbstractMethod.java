package oops;


abstract class AbstractDemo { 
	   
	   public void msg() { // non-abstract method
	      System.out.print("Abstact class with non abstract method");
	   }
	}
	public class NonAbstractMethod extends AbstractDemo {
	   public static void main(String args[]) {
		   AbstractDemo demo = new NonAbstractMethod();
	      demo.msg();
	   }
	}
	//NonAbstractMethod