package day2;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
        System.out.println("Enter your details");
        
        System.out.println("Enter your id");
        int id=s.nextInt();
        System.out.println("your id is "+ id);
        
        
        
        System.out.println("Enter your name");
        String name = s.nextLine();
        while(s.hasNext())
        {
        	System.out.print(s.next()+ " ");
        }
        System.out.print("your name is "+ name);
	}

}
