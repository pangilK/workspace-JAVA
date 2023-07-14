package extends6_protectede.b;

import extends6_protectede.a.A;

public class D extends A {

	A a = new A();
	
	D(){
		//a.a = 100;
		a.b = 200;
		//a.c = 300;
		//a.methodA();
		//a.methodB();
		//this.a = 100;
		super.b = 200;
		methodA();
		methodB();
	}

	@Override
	protected void methodA() {
		super.methodA();
	}

}
