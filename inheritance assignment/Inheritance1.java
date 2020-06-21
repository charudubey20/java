/*1) Create a multi-level inheritance , instantiate the child class and observe constructor invocation.Also show, if needed how will u invoke parent class 
   constructor from child class */



class Parent
{
	void disp()
	{
		System.out.println("in parent disp");
	}
	Parent()
	{
		System.out.println("inside parent constructor");
	}
}
class Child1 extends Parent
{
	void disp1()
	{
		System.out.println("in child1 disp1");
	}
	Child1()
	{
		super();
		
		System.out.println("inside child1 constructor");
	}
}
class Child2 extends Child1
{
	void disp2()
	{
		System.out.println("in Child2 disp2");
	}
	Child2()
	
	{
		
		System.out.println("inside Child2 constructor");
	}
}

public class Inheritance1 {

	public static void main(String[] args) 
	{
		Child2 s2=new Child2();
	  s2.disp();
	  s2.disp1();
	  s2.disp2();
	  

	}

}
