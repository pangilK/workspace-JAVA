package t02_priority;

public class PriorityExample {
	
	public static void main(String[] args) {
		// Thread는 상수값으로 우선순위의 범위를 알려줌 1 ~ 5 ~ 10
		System.out.println(Thread.MAX_PRIORITY); 	// 10
		System.out.println(Thread.NORM_PRIORITY);   // 5
		System.out.println(Thread.MIN_PRIORITY);    // 1
		
		for(int i = 0 ; i <= 10 ; i ++) {
			Thread calc = new CalcThread("THREAD-"+i);
			if(i == 5) {
				calc.setPriority(Thread.MAX_PRIORITY);
			}
			calc.start();
		}
	} // end main
	
}
