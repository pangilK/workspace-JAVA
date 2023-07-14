package c_extends;

public class MyClass implements C {
	
	@Override
	public void methodA() {
		System.out.println("myClass methodA");
	}
	/*
	@Override
	public void methodB() {
		System.out.println("myClass methodB");
	}
	*/
	@Override
	public void methodC() {
		System.out.println("myClass methodC");		
	}
	
	public static void main(String[] args) {
		MyClass myclass = new MyClass();
		myclass.methodA();
		myclass.methodB();
		myclass.methodC();
		
		A.methodC();
	}
}
