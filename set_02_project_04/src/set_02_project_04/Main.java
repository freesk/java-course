package set_02_project_04;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number_1 = 0;
		int number_2 = 0;
		int max_number = 1000000;
		
		alert("Enter two numbers between 1 and " + max_number + " and I will try to guess", "Warning");
		
		while(number_1 < 1 || number_1 > max_number) {
			number_1 = getInt("Enter the first number");
		}
		
		while(number_2 < 1 || number_2 > max_number) {
			number_2 = getInt("Enter the second number");
		}
		
		String message_to_show = ""; 
		String char_s = "";
		
		int mid = 0;
		int low = number_1;
		int high = number_2;
		
		while(!char_s.equals("y")) {
			
			mid = low + (high - low) / 2;
		
			message_to_show = "Is it " + mid  + "? . Enter \"s\" for smaller, \"b\" for bigger and \"y\" if the answer is correct";
			
			char_s = getCharS(message_to_show);	
			
			if(char_s.equals("b")) {
				low = mid + 1;
			} else if (char_s.equals("s")) {
				high = mid - 1;
			} else {
				continue;
			}

		}
		
		alert("Gotcha!", "Warning");

	}
	
	public static String getCharS(String message) {
		String response = "";
		response = JOptionPane.showInputDialog(message);
		return response;
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
