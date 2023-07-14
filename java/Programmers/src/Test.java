import java.util.Arrays;
import java.util.Vector;

public class Test {

	public static void main(String[] args) {
		// 계산식 10000 × a + 100 × b + c
		int[] rank = {1, 2, 3 , 10 , 14  , 15};
		boolean[] attendance = {true, true, true , false ,true,false};
		Vector abc = new Vector();
		Vector abc2 = new Vector();
		for(int i = 0 ; i < rank.length ; i++) {
			if(attendance[i] == false) {
				continue;
			}else {
				abc.add(rank[i]+"("+i+")");
				abc2.add(i);
			}
		}
		String[] str = new String[abc.size()];
		for(int i = 0 ; i < str.length ; i ++) {
			str[i] = (String) abc.get(i);
		}
		Arrays.sort(str);
		for(int i = 0 ; i < str.length ; i++) {
			str[i] = str[i].replaceAll("[0-9][(]","");
			str[i] = str[i].replaceAll("[)]","");
		}
		System.out.println(Arrays.toString(str));
		int a = 0;
		int b = 0;
		int c = 0;
		for(int i = 0 ; i < str.length ; i++) {
			if(i == 0) a = Integer.parseInt(str[i]);
			if(i == 1) b = Integer.parseInt(str[i]);
			if(i == 2) c = Integer.parseInt(str[i]);
		}
		System.out.println(10000 * a + 100 * b + c);
//		System.out.println(abc);
//		System.out.println(abc2);
	}

}
