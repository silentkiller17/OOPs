package oops;
class Students {
	int id;
	String name;
	Students(int id,String name){
		id=id;
		name=name;
	}
	void display() {
		System.out.println(id+" "+name);
	}
}

public class WithoutThisK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Students s1= new Students(111,"Shital");
Students s2=new Students

(321,"Diksha");
s1.display();
s2.display();
	}

}
