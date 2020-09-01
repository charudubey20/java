/* 2) define a class Student 
     rollno
	name
	age
	marks
    parameterized constructor 
	getter methods
    create 5 objects and store them inside list.
    using java8 stream api:
    1) find out name starts with 's'
        hint:- use "filter" to check names start with "s" and "forEach" method to display all those names.
    2) how many students got more than 70
      hint: use "filter" and "count"
    3) how many students in between age 22 and 25
       hint: use "filter" and "count"  */


package StreamApi;

import java.lang.reflect.Array;
import java.util.*;

class student
{
	int rollno;
	String name;
	int age;
	int marks;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
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
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public student(int rollno, String name, int age, int marks) {
	
		this.rollno = rollno;
		this.name = name;
		this.age = age;
		this.marks = marks;
	}
	public String toString() {
		return name;
	}
	
}
public class second {

	public static void main(String[] args) {
	student s1 = new student(1,"charu",24,99);
	student s2 = new student(2,"sonu",21,60);
	student s3 = new student(3,"swati",25,98);
	student s4 = new student(4,"jassi",26,50);
	student s5 = new student(5,"monu",20,79);
   List<student> mylist = new ArrayList<student>();
   mylist.add(s1);
   mylist.add(s2);
   mylist.add(s3);
   mylist.add(s4);
   mylist.add(s5);
    
   //find out name starts with 's'
   mylist.stream().filter((s)->{if(s.getName().toLowerCase().startsWith("s")) return true; else return false;}).forEach(System.out::println);

   System.out.println("----------------------------------------");
   // how many students got more than 70
   mylist.stream().filter((s)->{if(s.getMarks()>70) return true; else return false;}).forEach(System.out::println);
   
   //how many students in between age 22 and 25
   System.out.println("----------------------------------------");
   int cnt = (int) mylist.stream().filter( (s)-> { if(s.getAge() >= 22 && s.getAge() <= 25) return true; else return false; }).count();
   System.out.println("count is "+ "\t" + cnt);
   
	}

}
