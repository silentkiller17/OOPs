package oops;

interface Call{
	void misscall();
}
interface Call1{
	void callback();
}
interface Call2{
	void callreceive();
}
class Calltype implements Call ,Call1,Call2{
	
public void misscall() {
	System.out.println("misscall");
}

public void callback() {
	System.out.println("callback");
}

public void callrecieve() {
	System.out.println("callreceive");
}

public void callreceive() {
	// TODO Auto-generated method stub
	
}

}
public class InterfaceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Call c=new Calltype();
		c.misscall();
		Call1 c1=new Calltype();
		c1.callback();
		Call2 c2=new Calltype();
		c2.callreceive();

	}

}
