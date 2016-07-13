package p;

interface I {
	default void m() {
		System.out.println(5);
	}
}

abstract class B implements I {
	@Override
	public void m() {
		int x = 6;
	}
}

class Main {
	public static void main(String[] args) {
		new I() {}.m(); //prints 5.
		new B() {}.m(); //prints 6.
	}
}