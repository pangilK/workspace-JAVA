package pratice1;

import java.util.*;

public class Test2 {

	public static void main(String[] args) {
		/*
		 -결 과 : 남성 또는 남 입력 시 (남자 화장실은 왼쪽입니다.)
		 	: 여성 또는 여 입력시(여자 화장실은 오른쪽입니다.)
		 	: 제시된 단어가 아닐시(화장실을 찾을수 없습니다.)
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("성별을 입력해 주세요.(남성 또는 남 그리고 여성 또는 여 )");
		String s = sc.next();
		if(s.equals("남성") || s.equals("남")) {
			System.out.println("남자 화장실은 오른쪽입니다.");
		}else if(s.equals("여성") || s.equals("여")) {
			System.out.println("여자 화장실은 왼쪽입니다.");
		}else {
			System.out.println("화장실을 찾을 수 없습니다.");
		}
		
		switch(s) {
			case "남성" : case "남" :
				System.out.println("남자 화장실은 오른쪽입니다.");
				break;
			case "여성","여" :
				System.out.println("여자 화장실은 왼쪽입니다.");
			default :
				System.out.println("화장실을 찾을수 없습니다.");
		}
	}

}
