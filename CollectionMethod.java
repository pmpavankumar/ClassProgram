package day13;

import java.util.ArrayList;

public class CollectionMethod {

	public static void main(String[] args) {
		ArrayList o1 = new ArrayList();
		o1.add(1);
		o1.add(2);
		o1.add(3);
		o1.add(4);
		System.out.println("element of o1 "+ o1);

		ArrayList o2 = new ArrayList();
		o2.add(3);
		o2.add(4);
		o2.add(5);
		o2.add(6);
		System.out.println("element of o2 "+ o2);

		//o2.addAll(o1);
		//System.out.println("element of o2 after adding o1 "+ o2);
//o2.removeAll(o1);
//System.out.println("element of o2 "+ o2);
	o2.retainAll(o1);
	System.out.println("commaon element will be retails o2"+ o1);

}
}
