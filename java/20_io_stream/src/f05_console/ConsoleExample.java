package f05_console;

import java.io.Console;

public class ConsoleExample {
	
	public static void main(String[] args) {
		// java -jar console.jar
		Console console = System.console();
		System.out.print("아이디 : ");
		// 사용자에게 콘솔을 통해서 한 문장 - 한라인 을 입력받는다.
		String id = console.readLine();
		System.out.print("비밀번호 : ");
		// 한라인의 문장을 입력 받되 사용자에게 노출하지 않음
		char[] password = console.readPassword();
		System.out.println("----------------------");
		
		String strPass = new String(password);
		System.out.println("아이디는 : "+ id);
		System.out.println("비밀번호는 : "+ strPass);
	}
	
}
