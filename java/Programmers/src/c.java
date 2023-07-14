import java.util.Arrays;
import java.util.Vector;

public class c {

	public static void main(String[] args) {
		String myString = " d d d dxxxxdxdddddddd";
		String a = myString.replaceAll(" ","").trim();
		String b[] = a.split("x");
		Vector s = new Vector();
		for(int i = 0 ; i < b.length ; i++) {
			if(b[i].equals("")) {
				continue;
			}else {
				s.add(b[i]);
			}
		}
		String answer[] = new String[s.size()];
		for(int i = 0 ; i < answer.length ; i++) {
			answer[i] = (String) s.get(i);
		}
		System.out.println("Vector : " + s);
		System.out.println("answer : "+Arrays.toString(answer));
		System.out.println(Arrays.toString(b));
	}

}
