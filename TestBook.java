package EncAndInh;

public class TestBook {
	
		   public static void main(String[] args) {
		      Book b1 = new Book("","",-5);
		      System.out.println(b1);
		      Book b2 = new Book("","",6);
		      System.out.println(b2);
		      b2.setTitle("");
		      b2.setAuthor("");
		      b2.setPrice(-32);
		      System.out.println(b2);
		   }
		}


