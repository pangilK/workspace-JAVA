package pratice0424;

import java.util.Scanner;

public class pr03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		double random = Math.random();
		int num2 = (int) (random*100) + 1;
		
		gil : while(true) {
			
				System.out.println("1~100까지의 정수를 입력해주세요");
				int num = sc.nextInt();		
				count++;
				if(num == num2) {
					System.out.println("성공입니다. 추측횟수 : "+count);
					break gil;
				}else if(num > num2) {
					System.out.println("낮습니다. 추측횟수 : "+count);
				}else if(num < num2) {
					System.out.println("높습니다. 추측횟수 : "+count);
			
			}
		}
		}
		
		

}
