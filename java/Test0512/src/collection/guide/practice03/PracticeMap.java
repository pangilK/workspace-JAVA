package collection.guide.practice03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;
import java.util.Map.Entry;

public class PracticeMap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String,Location> manage = new HashMap<>();
		System.out.println("도시, 경도, 위도를 한번에 입력해주세요.(q는 입력완료)");
		
		// 코드 작성
		while(true) {
			System.out.print(">> ");
			String a = sc.next();
			
			if(a.equals("q")||a.equals("ㅂ")) break; // q시 탈출
			
			String s[] = a.replaceAll(" ","").split(",");
			String city = (String) s[0];
			double longitude = Double.valueOf(s[1]);
			double latitude =  Double.valueOf(s[2]);
			Location x = new Location(longitude,latitude);
			manage.put(city,x);
		}
		
		// 출력
		System.out.println("-------------------");
		Set<Entry<String, Location>> entrySet = manage.entrySet();
		Iterator<Entry<String,Location>> iterator = entrySet.iterator();
		while(iterator.hasNext()) {
			Entry<String, Location> entry = iterator.next();
			String key = entry.getKey();
			Location value = entry.getValue();
			System.out.println(key + " " +value.getLongitude()+" "+value.getLatitude());
		}
		System.out.println("-------------------");
		
		// 뽑아내기
		while(true) {
			System.out.print("도시 이름 (q는 종료) >> ");
			String city = sc.next();
			if(city.equals("q") || city.equals("ㅂ")) break;
			else if(manage.get(city) == null) System.out.println(city+"는(은) 없습니다");
			else System.out.println(city+" "+manage.get(city));
		}
		
		System.out.println("시스템 종료");
	}

}
