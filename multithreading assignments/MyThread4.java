/* 
4)create 2 threads. Write a program which displays number 1 to 10 using class lock. 
[hint:- use "implements Runnable" and synchronized block]  */




public class MyThread4 implements Runnable
{
	static Class cs;
	 static void disp()
	{
		synchronized(cs)
		{
			for(int i=1;i<=10;i++)
			{
				System.out.println(i);
				try
				{
					Thread.sleep(200);
				}
				catch(InterruptedException ie)
				{
				}
				}
}
}                
                public void run()
		{
			disp();
		}
	

	public static void main(String[] args) throws Exception
	{
		cs= Class.forName("MyThread4");
		MyThread4 m1 = new MyThread4();
		MyThread4 m2 = new MyThread4();
		
		Thread t1=new Thread(m1);
		Thread t2=new Thread(m2);
		t1.start();
		t2.start();
		

	}

}
