package Pratice;

import java.util.Scanner;

public class Pratice_13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean isRun = true;

		int money = 0;
		int in = 0;
		
		while(isRun) {
			System.out.println("===========================");
			System.out.println("1.예금 |2.출금|3.잔액확인|4.종료");
			System.out.println("===========================");
			System.out.println("번호를 입력해주세요(1~4) > ");
			int selectNo = sc.nextInt();
			
			if(selectNo == 1) {
				System.out.println("입금");
				System.out.println("입금하실 금액을 입력하세요");
				in = sc.nextInt();
				money += in;
				System.out.println(in+"원 입금이 완료되었습니다.");
			}
			
			else if(selectNo == 2) {
				System.out.println("출금");
				System.out.println("출금하실 금액을 입력하세요");
				int out = sc.nextInt();
				if(out > money) {
					System.err.println("출금 금액이 예금된 금액보다 클 수 없습니다");
				}else if(money >= out) {
					money -= out;
					System.out.println(out+"원 출금되었습니다.");
				}
				
			}
			
			else if(selectNo == 3) {
				System.out.println("잔액확인");
				System.out.println("잔액 : " + money +"원");
			}
			
			else if(selectNo == 4) {
				System.out.println("종료");
				break;
			} else {
				System.out.println("사용할수 없는 기능입니다.");
				System.out.println("다시 입력해주세요.");
			}
			
		} // end while
		
	}// end main

}
