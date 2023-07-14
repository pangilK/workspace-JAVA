package Pratice;

import java.util.Scanner;

public class Pratice_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("반지름을 입력하시오 : ");
		double radius = sc.nextDouble();
		double area = (double) (radius*radius*3.14);
		System.out.println(area);

	}

}
