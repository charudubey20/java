/* 1) create a multi-threaded application by using  "extends Thread " method.create 2 threads. they should display 
    characters from A to J.   */
 

public class MyThread1 extends Thread
{
     public void run()
     {
    	 for(char c='A';c<='J';c++)
    	 {
    		 System.out.println(c+" ");
    	 }
     }
	public static void main(String[] args) {
		MyThread1 m1 = new MyThread1();
		MyThread1 m2 = new MyThread1();
		m1.start();
		m2.start();
				
	
	}

}
