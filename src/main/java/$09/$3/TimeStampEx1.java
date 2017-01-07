package $09.$3;

import java.sql.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TimeStampEx1 {
	
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		
		Timestamp time = new Timestamp(System.currentTimeMillis());
		System.out.println(System.currentTimeMillis());
		System.out.println(time);
		
		Date date = new Date(time.getTime());
		
		//SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); //http://vicki.tistory.com/1294
	    
	    System.out.println(sdf.format(date).toString());
		

	}

}
