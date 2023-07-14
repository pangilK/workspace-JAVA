package c_string.method;

public class String01CharAtLengthExample {
	
	public static void main(String[] args) {
		// CharAt(인덱스) - 문자열을 문자타입의 배열로 지정 후
		// 각 인덱스에 저장된 하나의 문자를 반환
		String rrn = "010624-1230123";
		char gender = rrn.charAt(7);
		switch(gender) {
			case '1' : case '3' : 
				System.out.println("남성 입니다");
			case '2' : case '4' : 
			System.out.println("여성 입니다");
			case '5' : case '7' : 
				System.out.println("외국인 남성 입니다");
			case '6' : case '8' : 
				System.out.println("외국인 여성 입니다");
			default :
				System.out.println("1900년 이전 출생자 입니다.");
		} // end switch
		
		// "문자열".length() - 문자가 몇개인지 개수를 반환
		rrn = "8206071123456";
		int length = rrn.length();
		System.out.println("rrn 길이 : " + length);
		if(length == 13) {
			System.out.println("올바른 주민등록 번호 길이입니다.");
		}
		
	}// end main
}
