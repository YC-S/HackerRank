package _30_days_of_code;

public class Day12_Inheritance {

}

class Person2 {
	private String firstName;
	private String lastName;
	private int id;

	public Person2(String firstName, String lastName, int id) {
	}
}


class Student extends Person2 {
	private int[] testScores;

	public Student(String firstName, String lastName, int id, int[] testScores) {
		super(firstName,lastName,id);
		this.testScores = testScores;
	}

	public char calculate() {
		int sum = 0;
		for (int score : testScores) {
			sum += score;
		}
		double average = (double) sum / testScores.length;
		if (average >= 90) {
			return 'O';
		} else if (average >= 80) {
			return 'E';
		} else if (average >= 70) {
			return 'A';
		} else if (average >= 55) {
			return 'P';
		} else if (average >= 40) {
			return 'D';
		} else {
			return 'T';
		}
	}
}