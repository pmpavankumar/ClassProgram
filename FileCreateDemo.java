package Filehandling;
import java.io.*;
public class FileCreateDemo {
	public static void main(String[] args) throws IOException {
		
			File f = new File("C:\\Users\\Lenovo\\abc.txt");
			System.out.println(f.exists());
			f.createNewFile();
			System.out.println(f.exists());

		}

	}



