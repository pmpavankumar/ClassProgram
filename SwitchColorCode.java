package day3;

import java.util.Scanner;

public class SwitchColorCode {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the color name");
		char ch=sc.next().charAt(0);
		switch(ch)
		{
		case 'B':
			System.out.println("blue");
			break;
		case 'G':
			System.out.println("green");
			break;
		case 'R':
			System.out.println("red");
			break;
			
			default:
				System.out.println("color not found");
			
		}

	}

}
