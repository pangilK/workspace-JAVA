import java.util.Arrays;

public class a {
	
	public static void main(String[] args) {
		int[] num_list = {2, 1, 6};
		int n = 1;
		int[] num_list2 = Arrays.copyOfRange(num_list, n, num_list.length);
		int[] num_list3 = new int[num_list2.length];
		System.out.println(Arrays.toString(num_list2));
		System.out.println(Arrays.toString(num_list3));
	}
	
}

