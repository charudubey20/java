/* 7)Given
interface Base
{
	int product(int a,int b);
}
Write a lambda expression and invoke product method.*/

package interfacejava8;

interface seventh
{
	int product(int a,int b);
}

public class Assign7 {
	

	public static void main(String[] args) {

seventh ref=(a,b)->{return a*b;};
System.out.println(ref.product(3,4));
	}

}
