package day13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ItrateDemo {

	public static void main(String[] args) {
		ArrayList o1 = new ArrayList();
		o1.add(1);
		o1.add(2);
		o1.add(3);
		o1.add(4);
	System.out.println("element are "+ o1);
	Iterator it = o1.iterator();
	while(it.hasNext());
	{
		System.out.println(it.next());
	}
	System.out.println("============listiterator======");
	ListIterator lsit = o1.listIterator();
	System.out.println("forword direction");
	while(lsit.hasNext())
	{
		System.out.println(lsit.next());
	}
	System.out.println("backword direction");
	while(lsit.hasPrevious())
	{
		System.out.println(lsit.previous());
	}
	}

}
