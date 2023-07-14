package a_object.equlas;

public class EqualsExmaple {
	
	public static void main(String[] args) {
		Member member1 = new Member("id001");
		Member member2 = new Member("id001");
		System.out.println(member1 == member2);
		System.out.println(member1.equals(member2));
		
	}
	
}
