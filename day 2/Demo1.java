/*6) define static initializers in the above A,B and C classes and check the order of their 
 * execution.if you put static initializers or blocks inside A,B and C just notice how they
  are invoked. They will be invoked in the sequence you access these classes from main function.
Also put static initializer or block inside "Demo" class and see what happens.
______________________________________________________________________________________________*/


class A
{
	private int num=50;
	static int cnt=5;
	
	public static int disp()
	{
		return cnt;
	}
	public void setdata(int num)
	{
		this.num=num;
	}
	 public int getdata()
	{
		return num;
	}
	 static {
			System.out.println("insid A static class");
		}
}

class B
{
	private int num=100;
	static int cnt=25;
	
	public static int disp()
	{
		return cnt;
	}
	public void setdata(int num)
	{
		this.num=num;
	}
	 public int getdata()
	{
		return num;
	}
	 static {
			System.out.println("insid B static class");
		}
	
}


class C
{
	private int num=150;
	static int cnt=75;
	
	public static int disp()
	{
		return cnt;
	}
	public void setdata(int num)
	{
		this.num=num;
	}
	 public int getdata()
	{
		return num;
	}
	 static {
			System.out.println("insid C static class");
		}
}


class Demo
{
	static {
		System.out.println("insid class Demo static class");//STATIC Blocks of classes are only 
//invoked when an instance of that class is created or any function of that class is invoked
	}
 public static void main(String args[])
 {
	 System.out.println("in main");
	 A t=new A();
	 B t1=new B();
	 C t2=new C();
	 System.out.println("result of static A class:"+A.disp());
	 System.out.println("result of non-static A class"+t.getdata());
	 System.out.println("result of static B class:"+B.disp());
	 System.out.println("result of non-static B class"+t1.getdata());
	 System.out.println("result of static C class:"+C.disp());
	 System.out.println("result of non-static C class"+t2.getdata());
 }
}
