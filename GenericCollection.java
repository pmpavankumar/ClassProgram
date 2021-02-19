package day13;
import java.util.ArrayList;
public class GenericCollection {

	public static void main(String[] args) {
	ArrayList o1 = new ArrayList();
	o1.add(o1);
	o1.add("scahin");
	o1.add(true);
	o1.add(24,45);
ArrayList<Integer> o2 = new ArrayList<Integer>();
o2.add(2);

ArrayList<String> o3 = new ArrayList<String>();

ArrayList<Employee>emplist = new ArrayList<Employee>();
emplist.add(new Employee(1,"rahukl"));
emplist.add(new Employee(2,"rahul"));
	}

}
class Employee
{
	int id;
	String name;
	public Employee (int id,String name)
	{
		super();
		this.id = id;
		this.name = name;
	}
	
}