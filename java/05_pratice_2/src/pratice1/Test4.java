package pratice1;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		for(int i = 0; i <= 5; i++) {
			for(int j = 0; j < i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("=======================");
		for(int i = 0 ; i < 5 ; i ++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
				}
			System.out.println("");
			}
			
		for(int i = 5; i > 1; i--) {
			for(int j = 1; j < i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("=========================");
		
		/*
		  	size : 5
		  	[1]
		  	[1][2]
		  	[1][2][3]
		  	[1][2][3][4][5]
		  	--------------------
		  	[1][2][3][4]
		  	[1][2][3]
		  	[1][2]
		  	[1]
		
		 */
		// 사용자가 입력할 값만큼 삼각형만들기
		Scanner sc = new Scanner(System.in);
		System.out.println("높이를 입력하세요!");
		int size = sc.nextInt();
		
		//전체 라인 개수
		int max = size * 2 - 1;
		for(int i = 0; i < max ; i ++) {
			// size : 5
			// max : 9
			// i : 0 ~ 8
			if(i < size) {
				// i : 0 ~ 4
				// i가 size보다 작을떄는 별의 출력 개수 증가
				for(int j = 0 ; j <= i ; j++) {
					System.out.print("*");
				}
			}else {
				// i가 size와 같거나 커지면 별의 출력 개수 감소
				// i : 5 ~ 8
				for(int j = 1 ; j <= max-i ; j++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}	
		
		System.out.println("===============================");
		int count = 1;
		for(int i = 1; i <= max; i++) {
			for(int j = 0 ; j < count ; j++) {
				System.out.print("*");
			}
			if(i < size) {
				count++;
			}else {
				count--;
			}
			System.out.println();
		}

	}

}
