package pratice1;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		// 임의로 지정된 1 ~ 100까지의 정수 맞추기
		boolean isRun = true;
		// 임의의 정수
		int guess = 78;
		guess = (int) (Math.random() * 100 )+ 1;
		// 추측횟수
		int count = 0;
		System.out.println(guess);
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("1 ~ 100까지의 정수를 입력해주세요");
			int input = sc.nextInt();
			String result = "성공입니다.";
			if(input == guess) {
				isRun = false;
			}else if(input < guess) {
				result = "높습니다.";
			}else if(guess < input){
				result = "낮습니다.";
			}
			count++;
			System.out.println(result+"추측 횟수 : "+count);
		}while(isRun);
	}

}
