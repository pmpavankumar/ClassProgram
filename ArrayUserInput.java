package day3;

import java.util.Scanner;

public class ArrayUserInput {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		
		int marks[]=new int[size];
		for(int i=0;i<marks.length;i++)
		{
			System.out.println("enter the value in Array ["+i+"] =");
			marks[i]=sc.nextInt();
		}
		System.out.println();
       
		for(int i=0;i<marks.length;i++)
		{
			System.out.println(" the value in Array ["+i+"] =" + marks[i]);
			
		}
	}

}
