package generic05_wild_card;

// 교육 과정 별 학생을 관리하는 class
public class Course<S> {
	
	private String title; 	// 교육 과정 명
	private S[] students; 	// 학생 목록
	
	// 교육과정명 과 학생 인원수
	@SuppressWarnings("unchecked")
	public Course(String title,int capacity) {
		this.title = title;
		this.students = (S[]) new Object[capacity];
	}

	public String getTitle() {
		return title;
	}

	public S[] getStudents() {
		return students;
	}
	
	// 학생 정보 추가
	public void add(S s) {
		for(int i = 0 ; i < students.length ; i++) {
			if(students[i] == null) {
				students[i] = s;
				break;
			}
		}
	}
	
	
}
