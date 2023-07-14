package server;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Hashtable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Chatserver {
	
	public static final String IP = "10.100.205.16";
	public static int PORT = 5002;
	
	// port 할당 및 client 연결 처리
	ServerSocket serverSocket;
	
	// 연결된 클라이언트의 정보를 저장
	// key(닉네임) value(client 출력 스트림)
	static Hashtable<String,PrintWriter> ht;
	
	// 연결된 클라이언트의 스레드를 관리할 스레드 풀
	static ExecutorService serverPool;
	
	// 연결 수락 및 클라이언트 정보 관리를 위한 초기화
	public Chatserver() {
		try {
			serverPool = Executors.newFixedThreadPool(20);
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress(IP,PORT));
		} catch (IOException e) {
			System.out.println("bind 할 수 없는 IP 또는 PORT 번호 입니다.");
			System.out.println(e.getMessage());
			return;
		}
		
		ht = new Hashtable<>();
		System.out.println("********* 채팅 서버 오픈 *********");
		while(true) {
			try {
				System.out.println("[ Client 연결 기다리는 중 ...]");
				Socket client = serverSocket.accept();
				String clientIp = client.getInetAddress().getHostAddress();
				System.out.println(clientIp+"- 연결수락");
				new ServerTask(client);
			} catch (IOException e) {
				System.out.println("Server 통신 오류 : " + e.getMessage());
				ht.clear();
				serverPool.shutdownNow();
				if(serverSocket != null && !serverSocket.isClosed()) {
					try {
						serverSocket.close();
					} catch (IOException e1) {}
				}
			}
		} // end while
		
	}
	
	
	public static void main(String[] args) {
		new Chatserver();
	}
	
}
