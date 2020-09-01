/* 9)Given
interface MyInterface
{
	void fun(char a,int b);
}
And
class SomeClass
{
	void disp(char a,int b)
	{
		S.o.p(a,b);
	}
}
Write a lambda expression as well as method reference and invoke disp() method of SomeClass. */

package interfacejava8;
interface MyIntrface
{
	void fun(char a,int b);
}
class someclass
{
	void disp(char a,int b)
	{
		System.out.println(a+ "\n"+ b);
	}
}
public class Assign9 {

	public static void main(String[] args) {
		someclass s = new someclass();
		//using lambda
MyIntrface ref = (a,b)->{s.disp(a,b);};
ref.fun('a',3);
//using method reference
MyIntrface ref2 = s::disp;
ref2.fun('c', 9);

	}

}
