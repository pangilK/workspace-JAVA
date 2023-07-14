package f03_input_stream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputReadExample {
	
	public static void main(String[] args) throws IOException {
		
		InputStream is = new FileInputStream("C:\\Temp\\file.txt");
		
		int readByte = 0;
		byte[] bytes = new byte[100];
		String data = "";
		while(true) {
			readByte = is.read(bytes);
			System.out.println("읽어들인 바이트 크기 : " + readByte);
			if(readByte == -1) {
				break;
			}
			
			data += new String(bytes,0,readByte);
		}
		
		System.out.println(data);
		is.close();
	}
	
}
