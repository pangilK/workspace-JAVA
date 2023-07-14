package n0_url_inet_address;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

public class InetAddressURLExample {
	
	public static void main(String[] args) {
		
		try {
			// 내 컴퓨터 호스트 정보
			InetAddress address = InetAddress.getLocalHost();
			System.out.println(address);
			// 내 아이피 주소
			System.out.println(address.getHostAddress());
			// 컴퓨터 이름
			System.out.println(address.getCanonicalHostName());
			
			InetAddress naver = InetAddress.getByName("www.naver.com");
			System.out.println("naver : "+naver.getHostAddress());
			
			InetAddress[] iar = InetAddress.getAllByName("www.naver.com");
			for(InetAddress remote : iar) {
				System.out.println("naver.com IP 주소 : "+remote.getHostAddress());
			}
			
			// https://comic.naver.com/webtoon/detail?titleId=783053&no=81
			// java.net.URL
			URL url = new URL("https://comic.naver.com/webtoon/detail?titleId=783053&no=81");
			System.out.println(url);
			System.out.println(url.getPath());
			System.out.println(url.getProtocol());
			System.out.println(url.getHost());
			System.out.println(url.getPort());
			System.out.println(url.getQuery());
			System.out.println(url.getFile());
			
			InputStream is = url.openStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader reader = new BufferedReader(isr);
			
			File file = new File("naver.html");
			FileWriter writer = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(writer);
			
			
			String isLine;
			while((isLine = reader.readLine()) != null) {
				System.out.println(isLine);
				bw.write(isLine);
				bw.newLine();
			}
			bw.flush();
			bw.close();
			reader.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
