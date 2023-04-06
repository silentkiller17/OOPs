package oops;

public class MethidOverload {
   void mult(int x, int y)
   {
	   System.out.println(x*y);
   }
   void sum(int x, int y, int z)
   {
	   System.out.println(x*y+z);
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethidOverload M1=new MethidOverload();
		M1.mult(10,45);
		M1.sum(3, 5, 2);
	}

}
