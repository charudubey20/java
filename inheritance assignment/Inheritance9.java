/*9) create interface "Game" , have an abstract method "play()". from this interface implements classes like "Cricket" , "FootBall" and "Tennis".
Now Define one more class 
public class Demo with main function.
In this class have a static method "perform" which will take interface reference as parameter.inside "perform()" see to it that any child object passed,
its "play()" method should be invoked. Call "perform()" method from main function.*/





interface game
{
	abstract void play();
}
class Cricket implements game
{
	public void play()
	{
		System.out.println("lets play cricket...!!!");
	}
}
class Football implements game
{
	public void play()
	{
		System.out.println("lets play football...!!!");
	}
	
}

class Tennis implements game
{
	public void play()
	{
		System.out.println("lets play tennis...!!!");
	}
}


 public class Inheritance9
 {
	 static void perform(game ref)
	 {
		 ref.play();
	 }
	 public static 	void main(String[] args)
	 {
		 perform(new Cricket());
		 perform(new Football());
		 perform(new Tennis());
		 
	 }
	 
 }
