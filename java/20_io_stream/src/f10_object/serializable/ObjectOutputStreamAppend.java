package f10_object.serializable;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class ObjectOutputStreamAppend extends ObjectOutputStream{

	public ObjectOutputStreamAppend(OutputStream out) throws IOException {
		super(out);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void writeStreamHeader() throws IOException {
		// 아무 일도 하지않음 - 헤더 정보 추가 x
	}
	
	
	
}
