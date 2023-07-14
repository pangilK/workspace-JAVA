import java.util.Arrays;
import java.util.Vector;

public class Array6 {

	public static void main(String[] args) {
		int[] arr = {0,1,1,1,0};
		int[] stk = null;
		for(int i = 0 ; i < arr.length ; i++) {
			if(i < arr.length) {
				stk[i] += arr[i];
			}
		}
		System.out.println(Arrays.toString(stk));
	}
	
}
