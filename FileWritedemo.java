package Filehandling;
import java.io.*;
public class FileWritedemo {
	

	

		public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("abc.txt",true);
		fw.write(" hai");
		fw.write(97);
		fw.write(98);
		
		fw.flush();
		fw.close();
		
		

		}

	}


