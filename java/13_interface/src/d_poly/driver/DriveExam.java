package d_poly.driver;

public class DriveExam {
	
	public static void main(String[] args) {
		Driver driver = new Driver();
		Bus bus = new Bus();
		driver.drive(bus);
		
		Sedan sedan = new Sedan();
		driver.drive(sedan);
	}
}
