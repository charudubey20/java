/*7) Define class "Parent1" with some data.
Define interface "Parent2" with some data.
Derive a class "Child" from "Parent1" and "Parent2", instantiate it and call the members.*/



class Parent1
{
	void display1()
	{
		System.out.println("in parent 1...");
	}
}
interface Parent2
{
	void display2();
}
class Child extends Parent1 implements Parent2
{
	
	void display3()
	{
		System.out.println("in child display 3");
	}
	public void display2()
	{
		System.out.println("in interface display 2");
	}
}

 public class Inheritance7
 {
	 public static 	void main(String[] args)
	 {
		 Child c1=new Child();
	
		 c1.display1();
		 c1.display2();
		 c1.display3();
		 
	 }
	 
 }
