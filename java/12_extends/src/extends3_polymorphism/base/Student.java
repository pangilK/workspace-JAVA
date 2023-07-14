package extends3_polymorphism.base;

public class Student extends Person {
	
	String classRoom; 	// 강의실
	String studentNum;	// 학번
	String grade;		// 학년
	
	Student(String name, int age, int weight, int heigth, 
			String classRoom, String studentNum, String grade) {
		super(name, age, weight, heigth);
		this.classRoom = classRoom;
		this.studentNum = studentNum;
		this.grade = grade;
	}
	
	public void study() {
		System.out.println(super.name+"학생은 "+grade+"학년 "+classRoom+"에서 공부합니다.");
	}

	@Override
	public String toString() {
		return super.toString()+" Student [classRoom=" + classRoom + ", studentNum=" + studentNum + ", grade=" + grade + "]";
	}
	
	
}
