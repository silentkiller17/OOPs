package oops;

import java.util.Scanner;

class Student1 {
	int id;
	String name;

	public Student1() {
		System.out.println("Default constructor");
	}

	void Student11(int i,String n)
	{
		id=i;
		name=n;
	}

	void display() {
		System.out.println("Id:" + id);
		System.out.println("Name:" + name);
	}
}

public class ConstructorDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 s1 = new Student1();
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();
		String name = sc.nextLine();
		Student1 s = new Student1();
		s.display();
		System.out.println("----------------");
	}

}
