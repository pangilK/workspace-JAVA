import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		final int size = 10; 
		// final
		// 한번 값이 지정이 되면 값을 재할당 할 수 없는 읽기전용 변수가 됨.
		// size = 100;
		int[] seats = new int[10];
		
		while(true) {
			System.out.println("--------------------");
			for(int i = 0 ; i < size ; i ++) {
				System.out.print((i+1) + " ");
			}
			System.out.println("\n--------------------");
			for(int i = 0 ; i < size ; i ++) {
				System.out.print(seats[i]+" ");
			}
			System.out.println("\n--------------------");
			System.out.println("원하시는 좌석번호를 입력하세요(종료는 - 1)");
			Scanner scan = new Scanner(System.in);
			int seat = scan.nextInt();
			// 여기까지가 문제에서 제시된 내용
			// index [0][1][2][3][4][5][6][7][8][9]
			// seats [0][0][0][0][0][0][0][0][0][0]
			
			// 예약프로그램 종료 - 반복문 탈출
			if(seat == -1) {
				System.out.println("프로그램 종료");
				break;
			}
			
			// 사용자가 입력한 좌석 번호에 따라 예약 진행
			if(seats[seat-1] == 0) {
				seats[seat-1] = 1;
				System.out.println("예약이 완료되었습니다.");
			}else {
				System.out.println("이미 예약이 완료된 자리입니다.");
			}
			
		}// end while
		

	}//end main

}
