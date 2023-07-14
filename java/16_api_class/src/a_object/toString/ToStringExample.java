package a_object.toString;

class Person extends Object{
	
	String name;
	int heigth;
	double weight;

	public Person(String name, int heigth, double weight) {
		this.name = name;
		this.heigth = heigth;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", heigth=" + heigth + ", weight=" + weight + "]";
	}	
	
}

public class ToStringExample {

	public static void main(String[] args) {
		Person person = new Person("최기근",180,75);
		System.out.println(person);
		
	}


}
