package array;

import java.util.Arrays;
import java.util.Scanner;


public class LottoProgramExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//입력 번호
		int sNum[] = new int[6];
		for(int i = 0 ; i < 6 ; i++) {
			System.out.println("로또 당첨 번호를 입력해주세요 45이하로 > ");
			sNum[i] = sc.nextInt();
		}
		
		Arrays.sort(sNum);
		for(int d : sNum) {
			System.out.printf("[%d]",d);
		}
		
		//당첨 번호
		int luckyNum[] = new int[6];
		
		for(int i = 0 ; i < 6 ; i++) {
			luckyNum[i] = (int) (Math.random() *45) + 1;
			for(int j = 0 ; j < i ; j ++) {
				if(luckyNum[i] == luckyNum[j]) {
					i--;
				}
			}
		}
		System.out.println();
		
		Arrays.sort(luckyNum);
		for(int i : luckyNum) {
			System.out.printf("[%d]",i);
		}
		
		//당첨 확인
		int count = 0;
		
		for(int i = 0; i < 6 ; i++) {
			if(sNum[i] == luckyNum[i] ) {
				count++;
			}
		}
		
		if(count == 6) {
			System.out.println("1등 당첨입니다 !");
		}else if(count == 5){
			System.out.println("2등 당첨입니다 !");
		}else if(count == 4 ) {
			System.out.println("3등 당첨입니다");
		}else if(count == 3 ) {
			System.out.println("4등 당첨입니다");
		}else {
			System.out.println("\n당첨되지 않았습니다.");
		}
	}

}
