package api_class.practice;

import java.util.Arrays;

public class Practice1ArraysRandom {

	public static void main(String[] args) {
		int[] arrays = new int[10];
		
		// 코드 작성
		for(int i = 0 ; i < arrays.length ;i++) {
			int random =  (int) (Math.random()*100+1);
			arrays[i] = random;
		}
		System.out.println("최초의 리스트 : " + Arrays.toString(arrays));
		Arrays.sort(arrays);
		System.out.println("정렬된 리스트 : " + Arrays.toString(arrays));
	}

}
