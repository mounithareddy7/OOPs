package mypackage;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
public class Date_Time {

	public static void main(String[] args) {
		  // Current Date
        LocalDate today = LocalDate.now();
        System.out.println("Current Date: " + today);

        // Current Time
        LocalTime now = LocalTime.now();
        System.out.println("Current Time: " + now);

        // Current Date and Time
        LocalDateTime dateTimeNow = LocalDateTime.now();
        System.out.println("Current Date & Time: " + dateTimeNow);
	
	}

}
