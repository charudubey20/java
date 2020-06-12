/*4) Define a class "DemoOb". 
create an instance of it.
now create a reference and assign the reference created in the above statement.
	Discuss what happens?
Now since u have 2 references, take one of the reference and assign a new instance of the class.
	Discuss what happens?
(For ur discussion, write necessary comments in the program)
____________________________________________________________________________________________*/


public class DemoOb
{
	
	public static void main(String[] args)
	{
			DemoOb obj1=new DemoOb(); //First instance
			//obj1 is a reference referring to the object
			
			DemoOb obj2=obj1;
			//obj2 is a refernce referring to instance referred by obj1 on heap
		     
			obj1=new DemoOb(); 
			//Here,obj1 is will refer to new instance created.
			
			
			}

}