package set_02_project_01;

import java.util.Scanner;
import java.util.Locale;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a number:");
		double number_1 = scan.nextDouble();
		System.out.println("Enter an opertator:");
		String operator = scan.next();
		System.out.println("Enter a number:");
		double number_2 = scan.nextDouble();

		scan.close();

		double result = 0;

		if(operator.equals("+")) {
			result = sum(number_1, number_2);
		} else if (operator.equals("*")) {
			result = product(number_1, number_2);
		} else if (operator.equals("-")) {
			result = difference(number_1, number_2);
		} else if (operator.equals("/")) {
			result = division(number_1, number_2);
		}

		System.out.println("The result is " + result);

	}

	public static double sum(double number_1, double number_2) {
		return number_1 + number_2;
	}

	public static double product(double number_1, double number_2) {
		return number_1 * number_2;
	}

	public static double division(double number_1, double number_2) {
		return number_1 / number_2;
	}

	public static double difference (double number_1, double number_2) {
		return number_1 - number_2;
	}
}
