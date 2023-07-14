package Pratice;

import java.util.Arrays;

public class dddd2 {

	public static void main(String[] args) {
		int a = 6;
		int b = 3;
		int c = 3;
		int d = 6;
		
		int q = 0;
		int p = 0;
		int r = 0;
		int plus = 0;
		int count = 0;
		int[] hop = {a,b,c,d};
		for(int i = 0 ; i < hop.length ; i++) {
			for(int x = 0 ; x < hop.length ; x++) {
				if(hop[i] == hop[x]) {
					count++;
					if(count <= 3) p = hop[i];
				}else q = hop[i];
				break;
			}
		}
		
		switch(count) {
			case 0 : 
					 break;
			case 1 : plus = q*r;
					 break;
			case 2 : plus = (p+q)*(p-q);
					 break;
			case 3 : plus = (10*p+q)*(10*p+q);
					 break;
			case 4 : plus = 1111*a;
					 break;
		}
		// 4. 1111*p
		// 3. int g = Math.pow(10*p+q,10*p+q); 
		System.out.println(count);
		System.out.println(p);
		System.out.println(q);
		System.out.println(plus);
	}

}
