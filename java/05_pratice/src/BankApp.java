import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// while 탈출 falg
		boolean isRun = true;
		// 사용자의 예금을 저장할 변수
		int money = 0;
		gil : while(isRun) {
			System.out.println("==========================");
			System.out.println("1.예금|2.출금|3.잔액확인|4.종료");
			System.out.println("==========================");
			System.out.println("번호를 입력해주세요(1~4) > ");
			int selectNo = sc.nextInt();
			switch (selectNo) {
				case 1 :
					System.out.println("입금");
					System.out.println("입금하실 금액을 입력하세요");
					int deposit = sc.nextInt();
					money = money + deposit;
					// money += deposit;
					System.out.println(deposit+"원이 입금 완료되었습니다.");
					break;
					
				case 2 :
					System.out.println("출금");
					System.out.println("출금하실 금액을 입력하세요.");
					int withdrawal = sc.nextInt();
					if(withdrawal > money) {
						System.err.println("출금 금액이 예금된 금액보다 클 수 없습니다");
						continue gil;
					}
					money -= withdrawal;
					System.out.println(withdrawal+"원이 출금되었습니다.");
					break;
					
				case 3 :
					System.out.println("잔액확인");
					System.out.printf("잔액 : %d원 입니다.\n",money);
					break;
					
				case 4 :
					System.out.println("종료");
					// isRun = false;
					break gil;
					
				default :
					System.out.println("사용할수 없는 기능입니다.");
					System.out.println("다시 입력해주세요.");
			}
		} // while 종료

	}

}
