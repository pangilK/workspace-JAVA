package account;

import java.util.Scanner;

public class BankApplication {
	
	Account[] account = new Account[100];
	int num = 0 ;
	Scanner sc = new Scanner(System.in);
	
	BankApplication(){
		run();
	}
	
	void run() {
		// 1. 계좌생성
		// 2. 계좌조회 
		// 3. 예금
		// 4. 출금
		// 5. 종료
		boolean isRun = true;
		
		while(isRun) {
			System.out.println("========================================");
			System.out.println("1.계좌생성 2.계좌조회 3.예금 4.출금 5.종료");
			System.out.println("========================================");
			
			int selectNo = sc.nextInt();
			if(selectNo == 1) {
				// 계좌생성
				createAccount();
			}else if(selectNo ==2) {
				// 계좌조회
				selectAccount();
			}else if(selectNo ==3) {
				// 예금
				deposit();
			}else if(selectNo ==4) {
				// 출금
				withdraw();
			}else if(selectNo ==5) {
				// 종료
				isRun = false;
				sc.close();
			}
		}
		System.out.println("프로그램 종료");
	}
	
	
	//계좌생성
	void createAccount() {
		account[num] = new Account();
		System.out.println("----------------");
		System.out.println("계좌생성");
		System.out.println("----------------");
		System.out.print("계좌주 : ");
		account[num].owner = sc.next();
		System.out.print("계좌번호 : ");
		account[num].ano = sc.next();
		System.out.print("초기입금액 : ");
		account[num].balance = sc.nextInt();
		System.out.print("비밀번호 : ");
		account[num].password = sc.next();
		System.out.println("계좌 생성이 완료되었습니다.");
		num++;
	}
	// 계좌조회
	void selectAccount() {
		System.out.println("----------------");
		System.out.println("계좌목록");
		System.out.println("----------------");
		System.out.print("계좌번호 : ");
		String ano = sc.next();
		System.out.print("비밀번호 : ");
		String password = sc.next();
		for(int i = 0 ; i<num ; i++) {
			if(ano.equals(account[i].ano)) {
				if(password.equals(account[i].password)) {
					System.out.println(account[i].toString());									
				}
			}
		}
	}
	
	// 예금
	void deposit() {
		System.out.println("----------------");
		System.out.println("예금");
		System.out.println("----------------");
		System.out.print("계좌번호 : ");
		String ano = sc.next();
		System.out.print("비밀번호 : ");
		String password = sc.next();
		System.out.print("예금액 : ");
		int plus = sc.nextInt();
		for(int i = 0 ; i<num ; i++) {
			if(ano.equals(account[i].ano)) {
				if(password.equals(account[i].password)) {
					account[i].balance += plus;
					System.out.println(account[i].owner+"님의 계좌 입금이 완료 되었습니다.");									
				}
			}
		}
		
	}
	//출금
	void withdraw() {
		System.out.println("----------------");
		System.out.println("출금");
		System.out.println("----------------");
		System.out.print("계좌번호 : ");
		String ano = sc.next();
		System.out.print("비밀번호 : ");
		String password = sc.next();
		System.out.print("출금액 : ");
		int minus = sc.nextInt();
		for(int i = 0 ; i<num ; i++) {
			if(ano.equals(account[i].ano)) {
				if(password.equals(account[i].password)) {
					if(account[i].balance < minus) {
						System.out.println("계좌에 있는 금액보다 출금액이 더 많습니다.");
					}else if(account[i].balance >= minus) {
						account[i].balance -= minus;
						System.out.println(account[i].owner+"님의 계좌 출금이 완료 되었습니다.");																					
					}
				}
			}
		}
		
	}
	
	// 계좌번호와 비밀번호가 일치하는 Account 객체를 찾아서 반환 
	Account findAccount(String ano, String password) {
		return null;
	}
	
	public static void main(String[] args) {
		new BankApplication();
	}
}
