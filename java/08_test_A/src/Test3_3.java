
public class Test3_3 {

	public static void main(String[] args) {
		int[] firstNum = new int[10];
		System.out.print("최초의 리스트 : ");
		for(int i = 0 ; i < firstNum.length ; i++) {
			firstNum[i] = (int) (Math.random()*100) + 1;
			System.out.print(firstNum[i]+" ");
		} // end for1
		
		System.out.println();
		int temp = 0;
		System.out.print("정렬된 리스트 : ");
		for(int i = 0 ; i < firstNum.length ; i++) {
			
			for(int x = i + 1 ; x < firstNum.length ; x++) {
				if(firstNum[i] > firstNum[x]) {
					temp = firstNum[i];
					firstNum[i] = firstNum[x];
					firstNum[x] = temp;
				}
			}
		} // end for2
		
		for(int i : firstNum) {
			System.out.printf("%d ", i);
		}
		
	}

}
