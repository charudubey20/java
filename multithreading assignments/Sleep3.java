/* 3) create 3 threads in such a way that while one thread is executing, 2 threads cannot interfere. 
they should display output "Exec  0" to "Exec 5". */

/* or

we can also use synchronise instead of sleep    */

public class Sleep3 implements Runnable {
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			try
			{
				Thread.sleep(100);
			}
			catch(InterruptedException ee)
			{
				ee.printStackTrace();
			}
			System.out.println("Exec"+i);
		}
	}

	public static void main(String[] args) {
		
		Sleep3 m1 = new Sleep3();
		Thread t1 = new Thread(m1);
		Thread t2 = new Thread(m1);
		Thread t3 = new Thread(m1);
		
		t1.start();
		t2.start();
		t3.start();
	}

}
