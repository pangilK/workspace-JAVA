package Pratice;

import java.util.Scanner;

public class Pratice_07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("사원명을 입력하세요 > ");
		String name = sc.next();
		System.out.println("시급을 입력하세요 > ");
		int money = sc.nextInt();
		System.out.println("근무시간을 입력하세요 > ");
		int time = sc.nextInt();
		
		int money2 = (int) (( money*time )*0.03);
		int money3 = (int) ((money*time) - money2);
		System.out.println("급여 명세서");
		System.out.println("사원명 : "+name);
		System.out.println("급여금액 : "+(money*time)+"원");
		System.out.println("공제금액 : "+money2+"원");
		System.out.println("실지급액 : "+money3+"원");
		
	}

}
