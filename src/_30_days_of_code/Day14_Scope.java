package _30_days_of_code;

public class Day14_Scope {
	public static void main(String[] args) {
		int[] arr = {9, 3, 5, 1, 2};
		Difference difference = new Difference(arr);
		difference.computeDifference();
		System.out.println(difference.maximumDifference);

	}
}

class Difference {
	private int[] elements;
	public int maximumDifference;

	public Difference(int[] elements) {
		this.elements = elements;
	}

	public void computeDifference() {
		int min = 100;
		int max = 1;

		for (int element : elements) {
			if (element < min) {
				min = element;
			}
			if (element > max) {
				max = element;
			}
		}

		maximumDifference = max - min;
	}
}
