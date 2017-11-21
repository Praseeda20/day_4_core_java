import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;


public class DateDemo {
	private String myDate;
	private LocalDate today;
	

	public DateDemo() {
	}

	public DateDemo(String myDate, LocalDate today) {
		this.myDate = myDate;
		this.today = today;		
	}
	
	public void calcDuration()
	{
		DateTimeFormatter myFormatter=DateTimeFormatter.ofPattern("yyyy-MMM-dd");
		LocalDate myNewDate= LocalDate.parse(myDate, myFormatter);
		Period per= Period.between(today, myNewDate);
		System.out.println(+per.getDays()+" Days "+per.getMonths()+" Months "+per.getYears()+" Years");

	}

}
