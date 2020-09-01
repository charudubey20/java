/* 2)Define two interfaces
        Interface A with “default void fun()” and interface B with “default void fun()” methods.
Now define a class C which implements both A and B.
Observe what happens here. Provide the solution in case of any problem.
*/


package interfacejava8;
interface A
{
	default void fun()
	{
		System.out.println("in A's fun");
	}
}
interface B
{
	default void fun()
	{
		System.out.println("in B's fun");
	}
}
class C implements A,B
{
	/* we need to override fun here otherwise it will give error */
	public void fun()
	{
		System.out.println("in C's fun");
	}
}
public class Assign2 {

	public static void main(String[] args) {
		C c1 = new C();
		c1.fun();

	}

}
