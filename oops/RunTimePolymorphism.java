package oops;

class Bank{
	int rateOfInterest() {
		return 0;
	}
}
class SBI extends Bank{
	int rateOfInterest() {
		return 5;
	}
}
class Axis extends Bank{
	int rateOfInterest() {
		return 6;
	}
}

public class RunTimePolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Bank b=new Axis();
SBI s= new SBI();
System.out.println("Axis :"+b.rateOfInterest());
System.out.println("SBI :"+s.rateOfInterest());
	}

}
