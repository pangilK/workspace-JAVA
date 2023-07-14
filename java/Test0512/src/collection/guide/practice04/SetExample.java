package collection.guide.practice04;

import java.util.Scanner;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 코드 작성
		System.out.println("정수(-1이 입력될 때까지) >>");
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		while(true) {
			if(sc.nextInt() == -1) {
				break;
			}
			treeSet.add(sc.nextInt());
		}
		if(treeSet.size() > 0)System.out.println("가장 큰 수는 : "+treeSet.last());
		else if(treeSet.size() == 0)System.out.println("수가 하나도 없음");
		System.out.println("시스템 종료");
	}

}
