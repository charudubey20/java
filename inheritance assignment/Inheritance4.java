/* 4) Create a class "Top1" with "disp1()" method.
From this class Derive "Bottom1", "Bottom2" and "Bottom3" classes ,override the "disp1()".
Now show how will u achieve dynamic polymorphism.*/

class Top1
{
	 void disp1()
	{
		System.out.println("in top1 disp1");
	}
	
}

class Bottom1 extends Top1
{
	 void disp1()
		{
			System.out.println("in bottom1 disp");
		}
		
	
}
class Bottom2 extends Top1
{
	 void disp1()
		{
			System.out.println("in bottom2 disp");
		}
}
class Bottom3 extends Top1
{
	 void disp1()
		{
			System.out.println("in bottom3 disp");
		}
}

public class Inheritance4 {

	public static void main(String[] args) 
	{
	   Top1 b1 = new Bottom3();
	   b1.disp1();
	   
	    
	}

}
