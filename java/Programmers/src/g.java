
public class g {

	public static void main(String[] args) {
		String my_strings[] = {"progressive", "hamburger", "hammer", "ahocorasick"};
		int[][] parts = {
				{0, 4}, {1, 2}, {3, 5}, {7, 7}
		};
        String answer = "";
        int s = 0;
        int e = 0;
        for(int i = 0 ; i < my_strings.length ; i++){
            for(int p = 0 ; p < parts[i].length ; p++){
             if(p == 0) s = parts[i][p];
             if(p == 1) e = parts[i][p];
            }
            answer += my_strings[i].substring(s,e+1);
        }
        System.out.println(answer);
        
        String i = "0010";
        int i2 = Integer.parseInt(i);
        System.out.println(i2);
        }

}
