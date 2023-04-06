package oops;
 
interface Test1{
	int val=10;
	void display();
}
interface Test2{
	int val=20;
	void display();
}
interface Test3 extends Test1, Test2{
	int val=30;
	void display();
}
class Test4 implements Test3{
	int val=40;
	public void display() {
		System.out.println("Test1 :"+Test1.val);
		System.out.println("Test2 :"+Test2.val);
		System.out.println("Test3 :"+Test3.val);
		System.out.println("Test4 :"+val);
		
	}
}

public class InterfaceEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Test4 t4= new Test4();
t4.display();
	}

}
