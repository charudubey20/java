/* 6)Given
interface Alpha
{
	void perform();
}
And
Public class Demo
{
	Public static void main(String args[])
	{
		Alpha a=MyClass.getAlpha();
		a.perform();
	}
}
Above code is incomplete. You have to complete it. It means you have to write “MyClass”.
Complete the entire code, compile and run.
*/

package interfacejava8;
interface Alpha
{
	void perform();
}
class MyClass
{
	public static Alpha getAlpha()
	{
		return new Alpha()
				{
			public void perform()
			{
				System.out.println("in perform");
			}
				};
	}
}

public class Assign6 {
	public static void main(String[] args) {
	
		Alpha a=MyClass.getAlpha();
		a.perform();
	}
	
	
	}


