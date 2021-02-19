package EncAndInh;

public class secondpart {
	private String title;
	   private String author;
	   private double price;

	   
	   public secondpart(String t, String a, double p) {
	      title = t.trim();
	      if (title.equals("")) {
	         title = "NOTITLE";
	      }
	      author = a.trim();
	      if (author.equals("")) {
	         author = "NOAUTHOR";
	      }
	      price = p;
	      if (price < 0) {
	         price = 0;
	      }
	   }
	   public secondpart() {
	      this("","",0.0);
	   }

	   public String toString() {
	      String temp = "Title: " + title + "\nAuthor: " + author + "\nPrice: $" + price;
	      return temp;
	   }
	   public void setTitle(String t) {
	      title = t.trim();
	      if (title.equals("")) {
	         title = "BLANKTITLE";
	      }
	   }
	   public String getTitle() {
	      return title;
	   }
	   public void setAuthor(String a) {
	      author = a.trim();
	      if (author.equals("")) {
	         author = "BLANKAUTHOR";
	      }
	   }
	   public String getAuthor() {
	      return author;
	   }
	   public void setPrice(double p) {
	      price = p;
	      if (price < 0) {
	         price = 0;
	      }
	   }
	   public double getPrice() {
	      return price;
	   }
}