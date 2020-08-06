/* 3)create a package called "course"
In this package create three classes
a) Dac    with methods  term1()  and term2()
b) PreDac with  method  cet()
c) Basic   with method  finalTest()

Now write application called  "VitaApp" in which call all the methods  of the above mentioned classes. */


package Objects;

import course.Basic;
import course.Dac;
import course.Predac;

public class VitaApp {

	public static void main(String[] args) {
		Dac d1 = new Dac();
		d1.term1();
		d1.term2();
		Predac p= new Predac();
		p.cet();
		Basic b1 = new Basic();
		b1.finaltest();
		

	}

}
