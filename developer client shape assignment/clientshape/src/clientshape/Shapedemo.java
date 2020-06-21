package clientshape;

import shapepack.Circle;
import shapepack.Rectangle;
import shapepack.Triangle;
import shapepack.Shape;





public class Shapedemo {
	public static void perform(Shape ref)
	{
		ref.draw();
	}


	public static void main(String[] args) {
		
		perform(new Rectangle());
		perform(new Triangle());
		perform(new Circle());
	}

}
