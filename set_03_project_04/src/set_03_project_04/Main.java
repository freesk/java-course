package set_03_project_04;

import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int number = scan.nextInt();
		
		scan.close();
		
		String binary_string = Integer.toBinaryString(number);
		String output = "";
		
		for (int i = 0; i < binary_string.length(); i++){
			output = output + binary_string.charAt(i) + (i == (binary_string.length() - 1) ? "" : ", ");
		}
		
		System.out.println("The binari representation of " + number + " is " + output);
	

	}

}
