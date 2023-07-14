package a_declaration;

public class StudentExmaple {

	public static void main(String[] args) {
		Student s1; // 선언
		s1 = new Student(); // 초기화,객체생성
		System.out.println("Student class를 참조하여 s1 객체 생성 - "+s1);
		Student s2 = new Student();
		System.out.println("Student class를 참조하여 s2 객체 생성 - "+s2);
		System.out.println(s1 == s2);
		s1.name = "김판길";
		s1.age = 1;
		System.out.println("학생의 이름은 "+s1.name+" 학생의 나이는 "+s1.age);
		System.out.println(s2.name);
		
		Bus bus = null;
		bus = new Bus();
		System.out.println(bus);

	}

}
