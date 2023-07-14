package generic02_multi;

public class TwinExample {
	
	public static void main(String[] args) {
		Twin<Tv,String> twin = new Twin<Tv,String>();
		Tv tv = new Tv();
		twin.setType(tv);
		twin.setModel("LG 스마트 TV");
		// 잘못된 값이 전달 되는 걸 컴파일 단계에서 체크
		// twin.setModel(1);
		// 컴파일 단계에서 체크된 데이터만 저장되어 있기 때문에
		// 값을 읽을 때 체크할 필요가 없음
		String model = twin.getModel();
		System.out.println(model);
		
		Twin<Car,Integer> carTwin = new Twin<>();
		carTwin.setType(new Car());
		carTwin.setModel(520);
		
		
	}
}
