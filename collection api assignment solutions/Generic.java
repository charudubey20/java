/* 3) create a hierarchy as follows

	interface Game- play() method
	Derive at least 3 classes from it.
Now Create generic class which can take Game type (i.e. any sub type of Game) as parameter.
In this class try to call the play() method of the class which is passed to it.
*/


package collectionApi;

import java.util.*;

import static java.lang.System.*;

import java.io.*;

interface Game
{
	void play();
}
class cricket implements Game
{
	public void play()
	{
		System.out.println("play cricket...");
	}
}
class football implements Game
{
	public void play()
	{
		System.out.println("play football...");
	}
}
class basketball implements Game
{
	public void play()
	{
		System.out.println("play basketball...");
	}
}

public class Generic <T extends Game> {
	T ob;
	public Generic(T ob)
	{
		this.ob=ob;
	}
	public void disp()
	{
		ob.play();
	}

	public static void main(String[] args) {
		Generic <cricket> c1 = new Generic<cricket>(new cricket());
		c1.disp();
		Generic <football> f1 = new Generic<football>(new football());
		f1.disp();
		
		Generic <basketball> b1 = new Generic<basketball>(new basketball());
		b1.disp();


	}

}
