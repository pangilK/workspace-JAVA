package extends3_polymorphism.base;

public class Person {
	
	String name; 	// 이름
	int age; 		// 나이
	int weight;		// 몸무게
	int heigth;		// 키
	
	// 기본 생성자 - 전체 값을 넘겨받는 생성자 추가
	// alt + s + a
	public Person(){
		super();
	}
	
	Person(String name, int age, int weight, int heigth) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.heigth = heigth;
	}
	
	// Object class의 toString() 메소드 재정의
	// alt + s + s + s
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", weight=" + weight + ", heigth=" + heigth + "]";
	}
	
	
	
}
