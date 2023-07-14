
public class Car {
	
	String color;
	int speed;
	int gear;
	
	Car(){}
	
	void speedUp() {
		speed += 10;
	}
	void speedDown() {
		speed = speed -10;
	}
	String showInfo() {
		return "[color="+color+", speed="+speed+", gear="+gear+"]";
	}
}
