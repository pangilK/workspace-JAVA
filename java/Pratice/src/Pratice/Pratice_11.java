package Pratice;

import java.util.Scanner;

public class Pratice_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("점수를 입력해주세요 : ");
			int score = sc.nextInt();
			String result ="";
			if(score >= 90) {
				result = "A";
			}else if(score >= 80) {
				result = "B";
			}else if(score >= 70) {
				result = "C";
			}else if(score >= 60) {
				result = "D";
			}else if(score >= 0){
				result = "F";
			}
			System.out.println(result+"학점입니다.");
		}
	}

}
