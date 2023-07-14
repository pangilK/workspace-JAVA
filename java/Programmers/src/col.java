import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class col {
	
	public static void main(String[] args) {
		int n = 6;
		String binaryString1[] = new String[n];
		String binaryString2[] = new String[n];
		String binaryString3[] = new String[n];
		int [] arr1 = {46, 33, 33 ,22, 31, 50};
		int [] arr2 = {27 ,56, 19, 14, 14, 10};
		for(int i = 0 ; i < binaryString2.length ; i ++) {
			String a = Integer.toBinaryString(arr1[i]);
			String b = Integer.toBinaryString(arr2[i]);
			
			binaryString1[i] = a;
			binaryString2[i] = b;
			int ab = Integer.parseInt(a)+Integer.parseInt(b);
			String s = String.valueOf(ab);
			if(s.length() < 6) s = " "+s;
			binaryString3[i] = s;
		}
		for(int i = 0 ; i < binaryString3.length ; i++) {
			binaryString3[i] = binaryString3[i].replaceAll("1|2","#");
			binaryString3[i] = binaryString3[i].replaceAll("0"," ");
			System.out.println(binaryString3[i].length());
		}
		System.out.println(Arrays.toString(binaryString1));
		System.out.println(Arrays.toString(binaryString2));
		System.out.println(Arrays.toString(binaryString3));
    }
	
 }
        

