/* 1)accept 10 characters from a user ( use Scanner).
store these 10 characters in a file. (FileWriter)
Now open a file and read all these characters.  */

package FileHandling;
import java.util.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Assign1 {

	public static void main(String[] args) throws Exception {
		FileWriter fw = new FileWriter("d:/assign1.txt");
		
		System.out.println("enter characters");
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<10;i++)
		{
			char[] a= sc.next().toCharArray();
			fw.write(a);
			
		}
		fw.flush();
		fw.close();
		
		FileReader fr = new FileReader("d:/assign1.txt");
		int i=fr.read();
		while(i!=-1)
		{
			System.out.println((char)i);
			i=fr.read();
			
		}
		
		
		
	}
	
	
	

}
