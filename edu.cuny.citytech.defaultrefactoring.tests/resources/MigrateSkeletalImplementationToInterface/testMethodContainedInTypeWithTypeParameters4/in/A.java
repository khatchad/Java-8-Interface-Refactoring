package p;

interface I<T> {
	void m();
}

abstract class A<E> implements I<E> {
	public void m() {
		E e = null;
	}
}
