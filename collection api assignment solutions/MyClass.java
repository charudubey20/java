/* 1) create a class "MyClass".
create 5 different objects of it.
add them in a ArrayList.
store ArrayList in file.
Now open a file, read ArrayList and display all objects.
*/


package collectionApi;
import java.util.*;
import java.io.*;
import static java.lang.System.*;

public class MyClass implements Serializable{
	public static void main(String[] args) {
	MyClass m1 = new MyClass();
	MyClass m2 = new MyClass();
	MyClass m3 = new MyClass();
	MyClass m4 = new MyClass();
	MyClass m5 = new MyClass();
	List<Object> arr = new ArrayList<Object>();
	arr.add(m1);
	arr.add(m2);
	arr.add(m3);
	arr.add(m4);
	arr.add(m5);
	 try(FileOutputStream fos = new FileOutputStream("d:\\MyClass.txt") )
		{
			try(ObjectOutputStream oos = new ObjectOutputStream(fos))
			{
				oos.writeObject(arr);  
				System.out.println("writing done");
			}
			
		} catch (Exception e) {

			e.printStackTrace();
		} 
		try(FileInputStream fis=new FileInputStream("d:\\MyClass.txt"))
		{
		try(ObjectInputStream ois=new ObjectInputStream(fis))
		{
			
		List arr2 = (List)ois.readObject();
		Iterator itr = arr.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println(arr2);
		
		System.out.println("reading done" );
		}
		} catch (Exception e) {
			
			e.printStackTrace();
		} 
	    
			

	}

}
