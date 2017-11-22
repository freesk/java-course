package set_01_project_01;

import java.util.Scanner;
import java.util.Locale;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

        // If locale is Polish, floating point numbers
        // have to be entered with  c o m m a  as the
        // decimal separator. Locale can be changed to,
        // e.g., American, by uncommenting the line below:
        //    Locale.setDefault(Locale.US);
        // (then the dot is is used as decimal separator).
        // When reading data, any nonempty sequence of
        // white characters is treated as a separator.

		double weight = 0;
		double height = 0;

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

		while(weight == 0) {
			try {
				// Must be in kilograms
				System.out.println("Enter your weight in kilograms:");
				String weight_string = scan.next();
				weight = Double.parseDouble(weight_string);
				if(weight == 0) {
					System.out.println("Your weight cannot be equal to zero");
				}
			} catch(NumberFormatException ex) {
				System.out.println("Got wrong weight number");
			}
		}

		while(height == 0) {
			try {
				// Must be in meters
				System.out.println("Enter your height in meters:");
				String height_string = scan.next();
				height = Double.parseDouble(height_string);
				if(height == 0) {
					System.out.println("Your weight cannot be equal to zero");
				}
			} catch(NumberFormatException ex) {
				System.out.println("Got wrong height number");
			}
		}

		scan.close();

		double result = weight/Math.pow(height, 2);
		String answer_output;

		String answer_1 = "Sorry, you are too fat";
		String answer_2 = "Congratulations! you are perfectly fit";
		String answer_3 = "You are nearly dead! Go get some food";

		if(result <= 18.5) {
			answer_output = answer_3;
		} else if (result >= 25) {
			answer_output = answer_1;
		} else {
			answer_output = answer_2;
		}

		System.out.println("Your BMI index is " + result);
		System.out.println(answer_output);

	}
}
