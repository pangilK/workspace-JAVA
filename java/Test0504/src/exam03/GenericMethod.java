package exam03;


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
		printArray(dArray);
		printArray(cArray);
	}

	private static <T> void printArray(T[] arr) {
		for(int i = 0 ; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}
