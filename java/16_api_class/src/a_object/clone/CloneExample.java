package a_object.clone;

public class CloneExample {

	public static void main(String[] args) throws CloneNotSupportedException {
		Member member = new Member(
				"최기근",
				28,
				new int[] {100,95,99},
				new Car("캐스터")
				);
		System.out.println(member);
		
		Member cloned = (Member) member.clone();
		System.out.println(cloned);
		
		cloned.scores[0] = 90;
		System.out.println(cloned.scores == member.scores);
		System.out.println(cloned);
		System.out.println(member);
		
		cloned.car.model = "ㄴㄱㅁ";
		System.out.println(cloned);
		//참조타입은 주소값을 복사해오기때문에 깊은복제를하려면 clone메소드 재정의해줘야한다.
	}
	
}
