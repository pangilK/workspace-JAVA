package l4_return;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

@FunctionalInterface
interface MyInterFace{
	int method(int x, int y , String s);
}


public class LambdaReturnExample {
	
	public static void main(String[] args) {
		MyInterFace m1 = new MyInterFace() {
			@Override
			public int method(int x, int y, String s) {
				System.out.println(s);
				return x*y;
			}
		};
		int result = m1.method(10 ,5 , "multiply");
		System.out.println(result);
		
		m1 = (a,b,s) ->{
			System.out.println(s);
			return a+b;
		};
		
		Set<Integer> set = new TreeSet<>(new Comparator<>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				// 오름차순
				return o1 - o2;
			}
		});
		
		set = new TreeSet<>((o1,o2) -> {
			return o1 - o2;
		});
		set.add(140);
		set.add(100);
		System.out.println(set);
		
		
		
		
	}
	
}
