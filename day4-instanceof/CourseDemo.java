/*create a hierarchy
Course
void start()
void end()

override "start()" and "end()" in all the child classes.

MsCit		Basic		Dbda
				void orientation()
write a class "CourseDemo" with main and perform functions

perform function should be defined in such a way that it can accept any course and invoke "start()" and "end()" functions.

also make sure if "Dbda" is passed , its "orientation()" method also should be called.*/



class Course
{
	void start()
	{
		System.out.println("course start");
	}
	void end()
	{
		System.out.println("course end");
	}
}
class Mscit extends Course
{
	void start()
	{
		System.out.println("mscit course start");
	}
	void end()
	{
		System.out.println("mscit course end");
	}
}
class Basic extends Course
{
	void start()
	{
		System.out.println("basic course start");
	}
	void end()
	{
		System.out.println("basic course end");
	}
}
class Dbda extends Course
{
	void start()
	{
		System.out.println("dbda course start");
	}
	void end()
	{
		System.out.println("dbda course end");
	}
	void orientation()
	{
		System.out.println("dbda orientation");
	}
}

public class CourseDemo
{
     static void perform(Course ref)
	{
		if(ref instanceof Dbda)
		{
			Dbda obj=(Dbda)ref;
			obj.orientation();
		}
		ref.start();
		ref.end();
	}

	public static void main(String[] args)
	{
	    perform(new Mscit());
	    perform(new Basic());
	    perform(new Dbda());
	    

	}

}
