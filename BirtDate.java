package MultiThread;

import java.time.LocalDate;
import java.time.Period;

public class BirtDate {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalDate birthDay = LocalDate.of(2000, 5, 25);
		
		Period period = Period.between(birthDay, today);
		System.out.println(period.getYears() +" year "+ period.getMonths() +"day "+period.getDays());

	}

}
