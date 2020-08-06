/* create a multi-threaded application by using  "implements Runnable" method.
  create 2 threads. they should display characters from A to J.   */ 

public class MyThread2 implements Runnable {
	public void run() {
		for (char c = 'A'; c <= 'J'; c++) {
			System.out.println(c);
		}
	}

	public static void main(String[] args) {
		MyThread2 m1 = new MyThread2();
		Thread t1 = new Thread(m1);
		Thread t2 = new Thread(m1);
		t1.start();
		t2.start();

	}

}
