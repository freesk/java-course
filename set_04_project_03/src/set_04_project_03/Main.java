package set_04_project_03;

import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int n = 0;
		
		System.out.println("Enter a number");
		n = scan.nextInt();
		
		scan.close();
		
		for(int i = 1; i <= n; i++) {
			
			for(int j = 1; j <= n; j++) {
				System.out.format("%5d", i*j);
			}
			
			System.out.print("\n");
		}

	}

}
