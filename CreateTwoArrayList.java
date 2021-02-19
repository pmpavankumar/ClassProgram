package day14;
import java.util.ArrayList;
import java.util.Collections;

public class CreateTwoArrayList {

	public static void main(String[] args) {
		
		
		ArrayList <String> javabatch=new ArrayList<String>();
		  javabatch.add("aarati");
		  javabatch.add("deepa");
		  javabatch.add("sarita");
		  javabatch.add("abhay");
		  System.out.println(javabatch);
		  
		  ArrayList <String> softskill=new ArrayList<String>();
		  softskill.add("anjali");
		  softskill.add("nikil");
		  softskill.add("deepa");
		  softskill.add("aarati");
		  System.out.println(softskill);
softskill.removeAll(javabatch);
System.out.println("after emoving "+ softskill);

softskill.addAll(javabatch);
System.out.println("after adding "+ softskill);

Collections.sort(softskill);
System.out.println("after sorting "+ softskill);

	}

}
