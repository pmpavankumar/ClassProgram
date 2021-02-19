package Filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task1 {

	public static void main(String[] args) throws IOException {
	
//Bufferedreader br = new BufferedReader("abc.txt");
		
		FileReader fr = new FileReader("abc.txt");
		BufferedReader br = new BufferedReader(fr);
		String read = br.readLine();
		
		StringBuffer sb = new StringBuffer();
		String r = br.readLine();
		
		while(read!=null)
		{
		
			sb.append(r);
			System.out.println(r);
			r=br.readLine();
		}
	
		System.out.println("content of file :"+ sb);
		
		sb.reverse();
		System.out.println("after reverse :"+ sb);
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("abc.txt"));
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		
	}

}
