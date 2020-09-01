/* 5)Define an interface “MyAlgo” with static methods
	Static int sqr(int k)
	Static int add(int a,int b)
	Static int product(int a,int b)

From main function invoke all the static methods of “MyAlgo”.
*/

package interfacejava8;
interface MyAlgo
{
	static int sqr(int k)
	{
		return k*k;
	}
	static int add(int a,int b)
	{
		return a+b;
	}
	static int product(int a,int b)
	{
		return a*b;
	}
}

public class Assign5 implements MyAlgo {

	public static void main(String[] args) {

		System.out.println(MyAlgo.sqr(2));

		System.out.println(MyAlgo.add(2,6));

		System.out.println(MyAlgo.product(6,6));
		

	}

}
