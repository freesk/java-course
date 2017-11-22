package set_01_project_08;

import java.util.Scanner;
import java.util.Locale;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

		double sum = 0;
		double number = 0;
		String number_string;
		int num_of_numbers = 0;

		while(sum < 100) {
			try {
				System.out.println("Enter a number: ");
				number_string = scan.next();
				number = Double.parseDouble(number_string);
				num_of_numbers = num_of_numbers + 1;
				sum += number;
			} catch(NumberFormatException ex) {
				System.out.println("Cannot parse a new number");
				continue;
			}

		}

		double res = sum/num_of_numbers;

		System.out.println(res);

		scan.close();
	}
}
