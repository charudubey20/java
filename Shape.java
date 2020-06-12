/*create a class "Shape" with 2 attributes, "width" and "height". Make sure one can not access these attributes directly.
provide accessor methods on these attributes and allow them to call from outside of your class.*/


public class Shape
{
private int height;
private int width;
public void setwidth(int width)
{
  this.width=width;
}
public int getwidth()
{
return width;
}
public void setheight(int height)
{
  this.height=height;
}
public int getheight()
{
return height;
}


public static void main(String[] args)
{
 Shape s1=new Shape();
		s1.setheight(50);
		s1.setwidth(70);
		
		System.out.println("Height="+ s1.getheight());
		System.out.println("width="+s1.getwidth());
}
}

