package t05_control_method.notifiy_wait;

public class DataBoxExample {
	
	public static void main(String[] args) {
		DataBox dataBox = new DataBox();
		Thread pThread = new ProducerThread(dataBox);
		Thread cThread = new ConsumerThread(dataBox);
		pThread.start();
		cThread.start();
	}
	
}
