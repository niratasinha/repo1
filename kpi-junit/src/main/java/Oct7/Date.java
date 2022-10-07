package Oct7;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Date {
public static void LocalDateTimeAPI()
{ 
	//current date
	LocalDate date = LocalDate.now();
	System.out.println("The current date is" +date);
	
	//current time
	LocalTime time = LocalTime.now();
	System.out.println("The current time is" +time);
	
	//will give us the current date and time 
	LocalDateTime current = LocalDateTime.now();
	System.out.println("Current Date and Time:" +current);
	
	//to print in a particular format
	DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-mm-yyyy HH:mm:ss");
	
	String formatedDateTime = current.format(format);
	System.out.println("in formatted manner" +formatedDateTime);
	
	//printing months days and seconds
	
	Month month = current.getMonth();
	int day = current.getDayOfMonth();
	int seconds = current.getSecond();
	int hour = current.getHour();
	int year = current.getYear();
	System.out.println("Month:" +month+"day:" +day+"seconds:"+seconds+"hour:"+hour+"year:"+year);
	
	//printing some specified date
	LocalDate date2 = LocalDate.of(1950, 1, 26);
	System.out.println("The republic day:"+date2);
	
	//printing date with current time
	LocalDateTime specificDate = current.withDayOfMonth(24).withYear(2016);

	System.out.println("specific date with"+specificDate);
}

public static void main(String[]args)
{
	LocalDateTimeAPI();
}


}
