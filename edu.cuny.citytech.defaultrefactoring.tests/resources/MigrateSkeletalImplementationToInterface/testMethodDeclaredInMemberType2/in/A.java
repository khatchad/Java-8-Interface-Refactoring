package p;

interface I {
	void m();
}

class A {
	abstract class B implements I {
		public void m() {
			A.this.getClass();
		}
	}
}
