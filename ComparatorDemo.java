package day14;
import java.util.*;
class Product
	{
		int id;
		String name;
		int Price;
		public Product(int id, String name, int price) {
			super();
			this.id = id;
			this.name = name;
			Price = price;
		}
		@Override
		public String toString()
		{
			return "Product [id=" + ",name=" + name + ",price=" + Price + "]";
		
		}
	}
	class PriceComparator implements Comparator<Product>
	{

		@Override
		public int compare(Product o1, Product o2) {
			if(o1.Price==o2.Price)
				return 0;
			else if(o1.Price>o2.Price)
				return 1;
			return -1;
		}
	}
	public class ComparatorDemo {

		public static void main(String[] args) {
			
		ArrayList<Product> productList = new ArrayList<Product>();
		productList.add(new Product(100,"laptop",60000));
		productList.add(new Product(100,"mobile",6000));
		productList.add(new Product(100,"pc",20000));
		for(Product p : productList)
		{
			System.out.println(p.id +" "+p.name +" "+p.Price);
			
		}
		Collections.sort(productList, new PriceComparator());
		System.out.println("=============sort by price============");
		{
			for(Product p : productList)
			{
				System.out.println(p.id +" "+p.name +" "+ p.Price);
			}
		}
		
		}

}
