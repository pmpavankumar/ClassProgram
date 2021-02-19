package Filehandling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Printwriterdemo {

	public static void main(String[] args) throws FileNotFoundException {
	PrintWriter pw = new PrintWriter("abcde.txt");
	pw.write(100);
	pw.print(100);
	pw.flush();
	pw.close();
	
	
	System.out.println("succss");
	}

}
