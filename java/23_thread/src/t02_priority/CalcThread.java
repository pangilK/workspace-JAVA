package t02_priority;

public class CalcThread extends Thread {
	
	
	public CalcThread(String name) {
		// thread 이름 지정
		// Thread 부모 생성자를 통해 스레드 이름 초기화
		super(name);
	}

	@Override
	public void run() {
		for(int i = 0 ; i < 200000000 ; i++);
		// thread 이름 , 스레드의 우선 순위 출력
		System.out.println(getName()+":"+getPriority());
		// 현재 런메소드를 실행중인 Thread 정보
		System.out.println(Thread.currentThread());
	}
	
	
	
}
