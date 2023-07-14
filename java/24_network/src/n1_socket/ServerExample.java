package n1_socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample {
	
	public static void main(String[] args) {
		
		try {
			ServerSocket server = new ServerSocket(5001);
			while(true) {
				System.out.println("Client 연결 대기중");
				Socket client = server.accept();
				System.out.print("client 연결 수락");
				InetSocketAddress isa 
					= (InetSocketAddress) client.getRemoteSocketAddress();
				System.out.println(" - " + isa.getHostName() + isa.getAddress());
				
				byte[] bytes = null;
				String message = null;
				
				OutputStream os = client.getOutputStream();
				message = "또 올거냐 ???";
				bytes = message.getBytes("UTF-8");
				os.write(bytes);
				os.flush();
				System.out.println("client에 데이터 발송");
				
				InputStream is = client.getInputStream();
				bytes = new byte[100];
				int readCount = is.read(bytes);
				message = new String(bytes,0,readCount,"UTF-8");
				System.out.println("[데이터 받기 성공]" + message);
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
}
