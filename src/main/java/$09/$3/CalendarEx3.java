package $09.$3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

class  CalendarEx3
{
	public static void main(String[] args) 
	{
		final int[] TIME_UNIT = {3600, 60, 1}; // 큰 단위를 앞에 놓는다.
		final String[] TIME_UNIT_NAME = {"시간 ", "분 ", "초 "};

		Calendar time1 = Calendar.getInstance();
		Calendar time2 = Calendar.getInstance();

		// time1의 시간을 10시 20분 30초로 설정한다.
		time1.set(Calendar.HOUR_OF_DAY, 10);
		time1.set(Calendar.MINUTE, 20);
		time1.set(Calendar.SECOND, 30);

		// time2의 시간을 20시 30분 10초로 설정한다.
		time2.set(Calendar.HOUR_OF_DAY, 20);
		time2.set(Calendar.MINUTE, 30);
		time2.set(Calendar.SECOND, 10);

		System.out.println("time1 :"+time1.get(Calendar.HOUR_OF_DAY)+"시 " + time1.get(Calendar.MINUTE) +"분 " + time1.get(Calendar.SECOND) + "초");
		System.out.println("time2 :"+time2.get(Calendar.HOUR_OF_DAY)+"시 " + time2.get(Calendar.MINUTE) +"분 " + time2.get(Calendar.SECOND) + "초");

		long difference = Math.abs(time2.getTimeInMillis() - time1.getTimeInMillis())/1000;
		System.out.println("time1과 time2의 차이는 "+ difference +"초 입니다.");

		String tmp = "";
		for(int i=0; i < TIME_UNIT.length;i++) { 
			  tmp += difference/TIME_UNIT[i]+ TIME_UNIT_NAME[i]; 
			  difference %= TIME_UNIT[i];
		} 

/*		System.out.println("시분초로 변환하면 " + tmp + "입니다.");
		
		for(int i=0; i<10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("timein:" + System.currentTimeMillis());
		}*/
		
//		Calendar mydate = Calendar.getInstance();
//		mydate.setTimeInMillis(1403845638*1000);
//		System.out.println("" + mydate.get(Calendar.DAY_OF_MONTH)+"."+mydate.get(Calendar.MONTH)+"."+mydate.get(Calendar.YEAR));
		
		String s = "20140630/090508+32400N00O.AVI";
		Calendar c = Calendar.getInstance();
		SimpleDateFormat simple = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss", Locale.KOREAN);
		int year = Integer.parseInt(s.substring(0, 4));
		int month = Integer.parseInt(s.substring(4, 6));
		int hourOfDay = Integer.parseInt(s.substring(6, 8));
		int hour = Integer.parseInt(s.substring(9, 11));
		int minute = Integer.parseInt(s.substring(11, 13));
		int second =  Integer.parseInt(s.substring(13, 15));

		c.set(year, month-1, hourOfDay, hour, minute, second);
		c.add(Calendar.HOUR, 9);
		Date date = c.getTime();
		System.out.println("" + simple.format(date));
	}
}
