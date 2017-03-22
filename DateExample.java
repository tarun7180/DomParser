package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) throws ParseException {
		//converting date to milliseconds
		String myDate = "2017-03-20 18:30:28";
	    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    Date date1 = sdf.parse(myDate);
	    long millis = date1.getTime();
	    System.out.println("Date in Millis:"+millis);
		
	    //converting milliseconds to date
	    String millisDate = "1490014828000";
	    Date date = new Date(Long.parseLong(millisDate));
	    System.out.println("Date in date format:"+sdf.format(date));
	    
	}
}
