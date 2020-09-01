/* 8)Define a thread which displays 1 to 10 values. 
	Use lambda to pass Runnable implementation to Thread class constructor.
	*/

package interfacejava8;
class numbers
{
	public void disp()
	{
		for(int i =1;i<=10;i++)
		{
			System.out.println(i);
		}
	}
}

public class Assign8 {

	public static void main(String[] args) {
		numbers n = new numbers();
		Runnable ref = ()->{n.disp();};
		Thread t1 = new Thread(ref);
		t1.start();

	}

}
