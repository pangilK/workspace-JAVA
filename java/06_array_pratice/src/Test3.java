
public class Test3 {

	public static void main(String[] args) {
		int[] scores = {18,15,24,3,2,22,1,19,50,30};
		int minimum = scores[0];
		for(int i : scores) {
			if(i < minimum) {
				minimum = i;
			}
		}
		System.out.println("최소값은 : " + minimum);
	}

}
