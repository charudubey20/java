/* write a file copy program using byte streams.
( FileOutputStream and FileInputStream )
*/

package FileHandling;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Assign3 {

	public static void main(String[] args) {
		File f1 = new File("d:/assign3.txt");
		File f2 = new File("d:/assign3_copy.txt");
	try(FileInputStream fis = new FileInputStream(f1);
		FileOutputStream fos = new FileOutputStream(f2))
			{
		byte b[]=new byte[(int)f1.length()];
		int k;
		while((k=fis.read(b))>0)
				{
			fos.write(b,0,k);
				}
		fis.read(b);
		String s = new String(b);
		System.out.println(s);
		
			} catch (Exception e) {
				
				e.printStackTrace();
			} 

	}

}
