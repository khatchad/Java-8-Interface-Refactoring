package p;

interface I<E> {
	default void m() {
		E e = null;
		e.add("test");
	}
}
