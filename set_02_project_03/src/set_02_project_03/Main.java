package set_02_project_03;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Object[] options = { "OK", "CANCEL" };
	    int number_1 = 0;
	    int number_2 = 0;
	    int max_number = 100000;
		int i = 0;
		int number_of_prime_numbers = 0;
		String result = "";
		String number_string = "";
		String intro_message = "Please enter two integers between 2 and " + max_number;
		
		alert(intro_message, "Warning", options);

		while(number_1 < 2 || number_1 > max_number) {
			try {
				number_string = JOptionPane.showInputDialog("Enter the first number");
				number_1 = Integer.parseInt(number_string);
			} catch(NumberFormatException ex) {
				alert("Got a non number value", "Warning", options);
			}
		}
		
		while(number_2 < 2 || number_2 > max_number) {
			try {
				number_string = JOptionPane.showInputDialog("Enter the second number");
				number_2 = Integer.parseInt(number_string);
			} catch(NumberFormatException ex) {
				alert("Got a non number value", "Warning", options);
			}
		}
		
		for(i = number_1; i <= number_2; i++) {
			if(isPrime(i)) {
				number_of_prime_numbers++;
			}
		}
		
		result = "The number of prime numbers between " + number_1 + " and " + number_2 + " is " + number_of_prime_numbers;
		
		alert(result, "Warning", options);
		
	}
	
	public static boolean isPrime(int number) {
		int i;
		boolean isPrime = true;
		for(i = 2; i < number; i++) {
			int mod_result = number % i;
			if(mod_result == 0) {
				isPrime = false;
			}
		}
		return isPrime;
	}
	
	public static void alert(String message, String type, Object[] options) {
		JOptionPane.showOptionDialog(null, message, type, JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
	}

}
