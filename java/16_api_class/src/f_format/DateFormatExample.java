package f_format;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatExample {
	
	public static void main(String[] args) {
		// Date == long타입의 시간 정보를 저장하는 class
		Date date = new Date();
		System.out.println(date);
		// date.getYear();
		SimpleDateFormat sdf = new SimpleDateFormat();
		// HH - 0 ~ 23시
		// hh - 1 ~ 12시
		// KK - 0 ~ 11시
		// kk - 1 ~ 24시
		// yy. MM. dd. a kk:mm
		String now = sdf.format(date);
		System.out.println("now : " +now);
		sdf = new SimpleDateFormat("yyyy-MM-dd E요일 a KK:mm:ss");
		now = sdf.format(date);
		System.out.println(now);
		now = sdf.format(new Date(0));
		System.out.println(now);
		now = sdf.format(new Date(Long.MAX_VALUE)); 
		System.out.println(now);
		System.out.println(1000 * 60 * 60 * 24 * 365);
		// ss.sss초 정보를 밀리세컨까지 출력
		// D 년중 날짜
		sdf = new SimpleDateFormat("yyyy년MM월dd일 E요일 HH:MM:ss.sss D");
		now = sdf.format(System.currentTimeMillis());
		System.out.println(now);
	
	
	}
	
}
