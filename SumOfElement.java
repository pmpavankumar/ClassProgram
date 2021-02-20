package day3;

public class SumOfElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int evencount=0,oddcount=0,evensum=0,oddsum=0;
        int ar1[]= {1,2,3,4,5};
        int ar2[]= {3,4,9,12,7,20,5};
        int sum=0;
        
        for(int i=0;i<ar1.length;i++)
        {
        	sum=sum+ar1[i];
        }
        
        System.out.println(sum);
        
        for(int i=0;i<ar2.length;i++)
        {
        	if(ar2[i]%2==0)
        	{
        		evencount++;
        		evensum=evensum+ar2[i];
        	}
        	else
        	{
        		oddcount++;
        		oddsum=oddsum+ar2[i];
        	}
        		
        		
        }
        System.out.println("even count is "+ evencount+" even sum "+evensum );	
    	System.out.println("odd count is "+ oddcount+" odd sum "+oddsum );
	}

}
