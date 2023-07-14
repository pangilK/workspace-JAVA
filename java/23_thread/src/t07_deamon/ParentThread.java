package t07_deamon;

public class ParentThread extends Thread{
	
	public void save() {
		System.out.println("작업내용을 저장함");
	}
	
	public void run() {
		while(true) {
			System.out.println(Thread.currentThread());	
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				break;
			}
		}
		System.out.println("Parent thread 종료");
	}
}
