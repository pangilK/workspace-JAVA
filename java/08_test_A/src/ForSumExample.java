import java.util.Scanner;

public class ForSumExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 > ");
		int num = sc.nextInt();
		int sum = 0;
		int sum3 = 0;
		for(int i = 0; i <= num ; i ++) {
			sum += i;
			if(i % 3 == 0) {
				sum3 += i;
			}
		}
		System.out.println("1부터"+num+"까지의 총합계 : "+sum);
		System.out.println("1부터"+num+"까지의 3의 배수의 총합계 : "+sum3);
	}

}
