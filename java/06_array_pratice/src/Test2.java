import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		int[] numbers = new int[10];
		for(int i = 0; i<numbers.length; i++) {
			numbers[i] = (i+1);
		}
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 번호를 입력하세요 > ");
		int num = sc.nextInt();
		
		for(int i = 0 ; i < numbers.length ; i++) {
			if(numbers[i] == num) {
				System.out.printf("%d는 [%d] index에 있습니다.",num,i);
//				System.out.println(num+"은 ["+i+"] index 에 있습니다.");
				break;
			}
		}
		}

}
