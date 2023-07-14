
public class Test3_2 {

	public static void main(String[] args) {
		int sum = 0;
		for(int i = 0; i <10 ; i++) {
			int random = (int) (Math.random() *100) + 1;
			System.out.print(random+" ");
			sum += random;
		}
		System.out.print("총합계 : "+sum);
	}

}
