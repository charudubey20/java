/*********************************************************************
2) Define a class "MyClass" and make sure clients can instantiate it , 
a) without any argument
b) with one int argument
c) with two int arguments
**********************************************************************/

public class Shape
{
	int num1;
	int num2;
	Shape()
	{
		System.out.println("default");
	}
	Shape(int num1)
	{
		this.num1=num1;
		System.out.println(num1 + "  " + "in one parameter");
	}
	Shape(int num1, int num2)
	{
		this.num1=num1;
		this.num2=num2;
		
		System.out.println(num1 + " " + num2 + " " + "in two parameter");
	}
	public static void main(String args[])
	{
		Shape s1 = new Shape();
		Shape s2 = new Shape(10);
		Shape s3= new Shape(10,20);
	}
}

/* OUTPUT
default
10  in one parameter
10 20 in two parameter

*/


