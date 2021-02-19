package Filehandling;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Filewritterdemo {

	public static void main(String[] args) throws IOException {
		File f = new File("hello.txt");
		f.createNewFile();
		
		FileWriter f2 = new FileWriter("hello2.txt",true);
		f2.write("hello");
	    f2.write("\n");
	    f2.write("java");
	    f2.write("java");
	    
	    f2.flush();
	    f2.close();

	}

}