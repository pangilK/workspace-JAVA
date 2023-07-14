package a_base;

public class AirRemoteControl implements RemoteControl {
	
	private int temperrature = 24; 		// 온도
	
	@Override
	public void turnOn() {
		System.out.println("에어컨을 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("에어컨을 끕니다.");
	}

	@Override
	public void setValue(int value) {
		if(this.temperrature >= MAX_VALUE && this.temperrature <= MIN_VALUE) {
			return;
		}
		this.temperrature = value;
		System.out.println(this.temperrature+"로 온도를 설정합니다.");
	}

}
