package oops;

public class CopyConstDemo {
	private int ID;
	private String Name;
	CopyConstDemo(int id, String name)//parameterized constructor
	{
		ID=id;
		Name=name;
	}
	CopyConstDemo(CopyConstDemo interns)//copy constructor
	{
		System.out.println("The copy constructor statrs here");
		ID=interns.ID;//getters
		Name=interns.Name;//getters
	}
	int showID() {
		return ID;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
