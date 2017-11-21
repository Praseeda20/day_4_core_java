import java.time.LocalDate;
import java.util.Scanner;


public class TestDate3_3 {
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		LocalDate today=LocalDate.now();
		System.out.println("Today is: "+today);
		
		System.out.println("Enter your Date like '2017-Jan-01':");
		String myDate= sc.next();
		
		DateDemo myDates=new DateDemo( myDate, today);
		myDates.calcDuration();
		sc.close();
	}
}
