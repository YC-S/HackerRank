package _30_days_of_code;

public class Day4_ClassVsInstance {
	public static void main(String[] args) {
		Person p1 = new Person(-1);
		p1.amIOld();
	}
}

class Person {
	private int age;

	public Person(int initialAge) {
		if (initialAge >= 0) {
			this.age = initialAge;
		} else {
			this.age = 0;
			System.out.println("Age is not valid, setting age to 0.");
		}
	}

	public void yearPasses() {
		age++;
	}

	public void amIOld() {
		if (age < 13) {
			System.out.println("You are young.");
		} else if (age < 18) {
			System.out.println("You are a teenager.");
		} else {
			System.out.println("You are old.");
		}
	}
}

