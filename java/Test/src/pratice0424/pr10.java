package pratice0424;

import java.util.Scanner;

public class pr10 {

	public static void main(String[] args) {
		final int size = 10;
		int[] seats = new int[size];
		
		gil : while(true) {
			System.out.println("---------------------");
			for( int i = 0; i < size ; i ++) {
				System.out.print(i+1 + " ");
			}
			System.out.println("\n---------------------");
			for(int i = 0; i < size ; i ++) {
				System.out.print(seats[i]+ " ");
			}
			System.out.println("\n---------------------");
			
			System.out.println("원하시는 좌석번호를 입력하세요(종료는 -1) : ");
			Scanner sc = new Scanner(System.in);
			int s = sc.nextInt();
			if(s == -1 ) {
				System.out.println("종료되었습니다");
				break gil;
			}
			seats[s-1] = 1;
			System.out.println("예약되었습니다");
		}

	}

}
