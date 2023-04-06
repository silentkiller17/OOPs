package oops;
class ABC
{
public void print_ABC()
{
System.out.println("Cooking");
}
}
class XYZ extends ABC
{
public void print_XYZ()
{
System.out.println("Emerging Technology");
}
}
public class SingleInh2{
public static void main(String[] args) { 
XYZ d = new XYZ();
d.print_ABC();
d.print_XYZ();
}
}
