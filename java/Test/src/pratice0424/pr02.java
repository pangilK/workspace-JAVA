package pratice0424;

import java.util.Scanner;

public class pr02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("성별을 입력해주세요. (남성 또는 남 그리고 여성 또는 여)");
		String sexual = sc.next();
		
		if(sexual == "남성") {
			System.out.println("남자 화장실은 오른쪽입니다");
		}

	}

}
