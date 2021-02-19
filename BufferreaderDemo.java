package Filehandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferreaderDemo {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("info.txt");
	BufferedReader br = new BufferedReader(fr);
	
	System.out.println(br.readLine());
	System.out.println(br.readLine());
	System.out.println(br.readLine());
	
	String read = br.readLine();
	System.out.println(read);
	
	while(read!=null)
	{
		System.out.println(read);
		 read=br.readLine();
		
	}
	
	
	}

}
