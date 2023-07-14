
public class Test2_3 {

	public static void main(String[] args) {
		String[] str = new String[5];
		str[0] = "Hello";
		str[1] = "Java";
		System.out.println(str[0].equals(str[1]));
		
		// 비교하려는 배열에 값을 설정을 안했기때문에 
		// null이 들어가있어서 서로 비교가 불가능
	}

}
