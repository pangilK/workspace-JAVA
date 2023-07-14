package array;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * @apiNote
 * Math.random() 함수를 이용하여 6개의 당첨번호를 생성
 * 사용자에게 로또 번호 6개를 입력받아 당첨번호와 비교하여 등수를 출력
 * {@summary}
 * 1 ~ 45 까지의 중복되지 않는 랜덤한 값 6개와 보너스 번호를 비교하여
 * 사용자가 선택한 6개의 번호를 비교 , 등수를 출력하는 프로그램
 */

public class LottoProgram {

	public static void main(String[] args) {
		// 0 ~ 0.99999 // 0~1미만의 실수형 난수를 출력하는 함수
		// double random = Math.random();
		
		// 필요한 난수 == 1 ~ 45
		// int num = (int) (random*45) + 1;
		// System.out.println(num);

		// luckyNum == 당첨 번호
		int luckyNum[] = new int[6];
		// [1][4][4][0][0][0]
		int count = 0;
		
		for(int i = 0 ; i < 6 ; i++) {
			count++;
			luckyNum[i] = (int) (Math.random() *45) + 1;
			for(int j = 0 ; j < i ; j ++) {
				if(luckyNum[i] == luckyNum[j]) {
					i--;
					break;
				}
			}
		}
		
		//배열에 저장된 정수값을 오름차순으로 정렬하여 저장
		int temp = 0;
		for (int i = 0 ; i < luckyNum.length; i++) {
			// luckyNum[i]
			for(int j = i + 1 ; j < luckyNum.length ; j++) {
				// 앞 인덱스에 큰 값이 존재하면 뒤 인덱스에 값과
				// 위치를 변경하여 오름차순 구현
				if(luckyNum[i] > luckyNum[j]) {
					// swap
					temp = luckyNum[i];
					luckyNum[i] = luckyNum[j];
					luckyNum[j] = temp;
				}
			}
		}
		
		// 보너스 번호
		int bonus = (int)(Math.random()*45) + 1;
		for ( int i = 0 ; i<luckyNum.length ; i ++) {
			if(bonus == luckyNum[i]) {
				bonus = (int)(Math.random()*45) + 1;
				// 0번째 인덱스부터 다시 비교할수있도록 i값을 -1로 재할당
				i = -1;
			}
		}
		
		
//		for(int i : luckyNum) {
//			System.out.printf("[%d]",i);
//		}
		
		// 나의 로또 번호
		int[] myLotto = new int[6];
		boolean isRun = true;
		Scanner sc = new Scanner(System.in);
		while(isRun) {
			System.out.println("==================================");
			System.out.println("1.로또구입|2.내번호확인|3.당첨확인|4.종료");
			System.out.println("==================================");
			System.out.println("선택할 항목의 번호를 입력하세요 >");
			int selectNo = sc.nextInt();
			
			switch(selectNo) {
				case 1 : 
					System.out.println("로또 구입");
					a : for(int i = 0 ; i < myLotto.length ; i ++) {
						System.out.println((i+1)+"번째 번호를 입력하세요 >");
						myLotto[i] = sc.nextInt();
						
						if (myLotto[i] < 1 || myLotto[i] > 45 ) {
							System.err.println("1 ~ 45사이의 번호를 입력해주세요");
							i--;
							continue;
						}
						// 중복 제거
						// 현재 등록하려는 번호 보다 먼저 등록된 번호중에
						// 중복이 있는지 확인
						for(int j = 0 ; j < i ; j++) {
							if(myLotto[i] == myLotto[j]) {
								System.err.println("이미 등록된 번호 입니다.");
								i--;
								continue a;
						};
						break;
						}
					}
				case 2 :
					System.out.println("내 번호 확인");
					for (int lotto : myLotto) {
						System.out.printf("[%d]",lotto);
					}
					// 줄바꿈 추가
					System.out.println();
					break;
				case 3 :
					System.out.println("당첨 확인");
					//당첨번호 출력 및 일치하는 번호의 수로 등수 출력
					System.out.print("당첨 번호 : ");
					for(int lotto : luckyNum) {
						System.out.printf("[%d]",lotto);
					}
					System.out.printf(" 보너스 [%d] \n",bonus);
					System.out.print("나의 번호 : ");
					Arrays.sort(myLotto);
					for(int lotto : myLotto) {
						System.out.printf("[%d]",lotto);
					}
					System.out.println();
					
					// 일치하는 개수 확인
					int cnt = 0; // 일치하는 번호 개수
					// 보너스 번호가 일치하는지 확인
					boolean isBonus = false;
					for(int i = 0; i < luckyNum.length ; i ++) {
						for(int j = 0; j < myLotto.length ; j++) {
							if(myLotto[i] == bonus) {
								isBonus = true;
							}
							if(myLotto[j] == luckyNum[i]) {
								cnt++;
							}
						}
					}
					
					System.out.println("일치하는 번호 개수 : " + cnt);
					
					if(cnt == 6) {
						System.out.println("1등 입니다.");
					}else if(cnt == 5) {
						if(isBonus) {
							System.out.println("2등 입니다");
						}else {
							System.out.println("3등 입니다");
						}
					}else if(cnt == 4) {
						System.out.println("4등 입니다.");
					}else if(cnt == 3) {
						System.out.println("5등 입니다.");
					}else {
						System.err.println("꽝입니다");
					}
					break;
				case 4 :
					System.out.println("종료");
					isRun = false;
			}	
		}
		
	}

}
