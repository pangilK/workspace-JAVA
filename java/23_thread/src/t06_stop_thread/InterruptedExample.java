package t06_stop_thread;

class InterruptThread extends Thread{

	public void run() {
		boolean isInterrupted = Thread.interrupted();
		System.out.println(isInterrupted);
		while(true) {
			System.out.println("실행중 - 1 ");
			isInterrupted = Thread.interrupted();
			if(isInterrupted) {
				break;
			}
		}
		System.out.println("자원해제");
		System.out.println("실행종료");
	}
	
}

public class InterruptedExample {
	
	public static void main(String[] args) {
		InterruptThread it = new InterruptThread();
		it.start();
		
		try {
			Thread.sleep(1000); // 메인쓰레드재우기 일어나면 밑에 함수발생해서 종료됨
		} catch (InterruptedException e) {}
		
		it.interrupt();
	}
	
}
