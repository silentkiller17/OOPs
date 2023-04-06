package oops;
class student{
	int id;
	String name;
	student(int id,String name){
		this.id=id;
		this.name=name;
	}
	void display() {
		System.out.println(id+" "+name);
	}
}
public class WithThisK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
student s1=new student(111,"Shital");
student s2=new student(123,"Diksha");
s1.display();
s2.display();
	}

}
