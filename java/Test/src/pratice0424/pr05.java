package pratice0424;

import java.util.Scanner;

public class pr05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("높이를 입력하세요!");
		int num = sc.nextInt();
		System.out.print("높이가 "+num+"인 삼각형");
		for(int i = 0 ; i <= num ; i++) {
			for(int j = 0 ; j < i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
