package c_string.method;

public class String03SubStringExample {

	public static void main(String[] args) {
		String rrn = "880815-1******";
		int index = rrn.indexOf("-");
		// substring(시작인덱스번호,끝인덱스번호 - 1)
		String birthday = rrn.substring(0,index);
		System.out.println(birthday);
		// substring(시작인덱스번호) 
		String last = rrn.substring(index+1);
		System.out.println(last);
		
		String fileName = "cat.png";
		index = fileName.lastIndexOf(".");
		String ext = fileName.substring(index+1);
//		String png = fileName.substring(fileName.lastIndexOf(".")+1);
		System.out.println(ext);
	}

}
