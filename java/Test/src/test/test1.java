package test;

import java.util.Scanner;

public class test1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = '□';
        char b = '■';
        char c = 'A';
        int row2 = 0;
        boolean isRun = true;
        char[][] seat = new char[10][10];
        
        // 좌석 배열 초기화
        for(int i = 0 ; i < seat.length ; i++) {
            for(int x = 0 ; x < seat[i].length ; x++) {
                seat[i][x] = a;
            }
        }
        
        while(isRun) {
            System.out.println("\t     SCREEN \t");
            for(int i = 1 ; i <= 10 ; i++) {
                System.out.print("["+i+"]");
            }
            System.out.print("[행]\n");
            
            // 좌석 배치 출력
            for(int i = 0 ; i < seat.length ; i++) {
                for(int x = 0 ; x < seat[i].length ; x++) {
                    System.out.print("["+seat[i][x]+"]");
                }
        
                System.out.print("["+(char)(c+i)+"열]");
                System.out.println();
            }
            
            // 예약 기능 구현
            System.out.println("예약하실 좌석의 열을 입력해주세요");
            String row = sc.next();
            if(row == "A") {
            	row2 = 0;
            }else if(row == "B") {
            	row2 = 1;
            }else if(row == "C") {
            	row2 = 3;
            }else if(row == "D") {
			    row2 = 4;
			}else if(row == "E") {
			    row2 = 5;
			}else if(row == "F") {
				row2 = 6;
			}else if(row == "G") {
				row2 = 7;
			}else if(row == "H") {
				row2 = 8;
			}else if(row == "I") {
				row2 = 9;
			}else if(row == "J") {
				row2 = 10;
			}

            
            System.out.println("입력한 열 : "+row);
            System.out.println("예약하실 좌석의 행 번호를 입력해주세요 >");
            int col = sc.nextInt() - 1;
            System.out.println("선택하신 좌석은 "+row+"열"+(col+1)+"행 입니다.");
            System.out.println("예약 완료 하시겠습니까 ? y / n");
            String reserve = sc.next();
            switch(reserve) {
            
            case "y" :
	            if(seat[row2][col] == a) { // 선택한 좌석이 비어있을 경우
	                seat[row2][col] = b;
	                System.out.println("예약되었습니다.");
	            } else { // 선택한 좌석이 이미 예약된 경우
	                System.out.println("이미 예약된 좌석입니다. 다른 좌석을 선택하세요.");
	            }
            case "n" :
            	System.out.println("좌석을 다시 지정해주세요");
            	continue;
            }
        }
    }
}