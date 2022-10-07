package Oct7;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Ques2 {
	
	public static void CheckChrono()
	{
		LocalDate date = LocalDate.now();
		System.out.println("Present date is"+date);
		
		LocalDate year = date.plus(8,ChronoUnit.YEARS);
		System.out.println("Date of Wednesday in the year 2030:"+year);
		
	
	try {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy",java.util.Locale.ENGLISH);
		java.util.Date date1 = sdf.parse("07/10/2030");
		sdf.applyPattern("EEE,d MMM YYYY");
		String str = sdf.format(date1);
		System.out.println(str);
	}
catch (Exception e)
	{
	e.printStackTrace();
	}
	}
public static void main(String []args) {
	CheckChrono();
	
}
}
