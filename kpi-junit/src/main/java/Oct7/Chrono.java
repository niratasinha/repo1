package Oct7;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Chrono {

	//function to check ChronoUnit: when modification happens on certain fields
	public static void checkingChronoEnum()
	{
		LocalDate date = LocalDate.now();
		System.out.println("Current date is:"+date);
		
		//adding 2 years to the current date
		LocalDate year = date.plus(2, ChronoUnit.YEARS);
		System.out.println("Next to next year is:"+year);
		
		//adding one month to the current data
		LocalDate nextMonth = date.plus(1,ChronoUnit.MONTHS);
		System.out.println("The next month is:"+nextMonth);
	}
		//
		
		public static void main(String[]args)
		{
			checkingChronoEnum();
		}

	}

