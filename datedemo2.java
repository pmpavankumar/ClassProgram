package MultiThread;

import java.time.LocalDate;

public class datedemo2 {

	public static void main(String[] args) {
	LocalDate birthday =LocalDate.of(2025, 5, 23);
	LocalDate today = LocalDate.now();
	LocalDate booking = LocalDate.of(2021, 3, 5);
	
	System.out.println(booking.isAfter(today));
	System.out.println(birthday.isBefore(today));
	}

}
