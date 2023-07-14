package client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class ChatClient {
	
	public static final String IP = "10.100.205.231";
	public static final int PORT = 5001;
	
	// 연결된 서버의 정보를 저장하는 socket
	Socket server;
	
	// 서버로 출력할 스트림
	PrintWriter pw;
	// 서버에서 입력받을 스트림
	BufferedReader br;
	// console에서 출력할 메세지를 입력받을 스트림
	BufferedReader reader;
	
	// console 입력 탈출 flag
	boolean isRun = true;
	
	public ChatClient() {
		
		try {
			connect();
		} catch (Exception e) {
			System.out.println("서버와 연결이 종료되었습니다.");
			stopClient();
		}
		
	}
	
	// 서버와 연결 정보 초기화 method
	public void connect()throws Exception{
		System.out.println("******** 클라이언트 ********");
		System.out.println("연결 요청 : "+IP+":"+PORT);
		server = new Socket(IP,PORT);
		String serverIP = server.getInetAddress().getHostAddress();
		System.out.println("연결 성공 : "+ serverIP);
		
		// field 초기화
		// console에서 문자열 입력
		InputStreamReader isr = new InputStreamReader(System.in);
		reader = new BufferedReader(isr);
		
		// server에서 출력된 내용을 문자열 단위로 읽은
		InputStream sis = server.getInputStream();
		InputStreamReader sisr = new InputStreamReader(sis);
		br = new BufferedReader(sisr);
		
		//
		OutputStream os = server.getOutputStream();
		OutputStreamWriter osr = new OutputStreamWriter(os);
		BufferedWriter sbw = new BufferedWriter(osr); 
		pw = new PrintWriter(sbw,true);
		
		// server에서 전달될 데이터를 읽을 준비
		receive();
		
		System.out.println("사용할 이름(아이디)를 입력해 주세요");
		Thread t = new Thread(() -> { 
			// run()
			while(true) {
				// 반복하면서 client에서 server로 출력될 문자열을 console에서 입력받음
				try {
					String sendData;
					sendData = reader.readLine();
					// 작성할 문자열을 서버에 출력
					pw.println(sendData);
				} catch (IOException e) {
					System.out.println("서버와 연결이 끊김");
					break;
				}
				
			}
		});
		t.setDaemon(true);
		t.start();
	}
	
	
	// 서버에서 전달한 메세지를 입력받을 method 
	public void receive() {
		Thread t = new Thread(() -> {
			while(true) {
				String receiveData;
				try {
					if((receiveData = br.readLine()) != null) {
						System.out.println(receiveData);
					}
				} catch (IOException e) {
					System.out.println("서버 통신 오류 : "+e.getMessage());
					break;
				}
			}
		});
		t.start();
	}
	
	// 서버의 연결 종료 및 외부자원 해제
	public void stopClient() {
		if(server != null && !server.isClosed()) {
			try {
				server.close();
			} catch (IOException e) {}
		}
	}
	
	
	public static void main(String[] args) {
		new ChatClient();
	}
}
