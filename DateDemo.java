package MultiThread;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateDemo {

	public static void main(String[] args) {
	System.out.println(LocalDate.now());
	
	LocalDate today = LocalDate.now();
	System.out.println("today date is "+ today);
	
	System.out.println("year "+ today.getYear());
	System.out.println("month "+ today.getMonth());
	System.out.println("day pof the week "+ today.getDayOfWeek());
	System.out.println("week "+ today.getDayOfWeek());
	System.out.println("day of this year"+ today.getDayOfYear());
	
	System.out.println(LocalDateTime.now());
	LocalDateTime datetime = LocalDateTime.now();
	
	System.out.println("hour "+ datetime.getHour());
	
	
	}

}
