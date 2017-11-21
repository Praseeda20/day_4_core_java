import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class TestDateDemo {

	public static void main(String[] args) {
		LocalDate today=LocalDate.now();
		System.out.println("Today is: "+today);
		
		LocalDate myDoj=LocalDate.of(2017, 10, 25);
		System.out.println("My date of Joining: "+myDoj);
		
		System.out.println("Date after 2 days: "+today.plusDays(2));
		
		Period per= Period.between(myDoj,today);
		System.out.println("My experience in CG is: "+per.getYears()+" Years "+per.getMonths()+" Months "+per.getDays()+" Days");
		
		String myDob="20-Jan-1995";
		DateTimeFormatter myFormatter=DateTimeFormatter.ofPattern("dd-MMM-uuuu");
		LocalDate myDOB= LocalDate.parse(myDob, myFormatter);
		System.out.println("My Date of Birth: "+myDOB.format(myFormatter));
			
	}

}
