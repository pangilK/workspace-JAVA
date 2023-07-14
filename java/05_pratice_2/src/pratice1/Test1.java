package pratice1;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("정수를 입력해주세요 : ");
			//사용자가 입력한 값이 정수면 true, 정수 타입이 아니면 false
			boolean isInteger = sc.hasNextInt();
			if(!isInteger) {
				System.out.println("정수가 아닙니다.");
			}
			
			int num = sc.nextInt();
			
			if(num <= 0) {
				System.out.println("종료합니다");
				break;
			}
			
			if(num % 3 == 0 ) {
				System.out.println(num+"은(는) 3의 배수입니다.");
			}else {
				System.out.println(num+"은(는) 3의 배수가 아닙니다.");
			}
			
		}
	}

}
