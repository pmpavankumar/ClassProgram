package day2;

public class NestedForLoop {

	public static void main(String[] args) {
		
		for(int i=1;i<=3;i++)
		{
			System.out.println("value of i "+ i);
			for(int j=1;j<=4;j++)
			{
				System.out.println("value of j "+ j);
			}
			System.out.println("value of i "+ i);
		}

	}

}
