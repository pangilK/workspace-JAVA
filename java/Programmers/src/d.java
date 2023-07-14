import java.util.Vector;

public class d {
	
	public static void main(String[] args) {
		String[] strArr = {"and","notad","abcd"};
		Vector vss = new Vector();
        for(int i = 0; i < strArr.length ; i++){
            if(strArr[i].indexOf("ad") == -1) vss.add(strArr[i]);
        }
        String[] answer = new String[vss.size()];
        for(int i = 0 ; i <answer.length; i++) {
        	answer[i] = (String) vss.get(i);
        }
        System.out.println(vss);
	}
	
}
