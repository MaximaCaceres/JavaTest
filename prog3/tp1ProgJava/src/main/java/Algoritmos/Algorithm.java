package Algoritmos;

public final class Algorithm {

	public static <T extends Comparable<T>> T max(T x, T y) {
		return x.compareTo(y) >= 0 ? x : y;
		//si x comparado a y es mayor que cero es x, sino sera y.
	}
}
