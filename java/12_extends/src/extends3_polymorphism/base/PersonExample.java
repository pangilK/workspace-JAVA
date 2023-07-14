package extends3_polymorphism.base;

public class PersonExample {

	public static void main(String[] args) {
		
		Person person = new Person("최기근",25,68,187);
		System.out.println(person);
		System.out.println("=======================");
		
		Person student = new Student(
				"최기근",25,74,189,"603호","45번","1"
				);
		System.out.println(student.toString());
		// student.study();
		System.out.println("=======================");
		// 변수가 Person type이면 Person 이거나 하위 타입만 대입 가능
		// Person obj = new String("최기근");
		
		Object o = student;
		System.out.println(o.toString());
		
		/*
		Student stu = (Student) person;
		stu.study();
		Student stu2 = (Student) student;
		stu2.study(); 
		*/
		
		Student stu;
		boolean isPossible = (person instanceof Student);
		System.out.println(isPossible);
		if(student instanceof Student) {
			stu = (Student) student;
			stu.study();
		}else {
			System.out.println("Student 타입이 아닙니다");
		}
		
		
		
	}
}
