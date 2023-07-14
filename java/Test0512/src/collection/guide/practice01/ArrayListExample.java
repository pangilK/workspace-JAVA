package collection.guide.practice01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("6개의 학점을 공백으로 분리 입력(A/B/C/D/F) >>");
		String value = sc.nextLine();
		
		// 합계
		double total = 0;
		double avg = 0.0;
		
		// 코드 작성
		ArrayList<String> List = new ArrayList<>(Arrays.asList(value.split(" ")));
		for(String a : List) {
			if(a.equals("A")) total += 4.0;
			else if(a.equals("B")) total += 3.0;
			else if(a.equals("C")) total += 2.0;
			else if(a.equals("D")) total += 1.0;
			else if(a.equals("F")) total += 0;
		}
		avg = total / List.size();
		System.out.println("입력 완료");
		System.out.printf("평균은 : %.2f %n",avg );
		
		System.out.println("시스템 종료");
	}

}
