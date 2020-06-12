/*********************************************************************
2) Define a class "MyClass" and make sure clients can instantiate it , 
a) without any argument
b) with one int argument
c) with two int arguments
**********************************************************************/


public class MyclassTwo
{
int num;
MyclassTwo()
{
System.out.println("Inside Default Constructor");
}
MyclassTwo(int k)
{
num=k;
System.out.println("Inside Parameterized Constructor");
}
MyclassTwo(int m1,int m2)
	{
	System.out.println("Inside Parameterized Constructor with 2 arguments");
	}

	public static void main(String[] args) 
	{
           MyclassTwo m1=new MyclassTwo();
           MyclassTwo m2=new MyclassTwo(100);
           new MyclassTwo(50,100);
}
}

/* OUTPUT
Inside Default Constructor
Inside Parameterized Constructor
Inside Parameterized Constructor with 2 arguments
*/


