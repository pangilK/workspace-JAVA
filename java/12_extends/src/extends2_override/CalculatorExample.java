package extends2_override;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		double area = calc.circleArea(7);
		System.out.println("calc : "+area);
		
		Computer com = new Computer();
		area = com.circleArea(7);
		System.out.println("com : "+area);
		
		System.out.println(calc);
		System.out.println(com.toString());
	}

}
