package Oct7;

import java.time.LocalDate;
import java.time.Month;

public class Ques1 {
public static void check1()
{
	LocalDate date1 = LocalDate.of(2022,1,26);
	System.out.println("The current Date:" +date1);
	
	Month month = date1.getMonth();
	int date = date1.getDayOfMonth();
	int year = date1.getYear();
	
	System.out.println("Month:"+month+"Date:"+date+"Year:"+year);
}
public static void main(String[]args) {
	check1();
}}
	


