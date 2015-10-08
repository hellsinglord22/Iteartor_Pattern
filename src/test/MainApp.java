package test;

public class MainApp {

	public static void main(String[] args) {
		String[] numbers = new String[5];
		numbers[0] = "one";
		numbers[1] = "two";
		numbers[2] = "three";
		numbers[3] = "four";
		numbers[4] = "five";

		StringIterator iterator = new StringIterator(numbers);

		System.out.println("program start !");
		while (iterator.hasNext()) {
			System.out.println((String) iterator.next());
		}

	}
}
