/* 3)Define an interface “Second” with 
	One abstract method and one default method.
Now define a class “Sub1”, which implements “Second” and override the default method of interface “Second”. Also invoke default
method of Second from the overriding method. From main function, create an instance of Sub1 and invoke the methods.
*/

package interfacejava8;
interface Second
{
	void disp();
	default String show()
	{
		return "in second show";
	}
}
class sub1 implements Second
{
	public void disp()
	{
		System.out.println("sub1 disp");
	}
	public String show()
	{
		System.out.println("in sub1 show");
		System.out.println(Second.super.show());
		return null;
		
	}
}
public class Assign3 {

	public static void main(String[] args) {
      sub1 s1 = new sub1();
      s1.disp();
      s1.show();

	}

}
