package Filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UserInputDemo {

	public static void main(String[] args) throws IOException {
	Scanner s = new Scanner(System.in);
	System.out.println("enter id");
String id = s.next();
System.out.println("enter name");
String name= s.next();
System.out.println("enter salary");
String salary = s.next();


BufferedWriter bw = new BufferedWriter(new FileWriter("abcd.txt"));
bw.newLine();
bw.write(id +"    ");
bw.write(name +"  ");
bw.write(salary +"  ");
bw.flush();
bw.close();


	}

}
