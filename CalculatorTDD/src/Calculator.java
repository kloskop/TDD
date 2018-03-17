
public class Calculator {

	public int substract(int i, int j) {
		return i - j;
	}

	public int multiply(int i, int j) {
		return i * j;
	}

	public int sum(int i, int j) {
		return i + j;
	}

	public double divide(double i, double j) {
		if (j == 0) {
			throw new IllegalArgumentException();
		}
		return i / j;
	}

}
