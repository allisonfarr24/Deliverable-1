import java.util.Scanner;

public class ComparingTwoNumbers {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String userInput1;
		String userInput2;
		int i;

		// prompting the user for first number
		System.out.println("Please enter a number containing only digits: ");
		userInput1 = scnr.nextLine();

		// validating the the user input does not contain letters
		for (i = 0; i < userInput1.length(); ++i) {
			while (Character.isLetter(userInput1.charAt(i))) {
				System.out.println("Please enter numbers only");
			}
		}
		// prompting the user for a second number
		System.out.println("Please enter another number with the same amount of digits: ");
		userInput2 = scnr.nextLine();

		// validating that the second number does not contain letters
		i = 0;
		while (i < userInput2.length()) {
			if (Character.isLetter(userInput2.charAt(i)))
				System.out.println("Please enter numbers only");
			i++;
		}
		// validating that two numbers contain the same amount of digits
		while (userInput1.length() != userInput2.length()) {
			System.out.println("Error: Numbers do not have the same amout of digits.");
			break;
		}
		// calling the next method
		comparingSums(userInput1, userInput2);

	}

	// providing a new method for the task
	public static void comparingSums(String userInput1, String userInput2) {

		int ones;
		int tens;
		int hundreds;

		// initializing the variables to the sum of the digits in the ones, tens, and
		// hundreds place
		ones = userInput1.charAt(0) + userInput2.charAt(0);
		tens = userInput1.charAt(1) + userInput2.charAt(1);
		hundreds = userInput1.charAt(2) + userInput2.charAt(2);

		// if-else statement that outputs "true" when all sums are equal, and "false"
		// when they are not
		if (ones == tens && ones == hundreds) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

	}

}
