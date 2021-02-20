package day2;

public class IncrementDemo {

	public static void main(String[] args) {
		int a=5;
		int b= a++ - a++ + --a + a--;
		int c=--a + a-- + a++ - a--;
		System.out.println(b);
		System.out.println(c);

	}

}
