package ex4;

class A {
	void funA() {
		System.out.println("funA");
	}
}

class B extends A {
	void funB() {
		System.out.println("funB");
	}
}

class C extends B {
	void funC() {
		System.out.println("funC");
	}
}

public class Exam1 {

	static void testFunc(A a) {
		if (a instanceof C) {
			C c = (C) a;
			c.funC();
			((B) a).funB();
		} else {
			a.funA();
		}
	}

	public static void main(String[] args) {

		A a1 = new A();
		A a2 = new B();
		A a3 = new C();

		// B b1 = new A(); 하위 클래스는 상위 클래스 참조 불가
		B b2 = new B();
		B b3 = new C();

		// C c1 = new A(); 하위 클래스는 상위 클래스 참조 불가
		// C c2 = new B(); 하위 클래스는 상위 클래스 참조 불가
		C c3 = new C();

		A aa1 = new B();

		B bb2 = (B) aa1;

		A aa2 = new C();

		C cc1 = (C) aa2;

		System.out.println("--------------------------------------");

		testFunc(new A());
		testFunc(new B());
		testFunc(new C());

	}
}
