package a_base;

public class RemoteContrlExam {
	public static void main(String[] args) {
		System.out.println(RemoteControl.MAX_VALUE);
		System.out.println(RemoteControl.MIN_VALUE);
		// RemoteControl.MIN_VALUE = 100;
		RemoteControl tvRemote; // = new RemoteControl();
		tvRemote = new TVRemoteControl();
		tvRemote.turnOn();
		tvRemote.setValue(11);
		tvRemote.turnOff();
		
		System.out.println("=======================");
		RemoteControl airControl = new AirRemoteControl();
		airControl.turnOn();
		airControl.setValue(18);
		airControl.turnOff();
		
		System.out.println("=======================");
		RemoteControl smartTvRemote =  new SmartTVRemoteControl();
		smartTvRemote.turnOn();
		smartTvRemote.setValue(300);
		smartTvRemote.turnOff();
		
		Searchable searchRemote = (Searchable)smartTvRemote;
		searchRemote.search("가디언즈 오브 갤럭시 VOL.3");
		
		if(smartTvRemote instanceof SmartTVRemoteControl) {
			SmartTVRemoteControl strc = (SmartTVRemoteControl)smartTvRemote;
			strc.turnOn();
			strc.search("슬램덩크");
			strc.turnOff();
		}
		
	}
}
