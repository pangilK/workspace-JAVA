package extends6_protectede.b;

import extends6_protectede.a.A;
// import extends6_protectede.a.B;

public class C // extends B // final class는 설계 수정 불가 class - 상속 불가 
{
	
	A a = new A();
	
	C(){
		// 다른 패키지 자식 클래스를 제외하고는 접근 불가
//		a.a = 100; 		// protected
		a.b = 100; 		// public
//		a.methodA(); 	// protected
	}
}
