/* 2) Person class implements Serializable with
	private String name
	private int age

		getters and setters
		parameterized constructor

Student extends Person
	private int rollno
		getter and setters
		parameterized constructor accepting name,age and rollno
			pass name and age to the super constructor


Demo class with main
	create one object of Student, write it inside file and then read.   */


package FileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable
{


	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		System.out.println("in base param constructor");
	}
	
}
class Student extends Person
{
	
	
	private static final long serialVersionUID = 1L;
	private int rollno;

	

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public Student(String name, int age, int r ) {
		super(name, 25);
		r=rollno;
		System.out.println("in child param constructor");
	
	}
	
}
public class Demo {

	public static void main(String[] args) {
		Student s = new Student(null,0,0);
		s.setName("charu");
		s.setAge(25);
		s.setRollno(33);
		System.out.println(s.getName() + "\n" + s.getAge() + "\n" + s.getRollno());
		
		try(FileOutputStream fos = new FileOutputStream("d:\\Serial2.txt") )
		{
			try(ObjectOutputStream oos = new ObjectOutputStream(fos))
			{
				oos.writeObject(s);  //serialization
			}
			
		} catch (Exception e) {
	
			e.printStackTrace();
		} 

		System.out.println(s.getName()+ "\n" + s.getAge() + "\n" + s.getRollno());
		s=null;
		try(FileInputStream fis=new FileInputStream("d:\\Serial2.txt"))
		{
		try(ObjectInputStream ois=new ObjectInputStream(fis))
		{
			
		Student s1 = (Student)ois.readObject();
		System.out.println(s1.getName()+ "\n" + s1.getAge() + "\n" + s1.getRollno() );
		}
		} catch (Exception e) {
			
			e.printStackTrace();
		} 
   

	}

}
