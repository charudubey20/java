/*8) Define a class "base1" with only parameterized constructor.
Derive a class "sub1" from "base1". This class should have following constructors
	a) Default
	b) one parameter
	c) two parameter
Now try to instantiate "sub1" , using any of the above mentioned constructors.*/


class Base1
{
	int num=20;
	Base1(int num)
	{
		this.num=num;
		System.out.println(num);
		System.out.println("in base1 param");
	}
}
class Sub1 extends Base1
{
	int num1=10;
	int num2=30;
	Sub1()
	{
	super(15);
	System.out.println("in sub1 default");	
	}
	Sub1(int num1)
	{
		super(50);
		this.num1=num1;
		System.out.println(num1);
		System.out.println("in sub1 one parameter");
		}
	Sub1(int num1,int num2)
	{
		super(70);
		this.num1=num1;
		this.num2=num2;
		System.out.println(num1+ " "+num2);
		System.out.println("in sub1 two parameter");
	}
}


 public class Inheritance8
 {
	 public static 	void main(String[] args)
	 {
		 Sub1 s1 = new Sub1(40,80);
		 
	 }
	 
 }
