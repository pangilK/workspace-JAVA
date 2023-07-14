package f06_stream_reader_writer;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class StreamReaderExample {
	
	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("C:\\Temp\\fos.txt");
			Reader reader = new InputStreamReader(fis);
			char[] cBuf = new char[100];
			int readData = reader.read(cBuf);
			String result = new String(cBuf,0,readData);
			System.out.println(result);
			reader.close();
			
			InputStream is = System.in;
			reader = new InputStreamReader(is);
			readData = 0;
			char[] cbuf = new char[100];
			while((readData = reader.read(cbuf)) != -1) {
				String data = new String(cbuf,0,readData);
				System.out.println(data);
				if(data.startsWith("quit")) {
					break;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
