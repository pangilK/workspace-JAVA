package f_cooperation;

public class Worker {

	String workername; // 직장인 이름
	int money; // 보유 금액
	
	Worker(String workername, int money) {
		this.workername = workername;
		this.money = money;
	}
	
	void takeVehicle(Bus bus) {
		bus.take(1200);
		money -= 1200;
	}
	
	void takeVehicle(Subway subway) {
		subway.take(1300);
		money -= 1300;
	}
	
	void showInfo() {
		System.out.printf(
				"%s님의 남은 금액은 %,d 원입니다. %n",
				workername,money);
	}
}
