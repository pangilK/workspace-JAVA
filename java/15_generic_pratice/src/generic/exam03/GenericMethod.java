package generic.exam03;

import java.util.Arrays;

public class GenericMethod {

	/*
	 * printArray method 정의 
	 */
	
	public static void main(String[] args) {
		Integer[] iArray = {10,20,30,40,50};
		Double[] dArray = {1.1, 1.2, 1.3, 1.4, 1.5};
		Character[] cArray = {'K','O','R','E','A'};
		
		printArray(iArray);
		GenericMethod.<Double>printArray(dArray);
		printArray(cArray);
	}

	private static <T> void printArray(T[] arr) {
		for(T i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
}
