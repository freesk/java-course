package set_04_project_02;

import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int n = 0;
		
		System.out.println("Enter a number between 0 and 9");
		n = scan.nextInt();

		
		int number = 0;
		
		for(int i = 0; i < n; i++) {
			number *= 10;
			number += scan.nextInt();
		}
		
		
		scan.close();
		
		System.out.println(number);
		
		int reverse = 0;
		
		while (number > 0) {
			reverse *= 10;
			reverse += number % 10;
		    number = number / 10;
		}
		
		System.out.println(reverse);

	}

}
