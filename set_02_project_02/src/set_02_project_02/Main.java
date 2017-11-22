package set_02_project_02;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    Object[] options = { "OK", "CANCEL" };
	    int number = 0;
		String result = "";

		while(number == 0) {
			try {
				String number_string = JOptionPane.showInputDialog("Enter a number");
				number = Integer.parseInt(number_string);
				if(number == 0) break;
			} catch(NumberFormatException ex) {
				JOptionPane.showOptionDialog(null, "Got a non number value", "Warning", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);

			}
		}

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
			JOptionPane.showOptionDialog(null, output_message, "Warning", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
		} else {
			JOptionPane.showOptionDialog(null, number + " is a prime number", "Warning", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
		}

	}
}
