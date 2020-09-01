/*  4) Write a file copy program using unicode character streams.
( FileWriter and FileReader )
*/

package FileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Assign4 {

	public static void main(String[] args) {
		File f1 = new File("d:/assign4.txt");
		File f2 = new File("d:/assign4_copy.txt");
	try(FileWriter fw = new FileWriter(f2);
			FileReader fr = new FileReader(f1))
	{
	char[] b = new char[(int)f1.length()];
	int k;
	while((k=fr.read(b))>0)
	{
fw.write(b,0,k);
	}
fr.read(b);
String s = new String(b);
System.out.println(s);
		
		
	} catch (Exception e) {
	
		e.printStackTrace();
	}

	}

}
