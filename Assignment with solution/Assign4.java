/* 4)Define a class “Base” with  “public void disp()” and interface “MyInterface” with default method “public void disp()”.
Now define a child class “Sub2 extends Base implements MyInterface”
Inside main function create an instance of “Sub2” and invoke “disp()”.
Observe what happens.*/

package interfacejava8;
interface myinterface
{
	default void disp()
	{
		System.out.println("in myinterface");
	}
}
class base
{
	public void disp()
	{
		System.out.println("in base");
	}
}
class sub2 extends base implements myinterface
{
	
}
public class Assign4 {

	public static void main(String[] args) {
	sub2 s1 = new sub2();
	
	// here base class's disp will display because of class win's rule
	s1.disp();
	}

}
