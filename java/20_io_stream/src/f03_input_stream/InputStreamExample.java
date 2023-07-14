package f03_input_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class InputStreamExample {
	
	public static void main(String[] args) {
		// 프로그램 기준에서 외부 데이터를 읽어오는 class
		InputStream is = null;
		
		try {
			String path = "C:\\Temp\\file.txt";
			is = new FileInputStream(path);
			// inputStream과 연결된 파일의 크기를 byte단위로 반환
			int size = is.available();
			
			int readByte = 0;
			byte[] bytes = new byte[size];
			for(int i = 0; i < size ; i++) {
				readByte = is.read();
				bytes[i] = (byte) readByte;
			}
			System.out.println(new String(bytes));
			
			/*
			while(true) {
				readByte = is.read();
				System.out.println(readByte);
				// EOF End Of File == -1
				// 파일 데이터를 전부 읽어 들이면 파일 read가 끝났다는걸 알려주는 값
				if(readByte == -1) break;
				System.out.println((char)readByte);
			}
			 */
			System.out.println("size : "+size);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
