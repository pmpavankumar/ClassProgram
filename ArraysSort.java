package day3;

import java.util.Arrays;

public class ArraysSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {12,13,5,6,7,16};
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
        Arrays.sort(a);
        
        for(int i=0;i<a.length;i++)
        {
        	System.out.print(a[i]+" ");
        }
        System.out.println();
        int found=Arrays.binarySearch(a, 12);
        
        if(found>0)
        	System.out.println("element found at "+ (found+1));
        else
        	System.out.println("element not found");
	}

}
