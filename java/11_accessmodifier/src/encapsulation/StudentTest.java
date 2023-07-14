package encapsulation;

class Student {
	
	public String name; // 이름
	private int age;		// 나이
	private int grade;	// 학년
	
	public void setAge(int age) {
		if(age < 1 ) {
			System.out.println("등록할 수 없는 나이입니다.");
			this.age = 1;
			return;
		}
		this.age = age;			
	}
	
	public void setGrade(int grade) {
		if(grade < 1 || grade > 3) {
			this.grade = 1;
			return;
		}
		this.grade = grade;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public int getGrade() {
		return this.grade;
	}
	
}


public class StudentTest {

	public static void main(String[] args) {
		Student stu = new Student();
		stu.name = "김판길";
		stu.setAge(-100);
		stu.setGrade(2);
		
		int age = stu.getAge();
		int grade = stu.getGrade();
		System.out.println(age);
		System.out.println(grade);
	}
}
