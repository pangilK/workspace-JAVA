package Pratice;

import java.util.Arrays;
import java.util.Vector;

public class dddd3 {
	public static void main(String[] args) {
		int l = 5;
		int r = 555;
		Vector vss = new Vector();
	    for(int i = l ; i < r ; i++) {
	    	String a = ""+i;
	    	if(a.indexOf("5") > -1) {
	    		if(a.indexOf("1") < 0 && a.indexOf("2") < 0 && a.indexOf("3") < 0 &&
	    		   a.indexOf("4") < 0 && a.indexOf("6") < 0 && a.indexOf("7") < 0 &&
	    		   a.indexOf("8") < 0 && a.indexOf("9") < 0) vss.add(i);
	    	}
	    }
	    int[] answer = new int[vss.size()];
	    for(int i = 0 ; i < answer.length ; i++) {
	    	answer[i] = (int) vss.get(i);
	    }
	     System.out.println(vss);
	     System.out.println(Arrays.toString(answer));
	     int num = answer.length;
	     int[] num2 = {-1};
	     System.out.println("num2 : "+num2);
	     System.out.println("answer : "+answer);
	     System.out.println(answer.length > 0 ? answer : num2);
	}
}
