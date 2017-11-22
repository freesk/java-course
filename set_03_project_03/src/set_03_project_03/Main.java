package set_03_project_03;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    int number = 0;
		String result = "";

	    number = getInt("Enter a number");
		
		int i;
		boolean isPrime = true;

		for(i = 2; i < number; i++) {

			int mod_result = number % i;

			System.out.println(number + " % " + i + " = " + mod_result);

			if(mod_result == 0) {
				isPrime = false;
				result = result + i + ", ";
			}
		}
		
		String output_message = "Nontrivial divisors of " + number + ": " + result;
		
		if(!isPrime) {
			alert(output_message, "Warning");
		} else {
			alert(number + " is a prime number", "Warning");
		}
	}
	
	public static int getInt(String message) {
		int number = 0;
		String number_string = "";
		try {
			number_string = JOptionPane.showInputDialog("Enter a number");
			number = Integer.parseInt(number_string);
		} catch(NumberFormatException ex) {
			alert("Got a non number value", "Warning");
		}
		return number;
	}
	
	public static void alert(String message, String type) {
		Object[] options = { "OK", "CANCEL" };
		JOptionPane.showOptionDialog(null, message, type, JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
	}

}
