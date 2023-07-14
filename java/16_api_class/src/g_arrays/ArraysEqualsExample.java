package g_arrays;

import java.util.Arrays;

public class ArraysEqualsExample {
	
	public static void main(String[] args) {
		int[][] original = {
				{1,2},
				{3,4}
		};
		int[][] copy = Arrays.copyOf(original, original.length);
		System.out.println(original.equals(copy));
		// 2차원 배열의 각 인덱스 항목으 ㄹ비교
		// original[0] == copy[0]
		// original[1] == copy[1]
		System.out.println(Arrays.equals(original, copy));
		// original[0][0] == copy[0][0]
		// original[0][1] == copy[0][1]
		// original[1][0] == copy[1][0]
		// original[1][1] == copy[1][0]
		System.out.println(Arrays.deepEquals(original, copy));
		System.out.println("깊은 복제");
		int[][] copy2 = Arrays.copyOf(original, original.length);
		copy2[0] = Arrays.copyOf(original[0],original[0].length);
		copy2[1] = Arrays.copyOf(original[1], original[1].length);
		System.out.println("original : " + Arrays.toString(original));
		System.out.println("    copy : " +Arrays.toString(copy));
		copy[0][1] = 70;
		copy2[0][1] = 100;
		System.out.println("   copy2 : "+Arrays.toString(copy2));
		System.out.println(Arrays.deepToString(original));
		System.out.println(Arrays.deepToString(copy2));
		System.out.println(original.equals(copy2));
		System.out.println(Arrays.equals(original, copy2));
		System.out.println(Arrays.deepEquals(original, copy2));
	}
	
}
