package FileHandling;
import java.io.*;
import java.util.*;

public class Assign5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int input = 0;
		int count = 0;
		try(FileOutputStream fos = new FileOutputStream("d:/assign5.txt")){
			DataOutputStream dos = new DataOutputStream(fos);
			System.out.println("Enter Numbers:");
			while((input = sc.nextInt())!=0){
				dos.writeInt(input);
				count++;
			}
		}
		catch(IOException ie){
			ie.printStackTrace();
		}
		try(FileInputStream fis = new FileInputStream("d:/assign5.txt")){
			DataInputStream dis = new DataInputStream(fis);
			System.out.println("Reading values from file");
				for(int i=0;i<count;i++){
					System.out.println(dis.readInt());
				}
		}
		catch(IOException ie){
			ie.printStackTrace();
		}
	}
}