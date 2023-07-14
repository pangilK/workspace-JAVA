package api_class.practice;

import java.util.Arrays;

public class Practice5StringWrapper {

	public static void main(String[] args) {
		String scores = "100,11,35,41";
		// 총점
		int total = 0;
		// 평균
		double avg = 0;
		
		// 작성
		String scores2[] = scores.split(",");
		for(int i = 0 ; i < scores2.length ; i++) {
			total += Integer.parseInt(scores2[i]);
		}
		avg = total / scores2.length;
		System.out.println(scores);
		System.out.println("총점 : " + total + "점");
		System.out.printf("평균 : %.1f점 ",avg);
	}

}
