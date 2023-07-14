package Pratice;

import java.util.Arrays;
import java.util.Vector;

public class dddd {
	public static void main(String[] args) {
		String my_string = " i    love  you";
		Vector vector = new Vector();
		String[] str = my_string.split(" ");
		for(int i = 0 ; i < str.length ; i++) {
			if(!str[i].isEmpty()) {
 				vector.add(str[i]);
			}
		}
        String[] answer = new String[vector.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = (String) vector.get(i);
        }
		System.out.println(Arrays.toString(answer));
	
		String[] str_list = {"abc","def","ghi"};
		String ex = "ef";
		String str2 = "";
		for(int i = 0 ; i < str_list.length ; i++) {
			if(!str_list[i].contains(ex)) {
				str2 += str_list[i];		
			}
		}
		System.out.println(str2);
		
		String a = "aaaaaa";
		String b = "bbbbbb";
		String c = "";
		String[] aA = a.split("",0);
		String[] bB = b.split("",0);
		for(int i = 0 ; i < aA.length ; i++) {
			c += aA[i];
			c += bB[i];
		}
		System.out.println(c);
		
		int[] arr = {0,1,2,3,4,5};
		int[] query = {4,1,2};
		for(int i = 0 ; i < query.length ; i++) {
			if(i % 2 == 0) {
				arr = Arrays.copyOfRange(arr, 0, query[i]+1);
				System.out.println(Arrays.toString(arr));
			}else {
				arr = Arrays.copyOfRange(arr,query[i], arr.length);			
				System.out.println(Arrays.toString(arr));
			}
		}
		
		int n = 5;
		int[][] answer2 = new int[n][n];
		int value = 1;
		int row = 0;
		int col = 0;
		int move = 0; // 0 오른쪽 , 1 밑으로 , 2 왼쪽 , 3 위
		while(value <= n*n) {
			answer2[row][col] = value++;
			if(move == 0) {  
				if(col == n-1 || answer2[row][col + 1] != 0) {
					move = 1;
					row++;
				}else {
					col++;
				}
			}else if(move == 1) { 
				if(row == n - 1 || answer2[row + 1][col] != 0 ) {
					move = 2;
					col--;
				}else {
					row++;
				}
			}else if(move == 2) { 
				if(col == 0 || answer2[row][col - 1] != 0) {
					move = 3;
					row--;
				}else {
					col--;
				}
			}else if(move == 3) { 
				if(row == 0 || answer2[row - 1][col] != 0) {
					move = 0;
					col++;
				}else {
					row--;
				}
			}
		}
		System.out.println("=========================");
		System.out.println(Arrays.toString(answer2[0]));
		System.out.println(Arrays.toString(answer2[1]));
		System.out.println(Arrays.toString(answer2[2]));
		System.out.println(Arrays.toString(answer2[3]));
		
		
	}
}
