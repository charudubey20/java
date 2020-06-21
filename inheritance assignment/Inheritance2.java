/*2) create a class "Vehicle", define a method "public void start()" in it. From this class derive a class FourWheeler. How will u override "start()" method 
  of parent class. */


class Vehicle
{
	public void start()
	{
		System.out.println("vehicle start....");
	}
	
}

class Fourwheeler extends Vehicle
{
	public void start()
	{
		System.out.println("fourwheeler start....");
	}
	
}

public class Inheritance2 {

	public static void main(String[] args) 
	{
		Fourwheeler f1=new Fourwheeler();
		f1.start();
	  

	}

}
