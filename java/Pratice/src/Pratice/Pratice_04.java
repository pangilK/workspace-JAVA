package Pratice;

public class Pratice_04 {

	public static void main(String[] args) {
//		반복문을 이용하여 1~10까지의 합을 구해서 출력하는 코드를 작성하시오.(print, println)
		int plus = 0;
		for(int i = 1 ; i <= 10 ; i ++) {
			System.out.print(i+" ");
			plus += i;
			if(i == 10) {
				System.out.print("\n");
			}
		};
		System.out.println("합 : "+plus);

	}

}
