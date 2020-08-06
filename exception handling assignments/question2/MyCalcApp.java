package Objects;

public class MyCalcApp {

	public static void main(String[] args) {
		calculator c = new calculator();
		int result = 0;
		try {
			result=c.calcdouble(-3);
			
			System.out.println(result);
			
		}
		catch(MyArithException msg)
		{
			System.out.println(msg);
		}
		System.out.println("finished");

	}

}
