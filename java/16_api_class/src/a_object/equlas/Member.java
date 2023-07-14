package a_object.equlas;



public class Member {

	String id;

	// alt + s + a 생성자
	public Member(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj) { return true;}
		if(obj instanceof Member) {
			Member member = (Member)obj;
			if(this.id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}



	
	
}
