package p;

import javax.annotation.Generated;

interface I {
	default void m(@Generated("hello") int n) {
	}
}