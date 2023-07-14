package collection.guide.practice03;

public class Location{
	
	private double longitude;	// 경도
	private double latitude;	// 위도
	
	public Location(double longitude, double latitude) {
		this.longitude = longitude;
		this.latitude = latitude;
	}
	
	public double getLongitude() {
		return longitude;
	}
	
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	
	public double getLatitude() {
		return latitude;
	}
	
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	
	@Override
	public String toString() {
		return "Location [경도=" + longitude + ", 위도=" + latitude + "]";
	}
	
}
