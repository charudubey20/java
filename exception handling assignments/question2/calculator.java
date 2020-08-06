/* 2) define your exception class by name "MyArithException"
(MyArithException.java)
define class "Calculator"   (Calculator.java)
In this class define a function,which will accept an int and return double of it.
e.g int caldouble(int)
This function will check an int which is passed to it
It will throw exception if 0 is passed or negative passed
in case of 0 caller of this method should get error message
"Zero not allowed" 
in case of negative caller of this method should get error message
"negative not allowed"
In case of positive value it should simply return the double value.

Now define class "MyCalcApp" (MyCalcApp.java)
In this class you accept a number from user and pass that no. to
caldouble() method which is mentioned above. */

package Objects;

public class calculator 
{
	public int calcdouble(int num) throws MyArithException
	{
		if(num==0)
		{
		throw new MyArithException("zero not allowed");
		}
		else if (num<0)
		{
			throw new MyArithException("negative not allowed");
		}
		return 2*num;
	}

}
