package Filehandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterDemo {

	public static void main(String[] args) throws IOException {
//File f = new File("hai.txt");	//ONLY PATH
FileWriter fw = new FileWriter("hai.txt");//Create write one cxharatcer
	
	BufferedWriter bw = new BufferedWriter(fw);
	
	bw.write("hello");
	bw.newLine();
	bw.write("java");
	bw.newLine();
	bw.write("banglore");
	
	
	bw.flush();
	bw.close();
	System.out.println("succss");
	}

}
