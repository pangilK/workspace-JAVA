package pratice0424;

import java.util.Scanner;

public class pr07 {

	public static void main(String[] args) {
		int[] numbers = { 1,2,3,4,5,6,7,8,9,10 };
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 번호를 입력하세요 > ");
		int num = sc.nextInt();
		for(int i = 0; i < numbers.length ; i++) {
			if(num == numbers[i]) {
				System.out.println(num+"은 ["+i+"] index에 있습니다");
			}
		}

	}

}
