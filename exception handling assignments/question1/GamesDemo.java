/* 1)Create abstract base class "Game" with 'play()' as abstract method.
From that derive following classes.
Football,Cricket,Tennis
Create a class called as "GamesDemo" (public class)
inside a main method create an array of "Game" (3 elements)
Store objects of Football,Cricket and Tennis respectively.
Now traverse the array and call that Cricket's play() method. */

package Objects;
abstract class game
{
	void play()
	{
		
	}
}
class football extends game
{
	public void play()
	{
		System.out.println("play football..!!");
	}
}
class cricket extends game
{
	public void play()
	{
		System.out.println("play cricket..!!");
	}
}
class tennis extends game
{
	public void play()
	{
		System.out.println("play tennis..!!");
	}
}

public class GamesDemo {

	public static void main(String[] args) {
		game arr[]=new game[3];
		arr[0]=new football();
		arr[1]=new cricket();
		arr[2]=new tennis();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] instanceof cricket)
			{
				arr[i].play();
			}
			
		}
		

	}

}
