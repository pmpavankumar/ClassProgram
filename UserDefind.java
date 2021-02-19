package day14;
import java.util.ArrayList;
import java.util.Collections;
class Employee 
	{
		int id;
		String name;
		public Employee(int id,String name)
		{
			super();
			this.id=id;
			this.name = name;
		}
		@Override
		public String toString() {
			return "Employee[id=" + id + ", name=" + name + "]";
		}
		
		
	}

	public class UserDefind {

		public static void main(String[] args) {
			ArrayList<Employee>emplist = new ArrayList<Employee>();
			emplist.add(new Employee(1,"name"));
			emplist.add(new Employee(2,"rahul"));
			emplist.add(new Employee(3,"pant"));
			
			System.out.println("elements are "+ emplist );
			
			for(Employee o :emplist)
			{
				System.out.println(o.id +" "+ o.name);
			}
			
		}

}
