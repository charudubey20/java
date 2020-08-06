/* 5) create 2 threads
	one thread will display 1 to 50
	second thread will display 50 to 1
both the threads should start simultaneously.

(use implements method)   */





class First implements Runnable
{
	public void run()
	{
		for(int i=1;i<=50;i++)
		{
			System.out.println(i);
		}
	}
}
class Second implements Runnable
{
	public void run()
	{
		for(int i=50;i>=1;i--)
		{
			System.out.println(i);
		}
	}
}




public class MyThread5  {
	

	public static void main(String[] args) {
		First f = new First();
		Second s = new Second();
		Thread t1=new Thread(f);
		Thread t2=new Thread(s);
		t1.start();
		t2.start();
		
		

	}

}
