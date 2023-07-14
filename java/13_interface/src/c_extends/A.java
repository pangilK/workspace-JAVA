package c_extends;

public interface A {
	void methodA();
	
	default void methodB() { // 디폴트라 접근제한
		System.out.println("A interface의 methodB");
	}
	
	static void methodC() { // 스태틱 정적멤버라 접근제한x  A.methodC(); 
		System.out.println("A interface의 methodC");
	}
}

interface B{
	void methodB();
}

interface C extends A,B{
	void methodC();
	
	public default void methodB() {
		System.out.println("C interface의 methodB");
	}
	
}