/*6) Define interface "A" with "disp1()" method.
Derive from "A", interface "B" with "disp2" method.
Derive class "C" , from "B".
Instantiate class "C" and call its members as well as derived from parent interfaces.*/



interface A
{
	void display1();
}
interface B extends A
{
	void display2();
}
class C implements B
{
	
	public void display1()
	{
		System.out.println("in display 1");
	}
	public void display2()
	{
		System.out.println("in display 2");
	}
}

 public class Inheritance6
 {
	 public static 	void main(String[] args)
	 {
		 C c1=new C();
		 c1.display1();
		 c1.display2();
		 
	 }
	 
 }
