/* 2) using RandomAccessFile class create a file.
accept a message from user and write in a file.
now read the message which u have stored in a file.
now again accept a message and write in a file at the end of existing message.
now read the entire content of file . ( u should be able to read both the messages now)
 */



package FileHandling;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
public class Assign2 {

	public static void main(String[] args) throws Exception  {
		RandomAccessFile rf = new RandomAccessFile("d:/assign2.txt","rw");
		rf.seek(rf.length());
		System.out.println("enter your message");
		
		byte[] b  = new byte[100];
		int a = System.in.read(b);
		rf.write(b,0,a);
		//rf.seek(0);
		byte[] c = new byte[(int)rf.length()];
		rf.read(c);
		String s = new String(c);
		System.out.println(s);
		
		rf.close();
		


	}

}
