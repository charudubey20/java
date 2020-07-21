/*********************************************************************
2) Define a class "MyClass" and make sure clients can instantiate it , 
a) without any argument
b) with one int argument
c) with two int arguments
**********************************************************************/

public class MyClass
{
	int num1;
	int num2;
	MyClass()
	{
		System.out.println("without any argument");
	}
	MyClass(int num1)
	{
		this.num1=num1;
		System.out.println(num1 + "  " + "with one argument");
	}
	MyClass(int num1, int num2)
	{
		this.num1=num1;
		this.num2=num2;
		
		System.out.println(num1 + " " + num2 + " " + "with two argument");
	}
	public static void main(String args[])
	{
		MyClass s1 = MyClasse();
		MyClass s2 = MyClass(10);
		MyClass s3= new MyClass(10,20);
	}
}

/* OUTPUT
without any argument
10  with one argument
10 20 with two argument

*/


