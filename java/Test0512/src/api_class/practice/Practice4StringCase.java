package api_class.practice;

import java.util.Scanner;

public class Practice4StringCase {

	public static void main(String[] args) {
		String chars = "abcdefghijklmnopqrstuvwxyz";
		String num = "01234569";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("문자나 숫자를 입력해주세요>");
		String str = sc.next();
		
		// code 작성
		System.out.println("입력받은 문자 : "+str);
		str = str.toLowerCase();
		System.out.println("영어문자 : " + chars.contains(str));
		System.out.println("숫자 : " + num.contains(str));
		sc.close();
	}

}
