package day3;

import java.util.Scanner;

public class StringArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Entet the size");
		int size=sc.nextInt();
		String st[]=new String[size];
		System.out.println("Enter the names");
		for(int i=0;i<st.length;i++)
		{
			st[i]=sc.nextLine();
		}
		for(int i=0;i<st.length;i++)
		{
			System.out.println(st[i]);
		}

	}

}
