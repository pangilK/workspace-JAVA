package test0517;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class FileCopyExample {

	public static void main(String[] args) {
			
		 try {
			 Scanner scanner = new Scanner(System.in);
			 //경로 입력 받기
			 System.out.print("원본 파일 경로: ");
			 String originalFilePath = scanner.nextLine();
			 
			 System.out.print("복사 파일 경로: ");
			 String targetFilePath = scanner.nextLine();
			 //원본 파일 존재 여부 확인
			 File original = new File(originalFilePath);
			 
			 if(original.isDirectory()) {
				 scanner.close();
				 throw new FileNotFoundException("디렉토리는 파일이 아닙니다.");
			 }
			 
			 if(!original.exists()) {
				 // System.out.println("원본파일이 존재하지 않습니다");return;
				 scanner.close();
				 throw new FileNotFoundException("원본파일이 존재하지 않습니다.");
			 }
//			 File file = new File(originalFilePath.trim());
//			 if(!file.exists()) {
//				 System.err.println("복사할 파일이 존재하지 않습니다.");
//			 }else {
//				 System.out.println("원본 파일이 존재합니다");
//			 }
			 
			 //복사 파일 경로상에 없는 모든 디렉토리 생성
//			 String dirPath = targetFilePath.substring(
//					 0 , targetFilePath.lastIndexOf("\\\\")
//				 );
//				 // C:\\Temp\\aaa
//				 System.out.println(dirPath);
//				 File targetFile = new File(targetFilePath);
//				 dirPath = targetFile.getParent();
//				 System.out.println(dirPath);
//				 File parentDir = new File(dirPath);
//				 parentDir = targetFile.getParentFile();
//				 if(!parentDir.exists()) {
//					 parentDir.mkdirs();
//				 }
			 File copy = new File(targetFilePath.trim());
			 File copy2 = copy.getParentFile();
			 
			 if(!copy2.exists()) {
				 System.out.println("디렉토리가 존재하지 않으므로 생성");
				 copy2.mkdirs();
			 }
			 
			 //입출력 스트림 얻기
			 FileInputStream fis = new FileInputStream(original);
			 FileOutputStream fos = new FileOutputStream(copy);
			 //파일 데이터를 읽고 출력하기
			 System.out.println("[ 복 사 시 작 ]");
//			 int data;
//			 byte[] buf = new byte[1024];
//			 while((data = fis.read()) != -1) {
//					fos.write(data);
//			 }
			 fis.transferTo(fos);
			 
			 
			 //입출력 스트림 닫기 -  자원 해제
			 System.out.println("[ 복 사 완 료 ]");
			 fos.close();
			 fis.close();
			 scanner.close();
		 } catch(Exception e) {
			 System.out.println(e.getMessage());
		 }
		 
	 }

}
