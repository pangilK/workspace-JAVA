package pratice0424;

import java.util.Scanner;

public class pr06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum =0;
		for(int i = 0 ; i < 5 ; i++) {
			System.out.print("성적을 입력하십시오:");
			int num = sc.nextInt();
			sum += num/5;
			
		}
		System.out.println("평균성적은 "+sum+" 입니다.");
	}

}
