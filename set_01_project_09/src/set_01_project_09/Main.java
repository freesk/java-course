package set_01_project_09;

import java.util.Scanner;
import java.util.Locale;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 0;
		String number_string;

		Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

		try {
	        System.out.println("Enter a number: ");
			number_string = scan.next();
			number = Integer.parseInt(number_string);
		} catch(NumberFormatException ex) {
			System.out.println("Cannot parse a new number");
		}

		scan.close();

		System.out.println("Prime number? " + isPrime(number));

	}

	//checks whether an int is prime or not.
	public static boolean isPrime(int n) {
	    //check if n is a multiple of 2
	    if (n % 2 == 0) return false;
	    //if not, then just check the odds
	    for(int i = 3; i * i <= n; i += 2) {
	        if(n % i == 0)
	            return false;
	    }
	    return true;
	}
}
