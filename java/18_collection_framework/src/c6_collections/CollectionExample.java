package c6_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionExample {
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for(int i = 0 ; i <= 45 ; i++) {
			list.add(i);
		}
		System.out.println(list);
		// 섞는다.
		Collections.shuffle(list);
		System.out.println(list);
		System.out.println("=========================");
		
		// list에서 시작인덱스 부터 필요한 크기 만큼만 잘라서 새로운 리스트 생성
		List<Integer> lotto = list.subList(0, 6);
		System.out.println(lotto);
		System.out.println("=========================");
		System.out.println("정렬 전 : "+lotto);
		Collections.sort(lotto);
		System.out.println("정렬 후 : "+lotto);
		Collections.reverse(lotto);
		System.out.println("reverse : "+lotto);
		System.out.println("=========================");
		System.out.println(Collections.max(lotto));
		System.out.println(Collections.min(lotto));
		
		
		
		int[] num_list = {5, 2, 1, 7, 5}; // 1 = n // 0 == n - 1
		int n = 3;
		int[] arr2 = Arrays.copyOfRange(num_list,n,num_list.length);
		int[] arr3 = Arrays.copyOfRange(num_list,0,n);
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		int[] arr4 = new int[num_list.length];
		for(int i = 0 ; i < arr4.length ; i++) {
			
		}
	}
	
}
