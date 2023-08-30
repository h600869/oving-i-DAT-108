package generisk;

public interface Intervall<T extends Comparable<T>> {
	T getMin();
	T getMax();
	boolean inneholder(T tall);
	boolean overlapper(Intervall<T> other);
}
