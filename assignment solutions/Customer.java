/* 1)create a customer class with following attributes
	custid
	custname
	address
	age
create one instance of it and store it in a file. (Serialization).
now open a file, read the object and read its contents . (Deserialization)   */

package FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Customer implements Serializable {
	private static final long serialVersionUID = 1L;
	int custid=10;
	String custname="charu";
	String address="Bhopal";
	int age=25;
	

	public static void main(String[] args) {
		Customer c = new Customer();
		try(FileOutputStream fos = new FileOutputStream("d:\\Serial1.txt") )
		{
			try(ObjectOutputStream oos = new ObjectOutputStream(fos))
			{
				oos.writeObject(c);  //serialization
			}
			
		} catch (Exception e) {
	
			e.printStackTrace();
		} 

		System.out.println(c.custid+ "\n" + c.custname + "\n" + c.address + "\n"+c.age);
		c=null;
		try(FileInputStream fis=new FileInputStream("d:\\Serial1.txt"))
		{
		try(ObjectInputStream ois=new ObjectInputStream(fis))
		{
			
		Customer c1 = (Customer)ois.readObject();
		System.out.println(c1.custid+ "\n" + c1.custname + "\n" + c1.address + "\n"+c1.age);
		}
		} catch (Exception e) {
			
			e.printStackTrace();
		} 
	}

}
