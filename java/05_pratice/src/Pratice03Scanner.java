import java.util.Scanner;

public class Pratice03Scanner {

	public static void main(String[] args) {
		double radius, area;
		System.out.print("반지름을 입력해 주세요 > ");
		// ctrl + shift + o //자동 임폴트
		Scanner sc = new Scanner(System.in);
		radius = sc.nextDouble();
		double pi = 3.14;
		area = radius*radius*pi;
		System.out.println(area);
		
		// 1~10까지의 합을 출력
		int sum = 1+2+3+4+5+6+7+8+9+10 ;
		System.out.println("1 2 3 4 5 6 7 8 9 10");
		System.out.println("합 : "+sum);
		
		// 1~20 까지의 정수의 합을 출력
		// n = n + m
		sum = 0;
		// for - 반복횟수가 정해져 있을때  
		// while - 반복문의 종료 시점을 알 수 없을 때
		// 1에서 시작하여 20까지의 수를 1씩 증가 시키면서 도출
		for(int i = 1; i<=20 ; i++) {}
		int i = 1;
		for(; i<=20; i++) {}
//		for(;;) {}
		for (i = 1; i<=20 ; i++) {
			System.out.print(i + " ");
//			int total = 0;
//			total = total + i;
			sum += i;
		}
		System.out.println("\n합 : "+sum);
		
		// 1 ~ 100까지의 정수 중 홀수의 합을 구하시오.
		int odd = 0;
		for(i = 1 ; i <= 100 ; i++) {
			if( i % 2 == 1 ) odd += i;
		}
		System.out.println("홀수의 총합 : "+odd);
		
		odd = 0;
		
		for(i = 1 ; i < 101 ; i+=2) {
			odd +=i;
		}
		System.out.println("홀수의 총합 : "+odd);
		
	}
	
}
