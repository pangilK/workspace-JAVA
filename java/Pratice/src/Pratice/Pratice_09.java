package Pratice;

import java.util.Scanner;

public class Pratice_09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 : ");
		int num2 = sc.nextInt();
		int result = 0;
		if(num1 > num2) {
			result =+ num1;
		}else {
			result =+ num2;
		}
		
		System.out.println("큰 수는 "+result);
	}

}
