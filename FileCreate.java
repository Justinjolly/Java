/*******************************************
 * File    : FileCreate.java
 * Program : To Create a new File in Java
 * Author  : Justin Jolly
 * Version : 1.0
 * Date    : 22-01-2022
 *******************************************/
import java.io.*;
public class FileCreate {
	public static void main(String[] args)throws IOException {
		File r = new File("file.txt");
		
		//To check if file exist
		if(r.exists()) {
			System.out.println("Exist");
		}
		//To create new file
		else {
			r.createNewFile();
			System.out.println("Created");
		}
		
		
	}
}
