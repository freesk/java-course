package set_04_project_01;

import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int number = 0;
		int current = 0;
		int current_sum_of_digits = 0;
		int sum = 0;
		
		System.out.println("Enter a number greater than 0 or enter 0 to return");
		
		while(true) {
			number = scan.nextInt();
			if(number == 0) break;
			sum = get_sum_of_digits(number);
			if(sum > current_sum_of_digits) {
				current_sum_of_digits = sum;
				current = number;
			} 
		}
		
		scan.close();
		
		System.out.println("Max sum of digits was " + current_sum_of_digits + " for " + current);
		

	}
	
	public static int get_sum_of_digits(int num) {
		
		int number = num;
		int sum = 0;
		
		while (number > 0) {
			sum += number % 10;
		    number = number / 10;
		}
		
		return sum;
		
	}

}
