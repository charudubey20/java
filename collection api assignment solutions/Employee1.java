/* 4) Define a class "Employee" with following members
empid, empname, desig, basic.
Define a parameterised constructor which will take all these values while creating an instance.
Also define "disp()" method which will display all these details.
create 4 employees and save them in "ArrayList".
Now save this "ArrayList" in a file.
Open file , read "ArrayList" , traverse ArrayList and call "disp()" for all the objects.
*/

import java.util.ArrayList;
import java.util.Iterator;

import java.io.*;

class Employee1 implements Serializable {
	
	int empid;
	String empname;
	String desi;
	int basic;
	
	public  Employee(int id,String nm,String dsg,int bsc)
	{
		empid=id;
		empname=nm;
		desi=dsg;
		basic=bsc;
	}
	
	//this is optional
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Id:"+empid+"\nName:"+empname+"\nDesignation:"+desi+"\nBasic:"+basic;
	}
	
	public String disp(){
		
		return "Id:"+empid+"\tName:"+empname+"\tDesignation:"+desi+"\tBasic:"+basic;
		
	}
	
	
}

public class Que4_ass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<Employee> elist=new ArrayList<Employee>();
		Employee1 e1= new Employee1(1,"charu","developer",90000);
		Employee1 e2= new Employee1(2,"swati","manager",80000);
		Employee1 e3= new Employee1(3,"sonu","choreographer",95000);
        Employee1 e4= new Employee1(4,"rupal","developer",90000);
		
		elist.add(e1);
		elist.add(e2);
		elist.add(e3);
		elist.add(e4);
		
		
		
		
		System.out.println("----------------data from file--------------");
		
		
		
		try(FileOutputStream fos=new FileOutputStream("g:\\first.txt"))
		{
			try(ObjectOutputStream oos=new ObjectOutputStream(fos)){
				oos.writeObject(elist);
			}
			
		}
		catch(IOException ex){
			ex.printStackTrace();
		}
		
		//for deserialize array list
		
		try(FileInputStream fis =new FileInputStream("g:\\first.txt"))
		{
			
			try(ObjectInputStream ois=new ObjectInputStream(fis)){
				
				
				ArrayList<Employee> listdata=(ArrayList<Employee>)ois.readObject();
				
				Iterator <Employee> i=listdata.iterator();
				
				//just for display
				while(i.hasNext())
				{
					Employee element=i.next();
					System.out.println(element.disp());
				}
				
				/*yes we can display using list object only bcoz ToString() is overriden 
				System.out.println(listdata);
			}
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
		
	}

}


         OR

/* package collectionApi;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employee1 implements Serializable {
	int empid;
	String empname,desig;
	int basic;
	

	public Employee1(int empid, String empname, String desig, int basic) {
		//super();
		this.empid = empid;
		this.empname = empname;
		this.desig = desig;
		this.basic = basic;
	}
	
	void disp()
	{
		System.out.println(empid + "\n" + empname + "\n" + desig + "\n" + basic);
	}


	public static void main(String[] args) {
		Employee1 e1= new Employee1(1,"charu","developer",90000);
		Employee1 e2= new Employee1(2,"swati","manager",80000);
		Employee1 e3= new Employee1(3,"sonu","choreographer",95000);
                Employee1 e4= new Employee1(4,"rupal","developer",90000);
        List<Object> arr = new ArrayList<Object>();
    	arr.add(e1);
    	arr.add(e2);
    	arr.add(e3);
    	arr.add(e4);
    	 try(FileOutputStream fos = new FileOutputStream("d:\\Employee1.txt") )
    		{
    			try(ObjectOutputStream oos = new ObjectOutputStream(fos))
    			{
    				oos.writeObject(arr);  
    				
    			}
    			
    		} catch (Exception e) {

    			e.printStackTrace();
    		} 
    		try(FileInputStream fis=new FileInputStream("d:\\Employee1.txt"))
    		{
    		try(ObjectInputStream ois=new ObjectInputStream(fis))
    		{
    			
    		List arr2 = (List)ois.readObject();
    		Iterator itr = arr.iterator();
    		while(itr.hasNext())
    		{
    			
    			System.out.println(itr.next());
    	
    			e1.disp();
    			e2.disp();
    			e3.disp();
    			e4.disp();
    		}
    		System.out.println(arr2);
    		
    		System.out.println("reading done" );
    		}
    		} catch (Exception e) {
    			
    			e.printStackTrace();
    		} 
    	    
       
	}

}
*/