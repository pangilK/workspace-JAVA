import java.util.Scanner;

public class forsum {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			while(true) {
				System.out.println("숫자를 입력하세요 > ");
				
				boolean isInteger = sc.hasNextInt();
				if(!isInteger) {
					System.out.println("정수가 아닙니다.");
					sc.next();
					continue;
				}
				
				int num = sc.nextInt();
				if(num <= 1) {
					System.out.println("1보다 큰수를 입력해주세요");
					continue;
				}
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

}


