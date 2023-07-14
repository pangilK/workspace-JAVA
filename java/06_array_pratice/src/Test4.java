import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		//import
		Scanner sc = new Scanner(System.in);
		System.out.println("크기를 입력해 주세요.");
		int num = sc.nextInt();
		int[] array[] = new int[num+1][];
		
		for(int i = 0; i<array.length ; i++) {
			array[i] = new int[i+1];
			for(int j = 0; j<array[i].length ; j++) {
				array[i][j] = j;
			}
		}
		
		for(int[] i : array) {
			for(int j : i ) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
