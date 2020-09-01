/* 1)Define an interface “First” with 
One abstract method and one default method.
Now define a class “Sub”, which implements “First”.
From main function, create an instance of Sub and invoke both the methods of interface.
*/

package interfacejava8;
interface First
{
	void disp();
	default void show()
	{
		System.out.println("in First show");
	}
}
class sub implements First
{
	public void disp()
	{
		System.out.println("in sub disp");
	}
	
}

public class Assign1 {

	public static void main(String[] args) {
		sub s1 = new sub();
		s1.disp();
		s1.show();

	}

}
