package day14;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList l = new LinkedList();
		l.add(2);
		l.add(5);
		l.add(10);
		l.addFirst(10);
		l.addLast(4);
		l.add(8);
System.out.println("linked lis "+ l);

l.removeFirst();
System.out.println("linked list "+ l);
l.removeLast();
System.out.println("linked list "+ l);


	}

}
