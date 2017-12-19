package set_04_project_04;

import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int number = 0;
		int min = 0;
		int max = 0;
		int min_times = 0;
		int max_times = 0;
		
		System.out.println("Enter a number greater than 0 or enter 0 to return");
		
		for(int i = 0; true; i++) {
			number = scan.nextInt();
			
			if(number == 0) break;
			
			if(i == 0) {
				min = max = number;
			}
			
			if(number > max) {
				max = number;
				max_times = 0;
			}
			
			if(number == max) {
				max_times++;
			}
			
			if(number < min) {
				min = number;
				min_times = 0;
			}
			
			if(number == min) {
				min_times++;
			}
		}
		
		scan.close();
		
		System.out.println("Min = " + min + ", " + min_times + " times");
		System.out.println("Max = " + max + ", " + max_times + " times");

	}

}
