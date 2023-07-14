package account;

import java.util.Scanner;

public class BankApplication {
	
	Account[] account = new Account[100];
	
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
			System.out.println("이용하실 메뉴 번호를 입력해 주세요 > ");
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
		System.out.println("------------------");
		System.out.println("계좌생성");
		System.out.println("------------------");
		
		Account newAccount = new Account();
		System.out.print("계좌주 : ");
		newAccount.owner = sc.next();
		System.out.print("계좌번호 : ");
		newAccount.ano = sc.next();
		System.out.print("초기입금액 : ");
		newAccount.balance = sc.nextInt();
		System.out.print("비밀번호 : ");
		newAccount.password = sc.next();
		
		for(int i = 0 ; i < account.length; i++) {
			if(account[i] == null) {
				account[i] = newAccount;
				System.out.println("계좌생성이 완료되었습니다");
				break;
			}
		}
	}
	// 계좌조회
	void selectAccount() {
		System.out.println("--------------");
		System.out.println("2. 계좌조회");
		System.out.println("--------------");
		System.out.print("계좌번호 > ");
		String ano = sc.next();
		System.out.print("비밀번호 > ");
		String password = sc.next();
		
		Account registAccount = findAccount(ano,password);
		if(registAccount == null) {
			System.out.println("일치하는 계좌 정보가 없습니다");
		}else {
			System.out.println(registAccount.toString());
		}
	}
	
	// 예금
	void deposit() {
		System.out.println("--------------");
		System.out.println("3. 예금");
		System.out.println("--------------");
		System.out.print("계좌번호 > ");
		String ano = sc.next();
		System.out.print("비밀번호 > ");
		String password = sc.next();
		
		Account registAccount = findAccount(ano,password);
		if(registAccount == null) {
			System.out.println("일치하는 계좌 정보가 없습니다.");
			return;
		}
		
		// 계좌정보가 존재
		System.out.print("예금액 : ");
		int money = sc.nextInt();
		// 잔고
		registAccount.balance += money;
		System.out.printf(
				"%s님의 계좌에 %,d원이 입금되었습니다. %n",
				registAccount.owner,
				money
				);		
	}
	//출금
	void withdraw() {
		System.out.println("--------------");
		System.out.println("3. 출금");
		System.out.println("--------------");
		System.out.print("계좌번호 > ");
		String ano = sc.next();
		System.out.print("비밀번호 > ");
		String password = sc.next();
		
		Account regist = findAccount(ano,password);
		
		if(regist != null) {
			System.out.print("출금액 : ");
			int money = sc.nextInt();
			int result = regist.balance - money;
		
			if(result < 0) {
				System.out.println("잔고가 부족합니다.");
				return;
			}
			regist.balance = result;
			System.out.printf(
					"%s님의 계좌에 %,d원이 출금되었습니다. %n",
					regist.owner,
					money
					);
			//출금완료
			return;
		}
		System.out.println("일치하는 계좌 정보가 없습니다.");
	}
	
	// 계좌번호와 비밀번호가 일치하는 Account 객체를 찾아서 반환 
	Account findAccount(String ano, String password) {
		for(int i = 0; i < account.length; i++) {
			if(account[i] != null
					&&
					account[i].ano.equals(ano)
					&& 
					account[i].password.equals(password)) {
				return account[i];
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		new BankApplication();
	}
}
