import java.util.ArrayList;
import java.util.Vector;

public class f {
		
	public static void main(String[] args) {
        int answer = 0;
        String my_string = "banana";
        int count = 0;
        String is_suffix = "ana";
        Vector str = new Vector();
        for (int i = 0; i < my_string.length(); i++) {
            str.add(my_string.substring(i));
        }
        for(int i = 0 ; i < str.size() ; i++) {
        	if(str.get(i).equals(is_suffix)) count++;
        }
        System.out.println(count);
		System.out.println(str);
		int[] arr = {5,1,4};
		ArrayList<Integer> arrL = new ArrayList<>();
        for(int i = 0 ; i < arr.length ; i++){
            for(int x = 0 ; x<arr[i] ; x++){
                arrL.add(arr[i]);
            }
        }
        
	}
}
