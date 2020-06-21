/* 3) Go for Hierarchical inheritance, create instances of child class and observe constructor invocation..*/
class Father
{
	 void disp()
	{
		System.out.println("in father disp");
	}
	Father()
	{
		System.out.println("in father constructor");
	}
}

class Son extends Father
{
	 void disp1()
		{
			System.out.println("in son disp");
		}
		Son()
		{
			System.out.println("in son constructor");
		}
	
}
class Daughter extends Father
{
	 void disp2()
		{
			System.out.println("in daughter disp");
		}
		Daughter()
		{
			System.out.println("in daughter constructor");
		}
	
}

public class Inheritance3 {

	public static void main(String[] args) 
	{
	   Son s1 = new Son();
	   Daughter d1 = new Daughter();
	   s1.disp();
	   s1.disp1();
	   d1.disp();
	   d1.disp2();
	    
	}

}
