package day4;

public class LinearSearchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,8,6,5,19,13,17};
		
		int findnumber=13;
		int index=0;
		int flag=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==findnumber) {
				index=i;//it gives index number
			    flag=1;
			    break;
			}
			else
			{
				flag=0;
			}
		}
		if(flag==1)
			System.out.println("number is found "+index);
		else
			System.out.println("number is not found");
	}

}
