package t05_control_method.notifiy_wait;

public class ProducerThread extends Thread{

	private DataBox dataBox;

	public ProducerThread(DataBox dataBox) {
		this.dataBox = dataBox;
	}
	
	public void run() {
		for(int i=0; i <= 3; i++) {
			String data = "Data-"+i;
			dataBox.setData(data);
		}
	}
	
}
