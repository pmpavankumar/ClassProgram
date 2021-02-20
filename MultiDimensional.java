package day3;

public class MultiDimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]=new int[4][5];
		
		int count=1;
		for(int i=0;i<a.length;i++)
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=count;
				count++;
			}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}

}
