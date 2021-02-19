package day13;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList o = new ArrayList();//default size array 10
		ArrayList o1 = new ArrayList(30);//30 create size index
		
		
		System.out.println("size of ArrayList "+ o.size());
		System.out.println("element af arraylist "+o);
		o.add(1);//integer i=1 object store
	    o.add("sam");
	    o.add("c");
	    o.add(23.45);
	    o.add(null);
	    o.add("c");
	    o.add(23.45);
	    o.add(null);
	    System.out.println("size of ArrayList after adding "+ o.size());
		System.out.println("element af arraylist "+o);
		
		System.out.println("exits "+o.contains("sam"));
		System.out.println("index "+o.indexOf(1));
		System.out.println("index "+o.indexOf("sam"));
		System.out.println("element of index 2 "+o.get(2));
		
		System.out.println("===============remove=========");
		o.remove(Integer.valueOf(1));
		o.remove("sam");
		System.out.println("after remove "+o);
		o.add(4,"banglore");
		System.out.println("after adding at 4th index "+ o);
	}

}
