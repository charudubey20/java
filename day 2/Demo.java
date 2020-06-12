/*5) Define 3 classes A , B and C
in all these classes create static and nonstatic variables as well as methods.
	Now Define a class "Demo" ,in which define "main" function. From this main function try 
	to access all the members of A ,B  and C.
--------------------------------------------------------------------------------------------*/


class A
{
	public int a;
	
	public int getA() {
		return a;
		
	}
	public void setA(int a) {
		this.a = a;
	}
	public static int cnt1=10;
	public static int display()
	{
		return cnt1;
	}
}
class B
{
	public int b;
	
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public static int cnt2=20;
	public static int display()
	{
		return cnt2;
	}
}
class C
{
	public int c;
	
	public int getC() {
		return c;
		}
	public void setC(int c) {
		this.c = c;
	}
	public static int cnt3=30;
	public static int display()
	{
		return cnt3;
	}
}
public class Demo
{

	public static void main(String[] args) 
	{
		A a1=new A();
		a1.setA(1);
		System.out.println("a=" + a1.getA());
		B b1=new B();
		b1.setB(2);
		System.out.println("b="+ b1.getB());
		C c1=new C();
		c1.setC(3);
		System.out.println("c="+ c1.getC());
		
		
		System.out.println(A.display());
		System.out.println(B.display());
		System.out.println(C.display());
		
	}

}