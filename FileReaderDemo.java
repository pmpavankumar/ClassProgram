package Filehandling;
import java.io.*;
public class FileReaderDemo {
	


		public static void main(String[] args) throws IOException {
			FileReader fr = new FileReader("abc.txt");
	int r = fr.read();
	while(r!=-1)
	{
		System.out.println((char)r);
		r=fr.read();
	}
		}

	}

