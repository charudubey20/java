/*6) define static initializers in the above A,B and C classes and check the order of their 
 * execution.if you put static initializers or blocks inside A,B and C just notice how they
  are invoked. They will be invoked in the sequence you access these classes from main function.
Also put static initializer or block inside "Demo" class and see what happens.
______________________________________________________________________________________________*/


class A1
{
	static
	{
	System.out.println("Inside A1 static initializer");	
	}
}
class B1
{
	static
	{
	System.out.println("Inside B1 static initializer");	
	}
}
class C1
{
	public static void display()
	{
		
	}
	static
	{
	System.out.println("Inside C1 static initializer");	
	}
}
public class Demo1
{
	static
	{
	System.out.println("Inside Demo static initializer");	
	}

	public static void main(String[] args) 
	{
		System.out.println("Inside main");

		A1 a=new A1();
		B1 b=new B1();
		C1.display();
		
}

}
