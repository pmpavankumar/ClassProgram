package day14;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo {

	public static void main(String[] args) {
	
		ArrayList<Integer> o1 = new ArrayList<Integer>();
		o1.add(1);
		o1.add(12);
		o1.add(3);
		System.out.println("element are "+ o1);
		
		Collections.sort(o1);
		
		System.out.println("after sorting "+ o1);
		Collections.reverse(o1);
		System.out.println("reverse sorting "+ o1);
		
		System.out.println("minimum value "+ Collections.min(o1));
		System.out.println("maximum  value "+ Collections.max(o1));
Collections.sort(o1);
		
		System.out.println("after sorting "+ o1);
	int index = Collections.binarySearch(o1, 1);//list is ahould be sorted orderd
	System.out.println("element are found at "+ index);
	
	}

}
