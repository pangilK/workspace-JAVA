import java.util.Arrays;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// 5개의 정수(점수)를 입력받아 배열에 저장하고
		// 배열에 저장된 점수의 평균을 구하시오.
		int scores[] = new int[5];
		Scanner sc = new Scanner(System.in);
		int total = 0;
		for(int i = 0 ; i < scores.length ; i++) {
			System.out.print("점수를 입력하세요 > ");
			scores[i] = sc.nextInt();
			total += scores[i];
		}
		System.out.println("총점은 : "+total);
		double avg = total / (double)scores.length;
		System.out.println("평균 성적은 "+avg+" 입니다");
		
	}

}
