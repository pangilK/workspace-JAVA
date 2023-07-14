package Pratice;

import java.util.Scanner;

public class Pratice_06 {

	public static void main(String[] args) {
//		다음 사다리꼴 도형의 넓이를 구하여 출력하는 소스코드를 완성하세요.(단 소수점자리가 나와야함.)
//		   (사다리꼴의 넓이) = ((윗변+아랫변) * 높이) / 2
		Scanner sc = new Scanner(System.in);
		System.out.print("윗변을 입력하세요 : ");
		float top = sc.nextFloat();
	
		System.out.print("아랫변을 입력해 주세요 : ");
		float bot = sc.nextFloat();
		
		System.out.print("높이를 입력해 주세요 : ");
		float h = sc.nextFloat();
		
		System.out.println((top+bot) * (h/2));
	}

}
