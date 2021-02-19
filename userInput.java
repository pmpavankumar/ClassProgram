package Filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class userInput {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
	    System.out.println("enter the name ");
	    String name = scan.next();
	    
	    
	    System.out.println("enter the age ");
	    String age= scan.next();
	    
	FileWriter fw = new FileWriter("info.txt");
	BufferedWriter bw = new BufferedWriter(fw);
	bw.write("name: "+name);
	bw.newLine();
	bw.write("age: "+age);
	bw.flush();
	bw.close();
	
	
	}

}
