package nuls;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import java.util.Scanner;
public class TimeZona {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter TimeZone:");
		String s = "GMT"+scan.nextLine();
		System.out.println("Time in Ukraine:");
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MMMyyyy \n  HH:mm 'GMT'Z \n  K:m a ");
	        System.out.println("date: " + dateFormat.format( new Date() ) );
	        SimpleDateFormat dateFormat1 = new SimpleDateFormat("MM/dd/yyyy \n  HH:mm 'GMT'Z \n  K:m a ");
	        dateFormat1.setTimeZone(TimeZone.getTimeZone(s));
	        System.out.println("date: " + dateFormat1.format( new Date() ) );
	}

}
