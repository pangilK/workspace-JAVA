package c_method;

// 탁상용 램프

public class DarkLamp {

	// 인스턴스 멤버 변수 선언
	boolean isOnOff;
	
	
	void setSwitch(boolean isOnOff) {
		this.isOnOff = isOnOff;
		System.out.println(this);
	}
	
	String showinfo() {
		return "현재 상태는 " + (isOnOff ? "켜짐" : "꺼짐");
	}
	
	public static void main(String[] args) {	
		DarkLamp dl = new DarkLamp();
		System.out.println(dl);
		boolean on = true;
		boolean off = false;
		dl.setSwitch(on);
		dl.setSwitch(off);
		String result = dl.showinfo();
		System.out.println(result);
		
	}
}
