package pratice0424;

import java.util.Arrays;
import java.util.Scanner;

public class pr09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("크기를 입력하세요 > ");
		int x = sc.nextInt();
		int two = 0;
		int num[][] = new int[x][];
		for(int i = 0 ; i <= x ; i++) {
			num[i][0] += two;
			two++;
			System.out.println(Arrays.toString(num));
		}

	}

}
