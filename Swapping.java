package day4;

public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=12;
		
		System.out.println("Before swapping");
		System.out.println("Value of a is: "+ a);
		System.out.println("Value of b is: "+ b);
		
		int temp=a;
		a=b;
		b=temp;
		
		System.out.println("After swapping");
		System.out.println("Value of a is: "+ a);
		System.out.println("Value of b is: "+ b);

	}

}
