package f10_object.serializable;

import java.io.Serializable;

public class Person implements Serializable{
	
	
	private static final long serialVersionUID = 6131082771311808494L;
	
	private String name;
	transient private int age;
	
	private String phone;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", phone=" + phone + "]";
	}
	
	

}
	
