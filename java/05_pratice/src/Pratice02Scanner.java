
//import java.util.Scanner;
import java.util.*;

public class Pratice02Scanner {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		// 사용자에게 console을 통하여 지정된 타입의 값을 입력받는 class
		// System.in == 연결된 운영체제의 command line을 통해 입력
		
//		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("정수를 입력해 주세요 > ");
		boolean isUse = sc.hasNextInt();
		if(isUse == true) {
			// 정수 입력
			int result = sc.nextInt();
			System.out.printf("입력받은 정수값 %d \n",result);
			
		}else {
			// 정수가 아님.
			sc.next();
			System.out.println("정수를 다시 입력해주세요 > ");
			int result2 = sc.nextInt();
			System.out.printf("입력받은 정수값 %d \n",result2);
		}
		
		System.out.println("실수를 입력해 주세요 > ");
		double d = sc.nextDouble();
		System.out.printf("입력받은 실수값 %.2f \n",d);
		
		System.out.println("단어를 입력해주세요 > ");
		String word = sc.next();
		System.out.printf("입력 받은 단어 %s \n",word);
		
		// 스캐너를 따로 사용해줘야댐 엔터에도 값이 들어가기 때문
		System.out.println("문장을 입력해주세요 > ");
		String strs = sc2.nextLine();
		System.out.println(strs);
		
		System.out.println("실행 여부를 작성해 주세요 > ");
		boolean isRun = sc.nextBoolean();
		System.out.println("실행 여부 확인 : " + isRun);
		
		System.out.println("Main Method End");
	}// main end

}
