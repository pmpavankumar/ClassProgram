package day3;

import java.util.Scanner;

public class ArrayStudentMarks {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int totalMarks=0;
		System.out.println("enter the size");
		int size=sc.nextInt();
		
		int marks[]=new int[size];
		for(int i=0;i<marks.length;i++)
		{
			System.out.println("enter the value in Array ["+i+"] =");
			marks[i]=sc.nextInt();
		}
		 int minmarks = 0,maxmarks=marks[0];
		for(int i=0;i<marks.length;i++)
		{
			totalMarks=totalMarks+marks[i];
			if(maxmarks<marks[i])
				maxmarks=marks[i];
			else
				minmarks=marks[i];
		}
		System.out.println("total marks = "+totalMarks);
		System.out.println("minimum marks = "+minmarks);
		System.out.println("maximum marks = "+maxmarks);
		if(minmarks<45)
			System.out.println("result is fail");
		else
			System.out.println("result is pass");

	}

}
