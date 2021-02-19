package MultiThread;

import java.time.LocalDate;

public class dateoperation {

	public static void main(String[] args) {
	
		LocalDate date = LocalDate.now();
		System.out.println("today date "+ date);
		System.out.println("priviuos date "+ date.minusDays(1));
		System.out.println("next date "+ date.plusDays(1));
		
	}

}
